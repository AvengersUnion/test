package com.jump.pojo;

import java.util.ArrayList;
import java.util.List;

public class InformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InformationExample() {
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

        public Criteria andInfoIdIsNull() {
            addCriterion("info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(Integer value) {
            addCriterion("info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(Integer value) {
            addCriterion("info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(Integer value) {
            addCriterion("info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(Integer value) {
            addCriterion("info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<Integer> values) {
            addCriterion("info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<Integer> values) {
            addCriterion("info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("info_id not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoTitleIsNull() {
            addCriterion("info_title is null");
            return (Criteria) this;
        }

        public Criteria andInfoTitleIsNotNull() {
            addCriterion("info_title is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEqualTo(String value) {
            addCriterion("info_title =", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleNotEqualTo(String value) {
            addCriterion("info_title <>", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleGreaterThan(String value) {
            addCriterion("info_title >", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("info_title >=", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleLessThan(String value) {
            addCriterion("info_title <", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleLessThanOrEqualTo(String value) {
            addCriterion("info_title <=", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleLike(String value) {
            addCriterion("info_title like", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleNotLike(String value) {
            addCriterion("info_title not like", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleIn(List<String> values) {
            addCriterion("info_title in", values, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleNotIn(List<String> values) {
            addCriterion("info_title not in", values, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleBetween(String value1, String value2) {
            addCriterion("info_title between", value1, value2, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleNotBetween(String value1, String value2) {
            addCriterion("info_title not between", value1, value2, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoPicIsNull() {
            addCriterion("info_pic is null");
            return (Criteria) this;
        }

        public Criteria andInfoPicIsNotNull() {
            addCriterion("info_pic is not null");
            return (Criteria) this;
        }

        public Criteria andInfoPicEqualTo(String value) {
            addCriterion("info_pic =", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicNotEqualTo(String value) {
            addCriterion("info_pic <>", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicGreaterThan(String value) {
            addCriterion("info_pic >", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicGreaterThanOrEqualTo(String value) {
            addCriterion("info_pic >=", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicLessThan(String value) {
            addCriterion("info_pic <", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicLessThanOrEqualTo(String value) {
            addCriterion("info_pic <=", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicLike(String value) {
            addCriterion("info_pic like", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicNotLike(String value) {
            addCriterion("info_pic not like", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicIn(List<String> values) {
            addCriterion("info_pic in", values, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicNotIn(List<String> values) {
            addCriterion("info_pic not in", values, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicBetween(String value1, String value2) {
            addCriterion("info_pic between", value1, value2, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicNotBetween(String value1, String value2) {
            addCriterion("info_pic not between", value1, value2, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoCreateTimeIsNull() {
            addCriterion("info_create_time is null");
            return (Criteria) this;
        }

        public Criteria andInfoCreateTimeIsNotNull() {
            addCriterion("info_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andInfoCreateTimeEqualTo(String value) {
            addCriterion("info_create_time =", value, "infoCreateTime");
            return (Criteria) this;
        }

        public Criteria andInfoCreateTimeNotEqualTo(String value) {
            addCriterion("info_create_time <>", value, "infoCreateTime");
            return (Criteria) this;
        }

        public Criteria andInfoCreateTimeGreaterThan(String value) {
            addCriterion("info_create_time >", value, "infoCreateTime");
            return (Criteria) this;
        }

        public Criteria andInfoCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("info_create_time >=", value, "infoCreateTime");
            return (Criteria) this;
        }

        public Criteria andInfoCreateTimeLessThan(String value) {
            addCriterion("info_create_time <", value, "infoCreateTime");
            return (Criteria) this;
        }

        public Criteria andInfoCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("info_create_time <=", value, "infoCreateTime");
            return (Criteria) this;
        }

        public Criteria andInfoCreateTimeLike(String value) {
            addCriterion("info_create_time like", value, "infoCreateTime");
            return (Criteria) this;
        }

        public Criteria andInfoCreateTimeNotLike(String value) {
            addCriterion("info_create_time not like", value, "infoCreateTime");
            return (Criteria) this;
        }

        public Criteria andInfoCreateTimeIn(List<String> values) {
            addCriterion("info_create_time in", values, "infoCreateTime");
            return (Criteria) this;
        }

        public Criteria andInfoCreateTimeNotIn(List<String> values) {
            addCriterion("info_create_time not in", values, "infoCreateTime");
            return (Criteria) this;
        }

        public Criteria andInfoCreateTimeBetween(String value1, String value2) {
            addCriterion("info_create_time between", value1, value2, "infoCreateTime");
            return (Criteria) this;
        }

        public Criteria andInfoCreateTimeNotBetween(String value1, String value2) {
            addCriterion("info_create_time not between", value1, value2, "infoCreateTime");
            return (Criteria) this;
        }

        public Criteria andInfoKeywordIsNull() {
            addCriterion("info_keyword is null");
            return (Criteria) this;
        }

        public Criteria andInfoKeywordIsNotNull() {
            addCriterion("info_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andInfoKeywordEqualTo(String value) {
            addCriterion("info_keyword =", value, "infoKeyword");
            return (Criteria) this;
        }

        public Criteria andInfoKeywordNotEqualTo(String value) {
            addCriterion("info_keyword <>", value, "infoKeyword");
            return (Criteria) this;
        }

        public Criteria andInfoKeywordGreaterThan(String value) {
            addCriterion("info_keyword >", value, "infoKeyword");
            return (Criteria) this;
        }

        public Criteria andInfoKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("info_keyword >=", value, "infoKeyword");
            return (Criteria) this;
        }

        public Criteria andInfoKeywordLessThan(String value) {
            addCriterion("info_keyword <", value, "infoKeyword");
            return (Criteria) this;
        }

        public Criteria andInfoKeywordLessThanOrEqualTo(String value) {
            addCriterion("info_keyword <=", value, "infoKeyword");
            return (Criteria) this;
        }

        public Criteria andInfoKeywordLike(String value) {
            addCriterion("info_keyword like", value, "infoKeyword");
            return (Criteria) this;
        }

        public Criteria andInfoKeywordNotLike(String value) {
            addCriterion("info_keyword not like", value, "infoKeyword");
            return (Criteria) this;
        }

        public Criteria andInfoKeywordIn(List<String> values) {
            addCriterion("info_keyword in", values, "infoKeyword");
            return (Criteria) this;
        }

        public Criteria andInfoKeywordNotIn(List<String> values) {
            addCriterion("info_keyword not in", values, "infoKeyword");
            return (Criteria) this;
        }

        public Criteria andInfoKeywordBetween(String value1, String value2) {
            addCriterion("info_keyword between", value1, value2, "infoKeyword");
            return (Criteria) this;
        }

        public Criteria andInfoKeywordNotBetween(String value1, String value2) {
            addCriterion("info_keyword not between", value1, value2, "infoKeyword");
            return (Criteria) this;
        }

        public Criteria andInfoFrontIsNull() {
            addCriterion("info_front is null");
            return (Criteria) this;
        }

        public Criteria andInfoFrontIsNotNull() {
            addCriterion("info_front is not null");
            return (Criteria) this;
        }

        public Criteria andInfoFrontEqualTo(Integer value) {
            addCriterion("info_front =", value, "infoFront");
            return (Criteria) this;
        }

        public Criteria andInfoFrontNotEqualTo(Integer value) {
            addCriterion("info_front <>", value, "infoFront");
            return (Criteria) this;
        }

        public Criteria andInfoFrontGreaterThan(Integer value) {
            addCriterion("info_front >", value, "infoFront");
            return (Criteria) this;
        }

        public Criteria andInfoFrontGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_front >=", value, "infoFront");
            return (Criteria) this;
        }

        public Criteria andInfoFrontLessThan(Integer value) {
            addCriterion("info_front <", value, "infoFront");
            return (Criteria) this;
        }

        public Criteria andInfoFrontLessThanOrEqualTo(Integer value) {
            addCriterion("info_front <=", value, "infoFront");
            return (Criteria) this;
        }

        public Criteria andInfoFrontIn(List<Integer> values) {
            addCriterion("info_front in", values, "infoFront");
            return (Criteria) this;
        }

        public Criteria andInfoFrontNotIn(List<Integer> values) {
            addCriterion("info_front not in", values, "infoFront");
            return (Criteria) this;
        }

        public Criteria andInfoFrontBetween(Integer value1, Integer value2) {
            addCriterion("info_front between", value1, value2, "infoFront");
            return (Criteria) this;
        }

        public Criteria andInfoFrontNotBetween(Integer value1, Integer value2) {
            addCriterion("info_front not between", value1, value2, "infoFront");
            return (Criteria) this;
        }

        public Criteria andInfoDecIsNull() {
            addCriterion("info_dec is null");
            return (Criteria) this;
        }

        public Criteria andInfoDecIsNotNull() {
            addCriterion("info_dec is not null");
            return (Criteria) this;
        }

        public Criteria andInfoDecEqualTo(Long value) {
            addCriterion("info_dec =", value, "infoDec");
            return (Criteria) this;
        }

        public Criteria andInfoDecNotEqualTo(Long value) {
            addCriterion("info_dec <>", value, "infoDec");
            return (Criteria) this;
        }

        public Criteria andInfoDecGreaterThan(Long value) {
            addCriterion("info_dec >", value, "infoDec");
            return (Criteria) this;
        }

        public Criteria andInfoDecGreaterThanOrEqualTo(Long value) {
            addCriterion("info_dec >=", value, "infoDec");
            return (Criteria) this;
        }

        public Criteria andInfoDecLessThan(Long value) {
            addCriterion("info_dec <", value, "infoDec");
            return (Criteria) this;
        }

        public Criteria andInfoDecLessThanOrEqualTo(Long value) {
            addCriterion("info_dec <=", value, "infoDec");
            return (Criteria) this;
        }

        public Criteria andInfoDecIn(List<Long> values) {
            addCriterion("info_dec in", values, "infoDec");
            return (Criteria) this;
        }

        public Criteria andInfoDecNotIn(List<Long> values) {
            addCriterion("info_dec not in", values, "infoDec");
            return (Criteria) this;
        }

        public Criteria andInfoDecBetween(Long value1, Long value2) {
            addCriterion("info_dec between", value1, value2, "infoDec");
            return (Criteria) this;
        }

        public Criteria andInfoDecNotBetween(Long value1, Long value2) {
            addCriterion("info_dec not between", value1, value2, "infoDec");
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