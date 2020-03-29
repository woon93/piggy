package cn.keepingthepiggy.dataModel;

import java.util.Date;

public class Register {
    private Integer urzid;

    private String account;

    private String pazword;

    private Integer position;

    private Integer permission;

    private Integer registerState;

    private Integer registerWay;

    private String registerEquipment;

    private Date lastRequestTime;

    private Integer logoutWay;

    private String innerToken;

    private Date getIntokenTime;

    private String externalToken;

    private Date getExtokenTime;

    private Date registerTime;

    private Integer updAcctCount;

    private Date updAcctTime;

    private Date updPazTime;

    private String loginIp;

    private Integer accountState;

    private Integer delete;

    public Integer getUrzid() {
        return urzid;
    }

    public void setUrzid(Integer urzid) {
        this.urzid = urzid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPazword() {
        return pazword;
    }

    public void setPazword(String pazword) {
        this.pazword = pazword == null ? null : pazword.trim();
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public Integer getRegisterState() {
        return registerState;
    }

    public void setRegisterState(Integer registerState) {
        this.registerState = registerState;
    }

    public Integer getRegisterWay() {
        return registerWay;
    }

    public void setRegisterWay(Integer registerWay) {
        this.registerWay = registerWay;
    }

    public String getRegisterEquipment() {
        return registerEquipment;
    }

    public void setRegisterEquipment(String registerEquipment) {
        this.registerEquipment = registerEquipment == null ? null : registerEquipment.trim();
    }

    public Date getLastRequestTime() {
        return lastRequestTime;
    }

    public void setLastRequestTime(Date lastRequestTime) {
        this.lastRequestTime = lastRequestTime;
    }

    public Integer getLogoutWay() {
        return logoutWay;
    }

    public void setLogoutWay(Integer logoutWay) {
        this.logoutWay = logoutWay;
    }

    public String getInnerToken() {
        return innerToken;
    }

    public void setInnerToken(String innerToken) {
        this.innerToken = innerToken == null ? null : innerToken.trim();
    }

    public Date getGetIntokenTime() {
        return getIntokenTime;
    }

    public void setGetIntokenTime(Date getIntokenTime) {
        this.getIntokenTime = getIntokenTime;
    }

    public String getExternalToken() {
        return externalToken;
    }

    public void setExternalToken(String externalToken) {
        this.externalToken = externalToken == null ? null : externalToken.trim();
    }

    public Date getGetExtokenTime() {
        return getExtokenTime;
    }

    public void setGetExtokenTime(Date getExtokenTime) {
        this.getExtokenTime = getExtokenTime;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getUpdAcctCount() {
        return updAcctCount;
    }

    public void setUpdAcctCount(Integer updAcctCount) {
        this.updAcctCount = updAcctCount;
    }

    public Date getUpdAcctTime() {
        return updAcctTime;
    }

    public void setUpdAcctTime(Date updAcctTime) {
        this.updAcctTime = updAcctTime;
    }

    public Date getUpdPazTime() {
        return updPazTime;
    }

    public void setUpdPazTime(Date updPazTime) {
        this.updPazTime = updPazTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public Integer getAccountState() {
        return accountState;
    }

    public void setAccountState(Integer accountState) {
        this.accountState = accountState;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }
}