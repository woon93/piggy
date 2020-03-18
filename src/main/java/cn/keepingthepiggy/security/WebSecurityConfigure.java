package cn.keepingthepiggy.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.util.Assert;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableWebSecurity
public class WebSecurityConfigure extends WebSecurityConfigurerAdapter {

    @Autowired
    private PasswordEncoder passwordEncoder;


    /**
     * 需要放行的URL
     */
    private static final String[] AUTH_WHITELIST = {
            "/ask/register",
            "/oauth/**",
    };

    @Autowired
    private UserDetailsService userService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //校验用户
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(AUTH_WHITELIST).permitAll()
                .anyRequest().authenticated()
                .and()
                // 自定义的JsonFilter,加到
                .addFilterAt(jsonAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)

                // 表单登录和自定义的Json登录要分开配置，这里先关掉表单登录。
                .formLogin().disable()
//                .formLogin()
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .failureForwardUrl("/ask/login?error")
//                .loginPage("/ask/login")
//                .permitAll()
//                .and()

                .logout()
                .logoutUrl("/ask/logout")
                .logoutSuccessUrl("/ask/login")
                .permitAll()
                .and()

                .httpBasic()
                .disable()
                .csrf().disable()
            .sessionManagement()
                .maximumSessions(1);// 最大会话数量，设置为1表示一个用户只能有一个会话
                //.expiredSessionStrategy()//会话过期策略
    }


    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManager();
    }

    /**
     * 自定义加密方式bean
     * 开发阶段，先不加密，直接存储和对比
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder() {
            @Override
            public String encode(CharSequence charSequence) {
                return charSequence.toString();
            }

            @Override
            public boolean matches(CharSequence charSequence, String s) {
                Assert.notNull(charSequence, "Password must not bo null!!!");
                Assert.notNull(s, "Password must not bo null!!!");
                return s.equals(charSequence.toString());
            }
        };
    }

    @Bean
    public JsonAuthenticationFilter jsonAuthenticationFilter() throws Exception {
        JsonAuthenticationFilter filter = new JsonAuthenticationFilter();
        // 将已经存有的身份信息传进去
        filter.setAuthenticationManager(super.authenticationManagerBean());
        // Json登录路径
        filter.setFilterProcessesUrl("/ask/login");
        filter.setAuthenticationSuccessHandler(new AuthenticationSuccessHandler() {
            @Override
            public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
                response.setContentType("application/json;charset=utf-8");
                PrintWriter out = response.getWriter();
                Map<String, Object> map = new HashMap();
                map.put("status", 200);
                map.put("flag", 1);
                // 将身份信息放入msg
                map.put("msg", authentication.getPrincipal());
                out.write(new ObjectMapper().writeValueAsString(map));
                out.flush();
                out.close();
            }
        });
        return filter;
    }
}
