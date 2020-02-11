package cn.keepingthepiggy.viewModel;

import lombok.Data;

@Data
public class RegisterModel {
    private String username;
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
}
