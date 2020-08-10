package com.yyj.studentmanagement.po;

import java.util.ArrayList;
import java.util.List;

public class ClassExample {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andClass_idIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClass_idIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClass_idEqualTo(String value) {
            addCriterion("class_id =", value, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idNotEqualTo(String value) {
            addCriterion("class_id <>", value, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idGreaterThan(String value) {
            addCriterion("class_id >", value, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idGreaterThanOrEqualTo(String value) {
            addCriterion("class_id >=", value, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idLessThan(String value) {
            addCriterion("class_id <", value, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idLessThanOrEqualTo(String value) {
            addCriterion("class_id <=", value, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idLike(String value) {
            addCriterion("class_id like", value, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idNotLike(String value) {
            addCriterion("class_id not like", value, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idIn(List<String> values) {
            addCriterion("class_id in", values, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idNotIn(List<String> values) {
            addCriterion("class_id not in", values, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idBetween(String value1, String value2) {
            addCriterion("class_id between", value1, value2, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idNotBetween(String value1, String value2) {
            addCriterion("class_id not between", value1, value2, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_nameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClass_nameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClass_nameEqualTo(String value) {
            addCriterion("class_name =", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameGreaterThan(String value) {
            addCriterion("class_name >", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameLessThan(String value) {
            addCriterion("class_name <", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameLike(String value) {
            addCriterion("class_name like", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameNotLike(String value) {
            addCriterion("class_name not like", value, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameIn(List<String> values) {
            addCriterion("class_name in", values, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "class_name");
            return (Criteria) this;
        }

        public Criteria andClass_nameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "class_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_idIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_idIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_idEqualTo(String value) {
            addCriterion("teacher_id =", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idNotEqualTo(String value) {
            addCriterion("teacher_id <>", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idGreaterThan(String value) {
            addCriterion("teacher_id >", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_id >=", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idLessThan(String value) {
            addCriterion("teacher_id <", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idLessThanOrEqualTo(String value) {
            addCriterion("teacher_id <=", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idLike(String value) {
            addCriterion("teacher_id like", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idNotLike(String value) {
            addCriterion("teacher_id not like", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idIn(List<String> values) {
            addCriterion("teacher_id in", values, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idNotIn(List<String> values) {
            addCriterion("teacher_id not in", values, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idBetween(String value1, String value2) {
            addCriterion("teacher_id between", value1, value2, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idNotBetween(String value1, String value2) {
            addCriterion("teacher_id not between", value1, value2, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andClass_addressIsNull() {
            addCriterion("class_address is null");
            return (Criteria) this;
        }

        public Criteria andClass_addressIsNotNull() {
            addCriterion("class_address is not null");
            return (Criteria) this;
        }

        public Criteria andClass_addressEqualTo(String value) {
            addCriterion("class_address =", value, "class_address");
            return (Criteria) this;
        }

        public Criteria andClass_addressNotEqualTo(String value) {
            addCriterion("class_address <>", value, "class_address");
            return (Criteria) this;
        }

        public Criteria andClass_addressGreaterThan(String value) {
            addCriterion("class_address >", value, "class_address");
            return (Criteria) this;
        }

        public Criteria andClass_addressGreaterThanOrEqualTo(String value) {
            addCriterion("class_address >=", value, "class_address");
            return (Criteria) this;
        }

        public Criteria andClass_addressLessThan(String value) {
            addCriterion("class_address <", value, "class_address");
            return (Criteria) this;
        }

        public Criteria andClass_addressLessThanOrEqualTo(String value) {
            addCriterion("class_address <=", value, "class_address");
            return (Criteria) this;
        }

        public Criteria andClass_addressLike(String value) {
            addCriterion("class_address like", value, "class_address");
            return (Criteria) this;
        }

        public Criteria andClass_addressNotLike(String value) {
            addCriterion("class_address not like", value, "class_address");
            return (Criteria) this;
        }

        public Criteria andClass_addressIn(List<String> values) {
            addCriterion("class_address in", values, "class_address");
            return (Criteria) this;
        }

        public Criteria andClass_addressNotIn(List<String> values) {
            addCriterion("class_address not in", values, "class_address");
            return (Criteria) this;
        }

        public Criteria andClass_addressBetween(String value1, String value2) {
            addCriterion("class_address between", value1, value2, "class_address");
            return (Criteria) this;
        }

        public Criteria andClass_addressNotBetween(String value1, String value2) {
            addCriterion("class_address not between", value1, value2, "class_address");
            return (Criteria) this;
        }

        public Criteria andClass_timeIsNull() {
            addCriterion("class_time is null");
            return (Criteria) this;
        }

        public Criteria andClass_timeIsNotNull() {
            addCriterion("class_time is not null");
            return (Criteria) this;
        }

        public Criteria andClass_timeEqualTo(String value) {
            addCriterion("class_time =", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeNotEqualTo(String value) {
            addCriterion("class_time <>", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeGreaterThan(String value) {
            addCriterion("class_time >", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeGreaterThanOrEqualTo(String value) {
            addCriterion("class_time >=", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeLessThan(String value) {
            addCriterion("class_time <", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeLessThanOrEqualTo(String value) {
            addCriterion("class_time <=", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeLike(String value) {
            addCriterion("class_time like", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeNotLike(String value) {
            addCriterion("class_time not like", value, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeIn(List<String> values) {
            addCriterion("class_time in", values, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeNotIn(List<String> values) {
            addCriterion("class_time not in", values, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeBetween(String value1, String value2) {
            addCriterion("class_time between", value1, value2, "class_time");
            return (Criteria) this;
        }

        public Criteria andClass_timeNotBetween(String value1, String value2) {
            addCriterion("class_time not between", value1, value2, "class_time");
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