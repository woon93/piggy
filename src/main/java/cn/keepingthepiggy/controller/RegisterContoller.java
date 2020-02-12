package cn.keepingthepiggy.controller;

import cn.keepingthepiggy.dao.RegisterInfoMapper;
import cn.keepingthepiggy.dataModel.RegisterInfo;
import cn.keepingthepiggy.dataModel.RegisterInfoExample;
import cn.keepingthepiggy.util.GeneralConvertor;
import cn.keepingthepiggy.viewModel.RegisterModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RegisterContoller {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RegisterInfoMapper mapping;

    @Autowired
    private GeneralConvertor convertor;

    @RequestMapping(value = "/ask/login", method = RequestMethod.POST)
    public Map<String, String> login(@RequestBody(required = false) RegisterModel info) {
        Map<String, String> responsible = new HashMap<>();
        responsible.put("flag", "0");
        if (info != null) {
            logger.info("login:" + info.toString());
            int count = getCount(info);
            if (count > 1) {
                responsible.put("flag", "2");
                return responsible;
            }

            RegisterInfoExample example = new RegisterInfoExample();
            RegisterInfoExample.Criteria criteria = example.createCriteria();
            // 【KEY】
            criteria.andAccountEqualTo(info.getUsername());
            criteria.andPazwordEqualTo(info.getPassword());
            criteria.andDelflagNotEqualTo("1");
            //  excute Mapper
            List<RegisterInfo> infos = mapping.selectByExample(example);

            if (!infos.isEmpty())
                responsible.put("flag", "1");

        }
        logger.info("flag:" + responsible.get("flag"));
        return responsible;
    }

    @RequestMapping(value = "/ask/register", method = RequestMethod.POST)
    public Map<String, String> register(@RequestBody RegisterModel info) {
        Map<String, String> responsible = new HashMap<>();
        if (info != null) {
            logger.info("register:" + info.toString());
            int count = getCount(info);
            if (count > 0) {
                responsible.put("flag", "2");
                logger.info("flag:" + responsible.get("flag"));
                return responsible;
            }

            if (info.getPassword() == null || "".equals(info.getPassword())){
                responsible.put("flag", "1");
                logger.info("flag:" + responsible.get("flag"));
                return responsible;
            }

            RegisterInfo registerInfo = new RegisterInfo();
//            registerInfo.setAccount(info.getUsername());
//            registerInfo.setPazword(info.getPassword());

            convertor.convertor(info,registerInfo);
            mapping.insertSelective(registerInfo);
            responsible.put("flag", "1");

        }
        logger.info("flag:" + responsible.get("flag"));
        return responsible;
    }

    private int getCount(RegisterModel info) {
        RegisterInfoExample example = new RegisterInfoExample();
        RegisterInfoExample.Criteria criteria = example.createCriteria();
        // 【KEY】
        criteria.andAccountEqualTo(info.getUsername());
        //  excute Mapper
        List<RegisterInfo> infos = mapping.selectByExample(example);
        if (infos != null && !infos.isEmpty())
            return infos.size();
        else
            return 0;
    }
}
