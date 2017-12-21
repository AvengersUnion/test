package com.jump.pojo;

import java.util.ArrayList;
import java.util.List;

public class BigadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BigadExample() {
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

        public Criteria andBigadIdIsNull() {
            addCriterion("bigad_id is null");
            return (Criteria) this;
        }

        public Criteria andBigadIdIsNotNull() {
            addCriterion("bigad_id is not null");
            return (Criteria) this;
        }

        public Criteria andBigadIdEqualTo(Integer value) {
            addCriterion("bigad_id =", value, "bigadId");
            return (Criteria) this;
        }

        public Criteria andBigadIdNotEqualTo(Integer value) {
            addCriterion("bigad_id <>", value, "bigadId");
            return (Criteria) this;
        }

        public Criteria andBigadIdGreaterThan(Integer value) {
            addCriterion("bigad_id >", value, "bigadId");
            return (Criteria) this;
        }

        public Criteria andBigadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bigad_id >=", value, "bigadId");
            return (Criteria) this;
        }

        public Criteria andBigadIdLessThan(Integer value) {
            addCriterion("bigad_id <", value, "bigadId");
            return (Criteria) this;
        }

        public Criteria andBigadIdLessThanOrEqualTo(Integer value) {
            addCriterion("bigad_id <=", value, "bigadId");
            return (Criteria) this;
        }

        public Criteria andBigadIdIn(List<Integer> values) {
            addCriterion("bigad_id in", values, "bigadId");
            return (Criteria) this;
        }

        public Criteria andBigadIdNotIn(List<Integer> values) {
            addCriterion("bigad_id not in", values, "bigadId");
            return (Criteria) this;
        }

        public Criteria andBigadIdBetween(Integer value1, Integer value2) {
            addCriterion("bigad_id between", value1, value2, "bigadId");
            return (Criteria) this;
        }

        public Criteria andBigadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bigad_id not between", value1, value2, "bigadId");
            return (Criteria) this;
        }

        public Criteria andBigadPicIsNull() {
            addCriterion("bigad_pic is null");
            return (Criteria) this;
        }

        public Criteria andBigadPicIsNotNull() {
            addCriterion("bigad_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBigadPicEqualTo(String value) {
            addCriterion("bigad_pic =", value, "bigadPic");
            return (Criteria) this;
        }

        public Criteria andBigadPicNotEqualTo(String value) {
            addCriterion("bigad_pic <>", value, "bigadPic");
            return (Criteria) this;
        }

        public Criteria andBigadPicGreaterThan(String value) {
            addCriterion("bigad_pic >", value, "bigadPic");
            return (Criteria) this;
        }

        public Criteria andBigadPicGreaterThanOrEqualTo(String value) {
            addCriterion("bigad_pic >=", value, "bigadPic");
            return (Criteria) this;
        }

        public Criteria andBigadPicLessThan(String value) {
            addCriterion("bigad_pic <", value, "bigadPic");
            return (Criteria) this;
        }

        public Criteria andBigadPicLessThanOrEqualTo(String value) {
            addCriterion("bigad_pic <=", value, "bigadPic");
            return (Criteria) this;
        }

        public Criteria andBigadPicLike(String value) {
            addCriterion("bigad_pic like", value, "bigadPic");
            return (Criteria) this;
        }

        public Criteria andBigadPicNotLike(String value) {
            addCriterion("bigad_pic not like", value, "bigadPic");
            return (Criteria) this;
        }

        public Criteria andBigadPicIn(List<String> values) {
            addCriterion("bigad_pic in", values, "bigadPic");
            return (Criteria) this;
        }

        public Criteria andBigadPicNotIn(List<String> values) {
            addCriterion("bigad_pic not in", values, "bigadPic");
            return (Criteria) this;
        }

        public Criteria andBigadPicBetween(String value1, String value2) {
            addCriterion("bigad_pic between", value1, value2, "bigadPic");
            return (Criteria) this;
        }

        public Criteria andBigadPicNotBetween(String value1, String value2) {
            addCriterion("bigad_pic not between", value1, value2, "bigadPic");
            return (Criteria) this;
        }

        public Criteria andBigadFrontIsNull() {
            addCriterion("bigad_front is null");
            return (Criteria) this;
        }

        public Criteria andBigadFrontIsNotNull() {
            addCriterion("bigad_front is not null");
            return (Criteria) this;
        }

        public Criteria andBigadFrontEqualTo(Integer value) {
            addCriterion("bigad_front =", value, "bigadFront");
            return (Criteria) this;
        }

        public Criteria andBigadFrontNotEqualTo(Integer value) {
            addCriterion("bigad_front <>", value, "bigadFront");
            return (Criteria) this;
        }

        public Criteria andBigadFrontGreaterThan(Integer value) {
            addCriterion("bigad_front >", value, "bigadFront");
            return (Criteria) this;
        }

        public Criteria andBigadFrontGreaterThanOrEqualTo(Integer value) {
            addCriterion("bigad_front >=", value, "bigadFront");
            return (Criteria) this;
        }

        public Criteria andBigadFrontLessThan(Integer value) {
            addCriterion("bigad_front <", value, "bigadFront");
            return (Criteria) this;
        }

        public Criteria andBigadFrontLessThanOrEqualTo(Integer value) {
            addCriterion("bigad_front <=", value, "bigadFront");
            return (Criteria) this;
        }

        public Criteria andBigadFrontIn(List<Integer> values) {
            addCriterion("bigad_front in", values, "bigadFront");
            return (Criteria) this;
        }

        public Criteria andBigadFrontNotIn(List<Integer> values) {
            addCriterion("bigad_front not in", values, "bigadFront");
            return (Criteria) this;
        }

        public Criteria andBigadFrontBetween(Integer value1, Integer value2) {
            addCriterion("bigad_front between", value1, value2, "bigadFront");
            return (Criteria) this;
        }

        public Criteria andBigadFrontNotBetween(Integer value1, Integer value2) {
            addCriterion("bigad_front not between", value1, value2, "bigadFront");
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