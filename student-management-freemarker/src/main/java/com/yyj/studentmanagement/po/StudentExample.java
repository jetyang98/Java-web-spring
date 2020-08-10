package com.yyj.studentmanagement.po;

import java.util.ArrayList;
import java.util.List;


public class StudentExample {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStudent_idIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudent_idIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudent_idEqualTo(String value) {
            addCriterion("student_id =", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idNotEqualTo(String value) {
            addCriterion("student_id <>", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idGreaterThan(String value) {
            addCriterion("student_id >", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idGreaterThanOrEqualTo(String value) {
            addCriterion("student_id >=", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idLessThan(String value) {
            addCriterion("student_id <", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idLessThanOrEqualTo(String value) {
            addCriterion("student_id <=", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idLike(String value) {
            addCriterion("student_id like", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idNotLike(String value) {
            addCriterion("student_id not like", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idIn(List<String> values) {
            addCriterion("student_id in", values, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idNotIn(List<String> values) {
            addCriterion("student_id not in", values, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idBetween(String value1, String value2) {
            addCriterion("student_id between", value1, value2, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idNotBetween(String value1, String value2) {
            addCriterion("student_id not between", value1, value2, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_nameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudent_nameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudent_nameEqualTo(String value) {
            addCriterion("student_name =", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameGreaterThan(String value) {
            addCriterion("student_name >", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameLessThan(String value) {
            addCriterion("student_name <", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameLike(String value) {
            addCriterion("student_name like", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameNotLike(String value) {
            addCriterion("student_name not like", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameIn(List<String> values) {
            addCriterion("student_name in", values, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_passIsNull() {
            addCriterion("student_pass is null");
            return (Criteria) this;
        }

        public Criteria andStudent_passIsNotNull() {
            addCriterion("student_pass is not null");
            return (Criteria) this;
        }

        public Criteria andStudent_passEqualTo(String value) {
            addCriterion("student_pass =", value, "student_pass");
            return (Criteria) this;
        }

        public Criteria andStudent_passNotEqualTo(String value) {
            addCriterion("student_pass <>", value, "student_pass");
            return (Criteria) this;
        }

        public Criteria andStudent_passGreaterThan(String value) {
            addCriterion("student_pass >", value, "student_pass");
            return (Criteria) this;
        }

        public Criteria andStudent_passGreaterThanOrEqualTo(String value) {
            addCriterion("student_pass >=", value, "student_pass");
            return (Criteria) this;
        }

        public Criteria andStudent_passLessThan(String value) {
            addCriterion("student_pass <", value, "student_pass");
            return (Criteria) this;
        }

        public Criteria andStudent_passLessThanOrEqualTo(String value) {
            addCriterion("student_pass <=", value, "student_pass");
            return (Criteria) this;
        }

        public Criteria andStudent_passLike(String value) {
            addCriterion("student_pass like", value, "student_pass");
            return (Criteria) this;
        }

        public Criteria andStudent_passNotLike(String value) {
            addCriterion("student_pass not like", value, "student_pass");
            return (Criteria) this;
        }

        public Criteria andStudent_passIn(List<String> values) {
            addCriterion("student_pass in", values, "student_pass");
            return (Criteria) this;
        }

        public Criteria andStudent_passNotIn(List<String> values) {
            addCriterion("student_pass not in", values, "student_pass");
            return (Criteria) this;
        }

        public Criteria andStudent_passBetween(String value1, String value2) {
            addCriterion("student_pass between", value1, value2, "student_pass");
            return (Criteria) this;
        }

        public Criteria andStudent_passNotBetween(String value1, String value2) {
            addCriterion("student_pass not between", value1, value2, "student_pass");
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