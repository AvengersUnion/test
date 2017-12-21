package com.jump.pojo;

import java.util.ArrayList;
import java.util.List;

public class HonorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HonorExample() {
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

        public Criteria andHonorIdIsNull() {
            addCriterion("honor_id is null");
            return (Criteria) this;
        }

        public Criteria andHonorIdIsNotNull() {
            addCriterion("honor_id is not null");
            return (Criteria) this;
        }

        public Criteria andHonorIdEqualTo(Integer value) {
            addCriterion("honor_id =", value, "honorId");
            return (Criteria) this;
        }

        public Criteria andHonorIdNotEqualTo(Integer value) {
            addCriterion("honor_id <>", value, "honorId");
            return (Criteria) this;
        }

        public Criteria andHonorIdGreaterThan(Integer value) {
            addCriterion("honor_id >", value, "honorId");
            return (Criteria) this;
        }

        public Criteria andHonorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("honor_id >=", value, "honorId");
            return (Criteria) this;
        }

        public Criteria andHonorIdLessThan(Integer value) {
            addCriterion("honor_id <", value, "honorId");
            return (Criteria) this;
        }

        public Criteria andHonorIdLessThanOrEqualTo(Integer value) {
            addCriterion("honor_id <=", value, "honorId");
            return (Criteria) this;
        }

        public Criteria andHonorIdIn(List<Integer> values) {
            addCriterion("honor_id in", values, "honorId");
            return (Criteria) this;
        }

        public Criteria andHonorIdNotIn(List<Integer> values) {
            addCriterion("honor_id not in", values, "honorId");
            return (Criteria) this;
        }

        public Criteria andHonorIdBetween(Integer value1, Integer value2) {
            addCriterion("honor_id between", value1, value2, "honorId");
            return (Criteria) this;
        }

        public Criteria andHonorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("honor_id not between", value1, value2, "honorId");
            return (Criteria) this;
        }

        public Criteria andHonorTitleIsNull() {
            addCriterion("honor_title is null");
            return (Criteria) this;
        }

        public Criteria andHonorTitleIsNotNull() {
            addCriterion("honor_title is not null");
            return (Criteria) this;
        }

        public Criteria andHonorTitleEqualTo(String value) {
            addCriterion("honor_title =", value, "honorTitle");
            return (Criteria) this;
        }

        public Criteria andHonorTitleNotEqualTo(String value) {
            addCriterion("honor_title <>", value, "honorTitle");
            return (Criteria) this;
        }

        public Criteria andHonorTitleGreaterThan(String value) {
            addCriterion("honor_title >", value, "honorTitle");
            return (Criteria) this;
        }

        public Criteria andHonorTitleGreaterThanOrEqualTo(String value) {
            addCriterion("honor_title >=", value, "honorTitle");
            return (Criteria) this;
        }

        public Criteria andHonorTitleLessThan(String value) {
            addCriterion("honor_title <", value, "honorTitle");
            return (Criteria) this;
        }

        public Criteria andHonorTitleLessThanOrEqualTo(String value) {
            addCriterion("honor_title <=", value, "honorTitle");
            return (Criteria) this;
        }

        public Criteria andHonorTitleLike(String value) {
            addCriterion("honor_title like", value, "honorTitle");
            return (Criteria) this;
        }

        public Criteria andHonorTitleNotLike(String value) {
            addCriterion("honor_title not like", value, "honorTitle");
            return (Criteria) this;
        }

        public Criteria andHonorTitleIn(List<String> values) {
            addCriterion("honor_title in", values, "honorTitle");
            return (Criteria) this;
        }

        public Criteria andHonorTitleNotIn(List<String> values) {
            addCriterion("honor_title not in", values, "honorTitle");
            return (Criteria) this;
        }

        public Criteria andHonorTitleBetween(String value1, String value2) {
            addCriterion("honor_title between", value1, value2, "honorTitle");
            return (Criteria) this;
        }

        public Criteria andHonorTitleNotBetween(String value1, String value2) {
            addCriterion("honor_title not between", value1, value2, "honorTitle");
            return (Criteria) this;
        }

        public Criteria andHonorPicIsNull() {
            addCriterion("honor_pic is null");
            return (Criteria) this;
        }

        public Criteria andHonorPicIsNotNull() {
            addCriterion("honor_pic is not null");
            return (Criteria) this;
        }

        public Criteria andHonorPicEqualTo(String value) {
            addCriterion("honor_pic =", value, "honorPic");
            return (Criteria) this;
        }

        public Criteria andHonorPicNotEqualTo(String value) {
            addCriterion("honor_pic <>", value, "honorPic");
            return (Criteria) this;
        }

        public Criteria andHonorPicGreaterThan(String value) {
            addCriterion("honor_pic >", value, "honorPic");
            return (Criteria) this;
        }

        public Criteria andHonorPicGreaterThanOrEqualTo(String value) {
            addCriterion("honor_pic >=", value, "honorPic");
            return (Criteria) this;
        }

        public Criteria andHonorPicLessThan(String value) {
            addCriterion("honor_pic <", value, "honorPic");
            return (Criteria) this;
        }

        public Criteria andHonorPicLessThanOrEqualTo(String value) {
            addCriterion("honor_pic <=", value, "honorPic");
            return (Criteria) this;
        }

        public Criteria andHonorPicLike(String value) {
            addCriterion("honor_pic like", value, "honorPic");
            return (Criteria) this;
        }

        public Criteria andHonorPicNotLike(String value) {
            addCriterion("honor_pic not like", value, "honorPic");
            return (Criteria) this;
        }

        public Criteria andHonorPicIn(List<String> values) {
            addCriterion("honor_pic in", values, "honorPic");
            return (Criteria) this;
        }

        public Criteria andHonorPicNotIn(List<String> values) {
            addCriterion("honor_pic not in", values, "honorPic");
            return (Criteria) this;
        }

        public Criteria andHonorPicBetween(String value1, String value2) {
            addCriterion("honor_pic between", value1, value2, "honorPic");
            return (Criteria) this;
        }

        public Criteria andHonorPicNotBetween(String value1, String value2) {
            addCriterion("honor_pic not between", value1, value2, "honorPic");
            return (Criteria) this;
        }

        public Criteria andHonorSimpleIsNull() {
            addCriterion("honor_simple is null");
            return (Criteria) this;
        }

        public Criteria andHonorSimpleIsNotNull() {
            addCriterion("honor_simple is not null");
            return (Criteria) this;
        }

        public Criteria andHonorSimpleEqualTo(String value) {
            addCriterion("honor_simple =", value, "honorSimple");
            return (Criteria) this;
        }

        public Criteria andHonorSimpleNotEqualTo(String value) {
            addCriterion("honor_simple <>", value, "honorSimple");
            return (Criteria) this;
        }

        public Criteria andHonorSimpleGreaterThan(String value) {
            addCriterion("honor_simple >", value, "honorSimple");
            return (Criteria) this;
        }

        public Criteria andHonorSimpleGreaterThanOrEqualTo(String value) {
            addCriterion("honor_simple >=", value, "honorSimple");
            return (Criteria) this;
        }

        public Criteria andHonorSimpleLessThan(String value) {
            addCriterion("honor_simple <", value, "honorSimple");
            return (Criteria) this;
        }

        public Criteria andHonorSimpleLessThanOrEqualTo(String value) {
            addCriterion("honor_simple <=", value, "honorSimple");
            return (Criteria) this;
        }

        public Criteria andHonorSimpleLike(String value) {
            addCriterion("honor_simple like", value, "honorSimple");
            return (Criteria) this;
        }

        public Criteria andHonorSimpleNotLike(String value) {
            addCriterion("honor_simple not like", value, "honorSimple");
            return (Criteria) this;
        }

        public Criteria andHonorSimpleIn(List<String> values) {
            addCriterion("honor_simple in", values, "honorSimple");
            return (Criteria) this;
        }

        public Criteria andHonorSimpleNotIn(List<String> values) {
            addCriterion("honor_simple not in", values, "honorSimple");
            return (Criteria) this;
        }

        public Criteria andHonorSimpleBetween(String value1, String value2) {
            addCriterion("honor_simple between", value1, value2, "honorSimple");
            return (Criteria) this;
        }

        public Criteria andHonorSimpleNotBetween(String value1, String value2) {
            addCriterion("honor_simple not between", value1, value2, "honorSimple");
            return (Criteria) this;
        }

        public Criteria andHonorFrontIsNull() {
            addCriterion("honor_front is null");
            return (Criteria) this;
        }

        public Criteria andHonorFrontIsNotNull() {
            addCriterion("honor_front is not null");
            return (Criteria) this;
        }

        public Criteria andHonorFrontEqualTo(Integer value) {
            addCriterion("honor_front =", value, "honorFront");
            return (Criteria) this;
        }

        public Criteria andHonorFrontNotEqualTo(Integer value) {
            addCriterion("honor_front <>", value, "honorFront");
            return (Criteria) this;
        }

        public Criteria andHonorFrontGreaterThan(Integer value) {
            addCriterion("honor_front >", value, "honorFront");
            return (Criteria) this;
        }

        public Criteria andHonorFrontGreaterThanOrEqualTo(Integer value) {
            addCriterion("honor_front >=", value, "honorFront");
            return (Criteria) this;
        }

        public Criteria andHonorFrontLessThan(Integer value) {
            addCriterion("honor_front <", value, "honorFront");
            return (Criteria) this;
        }

        public Criteria andHonorFrontLessThanOrEqualTo(Integer value) {
            addCriterion("honor_front <=", value, "honorFront");
            return (Criteria) this;
        }

        public Criteria andHonorFrontIn(List<Integer> values) {
            addCriterion("honor_front in", values, "honorFront");
            return (Criteria) this;
        }

        public Criteria andHonorFrontNotIn(List<Integer> values) {
            addCriterion("honor_front not in", values, "honorFront");
            return (Criteria) this;
        }

        public Criteria andHonorFrontBetween(Integer value1, Integer value2) {
            addCriterion("honor_front between", value1, value2, "honorFront");
            return (Criteria) this;
        }

        public Criteria andHonorFrontNotBetween(Integer value1, Integer value2) {
            addCriterion("honor_front not between", value1, value2, "honorFront");
            return (Criteria) this;
        }

        public Criteria andHonorDecIsNull() {
            addCriterion("honor_dec is null");
            return (Criteria) this;
        }

        public Criteria andHonorDecIsNotNull() {
            addCriterion("honor_dec is not null");
            return (Criteria) this;
        }

        public Criteria andHonorDecEqualTo(Long value) {
            addCriterion("honor_dec =", value, "honorDec");
            return (Criteria) this;
        }

        public Criteria andHonorDecNotEqualTo(Long value) {
            addCriterion("honor_dec <>", value, "honorDec");
            return (Criteria) this;
        }

        public Criteria andHonorDecGreaterThan(Long value) {
            addCriterion("honor_dec >", value, "honorDec");
            return (Criteria) this;
        }

        public Criteria andHonorDecGreaterThanOrEqualTo(Long value) {
            addCriterion("honor_dec >=", value, "honorDec");
            return (Criteria) this;
        }

        public Criteria andHonorDecLessThan(Long value) {
            addCriterion("honor_dec <", value, "honorDec");
            return (Criteria) this;
        }

        public Criteria andHonorDecLessThanOrEqualTo(Long value) {
            addCriterion("honor_dec <=", value, "honorDec");
            return (Criteria) this;
        }

        public Criteria andHonorDecIn(List<Long> values) {
            addCriterion("honor_dec in", values, "honorDec");
            return (Criteria) this;
        }

        public Criteria andHonorDecNotIn(List<Long> values) {
            addCriterion("honor_dec not in", values, "honorDec");
            return (Criteria) this;
        }

        public Criteria andHonorDecBetween(Long value1, Long value2) {
            addCriterion("honor_dec between", value1, value2, "honorDec");
            return (Criteria) this;
        }

        public Criteria andHonorDecNotBetween(Long value1, Long value2) {
            addCriterion("honor_dec not between", value1, value2, "honorDec");
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