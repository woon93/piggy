package cn.keepingthepiggy.viewModel;

import lombok.Data;
import org.dozer.Mapping;

@Data
public class RegisterModel {
    @Mapping("account")
    private String username;

    @Mapping("pazword")
    private String password;
    private String sex;
    private String email;
    private String address;
    private String phone;
    private int age;

    private String externalToken;
    private String externalName;
    private String icon;
    private String iconUrl;

    @Mapping("portraitData")
    private String portrait;
}
