package cn.keepingthepiggy.service;

import cn.keepingthepiggy.dao.RegisterMapper;
import cn.keepingthepiggy.dataModel.Register;
import cn.keepingthepiggy.dataModel.RegisterExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.Assert;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class RegisterService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RegisterMapper mapping;

    public int getAccountCount(String account) {
        RegisterExample example = new RegisterExample();
        RegisterExample.Criteria criteria = example.createCriteria();
        // 【KEY】
        criteria.andAccountEqualTo(account);
        criteria.andDeleteNotEqualTo(1);
        //  excute Mapper
        return mapping.countByExample(example);
    }

    public Register getRegister(int urzid){
        RegisterExample example = new RegisterExample();
        RegisterExample.Criteria criteria = example.createCriteria();
        // 【KEY】
        criteria.andUrzidEqualTo(urzid);
//        criteria.andPazwordEqualTo(passwordEncoder.encode(info.getPazword())); //能登录说明密码已经校验了
        criteria.andDeleteNotEqualTo(1);
        //  excute Mapper
        List<Register> registers = mapping.selectByExample(example);
        if (registers == null || registers.isEmpty()) {
            return null;
        }
        Register register = registers.get(0);
        register.setPazword(null);//不能查出密码
        return register;

    }

    public int insertRegister(Register info){
        return mapping.insertSelective(info);
    }

    public int updateAccoutOrPazword(int urzid, String account, String pazword){
        Register upInfo = new Register();
        Date currentTime = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        Assert.notNull(urzid, "ID must not bo null!!!");
        if(pazword == null || "".equals(pazword)){
            Assert.notNull(account, "Account must not bo null!!!");
            upInfo.setAccount(account);
            upInfo.setUpdAcctTime(currentTime);
//            upInfo.setUpdAcctCount(+1);  //修改账号次数限制
        }
        if(account == null || "".equals(account)){
            Assert.notNull(pazword, "Pazword must not bo null!!!");
            upInfo.setPazword(passwordEncoder.encode(pazword));
            upInfo.setUpdPazTime(currentTime);
        }

        RegisterExample example = new RegisterExample();
        RegisterExample.Criteria criteria = example.createCriteria();
        // 【KEY】
        criteria.andUrzidEqualTo(urzid);
        criteria.andDeleteNotEqualTo(1);

        return mapping.updateByExampleSelective(upInfo,example);
    }
}
