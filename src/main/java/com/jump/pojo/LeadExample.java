package com.jump.pojo;

import java.util.ArrayList;
import java.util.List;

public class LeadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeadExample() {
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

        public Criteria andLeadIdIsNull() {
            addCriterion("lead_id is null");
            return (Criteria) this;
        }

        public Criteria andLeadIdIsNotNull() {
            addCriterion("lead_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeadIdEqualTo(Integer value) {
            addCriterion("lead_id =", value, "leadId");
            return (Criteria) this;
        }

        public Criteria andLeadIdNotEqualTo(Integer value) {
            addCriterion("lead_id <>", value, "leadId");
            return (Criteria) this;
        }

        public Criteria andLeadIdGreaterThan(Integer value) {
            addCriterion("lead_id >", value, "leadId");
            return (Criteria) this;
        }

        public Criteria andLeadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lead_id >=", value, "leadId");
            return (Criteria) this;
        }

        public Criteria andLeadIdLessThan(Integer value) {
            addCriterion("lead_id <", value, "leadId");
            return (Criteria) this;
        }

        public Criteria andLeadIdLessThanOrEqualTo(Integer value) {
            addCriterion("lead_id <=", value, "leadId");
            return (Criteria) this;
        }

        public Criteria andLeadIdIn(List<Integer> values) {
            addCriterion("lead_id in", values, "leadId");
            return (Criteria) this;
        }

        public Criteria andLeadIdNotIn(List<Integer> values) {
            addCriterion("lead_id not in", values, "leadId");
            return (Criteria) this;
        }

        public Criteria andLeadIdBetween(Integer value1, Integer value2) {
            addCriterion("lead_id between", value1, value2, "leadId");
            return (Criteria) this;
        }

        public Criteria andLeadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lead_id not between", value1, value2, "leadId");
            return (Criteria) this;
        }

        public Criteria andLeadNameIsNull() {
            addCriterion("lead_name is null");
            return (Criteria) this;
        }

        public Criteria andLeadNameIsNotNull() {
            addCriterion("lead_name is not null");
            return (Criteria) this;
        }

        public Criteria andLeadNameEqualTo(String value) {
            addCriterion("lead_name =", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameNotEqualTo(String value) {
            addCriterion("lead_name <>", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameGreaterThan(String value) {
            addCriterion("lead_name >", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameGreaterThanOrEqualTo(String value) {
            addCriterion("lead_name >=", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameLessThan(String value) {
            addCriterion("lead_name <", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameLessThanOrEqualTo(String value) {
            addCriterion("lead_name <=", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameLike(String value) {
            addCriterion("lead_name like", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameNotLike(String value) {
            addCriterion("lead_name not like", value, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameIn(List<String> values) {
            addCriterion("lead_name in", values, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameNotIn(List<String> values) {
            addCriterion("lead_name not in", values, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameBetween(String value1, String value2) {
            addCriterion("lead_name between", value1, value2, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadNameNotBetween(String value1, String value2) {
            addCriterion("lead_name not between", value1, value2, "leadName");
            return (Criteria) this;
        }

        public Criteria andLeadParentidIsNull() {
            addCriterion("lead_parentId is null");
            return (Criteria) this;
        }

        public Criteria andLeadParentidIsNotNull() {
            addCriterion("lead_parentId is not null");
            return (Criteria) this;
        }

        public Criteria andLeadParentidEqualTo(Integer value) {
            addCriterion("lead_parentId =", value, "leadParentid");
            return (Criteria) this;
        }

        public Criteria andLeadParentidNotEqualTo(Integer value) {
            addCriterion("lead_parentId <>", value, "leadParentid");
            return (Criteria) this;
        }

        public Criteria andLeadParentidGreaterThan(Integer value) {
            addCriterion("lead_parentId >", value, "leadParentid");
            return (Criteria) this;
        }

        public Criteria andLeadParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lead_parentId >=", value, "leadParentid");
            return (Criteria) this;
        }

        public Criteria andLeadParentidLessThan(Integer value) {
            addCriterion("lead_parentId <", value, "leadParentid");
            return (Criteria) this;
        }

        public Criteria andLeadParentidLessThanOrEqualTo(Integer value) {
            addCriterion("lead_parentId <=", value, "leadParentid");
            return (Criteria) this;
        }

        public Criteria andLeadParentidIn(List<Integer> values) {
            addCriterion("lead_parentId in", values, "leadParentid");
            return (Criteria) this;
        }

        public Criteria andLeadParentidNotIn(List<Integer> values) {
            addCriterion("lead_parentId not in", values, "leadParentid");
            return (Criteria) this;
        }

        public Criteria andLeadParentidBetween(Integer value1, Integer value2) {
            addCriterion("lead_parentId between", value1, value2, "leadParentid");
            return (Criteria) this;
        }

        public Criteria andLeadParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("lead_parentId not between", value1, value2, "leadParentid");
            return (Criteria) this;
        }

        public Criteria andLeadUrlIsNull() {
            addCriterion("lead_url is null");
            return (Criteria) this;
        }

        public Criteria andLeadUrlIsNotNull() {
            addCriterion("lead_url is not null");
            return (Criteria) this;
        }

        public Criteria andLeadUrlEqualTo(String value) {
            addCriterion("lead_url =", value, "leadUrl");
            return (Criteria) this;
        }

        public Criteria andLeadUrlNotEqualTo(String value) {
            addCriterion("lead_url <>", value, "leadUrl");
            return (Criteria) this;
        }

        public Criteria andLeadUrlGreaterThan(String value) {
            addCriterion("lead_url >", value, "leadUrl");
            return (Criteria) this;
        }

        public Criteria andLeadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("lead_url >=", value, "leadUrl");
            return (Criteria) this;
        }

        public Criteria andLeadUrlLessThan(String value) {
            addCriterion("lead_url <", value, "leadUrl");
            return (Criteria) this;
        }

        public Criteria andLeadUrlLessThanOrEqualTo(String value) {
            addCriterion("lead_url <=", value, "leadUrl");
            return (Criteria) this;
        }

        public Criteria andLeadUrlLike(String value) {
            addCriterion("lead_url like", value, "leadUrl");
            return (Criteria) this;
        }

        public Criteria andLeadUrlNotLike(String value) {
            addCriterion("lead_url not like", value, "leadUrl");
            return (Criteria) this;
        }

        public Criteria andLeadUrlIn(List<String> values) {
            addCriterion("lead_url in", values, "leadUrl");
            return (Criteria) this;
        }

        public Criteria andLeadUrlNotIn(List<String> values) {
            addCriterion("lead_url not in", values, "leadUrl");
            return (Criteria) this;
        }

        public Criteria andLeadUrlBetween(String value1, String value2) {
            addCriterion("lead_url between", value1, value2, "leadUrl");
            return (Criteria) this;
        }

        public Criteria andLeadUrlNotBetween(String value1, String value2) {
            addCriterion("lead_url not between", value1, value2, "leadUrl");
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