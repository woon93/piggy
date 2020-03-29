package cn.keepingthepiggy.dataModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NodeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NodeInfoExample() {
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

        public Criteria andNodeIdIsNull() {
            addCriterion("node_id is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("node_id is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(String value) {
            addCriterion("node_id =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(String value) {
            addCriterion("node_id <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(String value) {
            addCriterion("node_id >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("node_id >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(String value) {
            addCriterion("node_id <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(String value) {
            addCriterion("node_id <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLike(String value) {
            addCriterion("node_id like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotLike(String value) {
            addCriterion("node_id not like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<String> values) {
            addCriterion("node_id in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<String> values) {
            addCriterion("node_id not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(String value1, String value2) {
            addCriterion("node_id between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(String value1, String value2) {
            addCriterion("node_id not between", value1, value2, "nodeId");
            return (Criteria) this;
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

        public Criteria andClassifyIsNull() {
            addCriterion("classify is null");
            return (Criteria) this;
        }

        public Criteria andClassifyIsNotNull() {
            addCriterion("classify is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyEqualTo(Integer value) {
            addCriterion("classify =", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotEqualTo(Integer value) {
            addCriterion("classify <>", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyGreaterThan(Integer value) {
            addCriterion("classify >", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("classify >=", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLessThan(Integer value) {
            addCriterion("classify <", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLessThanOrEqualTo(Integer value) {
            addCriterion("classify <=", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyIn(List<Integer> values) {
            addCriterion("classify in", values, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotIn(List<Integer> values) {
            addCriterion("classify not in", values, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyBetween(Integer value1, Integer value2) {
            addCriterion("classify between", value1, value2, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotBetween(Integer value1, Integer value2) {
            addCriterion("classify not between", value1, value2, "classify");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdIsNull() {
            addCriterion("pre_node_id is null");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdIsNotNull() {
            addCriterion("pre_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdEqualTo(String value) {
            addCriterion("pre_node_id =", value, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdNotEqualTo(String value) {
            addCriterion("pre_node_id <>", value, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdGreaterThan(String value) {
            addCriterion("pre_node_id >", value, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("pre_node_id >=", value, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdLessThan(String value) {
            addCriterion("pre_node_id <", value, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdLessThanOrEqualTo(String value) {
            addCriterion("pre_node_id <=", value, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdLike(String value) {
            addCriterion("pre_node_id like", value, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdNotLike(String value) {
            addCriterion("pre_node_id not like", value, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdIn(List<String> values) {
            addCriterion("pre_node_id in", values, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdNotIn(List<String> values) {
            addCriterion("pre_node_id not in", values, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdBetween(String value1, String value2) {
            addCriterion("pre_node_id between", value1, value2, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdNotBetween(String value1, String value2) {
            addCriterion("pre_node_id not between", value1, value2, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdIsNull() {
            addCriterion("next_node_id is null");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdIsNotNull() {
            addCriterion("next_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdEqualTo(String value) {
            addCriterion("next_node_id =", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdNotEqualTo(String value) {
            addCriterion("next_node_id <>", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdGreaterThan(String value) {
            addCriterion("next_node_id >", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("next_node_id >=", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdLessThan(String value) {
            addCriterion("next_node_id <", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdLessThanOrEqualTo(String value) {
            addCriterion("next_node_id <=", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdLike(String value) {
            addCriterion("next_node_id like", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdNotLike(String value) {
            addCriterion("next_node_id not like", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdIn(List<String> values) {
            addCriterion("next_node_id in", values, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdNotIn(List<String> values) {
            addCriterion("next_node_id not in", values, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdBetween(String value1, String value2) {
            addCriterion("next_node_id between", value1, value2, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdNotBetween(String value1, String value2) {
            addCriterion("next_node_id not between", value1, value2, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andTierIsNull() {
            addCriterion("tier is null");
            return (Criteria) this;
        }

        public Criteria andTierIsNotNull() {
            addCriterion("tier is not null");
            return (Criteria) this;
        }

        public Criteria andTierEqualTo(Integer value) {
            addCriterion("tier =", value, "tier");
            return (Criteria) this;
        }

        public Criteria andTierNotEqualTo(Integer value) {
            addCriterion("tier <>", value, "tier");
            return (Criteria) this;
        }

        public Criteria andTierGreaterThan(Integer value) {
            addCriterion("tier >", value, "tier");
            return (Criteria) this;
        }

        public Criteria andTierGreaterThanOrEqualTo(Integer value) {
            addCriterion("tier >=", value, "tier");
            return (Criteria) this;
        }

        public Criteria andTierLessThan(Integer value) {
            addCriterion("tier <", value, "tier");
            return (Criteria) this;
        }

        public Criteria andTierLessThanOrEqualTo(Integer value) {
            addCriterion("tier <=", value, "tier");
            return (Criteria) this;
        }

        public Criteria andTierIn(List<Integer> values) {
            addCriterion("tier in", values, "tier");
            return (Criteria) this;
        }

        public Criteria andTierNotIn(List<Integer> values) {
            addCriterion("tier not in", values, "tier");
            return (Criteria) this;
        }

        public Criteria andTierBetween(Integer value1, Integer value2) {
            addCriterion("tier between", value1, value2, "tier");
            return (Criteria) this;
        }

        public Criteria andTierNotBetween(Integer value1, Integer value2) {
            addCriterion("tier not between", value1, value2, "tier");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIsNull() {
            addCriterion("picture_url is null");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIsNotNull() {
            addCriterion("picture_url is not null");
            return (Criteria) this;
        }

        public Criteria andPictureUrlEqualTo(String value) {
            addCriterion("picture_url =", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotEqualTo(String value) {
            addCriterion("picture_url <>", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThan(String value) {
            addCriterion("picture_url >", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("picture_url >=", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThan(String value) {
            addCriterion("picture_url <", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLessThanOrEqualTo(String value) {
            addCriterion("picture_url <=", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlLike(String value) {
            addCriterion("picture_url like", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotLike(String value) {
            addCriterion("picture_url not like", value, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlIn(List<String> values) {
            addCriterion("picture_url in", values, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotIn(List<String> values) {
            addCriterion("picture_url not in", values, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlBetween(String value1, String value2) {
            addCriterion("picture_url between", value1, value2, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureUrlNotBetween(String value1, String value2) {
            addCriterion("picture_url not between", value1, value2, "pictureUrl");
            return (Criteria) this;
        }

        public Criteria andMultimediaUrlIsNull() {
            addCriterion("multimedia_url is null");
            return (Criteria) this;
        }

        public Criteria andMultimediaUrlIsNotNull() {
            addCriterion("multimedia_url is not null");
            return (Criteria) this;
        }

        public Criteria andMultimediaUrlEqualTo(String value) {
            addCriterion("multimedia_url =", value, "multimediaUrl");
            return (Criteria) this;
        }

        public Criteria andMultimediaUrlNotEqualTo(String value) {
            addCriterion("multimedia_url <>", value, "multimediaUrl");
            return (Criteria) this;
        }

        public Criteria andMultimediaUrlGreaterThan(String value) {
            addCriterion("multimedia_url >", value, "multimediaUrl");
            return (Criteria) this;
        }

        public Criteria andMultimediaUrlGreaterThanOrEqualTo(String value) {
            addCriterion("multimedia_url >=", value, "multimediaUrl");
            return (Criteria) this;
        }

        public Criteria andMultimediaUrlLessThan(String value) {
            addCriterion("multimedia_url <", value, "multimediaUrl");
            return (Criteria) this;
        }

        public Criteria andMultimediaUrlLessThanOrEqualTo(String value) {
            addCriterion("multimedia_url <=", value, "multimediaUrl");
            return (Criteria) this;
        }

        public Criteria andMultimediaUrlLike(String value) {
            addCriterion("multimedia_url like", value, "multimediaUrl");
            return (Criteria) this;
        }

        public Criteria andMultimediaUrlNotLike(String value) {
            addCriterion("multimedia_url not like", value, "multimediaUrl");
            return (Criteria) this;
        }

        public Criteria andMultimediaUrlIn(List<String> values) {
            addCriterion("multimedia_url in", values, "multimediaUrl");
            return (Criteria) this;
        }

        public Criteria andMultimediaUrlNotIn(List<String> values) {
            addCriterion("multimedia_url not in", values, "multimediaUrl");
            return (Criteria) this;
        }

        public Criteria andMultimediaUrlBetween(String value1, String value2) {
            addCriterion("multimedia_url between", value1, value2, "multimediaUrl");
            return (Criteria) this;
        }

        public Criteria andMultimediaUrlNotBetween(String value1, String value2) {
            addCriterion("multimedia_url not between", value1, value2, "multimediaUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNull() {
            addCriterion("file_url is null");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNotNull() {
            addCriterion("file_url is not null");
            return (Criteria) this;
        }

        public Criteria andFileUrlEqualTo(String value) {
            addCriterion("file_url =", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotEqualTo(String value) {
            addCriterion("file_url <>", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThan(String value) {
            addCriterion("file_url >", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("file_url >=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThan(String value) {
            addCriterion("file_url <", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThanOrEqualTo(String value) {
            addCriterion("file_url <=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLike(String value) {
            addCriterion("file_url like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotLike(String value) {
            addCriterion("file_url not like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlIn(List<String> values) {
            addCriterion("file_url in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotIn(List<String> values) {
            addCriterion("file_url not in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlBetween(String value1, String value2) {
            addCriterion("file_url between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotBetween(String value1, String value2) {
            addCriterion("file_url not between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andVisibilityIsNull() {
            addCriterion("visibility is null");
            return (Criteria) this;
        }

        public Criteria andVisibilityIsNotNull() {
            addCriterion("visibility is not null");
            return (Criteria) this;
        }

        public Criteria andVisibilityEqualTo(Integer value) {
            addCriterion("visibility =", value, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityNotEqualTo(Integer value) {
            addCriterion("visibility <>", value, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityGreaterThan(Integer value) {
            addCriterion("visibility >", value, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("visibility >=", value, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityLessThan(Integer value) {
            addCriterion("visibility <", value, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityLessThanOrEqualTo(Integer value) {
            addCriterion("visibility <=", value, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityIn(List<Integer> values) {
            addCriterion("visibility in", values, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityNotIn(List<Integer> values) {
            addCriterion("visibility not in", values, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityBetween(Integer value1, Integer value2) {
            addCriterion("visibility between", value1, value2, "visibility");
            return (Criteria) this;
        }

        public Criteria andVisibilityNotBetween(Integer value1, Integer value2) {
            addCriterion("visibility not between", value1, value2, "visibility");
            return (Criteria) this;
        }

        public Criteria andReadableUrzidIsNull() {
            addCriterion("readable_urzid is null");
            return (Criteria) this;
        }

        public Criteria andReadableUrzidIsNotNull() {
            addCriterion("readable_urzid is not null");
            return (Criteria) this;
        }

        public Criteria andReadableUrzidEqualTo(String value) {
            addCriterion("readable_urzid =", value, "readableUrzid");
            return (Criteria) this;
        }

        public Criteria andReadableUrzidNotEqualTo(String value) {
            addCriterion("readable_urzid <>", value, "readableUrzid");
            return (Criteria) this;
        }

        public Criteria andReadableUrzidGreaterThan(String value) {
            addCriterion("readable_urzid >", value, "readableUrzid");
            return (Criteria) this;
        }

        public Criteria andReadableUrzidGreaterThanOrEqualTo(String value) {
            addCriterion("readable_urzid >=", value, "readableUrzid");
            return (Criteria) this;
        }

        public Criteria andReadableUrzidLessThan(String value) {
            addCriterion("readable_urzid <", value, "readableUrzid");
            return (Criteria) this;
        }

        public Criteria andReadableUrzidLessThanOrEqualTo(String value) {
            addCriterion("readable_urzid <=", value, "readableUrzid");
            return (Criteria) this;
        }

        public Criteria andReadableUrzidLike(String value) {
            addCriterion("readable_urzid like", value, "readableUrzid");
            return (Criteria) this;
        }

        public Criteria andReadableUrzidNotLike(String value) {
            addCriterion("readable_urzid not like", value, "readableUrzid");
            return (Criteria) this;
        }

        public Criteria andReadableUrzidIn(List<String> values) {
            addCriterion("readable_urzid in", values, "readableUrzid");
            return (Criteria) this;
        }

        public Criteria andReadableUrzidNotIn(List<String> values) {
            addCriterion("readable_urzid not in", values, "readableUrzid");
            return (Criteria) this;
        }

        public Criteria andReadableUrzidBetween(String value1, String value2) {
            addCriterion("readable_urzid between", value1, value2, "readableUrzid");
            return (Criteria) this;
        }

        public Criteria andReadableUrzidNotBetween(String value1, String value2) {
            addCriterion("readable_urzid not between", value1, value2, "readableUrzid");
            return (Criteria) this;
        }

        public Criteria andExcludeUrzidIsNull() {
            addCriterion("exclude_urzid is null");
            return (Criteria) this;
        }

        public Criteria andExcludeUrzidIsNotNull() {
            addCriterion("exclude_urzid is not null");
            return (Criteria) this;
        }

        public Criteria andExcludeUrzidEqualTo(String value) {
            addCriterion("exclude_urzid =", value, "excludeUrzid");
            return (Criteria) this;
        }

        public Criteria andExcludeUrzidNotEqualTo(String value) {
            addCriterion("exclude_urzid <>", value, "excludeUrzid");
            return (Criteria) this;
        }

        public Criteria andExcludeUrzidGreaterThan(String value) {
            addCriterion("exclude_urzid >", value, "excludeUrzid");
            return (Criteria) this;
        }

        public Criteria andExcludeUrzidGreaterThanOrEqualTo(String value) {
            addCriterion("exclude_urzid >=", value, "excludeUrzid");
            return (Criteria) this;
        }

        public Criteria andExcludeUrzidLessThan(String value) {
            addCriterion("exclude_urzid <", value, "excludeUrzid");
            return (Criteria) this;
        }

        public Criteria andExcludeUrzidLessThanOrEqualTo(String value) {
            addCriterion("exclude_urzid <=", value, "excludeUrzid");
            return (Criteria) this;
        }

        public Criteria andExcludeUrzidLike(String value) {
            addCriterion("exclude_urzid like", value, "excludeUrzid");
            return (Criteria) this;
        }

        public Criteria andExcludeUrzidNotLike(String value) {
            addCriterion("exclude_urzid not like", value, "excludeUrzid");
            return (Criteria) this;
        }

        public Criteria andExcludeUrzidIn(List<String> values) {
            addCriterion("exclude_urzid in", values, "excludeUrzid");
            return (Criteria) this;
        }

        public Criteria andExcludeUrzidNotIn(List<String> values) {
            addCriterion("exclude_urzid not in", values, "excludeUrzid");
            return (Criteria) this;
        }

        public Criteria andExcludeUrzidBetween(String value1, String value2) {
            addCriterion("exclude_urzid between", value1, value2, "excludeUrzid");
            return (Criteria) this;
        }

        public Criteria andExcludeUrzidNotBetween(String value1, String value2) {
            addCriterion("exclude_urzid not between", value1, value2, "excludeUrzid");
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