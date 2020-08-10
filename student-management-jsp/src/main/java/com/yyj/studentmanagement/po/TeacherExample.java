package com.yyj.studentmanagement.po;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacher_nameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameLike(String value) {
            addCriterion("teacher_name like", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_passIsNull() {
            addCriterion("teacher_pass is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_passIsNotNull() {
            addCriterion("teacher_pass is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_passEqualTo(String value) {
            addCriterion("teacher_pass =", value, "teacher_pass");
            return (Criteria) this;
        }

        public Criteria andTeacher_passNotEqualTo(String value) {
            addCriterion("teacher_pass <>", value, "teacher_pass");
            return (Criteria) this;
        }

        public Criteria andTeacher_passGreaterThan(String value) {
            addCriterion("teacher_pass >", value, "teacher_pass");
            return (Criteria) this;
        }

        public Criteria andTeacher_passGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_pass >=", value, "teacher_pass");
            return (Criteria) this;
        }

        public Criteria andTeacher_passLessThan(String value) {
            addCriterion("teacher_pass <", value, "teacher_pass");
            return (Criteria) this;
        }

        public Criteria andTeacher_passLessThanOrEqualTo(String value) {
            addCriterion("teacher_pass <=", value, "teacher_pass");
            return (Criteria) this;
        }

        public Criteria andTeacher_passLike(String value) {
            addCriterion("teacher_pass like", value, "teacher_pass");
            return (Criteria) this;
        }

        public Criteria andTeacher_passNotLike(String value) {
            addCriterion("teacher_pass not like", value, "teacher_pass");
            return (Criteria) this;
        }

        public Criteria andTeacher_passIn(List<String> values) {
            addCriterion("teacher_pass in", values, "teacher_pass");
            return (Criteria) this;
        }

        public Criteria andTeacher_passNotIn(List<String> values) {
            addCriterion("teacher_pass not in", values, "teacher_pass");
            return (Criteria) this;
        }

        public Criteria andTeacher_passBetween(String value1, String value2) {
            addCriterion("teacher_pass between", value1, value2, "teacher_pass");
            return (Criteria) this;
        }

        public Criteria andTeacher_passNotBetween(String value1, String value2) {
            addCriterion("teacher_pass not between", value1, value2, "teacher_pass");
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