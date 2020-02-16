package cn.keepingthepiggy.security;

import cn.keepingthepiggy.dao.RegisterInfoMapper;
import cn.keepingthepiggy.dataModel.RegisterInfo;
import cn.keepingthepiggy.dataModel.RegisterInfoExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Service//("authUserDetailService")
@Slf4j
public class AuthUserDetailService implements UserDetailsService {
    @Autowired
    private RegisterInfoMapper mapping;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("username : {}",username);
        RegisterInfo user = getRegisterInfoByname(username);
        if(Objects.isNull(user)){
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//        if (!StringUtils.isEmpty(user.getRoles())) {
//            String[] roles = user.getRoles().split(",");
//            for (String role : roles) {
//                if (!StringUtils.isEmpty(role)) {
//                    authorities.add(new SimpleGrantedAuthority(role.trim()));
//                }
//            }
//        }
        //返回一个SpringSecurity需要的用户对象
        return new org.springframework.security.core.userdetails.User(
                user.getAccount(),
                user.getPazword(),
                grantedAuthorities);
    }

    /**
     * Security 专用！！！
     * @param username
     * @return
     */
    private RegisterInfo getRegisterInfoByname(String username){
        RegisterInfoExample example = new RegisterInfoExample();
        RegisterInfoExample.Criteria criteria = example.createCriteria();
        // 【KEY】
        criteria.andAccountEqualTo(username);
        criteria.andDelflagNotEqualTo("1");
        //  excute Mapper
        List<RegisterInfo> infos = mapping.selectByExample(example);
        if (infos.isEmpty()) {
            return null;
        } else {
            return infos.get(0);
        }
    }
}
