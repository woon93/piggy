package cn.keepingthepiggy.controller.demo;

import cn.keepingthepiggy.configuration.Constant;
import cn.keepingthepiggy.dataModel.RegisterInfo;
import cn.keepingthepiggy.service.demo.RegisterInfoService;
import cn.keepingthepiggy.util.GeneralConvertor;
import cn.keepingthepiggy.util.JSONChange;
import cn.keepingthepiggy.viewModel.RegisterModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@EnableWebSecurity
public class RegisterContoller {
    private Logger logger = LoggerFactory.getLogger(getClass());

//    @Autowired
//    private CsrfTokenRepository lazyCsrfTokenRepository;

    @Autowired
    private GeneralConvertor convertor;

    @Autowired
    private RegisterInfoService registerInfoService;

    /********  开发测试用  ***********************/
    @RequestMapping(value = "/ask/login", method = RequestMethod.GET)
    public String loginGet(@RequestBody(required = false) RegisterModel info) {
        return "请登录！！！";
    }

    @RequestMapping(value = "/ask/test", method = RequestMethod.POST)
    public Map<String, Object> test(HttpServletRequest request,
                                    @RequestBody(required = false) RegisterModel info) {
        Map<String, Object> responsible = new HashMap<>();
        responsible.put(Constant.Flag_key, "1");
        responsible.put("msg", "test success");
        return responsible;
    }
    /********  开发测试用  ***********************/


    /**
     * 用户注册
     * @param info
     * @return
     */
    @RequestMapping(value = "/ask/register", method = RequestMethod.POST)
    public Map<String, String> register(@RequestBody RegisterModel info) {
        Map<String, String> responsible = new HashMap<>();
        if (info != null) {
            logger.info("register:" + info.toString());
            RegisterInfo registerInfo = new RegisterInfo();
            convertor.convertor(info, registerInfo);

            int count = registerInfoService.getInfoCount(registerInfo);
            if (count > 0) {
                responsible.put(Constant.Flag_key, Constant.Flag_2);
                logger.info("flag:" + responsible.get("flag"));
                return responsible;
            }

            if (info.getPassword() == null || "".equals(info.getPassword().trim())) {
                responsible.put(Constant.Flag_key, Constant.Flag_2);
                logger.info("flag:" + responsible.get("flag"));
                return responsible;
            }
        }
        logger.info("flag:" + responsible.get("flag"));
        return responsible;
    }


    /**
     * json登录
     *
     * @param info
     * @return
     */
    @RequestMapping(value = "/ask/login", method = RequestMethod.POST)
    public Map<String, Object> login(@RequestBody(required = false) RegisterModel info) {
        Map<String, Object> responsible = new HashMap<>();
        responsible.put(Constant.Flag_key, Constant.Flag_0);
        if (info != null) {
            logger.info("login:" + info.toString());
            RegisterInfo registerInfo = new RegisterInfo();
            convertor.convertor(info, registerInfo);

            int count = registerInfoService.getInfoCount(registerInfo);
            if (count > 1) {
                responsible.put(Constant.Flag_key, Constant.Flag_2);
                return responsible;
            }
            List<RegisterInfo> infos = registerInfoService.getRegisterInfos(registerInfo);
            if (!infos.isEmpty()) {
                responsible.put(Constant.Flag_key, Constant.Flag_1);
                responsible.put("info", infos.get(0));
//                CsrfTokenRepository lazyCsrfTokenRepository = new HttpSessionCsrfTokenRepository();
//                CsrfToken csrfToken = lazyCsrfTokenRepository.generateToken(request);
//                responsible.put("X-CSRF-TOKEN", csrfToken);
            }
        }
        logger.info("flag:" + responsible.get("flag"));

        return responsible;
    }


    /**
     * 上传/更新 用户头像
     *
     * @param info
     * @return
     */
    @RequestMapping(value = "/ask/portrait", method = RequestMethod.POST)
    public Map<String, String> portrait(HttpServletRequest request, @RequestBody RegisterModel info) {
        Map<String, String> responsible = new HashMap<>();
        responsible.put(Constant.Flag_key, Constant.Flag_0);

        /**
         * 一般spring security在认证后，security会把一个SecurityContextImpl对象存储到session中，此对象中有当前用户的各种资料。
         * 1.  SecurityContextImpl中只有两个基本业务方法，getAuthentication()  / setAuthentication() ，
         * 这两个方法是为了获取/设置 Authentication 对象 ，Authentication 是一个接口。
         *
         * 2 . 用户认证最核心的部分是接口 Authentication接口，它有两个最重要的方法 getPrincipal() / setPrincipal()，
         * 可获取被验证的用户的身份 / 可用于设置被验证的用户的身份。
         *
         * 3 . Authentication有一个基本的实现类，UsernamePasswordAuthenticationToken，我们只要将它初始化出来，
         * 并将我们更新的用户信息赋上去，即可完成修改session的用户信息。
         *
         *
         * //1.从HttpServletRequest中获取SecurityContextImpl对象
         * SecurityContextImpl securityContextImpl = (SecurityContextImpl) request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
         * //2.从SecurityContextImpl中获取Authentication对象
         * Authentication authentication = securityContextImpl.getAuthentication();
         * //3.初始化UsernamePasswordAuthenticationToken实例 ，这里的参数user就是我们要更新的用户信息
         * UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(user, authentication.getCredentials());
         * auth.setDetails(authentication.getDetails());
         * //4.重新设置SecurityContextImpl对象的Authentication
         * securityContextImpl.setAuthentication(auth);
         */

        SecurityContextImpl securityContextImpl = (SecurityContextImpl) request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");

        if (info != null) {
            logger.info("account:" + securityContextImpl.getAuthentication().getName());
            logger.info("portraitData:" + info.getPortrait());
            RegisterInfo registerInfo = new RegisterInfo();
            int count = registerInfoService.updatePortrait(securityContextImpl.getAuthentication().getName(), info.getPortrait().getBytes());
            if (count > 0) {
                responsible.put(Constant.Flag_key, Constant.Flag_1);
            }
        }
        logger.info("flag:" + responsible.get("flag"));
        return responsible;
    }

    /**
     * 查询用户信息
     */
    @RequestMapping(value = "/ask/getUserData", method = RequestMethod.POST)
    public Map<String, Object> getUserData(HttpServletRequest request, @RequestBody RegisterModel info) throws JsonProcessingException {
        Map<String, Object> responsible = new HashMap<>();
        responsible.put(Constant.Flag_key, Constant.Flag_0);

        // 用户只能查询自己的信息，不能查别人的
        SecurityContextImpl securityContextImpl = (SecurityContextImpl) request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        if (!securityContextImpl.getAuthentication().getName().equals(info.getUsername())) {
            logger.info("login:" + info.toString());
            responsible.put(Constant.Flag_key, Constant.Flag_2);
            return responsible;
        }

        if (!"".equals(info.getUsername())) {
            logger.info("login:" + info.toString());
            RegisterInfo registerInfo = new RegisterInfo();
            convertor.convertor(info, registerInfo);
            List<RegisterInfo> infos = registerInfoService.getRegisterInfos(registerInfo);
            if (!infos.isEmpty()) {
                responsible.put(Constant.Flag_key, Constant.Flag_1);
                RegisterInfo infoDB = infos.get(0);
                // 提取图片的by64码
                byte[] pottraitBuffer = infoDB.getPortraitData();
                String pottraitStr = new String(pottraitBuffer);

                convertor.convertor(infoDB, info);
                info.setPassword(null);
                info.setPortrait(pottraitStr);
                responsible.put("info", JSONChange.objToJson(info));
            }
        }
        logger.info("flag:" + responsible.get("flag"));
        return responsible;
    }
}