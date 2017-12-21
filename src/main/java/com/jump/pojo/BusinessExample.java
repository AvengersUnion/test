package com.jump.pojo;

import java.util.ArrayList;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessExample() {
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

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessTitleIsNull() {
            addCriterion("business_title is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTitleIsNotNull() {
            addCriterion("business_title is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTitleEqualTo(String value) {
            addCriterion("business_title =", value, "businessTitle");
            return (Criteria) this;
        }

        public Criteria andBusinessTitleNotEqualTo(String value) {
            addCriterion("business_title <>", value, "businessTitle");
            return (Criteria) this;
        }

        public Criteria andBusinessTitleGreaterThan(String value) {
            addCriterion("business_title >", value, "businessTitle");
            return (Criteria) this;
        }

        public Criteria andBusinessTitleGreaterThanOrEqualTo(String value) {
            addCriterion("business_title >=", value, "businessTitle");
            return (Criteria) this;
        }

        public Criteria andBusinessTitleLessThan(String value) {
            addCriterion("business_title <", value, "businessTitle");
            return (Criteria) this;
        }

        public Criteria andBusinessTitleLessThanOrEqualTo(String value) {
            addCriterion("business_title <=", value, "businessTitle");
            return (Criteria) this;
        }

        public Criteria andBusinessTitleLike(String value) {
            addCriterion("business_title like", value, "businessTitle");
            return (Criteria) this;
        }

        public Criteria andBusinessTitleNotLike(String value) {
            addCriterion("business_title not like", value, "businessTitle");
            return (Criteria) this;
        }

        public Criteria andBusinessTitleIn(List<String> values) {
            addCriterion("business_title in", values, "businessTitle");
            return (Criteria) this;
        }

        public Criteria andBusinessTitleNotIn(List<String> values) {
            addCriterion("business_title not in", values, "businessTitle");
            return (Criteria) this;
        }

        public Criteria andBusinessTitleBetween(String value1, String value2) {
            addCriterion("business_title between", value1, value2, "businessTitle");
            return (Criteria) this;
        }

        public Criteria andBusinessTitleNotBetween(String value1, String value2) {
            addCriterion("business_title not between", value1, value2, "businessTitle");
            return (Criteria) this;
        }

        public Criteria andBusinessPicIsNull() {
            addCriterion("business_pic is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPicIsNotNull() {
            addCriterion("business_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPicEqualTo(String value) {
            addCriterion("business_pic =", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicNotEqualTo(String value) {
            addCriterion("business_pic <>", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicGreaterThan(String value) {
            addCriterion("business_pic >", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicGreaterThanOrEqualTo(String value) {
            addCriterion("business_pic >=", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicLessThan(String value) {
            addCriterion("business_pic <", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicLessThanOrEqualTo(String value) {
            addCriterion("business_pic <=", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicLike(String value) {
            addCriterion("business_pic like", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicNotLike(String value) {
            addCriterion("business_pic not like", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicIn(List<String> values) {
            addCriterion("business_pic in", values, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicNotIn(List<String> values) {
            addCriterion("business_pic not in", values, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicBetween(String value1, String value2) {
            addCriterion("business_pic between", value1, value2, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicNotBetween(String value1, String value2) {
            addCriterion("business_pic not between", value1, value2, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessSimpleIsNull() {
            addCriterion("business_simple is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSimpleIsNotNull() {
            addCriterion("business_simple is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSimpleEqualTo(String value) {
            addCriterion("business_simple =", value, "businessSimple");
            return (Criteria) this;
        }

        public Criteria andBusinessSimpleNotEqualTo(String value) {
            addCriterion("business_simple <>", value, "businessSimple");
            return (Criteria) this;
        }

        public Criteria andBusinessSimpleGreaterThan(String value) {
            addCriterion("business_simple >", value, "businessSimple");
            return (Criteria) this;
        }

        public Criteria andBusinessSimpleGreaterThanOrEqualTo(String value) {
            addCriterion("business_simple >=", value, "businessSimple");
            return (Criteria) this;
        }

        public Criteria andBusinessSimpleLessThan(String value) {
            addCriterion("business_simple <", value, "businessSimple");
            return (Criteria) this;
        }

        public Criteria andBusinessSimpleLessThanOrEqualTo(String value) {
            addCriterion("business_simple <=", value, "businessSimple");
            return (Criteria) this;
        }

        public Criteria andBusinessSimpleLike(String value) {
            addCriterion("business_simple like", value, "businessSimple");
            return (Criteria) this;
        }

        public Criteria andBusinessSimpleNotLike(String value) {
            addCriterion("business_simple not like", value, "businessSimple");
            return (Criteria) this;
        }

        public Criteria andBusinessSimpleIn(List<String> values) {
            addCriterion("business_simple in", values, "businessSimple");
            return (Criteria) this;
        }

        public Criteria andBusinessSimpleNotIn(List<String> values) {
            addCriterion("business_simple not in", values, "businessSimple");
            return (Criteria) this;
        }

        public Criteria andBusinessSimpleBetween(String value1, String value2) {
            addCriterion("business_simple between", value1, value2, "businessSimple");
            return (Criteria) this;
        }

        public Criteria andBusinessSimpleNotBetween(String value1, String value2) {
            addCriterion("business_simple not between", value1, value2, "businessSimple");
            return (Criteria) this;
        }

        public Criteria andBusinessFrontIsNull() {
            addCriterion("business_front is null");
            return (Criteria) this;
        }

        public Criteria andBusinessFrontIsNotNull() {
            addCriterion("business_front is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessFrontEqualTo(Integer value) {
            addCriterion("business_front =", value, "businessFront");
            return (Criteria) this;
        }

        public Criteria andBusinessFrontNotEqualTo(Integer value) {
            addCriterion("business_front <>", value, "businessFront");
            return (Criteria) this;
        }

        public Criteria andBusinessFrontGreaterThan(Integer value) {
            addCriterion("business_front >", value, "businessFront");
            return (Criteria) this;
        }

        public Criteria andBusinessFrontGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_front >=", value, "businessFront");
            return (Criteria) this;
        }

        public Criteria andBusinessFrontLessThan(Integer value) {
            addCriterion("business_front <", value, "businessFront");
            return (Criteria) this;
        }

        public Criteria andBusinessFrontLessThanOrEqualTo(Integer value) {
            addCriterion("business_front <=", value, "businessFront");
            return (Criteria) this;
        }

        public Criteria andBusinessFrontIn(List<Integer> values) {
            addCriterion("business_front in", values, "businessFront");
            return (Criteria) this;
        }

        public Criteria andBusinessFrontNotIn(List<Integer> values) {
            addCriterion("business_front not in", values, "businessFront");
            return (Criteria) this;
        }

        public Criteria andBusinessFrontBetween(Integer value1, Integer value2) {
            addCriterion("business_front between", value1, value2, "businessFront");
            return (Criteria) this;
        }

        public Criteria andBusinessFrontNotBetween(Integer value1, Integer value2) {
            addCriterion("business_front not between", value1, value2, "businessFront");
            return (Criteria) this;
        }

        public Criteria andBusinessDecIsNull() {
            addCriterion("business_dec is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDecIsNotNull() {
            addCriterion("business_dec is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDecEqualTo(Long value) {
            addCriterion("business_dec =", value, "businessDec");
            return (Criteria) this;
        }

        public Criteria andBusinessDecNotEqualTo(Long value) {
            addCriterion("business_dec <>", value, "businessDec");
            return (Criteria) this;
        }

        public Criteria andBusinessDecGreaterThan(Long value) {
            addCriterion("business_dec >", value, "businessDec");
            return (Criteria) this;
        }

        public Criteria andBusinessDecGreaterThanOrEqualTo(Long value) {
            addCriterion("business_dec >=", value, "businessDec");
            return (Criteria) this;
        }

        public Criteria andBusinessDecLessThan(Long value) {
            addCriterion("business_dec <", value, "businessDec");
            return (Criteria) this;
        }

        public Criteria andBusinessDecLessThanOrEqualTo(Long value) {
            addCriterion("business_dec <=", value, "businessDec");
            return (Criteria) this;
        }

        public Criteria andBusinessDecIn(List<Long> values) {
            addCriterion("business_dec in", values, "businessDec");
            return (Criteria) this;
        }

        public Criteria andBusinessDecNotIn(List<Long> values) {
            addCriterion("business_dec not in", values, "businessDec");
            return (Criteria) this;
        }

        public Criteria andBusinessDecBetween(Long value1, Long value2) {
            addCriterion("business_dec between", value1, value2, "businessDec");
            return (Criteria) this;
        }

        public Criteria andBusinessDecNotBetween(Long value1, Long value2) {
            addCriterion("business_dec not between", value1, value2, "businessDec");
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