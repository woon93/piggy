package cn.keepingthepiggy.service;

import cn.keepingthepiggy.dao.RegisterInfoMapper;
import cn.keepingthepiggy.dataModel.RegisterInfo;
import cn.keepingthepiggy.dataModel.RegisterInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterInfoService {

    @Autowired
    private RegisterInfoMapper mapping;

    public int getInfoCount(RegisterInfo info) {
        RegisterInfoExample example = new RegisterInfoExample();
        RegisterInfoExample.Criteria criteria = example.createCriteria();
        // 【KEY】
        criteria.andAccountEqualTo(info.getAccount());
        //  excute Mapper
        List<RegisterInfo> infos = mapping.selectByExample(example);
        if (infos != null && !infos.isEmpty())
            return infos.size();
        else
            return 0;
    }

    public List<RegisterInfo> getRegisterInfos(RegisterInfo info){
        RegisterInfoExample example = new RegisterInfoExample();
        RegisterInfoExample.Criteria criteria = example.createCriteria();
        // 【KEY】
        criteria.andAccountEqualTo(info.getAccount());
        criteria.andPazwordEqualTo(info.getPazword());
        criteria.andDelflagNotEqualTo("1");
        //  excute Mapper
        return mapping.selectByExample(example);
    }

    public int insertRegister(RegisterInfo info){
        return mapping.insertSelective(info);
    }

    public int updatePortrait(String account,byte[] portriat){
        RegisterInfo upInfo = new RegisterInfo();
        upInfo.setAccount(account);
        upInfo.setPortraitData(portriat);

        RegisterInfoExample example = new RegisterInfoExample();
        RegisterInfoExample.Criteria criteria = example.createCriteria();
        // 【KEY】
        criteria.andAccountEqualTo(account);
        criteria.andDelflagNotEqualTo("1");

        return mapping.updateByExampleSelective(upInfo,example);
    }

}
