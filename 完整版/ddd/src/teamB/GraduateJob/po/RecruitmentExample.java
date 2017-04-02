package teamB.GraduateJob.po;

import java.util.ArrayList;
import java.util.List;

public class RecruitmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitmentExample() {
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

        public Criteria andRecruitmentidIsNull() {
            addCriterion("recruitmentId is null");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidIsNotNull() {
            addCriterion("recruitmentId is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidEqualTo(Integer value) {
            addCriterion("recruitmentId =", value, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidNotEqualTo(Integer value) {
            addCriterion("recruitmentId <>", value, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidGreaterThan(Integer value) {
            addCriterion("recruitmentId >", value, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruitmentId >=", value, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidLessThan(Integer value) {
            addCriterion("recruitmentId <", value, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidLessThanOrEqualTo(Integer value) {
            addCriterion("recruitmentId <=", value, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidIn(List<Integer> values) {
            addCriterion("recruitmentId in", values, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidNotIn(List<Integer> values) {
            addCriterion("recruitmentId not in", values, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidBetween(Integer value1, Integer value2) {
            addCriterion("recruitmentId between", value1, value2, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("recruitmentId not between", value1, value2, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andResumenumberIsNull() {
            addCriterion("resumeNumber is null");
            return (Criteria) this;
        }

        public Criteria andResumenumberIsNotNull() {
            addCriterion("resumeNumber is not null");
            return (Criteria) this;
        }

        public Criteria andResumenumberEqualTo(String value) {
            addCriterion("resumeNumber =", value, "resumenumber");
            return (Criteria) this;
        }

        public Criteria andResumenumberNotEqualTo(String value) {
            addCriterion("resumeNumber <>", value, "resumenumber");
            return (Criteria) this;
        }

        public Criteria andResumenumberGreaterThan(String value) {
            addCriterion("resumeNumber >", value, "resumenumber");
            return (Criteria) this;
        }

        public Criteria andResumenumberGreaterThanOrEqualTo(String value) {
            addCriterion("resumeNumber >=", value, "resumenumber");
            return (Criteria) this;
        }

        public Criteria andResumenumberLessThan(String value) {
            addCriterion("resumeNumber <", value, "resumenumber");
            return (Criteria) this;
        }

        public Criteria andResumenumberLessThanOrEqualTo(String value) {
            addCriterion("resumeNumber <=", value, "resumenumber");
            return (Criteria) this;
        }

        public Criteria andResumenumberLike(String value) {
            addCriterion("resumeNumber like", value, "resumenumber");
            return (Criteria) this;
        }

        public Criteria andResumenumberNotLike(String value) {
            addCriterion("resumeNumber not like", value, "resumenumber");
            return (Criteria) this;
        }

        public Criteria andResumenumberIn(List<String> values) {
            addCriterion("resumeNumber in", values, "resumenumber");
            return (Criteria) this;
        }

        public Criteria andResumenumberNotIn(List<String> values) {
            addCriterion("resumeNumber not in", values, "resumenumber");
            return (Criteria) this;
        }

        public Criteria andResumenumberBetween(String value1, String value2) {
            addCriterion("resumeNumber between", value1, value2, "resumenumber");
            return (Criteria) this;
        }

        public Criteria andResumenumberNotBetween(String value1, String value2) {
            addCriterion("resumeNumber not between", value1, value2, "resumenumber");
            return (Criteria) this;
        }

        public Criteria andInterviewnumberIsNull() {
            addCriterion("interviewNumber is null");
            return (Criteria) this;
        }

        public Criteria andInterviewnumberIsNotNull() {
            addCriterion("interviewNumber is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewnumberEqualTo(String value) {
            addCriterion("interviewNumber =", value, "interviewnumber");
            return (Criteria) this;
        }

        public Criteria andInterviewnumberNotEqualTo(String value) {
            addCriterion("interviewNumber <>", value, "interviewnumber");
            return (Criteria) this;
        }

        public Criteria andInterviewnumberGreaterThan(String value) {
            addCriterion("interviewNumber >", value, "interviewnumber");
            return (Criteria) this;
        }

        public Criteria andInterviewnumberGreaterThanOrEqualTo(String value) {
            addCriterion("interviewNumber >=", value, "interviewnumber");
            return (Criteria) this;
        }

        public Criteria andInterviewnumberLessThan(String value) {
            addCriterion("interviewNumber <", value, "interviewnumber");
            return (Criteria) this;
        }

        public Criteria andInterviewnumberLessThanOrEqualTo(String value) {
            addCriterion("interviewNumber <=", value, "interviewnumber");
            return (Criteria) this;
        }

        public Criteria andInterviewnumberLike(String value) {
            addCriterion("interviewNumber like", value, "interviewnumber");
            return (Criteria) this;
        }

        public Criteria andInterviewnumberNotLike(String value) {
            addCriterion("interviewNumber not like", value, "interviewnumber");
            return (Criteria) this;
        }

        public Criteria andInterviewnumberIn(List<String> values) {
            addCriterion("interviewNumber in", values, "interviewnumber");
            return (Criteria) this;
        }

        public Criteria andInterviewnumberNotIn(List<String> values) {
            addCriterion("interviewNumber not in", values, "interviewnumber");
            return (Criteria) this;
        }

        public Criteria andInterviewnumberBetween(String value1, String value2) {
            addCriterion("interviewNumber between", value1, value2, "interviewnumber");
            return (Criteria) this;
        }

        public Criteria andInterviewnumberNotBetween(String value1, String value2) {
            addCriterion("interviewNumber not between", value1, value2, "interviewnumber");
            return (Criteria) this;
        }

        public Criteria andAdmitnumberIsNull() {
            addCriterion("admitNumber is null");
            return (Criteria) this;
        }

        public Criteria andAdmitnumberIsNotNull() {
            addCriterion("admitNumber is not null");
            return (Criteria) this;
        }

        public Criteria andAdmitnumberEqualTo(String value) {
            addCriterion("admitNumber =", value, "admitnumber");
            return (Criteria) this;
        }

        public Criteria andAdmitnumberNotEqualTo(String value) {
            addCriterion("admitNumber <>", value, "admitnumber");
            return (Criteria) this;
        }

        public Criteria andAdmitnumberGreaterThan(String value) {
            addCriterion("admitNumber >", value, "admitnumber");
            return (Criteria) this;
        }

        public Criteria andAdmitnumberGreaterThanOrEqualTo(String value) {
            addCriterion("admitNumber >=", value, "admitnumber");
            return (Criteria) this;
        }

        public Criteria andAdmitnumberLessThan(String value) {
            addCriterion("admitNumber <", value, "admitnumber");
            return (Criteria) this;
        }

        public Criteria andAdmitnumberLessThanOrEqualTo(String value) {
            addCriterion("admitNumber <=", value, "admitnumber");
            return (Criteria) this;
        }

        public Criteria andAdmitnumberLike(String value) {
            addCriterion("admitNumber like", value, "admitnumber");
            return (Criteria) this;
        }

        public Criteria andAdmitnumberNotLike(String value) {
            addCriterion("admitNumber not like", value, "admitnumber");
            return (Criteria) this;
        }

        public Criteria andAdmitnumberIn(List<String> values) {
            addCriterion("admitNumber in", values, "admitnumber");
            return (Criteria) this;
        }

        public Criteria andAdmitnumberNotIn(List<String> values) {
            addCriterion("admitNumber not in", values, "admitnumber");
            return (Criteria) this;
        }

        public Criteria andAdmitnumberBetween(String value1, String value2) {
            addCriterion("admitNumber between", value1, value2, "admitnumber");
            return (Criteria) this;
        }

        public Criteria andAdmitnumberNotBetween(String value1, String value2) {
            addCriterion("admitNumber not between", value1, value2, "admitnumber");
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