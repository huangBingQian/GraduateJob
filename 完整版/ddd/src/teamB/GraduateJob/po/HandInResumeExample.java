package teamB.GraduateJob.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HandInResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HandInResumeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andGraduateidIsNull() {
            addCriterion("graduateId is null");
            return (Criteria) this;
        }

        public Criteria andGraduateidIsNotNull() {
            addCriterion("graduateId is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateidEqualTo(Integer value) {
            addCriterion("graduateId =", value, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidNotEqualTo(Integer value) {
            addCriterion("graduateId <>", value, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidGreaterThan(Integer value) {
            addCriterion("graduateId >", value, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("graduateId >=", value, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidLessThan(Integer value) {
            addCriterion("graduateId <", value, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidLessThanOrEqualTo(Integer value) {
            addCriterion("graduateId <=", value, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidIn(List<Integer> values) {
            addCriterion("graduateId in", values, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidNotIn(List<Integer> values) {
            addCriterion("graduateId not in", values, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidBetween(Integer value1, Integer value2) {
            addCriterion("graduateId between", value1, value2, "graduateid");
            return (Criteria) this;
        }

        public Criteria andGraduateidNotBetween(Integer value1, Integer value2) {
            addCriterion("graduateId not between", value1, value2, "graduateid");
            return (Criteria) this;
        }

        public Criteria andJobidIsNull() {
            addCriterion("jobId is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("jobId is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(Integer value) {
            addCriterion("jobId =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(Integer value) {
            addCriterion("jobId <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(Integer value) {
            addCriterion("jobId >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobId >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(Integer value) {
            addCriterion("jobId <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(Integer value) {
            addCriterion("jobId <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<Integer> values) {
            addCriterion("jobId in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<Integer> values) {
            addCriterion("jobId not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(Integer value1, Integer value2) {
            addCriterion("jobId between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(Integer value1, Integer value2) {
            addCriterion("jobId not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andResumeStateIsNull() {
            addCriterion("Resume_state is null");
            return (Criteria) this;
        }

        public Criteria andResumeStateIsNotNull() {
            addCriterion("Resume_state is not null");
            return (Criteria) this;
        }

        public Criteria andResumeStateEqualTo(Integer value) {
            addCriterion("Resume_state =", value, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateNotEqualTo(Integer value) {
            addCriterion("Resume_state <>", value, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateGreaterThan(Integer value) {
            addCriterion("Resume_state >", value, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Resume_state >=", value, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateLessThan(Integer value) {
            addCriterion("Resume_state <", value, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateLessThanOrEqualTo(Integer value) {
            addCriterion("Resume_state <=", value, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateIn(List<Integer> values) {
            addCriterion("Resume_state in", values, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateNotIn(List<Integer> values) {
            addCriterion("Resume_state not in", values, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateBetween(Integer value1, Integer value2) {
            addCriterion("Resume_state between", value1, value2, "resumeState");
            return (Criteria) this;
        }

        public Criteria andResumeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("Resume_state not between", value1, value2, "resumeState");
            return (Criteria) this;
        }

        public Criteria andIsViewIsNull() {
            addCriterion("Is_view is null");
            return (Criteria) this;
        }

        public Criteria andIsViewIsNotNull() {
            addCriterion("Is_view is not null");
            return (Criteria) this;
        }

        public Criteria andIsViewEqualTo(Integer value) {
            addCriterion("Is_view =", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewNotEqualTo(Integer value) {
            addCriterion("Is_view <>", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewGreaterThan(Integer value) {
            addCriterion("Is_view >", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("Is_view >=", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewLessThan(Integer value) {
            addCriterion("Is_view <", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewLessThanOrEqualTo(Integer value) {
            addCriterion("Is_view <=", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewIn(List<Integer> values) {
            addCriterion("Is_view in", values, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewNotIn(List<Integer> values) {
            addCriterion("Is_view not in", values, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewBetween(Integer value1, Integer value2) {
            addCriterion("Is_view between", value1, value2, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewNotBetween(Integer value1, Integer value2) {
            addCriterion("Is_view not between", value1, value2, "isView");
            return (Criteria) this;
        }

        public Criteria andInterviewdateIsNull() {
            addCriterion("Interviewdate is null");
            return (Criteria) this;
        }

        public Criteria andInterviewdateIsNotNull() {
            addCriterion("Interviewdate is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewdateEqualTo(Date value) {
            addCriterionForJDBCDate("Interviewdate =", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Interviewdate <>", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateGreaterThan(Date value) {
            addCriterionForJDBCDate("Interviewdate >", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Interviewdate >=", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateLessThan(Date value) {
            addCriterionForJDBCDate("Interviewdate <", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Interviewdate <=", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateIn(List<Date> values) {
            addCriterionForJDBCDate("Interviewdate in", values, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Interviewdate not in", values, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Interviewdate between", value1, value2, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Interviewdate not between", value1, value2, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andSenddateIsNull() {
            addCriterion("Senddate is null");
            return (Criteria) this;
        }

        public Criteria andSenddateIsNotNull() {
            addCriterion("Senddate is not null");
            return (Criteria) this;
        }

        public Criteria andSenddateEqualTo(Date value) {
            addCriterionForJDBCDate("Senddate =", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Senddate <>", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("Senddate >", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Senddate >=", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateLessThan(Date value) {
            addCriterionForJDBCDate("Senddate <", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Senddate <=", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateIn(List<Date> values) {
            addCriterionForJDBCDate("Senddate in", values, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Senddate not in", values, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Senddate between", value1, value2, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Senddate not between", value1, value2, "senddate");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("companyid is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyid is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("companyid =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("companyid <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("companyid >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyid >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("companyid <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("companyid <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("companyid in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("companyid not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("companyid between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("companyid not between", value1, value2, "companyid");
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