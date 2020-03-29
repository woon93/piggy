package cn.keepingthepiggy.dataModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegisterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUrzidIsNull() {
            addCriterion("urzid is null");
            return (Criteria) this;
        }

        public Criteria andUrzidIsNotNull() {
            addCriterion("urzid is not null");
            return (Criteria) this;
        }

        public Criteria andUrzidEqualTo(Integer value) {
            addCriterion("urzid =", value, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidNotEqualTo(Integer value) {
            addCriterion("urzid <>", value, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidGreaterThan(Integer value) {
            addCriterion("urzid >", value, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidGreaterThanOrEqualTo(Integer value) {
            addCriterion("urzid >=", value, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidLessThan(Integer value) {
            addCriterion("urzid <", value, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidLessThanOrEqualTo(Integer value) {
            addCriterion("urzid <=", value, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidIn(List<Integer> values) {
            addCriterion("urzid in", values, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidNotIn(List<Integer> values) {
            addCriterion("urzid not in", values, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidBetween(Integer value1, Integer value2) {
            addCriterion("urzid between", value1, value2, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidNotBetween(Integer value1, Integer value2) {
            addCriterion("urzid not between", value1, value2, "urzid");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPazwordIsNull() {
            addCriterion("pazword is null");
            return (Criteria) this;
        }

        public Criteria andPazwordIsNotNull() {
            addCriterion("pazword is not null");
            return (Criteria) this;
        }

        public Criteria andPazwordEqualTo(String value) {
            addCriterion("pazword =", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordNotEqualTo(String value) {
            addCriterion("pazword <>", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordGreaterThan(String value) {
            addCriterion("pazword >", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordGreaterThanOrEqualTo(String value) {
            addCriterion("pazword >=", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordLessThan(String value) {
            addCriterion("pazword <", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordLessThanOrEqualTo(String value) {
            addCriterion("pazword <=", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordLike(String value) {
            addCriterion("pazword like", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordNotLike(String value) {
            addCriterion("pazword not like", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordIn(List<String> values) {
            addCriterion("pazword in", values, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordNotIn(List<String> values) {
            addCriterion("pazword not in", values, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordBetween(String value1, String value2) {
            addCriterion("pazword between", value1, value2, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordNotBetween(String value1, String value2) {
            addCriterion("pazword not between", value1, value2, "pazword");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Integer value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Integer value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Integer value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Integer value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Integer value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Integer> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Integer> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Integer value1, Integer value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNull() {
            addCriterion("permission is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNotNull() {
            addCriterion("permission is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionEqualTo(Integer value) {
            addCriterion("permission =", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotEqualTo(Integer value) {
            addCriterion("permission <>", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThan(Integer value) {
            addCriterion("permission >", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("permission >=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThan(Integer value) {
            addCriterion("permission <", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThanOrEqualTo(Integer value) {
            addCriterion("permission <=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionIn(List<Integer> values) {
            addCriterion("permission in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotIn(List<Integer> values) {
            addCriterion("permission not in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionBetween(Integer value1, Integer value2) {
            addCriterion("permission between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotBetween(Integer value1, Integer value2) {
            addCriterion("permission not between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andRegisterStateIsNull() {
            addCriterion("register_state is null");
            return (Criteria) this;
        }

        public Criteria andRegisterStateIsNotNull() {
            addCriterion("register_state is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterStateEqualTo(Integer value) {
            addCriterion("register_state =", value, "registerState");
            return (Criteria) this;
        }

        public Criteria andRegisterStateNotEqualTo(Integer value) {
            addCriterion("register_state <>", value, "registerState");
            return (Criteria) this;
        }

        public Criteria andRegisterStateGreaterThan(Integer value) {
            addCriterion("register_state >", value, "registerState");
            return (Criteria) this;
        }

        public Criteria andRegisterStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_state >=", value, "registerState");
            return (Criteria) this;
        }

        public Criteria andRegisterStateLessThan(Integer value) {
            addCriterion("register_state <", value, "registerState");
            return (Criteria) this;
        }

        public Criteria andRegisterStateLessThanOrEqualTo(Integer value) {
            addCriterion("register_state <=", value, "registerState");
            return (Criteria) this;
        }

        public Criteria andRegisterStateIn(List<Integer> values) {
            addCriterion("register_state in", values, "registerState");
            return (Criteria) this;
        }

        public Criteria andRegisterStateNotIn(List<Integer> values) {
            addCriterion("register_state not in", values, "registerState");
            return (Criteria) this;
        }

        public Criteria andRegisterStateBetween(Integer value1, Integer value2) {
            addCriterion("register_state between", value1, value2, "registerState");
            return (Criteria) this;
        }

        public Criteria andRegisterStateNotBetween(Integer value1, Integer value2) {
            addCriterion("register_state not between", value1, value2, "registerState");
            return (Criteria) this;
        }

        public Criteria andRegisterWayIsNull() {
            addCriterion("register_way is null");
            return (Criteria) this;
        }

        public Criteria andRegisterWayIsNotNull() {
            addCriterion("register_way is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterWayEqualTo(Integer value) {
            addCriterion("register_way =", value, "registerWay");
            return (Criteria) this;
        }

        public Criteria andRegisterWayNotEqualTo(Integer value) {
            addCriterion("register_way <>", value, "registerWay");
            return (Criteria) this;
        }

        public Criteria andRegisterWayGreaterThan(Integer value) {
            addCriterion("register_way >", value, "registerWay");
            return (Criteria) this;
        }

        public Criteria andRegisterWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_way >=", value, "registerWay");
            return (Criteria) this;
        }

        public Criteria andRegisterWayLessThan(Integer value) {
            addCriterion("register_way <", value, "registerWay");
            return (Criteria) this;
        }

        public Criteria andRegisterWayLessThanOrEqualTo(Integer value) {
            addCriterion("register_way <=", value, "registerWay");
            return (Criteria) this;
        }

        public Criteria andRegisterWayIn(List<Integer> values) {
            addCriterion("register_way in", values, "registerWay");
            return (Criteria) this;
        }

        public Criteria andRegisterWayNotIn(List<Integer> values) {
            addCriterion("register_way not in", values, "registerWay");
            return (Criteria) this;
        }

        public Criteria andRegisterWayBetween(Integer value1, Integer value2) {
            addCriterion("register_way between", value1, value2, "registerWay");
            return (Criteria) this;
        }

        public Criteria andRegisterWayNotBetween(Integer value1, Integer value2) {
            addCriterion("register_way not between", value1, value2, "registerWay");
            return (Criteria) this;
        }

        public Criteria andRegisterEquipmentIsNull() {
            addCriterion("register_equipment is null");
            return (Criteria) this;
        }

        public Criteria andRegisterEquipmentIsNotNull() {
            addCriterion("register_equipment is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterEquipmentEqualTo(String value) {
            addCriterion("register_equipment =", value, "registerEquipment");
            return (Criteria) this;
        }

        public Criteria andRegisterEquipmentNotEqualTo(String value) {
            addCriterion("register_equipment <>", value, "registerEquipment");
            return (Criteria) this;
        }

        public Criteria andRegisterEquipmentGreaterThan(String value) {
            addCriterion("register_equipment >", value, "registerEquipment");
            return (Criteria) this;
        }

        public Criteria andRegisterEquipmentGreaterThanOrEqualTo(String value) {
            addCriterion("register_equipment >=", value, "registerEquipment");
            return (Criteria) this;
        }

        public Criteria andRegisterEquipmentLessThan(String value) {
            addCriterion("register_equipment <", value, "registerEquipment");
            return (Criteria) this;
        }

        public Criteria andRegisterEquipmentLessThanOrEqualTo(String value) {
            addCriterion("register_equipment <=", value, "registerEquipment");
            return (Criteria) this;
        }

        public Criteria andRegisterEquipmentLike(String value) {
            addCriterion("register_equipment like", value, "registerEquipment");
            return (Criteria) this;
        }

        public Criteria andRegisterEquipmentNotLike(String value) {
            addCriterion("register_equipment not like", value, "registerEquipment");
            return (Criteria) this;
        }

        public Criteria andRegisterEquipmentIn(List<String> values) {
            addCriterion("register_equipment in", values, "registerEquipment");
            return (Criteria) this;
        }

        public Criteria andRegisterEquipmentNotIn(List<String> values) {
            addCriterion("register_equipment not in", values, "registerEquipment");
            return (Criteria) this;
        }

        public Criteria andRegisterEquipmentBetween(String value1, String value2) {
            addCriterion("register_equipment between", value1, value2, "registerEquipment");
            return (Criteria) this;
        }

        public Criteria andRegisterEquipmentNotBetween(String value1, String value2) {
            addCriterion("register_equipment not between", value1, value2, "registerEquipment");
            return (Criteria) this;
        }

        public Criteria andLastRequestTimeIsNull() {
            addCriterion("last_request_time is null");
            return (Criteria) this;
        }

        public Criteria andLastRequestTimeIsNotNull() {
            addCriterion("last_request_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastRequestTimeEqualTo(Date value) {
            addCriterion("last_request_time =", value, "lastRequestTime");
            return (Criteria) this;
        }

        public Criteria andLastRequestTimeNotEqualTo(Date value) {
            addCriterion("last_request_time <>", value, "lastRequestTime");
            return (Criteria) this;
        }

        public Criteria andLastRequestTimeGreaterThan(Date value) {
            addCriterion("last_request_time >", value, "lastRequestTime");
            return (Criteria) this;
        }

        public Criteria andLastRequestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_request_time >=", value, "lastRequestTime");
            return (Criteria) this;
        }

        public Criteria andLastRequestTimeLessThan(Date value) {
            addCriterion("last_request_time <", value, "lastRequestTime");
            return (Criteria) this;
        }

        public Criteria andLastRequestTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_request_time <=", value, "lastRequestTime");
            return (Criteria) this;
        }

        public Criteria andLastRequestTimeIn(List<Date> values) {
            addCriterion("last_request_time in", values, "lastRequestTime");
            return (Criteria) this;
        }

        public Criteria andLastRequestTimeNotIn(List<Date> values) {
            addCriterion("last_request_time not in", values, "lastRequestTime");
            return (Criteria) this;
        }

        public Criteria andLastRequestTimeBetween(Date value1, Date value2) {
            addCriterion("last_request_time between", value1, value2, "lastRequestTime");
            return (Criteria) this;
        }

        public Criteria andLastRequestTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_request_time not between", value1, value2, "lastRequestTime");
            return (Criteria) this;
        }

        public Criteria andLogoutWayIsNull() {
            addCriterion("logout_way is null");
            return (Criteria) this;
        }

        public Criteria andLogoutWayIsNotNull() {
            addCriterion("logout_way is not null");
            return (Criteria) this;
        }

        public Criteria andLogoutWayEqualTo(Integer value) {
            addCriterion("logout_way =", value, "logoutWay");
            return (Criteria) this;
        }

        public Criteria andLogoutWayNotEqualTo(Integer value) {
            addCriterion("logout_way <>", value, "logoutWay");
            return (Criteria) this;
        }

        public Criteria andLogoutWayGreaterThan(Integer value) {
            addCriterion("logout_way >", value, "logoutWay");
            return (Criteria) this;
        }

        public Criteria andLogoutWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("logout_way >=", value, "logoutWay");
            return (Criteria) this;
        }

        public Criteria andLogoutWayLessThan(Integer value) {
            addCriterion("logout_way <", value, "logoutWay");
            return (Criteria) this;
        }

        public Criteria andLogoutWayLessThanOrEqualTo(Integer value) {
            addCriterion("logout_way <=", value, "logoutWay");
            return (Criteria) this;
        }

        public Criteria andLogoutWayIn(List<Integer> values) {
            addCriterion("logout_way in", values, "logoutWay");
            return (Criteria) this;
        }

        public Criteria andLogoutWayNotIn(List<Integer> values) {
            addCriterion("logout_way not in", values, "logoutWay");
            return (Criteria) this;
        }

        public Criteria andLogoutWayBetween(Integer value1, Integer value2) {
            addCriterion("logout_way between", value1, value2, "logoutWay");
            return (Criteria) this;
        }

        public Criteria andLogoutWayNotBetween(Integer value1, Integer value2) {
            addCriterion("logout_way not between", value1, value2, "logoutWay");
            return (Criteria) this;
        }

        public Criteria andInnerTokenIsNull() {
            addCriterion("inner_token is null");
            return (Criteria) this;
        }

        public Criteria andInnerTokenIsNotNull() {
            addCriterion("inner_token is not null");
            return (Criteria) this;
        }

        public Criteria andInnerTokenEqualTo(String value) {
            addCriterion("inner_token =", value, "innerToken");
            return (Criteria) this;
        }

        public Criteria andInnerTokenNotEqualTo(String value) {
            addCriterion("inner_token <>", value, "innerToken");
            return (Criteria) this;
        }

        public Criteria andInnerTokenGreaterThan(String value) {
            addCriterion("inner_token >", value, "innerToken");
            return (Criteria) this;
        }

        public Criteria andInnerTokenGreaterThanOrEqualTo(String value) {
            addCriterion("inner_token >=", value, "innerToken");
            return (Criteria) this;
        }

        public Criteria andInnerTokenLessThan(String value) {
            addCriterion("inner_token <", value, "innerToken");
            return (Criteria) this;
        }

        public Criteria andInnerTokenLessThanOrEqualTo(String value) {
            addCriterion("inner_token <=", value, "innerToken");
            return (Criteria) this;
        }

        public Criteria andInnerTokenLike(String value) {
            addCriterion("inner_token like", value, "innerToken");
            return (Criteria) this;
        }

        public Criteria andInnerTokenNotLike(String value) {
            addCriterion("inner_token not like", value, "innerToken");
            return (Criteria) this;
        }

        public Criteria andInnerTokenIn(List<String> values) {
            addCriterion("inner_token in", values, "innerToken");
            return (Criteria) this;
        }

        public Criteria andInnerTokenNotIn(List<String> values) {
            addCriterion("inner_token not in", values, "innerToken");
            return (Criteria) this;
        }

        public Criteria andInnerTokenBetween(String value1, String value2) {
            addCriterion("inner_token between", value1, value2, "innerToken");
            return (Criteria) this;
        }

        public Criteria andInnerTokenNotBetween(String value1, String value2) {
            addCriterion("inner_token not between", value1, value2, "innerToken");
            return (Criteria) this;
        }

        public Criteria andGetIntokenTimeIsNull() {
            addCriterion("get_intoken_time is null");
            return (Criteria) this;
        }

        public Criteria andGetIntokenTimeIsNotNull() {
            addCriterion("get_intoken_time is not null");
            return (Criteria) this;
        }

        public Criteria andGetIntokenTimeEqualTo(Date value) {
            addCriterion("get_intoken_time =", value, "getIntokenTime");
            return (Criteria) this;
        }

        public Criteria andGetIntokenTimeNotEqualTo(Date value) {
            addCriterion("get_intoken_time <>", value, "getIntokenTime");
            return (Criteria) this;
        }

        public Criteria andGetIntokenTimeGreaterThan(Date value) {
            addCriterion("get_intoken_time >", value, "getIntokenTime");
            return (Criteria) this;
        }

        public Criteria andGetIntokenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("get_intoken_time >=", value, "getIntokenTime");
            return (Criteria) this;
        }

        public Criteria andGetIntokenTimeLessThan(Date value) {
            addCriterion("get_intoken_time <", value, "getIntokenTime");
            return (Criteria) this;
        }

        public Criteria andGetIntokenTimeLessThanOrEqualTo(Date value) {
            addCriterion("get_intoken_time <=", value, "getIntokenTime");
            return (Criteria) this;
        }

        public Criteria andGetIntokenTimeIn(List<Date> values) {
            addCriterion("get_intoken_time in", values, "getIntokenTime");
            return (Criteria) this;
        }

        public Criteria andGetIntokenTimeNotIn(List<Date> values) {
            addCriterion("get_intoken_time not in", values, "getIntokenTime");
            return (Criteria) this;
        }

        public Criteria andGetIntokenTimeBetween(Date value1, Date value2) {
            addCriterion("get_intoken_time between", value1, value2, "getIntokenTime");
            return (Criteria) this;
        }

        public Criteria andGetIntokenTimeNotBetween(Date value1, Date value2) {
            addCriterion("get_intoken_time not between", value1, value2, "getIntokenTime");
            return (Criteria) this;
        }

        public Criteria andExternalTokenIsNull() {
            addCriterion("external_token is null");
            return (Criteria) this;
        }

        public Criteria andExternalTokenIsNotNull() {
            addCriterion("external_token is not null");
            return (Criteria) this;
        }

        public Criteria andExternalTokenEqualTo(String value) {
            addCriterion("external_token =", value, "externalToken");
            return (Criteria) this;
        }

        public Criteria andExternalTokenNotEqualTo(String value) {
            addCriterion("external_token <>", value, "externalToken");
            return (Criteria) this;
        }

        public Criteria andExternalTokenGreaterThan(String value) {
            addCriterion("external_token >", value, "externalToken");
            return (Criteria) this;
        }

        public Criteria andExternalTokenGreaterThanOrEqualTo(String value) {
            addCriterion("external_token >=", value, "externalToken");
            return (Criteria) this;
        }

        public Criteria andExternalTokenLessThan(String value) {
            addCriterion("external_token <", value, "externalToken");
            return (Criteria) this;
        }

        public Criteria andExternalTokenLessThanOrEqualTo(String value) {
            addCriterion("external_token <=", value, "externalToken");
            return (Criteria) this;
        }

        public Criteria andExternalTokenLike(String value) {
            addCriterion("external_token like", value, "externalToken");
            return (Criteria) this;
        }

        public Criteria andExternalTokenNotLike(String value) {
            addCriterion("external_token not like", value, "externalToken");
            return (Criteria) this;
        }

        public Criteria andExternalTokenIn(List<String> values) {
            addCriterion("external_token in", values, "externalToken");
            return (Criteria) this;
        }

        public Criteria andExternalTokenNotIn(List<String> values) {
            addCriterion("external_token not in", values, "externalToken");
            return (Criteria) this;
        }

        public Criteria andExternalTokenBetween(String value1, String value2) {
            addCriterion("external_token between", value1, value2, "externalToken");
            return (Criteria) this;
        }

        public Criteria andExternalTokenNotBetween(String value1, String value2) {
            addCriterion("external_token not between", value1, value2, "externalToken");
            return (Criteria) this;
        }

        public Criteria andGetExtokenTimeIsNull() {
            addCriterion("get_extoken_time is null");
            return (Criteria) this;
        }

        public Criteria andGetExtokenTimeIsNotNull() {
            addCriterion("get_extoken_time is not null");
            return (Criteria) this;
        }

        public Criteria andGetExtokenTimeEqualTo(Date value) {
            addCriterion("get_extoken_time =", value, "getExtokenTime");
            return (Criteria) this;
        }

        public Criteria andGetExtokenTimeNotEqualTo(Date value) {
            addCriterion("get_extoken_time <>", value, "getExtokenTime");
            return (Criteria) this;
        }

        public Criteria andGetExtokenTimeGreaterThan(Date value) {
            addCriterion("get_extoken_time >", value, "getExtokenTime");
            return (Criteria) this;
        }

        public Criteria andGetExtokenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("get_extoken_time >=", value, "getExtokenTime");
            return (Criteria) this;
        }

        public Criteria andGetExtokenTimeLessThan(Date value) {
            addCriterion("get_extoken_time <", value, "getExtokenTime");
            return (Criteria) this;
        }

        public Criteria andGetExtokenTimeLessThanOrEqualTo(Date value) {
            addCriterion("get_extoken_time <=", value, "getExtokenTime");
            return (Criteria) this;
        }

        public Criteria andGetExtokenTimeIn(List<Date> values) {
            addCriterion("get_extoken_time in", values, "getExtokenTime");
            return (Criteria) this;
        }

        public Criteria andGetExtokenTimeNotIn(List<Date> values) {
            addCriterion("get_extoken_time not in", values, "getExtokenTime");
            return (Criteria) this;
        }

        public Criteria andGetExtokenTimeBetween(Date value1, Date value2) {
            addCriterion("get_extoken_time between", value1, value2, "getExtokenTime");
            return (Criteria) this;
        }

        public Criteria andGetExtokenTimeNotBetween(Date value1, Date value2) {
            addCriterion("get_extoken_time not between", value1, value2, "getExtokenTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andUpdAcctCountIsNull() {
            addCriterion("upd_acct_count is null");
            return (Criteria) this;
        }

        public Criteria andUpdAcctCountIsNotNull() {
            addCriterion("upd_acct_count is not null");
            return (Criteria) this;
        }

        public Criteria andUpdAcctCountEqualTo(Integer value) {
            addCriterion("upd_acct_count =", value, "updAcctCount");
            return (Criteria) this;
        }

        public Criteria andUpdAcctCountNotEqualTo(Integer value) {
            addCriterion("upd_acct_count <>", value, "updAcctCount");
            return (Criteria) this;
        }

        public Criteria andUpdAcctCountGreaterThan(Integer value) {
            addCriterion("upd_acct_count >", value, "updAcctCount");
            return (Criteria) this;
        }

        public Criteria andUpdAcctCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("upd_acct_count >=", value, "updAcctCount");
            return (Criteria) this;
        }

        public Criteria andUpdAcctCountLessThan(Integer value) {
            addCriterion("upd_acct_count <", value, "updAcctCount");
            return (Criteria) this;
        }

        public Criteria andUpdAcctCountLessThanOrEqualTo(Integer value) {
            addCriterion("upd_acct_count <=", value, "updAcctCount");
            return (Criteria) this;
        }

        public Criteria andUpdAcctCountIn(List<Integer> values) {
            addCriterion("upd_acct_count in", values, "updAcctCount");
            return (Criteria) this;
        }

        public Criteria andUpdAcctCountNotIn(List<Integer> values) {
            addCriterion("upd_acct_count not in", values, "updAcctCount");
            return (Criteria) this;
        }

        public Criteria andUpdAcctCountBetween(Integer value1, Integer value2) {
            addCriterion("upd_acct_count between", value1, value2, "updAcctCount");
            return (Criteria) this;
        }

        public Criteria andUpdAcctCountNotBetween(Integer value1, Integer value2) {
            addCriterion("upd_acct_count not between", value1, value2, "updAcctCount");
            return (Criteria) this;
        }

        public Criteria andUpdAcctTimeIsNull() {
            addCriterion("upd_acct_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdAcctTimeIsNotNull() {
            addCriterion("upd_acct_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdAcctTimeEqualTo(Date value) {
            addCriterion("upd_acct_time =", value, "updAcctTime");
            return (Criteria) this;
        }

        public Criteria andUpdAcctTimeNotEqualTo(Date value) {
            addCriterion("upd_acct_time <>", value, "updAcctTime");
            return (Criteria) this;
        }

        public Criteria andUpdAcctTimeGreaterThan(Date value) {
            addCriterion("upd_acct_time >", value, "updAcctTime");
            return (Criteria) this;
        }

        public Criteria andUpdAcctTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upd_acct_time >=", value, "updAcctTime");
            return (Criteria) this;
        }

        public Criteria andUpdAcctTimeLessThan(Date value) {
            addCriterion("upd_acct_time <", value, "updAcctTime");
            return (Criteria) this;
        }

        public Criteria andUpdAcctTimeLessThanOrEqualTo(Date value) {
            addCriterion("upd_acct_time <=", value, "updAcctTime");
            return (Criteria) this;
        }

        public Criteria andUpdAcctTimeIn(List<Date> values) {
            addCriterion("upd_acct_time in", values, "updAcctTime");
            return (Criteria) this;
        }

        public Criteria andUpdAcctTimeNotIn(List<Date> values) {
            addCriterion("upd_acct_time not in", values, "updAcctTime");
            return (Criteria) this;
        }

        public Criteria andUpdAcctTimeBetween(Date value1, Date value2) {
            addCriterion("upd_acct_time between", value1, value2, "updAcctTime");
            return (Criteria) this;
        }

        public Criteria andUpdAcctTimeNotBetween(Date value1, Date value2) {
            addCriterion("upd_acct_time not between", value1, value2, "updAcctTime");
            return (Criteria) this;
        }

        public Criteria andUpdPazTimeIsNull() {
            addCriterion("upd_paz_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdPazTimeIsNotNull() {
            addCriterion("upd_paz_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdPazTimeEqualTo(Date value) {
            addCriterion("upd_paz_time =", value, "updPazTime");
            return (Criteria) this;
        }

        public Criteria andUpdPazTimeNotEqualTo(Date value) {
            addCriterion("upd_paz_time <>", value, "updPazTime");
            return (Criteria) this;
        }

        public Criteria andUpdPazTimeGreaterThan(Date value) {
            addCriterion("upd_paz_time >", value, "updPazTime");
            return (Criteria) this;
        }

        public Criteria andUpdPazTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upd_paz_time >=", value, "updPazTime");
            return (Criteria) this;
        }

        public Criteria andUpdPazTimeLessThan(Date value) {
            addCriterion("upd_paz_time <", value, "updPazTime");
            return (Criteria) this;
        }

        public Criteria andUpdPazTimeLessThanOrEqualTo(Date value) {
            addCriterion("upd_paz_time <=", value, "updPazTime");
            return (Criteria) this;
        }

        public Criteria andUpdPazTimeIn(List<Date> values) {
            addCriterion("upd_paz_time in", values, "updPazTime");
            return (Criteria) this;
        }

        public Criteria andUpdPazTimeNotIn(List<Date> values) {
            addCriterion("upd_paz_time not in", values, "updPazTime");
            return (Criteria) this;
        }

        public Criteria andUpdPazTimeBetween(Date value1, Date value2) {
            addCriterion("upd_paz_time between", value1, value2, "updPazTime");
            return (Criteria) this;
        }

        public Criteria andUpdPazTimeNotBetween(Date value1, Date value2) {
            addCriterion("upd_paz_time not between", value1, value2, "updPazTime");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andAccountStateIsNull() {
            addCriterion("account_state is null");
            return (Criteria) this;
        }

        public Criteria andAccountStateIsNotNull() {
            addCriterion("account_state is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStateEqualTo(Integer value) {
            addCriterion("account_state =", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotEqualTo(Integer value) {
            addCriterion("account_state <>", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateGreaterThan(Integer value) {
            addCriterion("account_state >", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_state >=", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateLessThan(Integer value) {
            addCriterion("account_state <", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateLessThanOrEqualTo(Integer value) {
            addCriterion("account_state <=", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateIn(List<Integer> values) {
            addCriterion("account_state in", values, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotIn(List<Integer> values) {
            addCriterion("account_state not in", values, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateBetween(Integer value1, Integer value2) {
            addCriterion("account_state between", value1, value2, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotBetween(Integer value1, Integer value2) {
            addCriterion("account_state not between", value1, value2, "accountState");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNull() {
            addCriterion("delete is null");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNotNull() {
            addCriterion("delete is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteEqualTo(Integer value) {
            addCriterion("delete =", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotEqualTo(Integer value) {
            addCriterion("delete <>", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThan(Integer value) {
            addCriterion("delete >", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete >=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThan(Integer value) {
            addCriterion("delete <", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("delete <=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteIn(List<Integer> values) {
            addCriterion("delete in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotIn(List<Integer> values) {
            addCriterion("delete not in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteBetween(Integer value1, Integer value2) {
            addCriterion("delete between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("delete not between", value1, value2, "delete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}