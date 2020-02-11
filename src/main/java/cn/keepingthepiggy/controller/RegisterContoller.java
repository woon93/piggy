package cn.keepingthepiggy.controller;

import cn.keepingthepiggy.dao.RegisterInfoMapper;
import cn.keepingthepiggy.dataModel.RegisterInfo;
import cn.keepingthepiggy.dataModel.RegisterInfoExample;
import cn.keepingthepiggy.service.GeneralConvertor;
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
            logger.info("register:" + info.toString());
            RegisterInfoExample example = new RegisterInfoExample();
            RegisterInfoExample.Criteria criteria = example.createCriteria();
            // 【KEY】
            criteria.andAccountEqualTo(info.getUsername());
            criteria.andDelflagNotEqualTo("1");
            //  excute Mapper
            List<RegisterInfo> infos = mapping.selectByExample(example);
            if (infos != null && !infos.isEmpty())
                responsible.put("flag", "1");
        }
        return responsible;
    }

    @RequestMapping(value = "/ask/register", method = RequestMethod.POST)
    public Map<String, String> register(@RequestBody RegisterModel info) {
        Map<String, String> responsible = new HashMap<>();
        if (info != null) {
            logger.info("register:" + info.toString());
            RegisterInfo registerInfo = new RegisterInfo();
            convertor.convertor(info,registerInfo);
            registerInfo.setAccount(info.getUsername());
            registerInfo.setPazword(info.getPassword());
            //  excute Mapper
            mapping.insertSelective(registerInfo);
            responsible.put("flag", "1");
        }
        return responsible;
    }
}
