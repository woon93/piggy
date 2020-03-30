package cn.keepingthepiggy.service;

import cn.keepingthepiggy.dao.UrzInfoMapper;
import cn.keepingthepiggy.dataModel.UrzInfo;
import cn.keepingthepiggy.dataModel.UrzInfoExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class UrzInfoService {
    @Autowired
    private UrzInfoMapper mapping;


    public int getInfoCount(int urzid) {
        UrzInfoExample example = new UrzInfoExample();
        UrzInfoExample.Criteria criteria = example.createCriteria();
        // 【KEY】
        criteria.andUrzidEqualTo(urzid);
        //  excute Mapper
        return mapping.countByExample(example);
    }

    public UrzInfo getUrzInfo(int urzid) {
        UrzInfoExample example = new UrzInfoExample();
        UrzInfoExample.Criteria criteria = example.createCriteria();
        // 【KEY】
        criteria.andUrzidEqualTo(urzid);
        //  excute Mapper
        List<UrzInfo> urzInfo = mapping.selectByExample(example);
        if (urzInfo == null || urzInfo.isEmpty()) {
            return null;
        }
        return urzInfo.get(0);

    }

    public int insertUrzInfo(UrzInfo info) {
        return mapping.insertSelective(info);
    }

    public int updateUrzInfo(UrzInfo info) {
        UrzInfoExample example = new UrzInfoExample();
        UrzInfoExample.Criteria criteria = example.createCriteria();
        // 【KEY】
        criteria.andUrzidEqualTo(info.getUrzid());
        return mapping.updateByExampleSelective(info,example);
    }

    public int updatePortrait(int urzid, byte[] portrayalData) {
        UrzInfo upInfo = new UrzInfo();
        upInfo.setPortrayalData(portrayalData);
        Date currentTime = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        upInfo.setUpdateTime(currentTime);

        UrzInfoExample example = new UrzInfoExample();
        UrzInfoExample.Criteria criteria = example.createCriteria();
        // 【KEY】
        criteria.andUrzidEqualTo(urzid);
        return mapping.updateByExampleWithBLOBs(upInfo,example);
    }
}