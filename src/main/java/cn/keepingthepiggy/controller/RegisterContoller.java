package cn.keepingthepiggy.controller;

import cn.keepingthepiggy.configuration.Constant;
import cn.keepingthepiggy.dao.RegisterInfoMapper;
import cn.keepingthepiggy.dataModel.RegisterInfo;
import cn.keepingthepiggy.service.RegisterInfoService;
import cn.keepingthepiggy.util.GeneralConvertor;
import cn.keepingthepiggy.viewModel.RegisterModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
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
    private RegisterInfoMapper mapping;

    @Autowired
    private GeneralConvertor convertor;

    @Autowired
    private RegisterInfoService registerInfoService;

    @RequestMapping(value = "/ask/login", method = RequestMethod.GET)
    public String  loginGet(@RequestBody(required = false) RegisterModel info) {
        return "请登录！！！";
    }

    @RequestMapping(value = "/ask/test", method = RequestMethod.POST)
    public Map<String, Object> test(HttpServletRequest request,
                                     @RequestBody(required = false) RegisterModel info) {
        Map<String, Object> responsible = new HashMap<>();
        responsible.put("msg","test success");
        return responsible;
    }

    @RequestMapping(value = "/ask/login", method = RequestMethod.POST)
    public Map<String, Object> login(HttpServletRequest request,
                                     @RequestBody(required = false) RegisterModel info) {
        Map<String, Object> responsible = new HashMap<>();
        responsible.put("flag", Constant.Flag_0);
        if (info != null) {
            logger.info("login:" + info.toString());
            RegisterInfo registerInfo = new RegisterInfo();
            convertor.convertor(info, registerInfo);

            int count = registerInfoService.getInfoCount(registerInfo);
            if (count > 1) {
                responsible.put("flag", Constant.Flag_2);
                return responsible;
            }
            List<RegisterInfo> infos = registerInfoService.getRegisterInfos(registerInfo);
            if (!infos.isEmpty()) {
                responsible.put("flag", Constant.Flag_1);

//                CsrfTokenRepository lazyCsrfTokenRepository = new HttpSessionCsrfTokenRepository();
//                CsrfToken csrfToken = lazyCsrfTokenRepository.generateToken(request);
//                responsible.put("X-CSRF-TOKEN", csrfToken);
            }
        }
        logger.info("flag:" + responsible.get("flag"));
        return responsible;
    }

    @RequestMapping(value = "/ask/register", method = RequestMethod.POST)
    public Map<String, String> register(@RequestBody RegisterModel info) {
        Map<String, String> responsible = new HashMap<>();
        if (info != null) {
            logger.info("register:" + info.toString());
            RegisterInfo registerInfo = new RegisterInfo();
            convertor.convertor(info, registerInfo);

            int count = registerInfoService.getInfoCount(registerInfo);
            if (count > 0) {
                responsible.put("flag", Constant.Flag_2);
                logger.info("flag:" + responsible.get("flag"));
                return responsible;
            }
            if (info.getPassword() == null || "".equals(info.getPassword())) {
                responsible.put("flag", Constant.Flag_1);
                logger.info("flag:" + responsible.get("flag"));
                return responsible;
            }
            registerInfoService.insertRegister(registerInfo);
            responsible.put("flag", Constant.Flag_1);

        }
        logger.info("flag:" + responsible.get("flag"));
        return responsible;
    }

}
