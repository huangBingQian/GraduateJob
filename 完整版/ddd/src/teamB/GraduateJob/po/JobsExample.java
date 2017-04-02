package teamB.GraduateJob.po;

import java.util.ArrayList;
import java.util.List;

public class JobsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobsExample() {
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

        public Criteria andJobnameIsNull() {
            addCriterion("jobName is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("jobName is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("jobName =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("jobName <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("jobName >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("jobName >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("jobName <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("jobName <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("jobName like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("jobName not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("jobName in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("jobName not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("jobName between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("jobName not between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnumberIsNull() {
            addCriterion("jobNumber is null");
            return (Criteria) this;
        }

        public Criteria andJobnumberIsNotNull() {
            addCriterion("jobNumber is not null");
            return (Criteria) this;
        }

        public Criteria andJobnumberEqualTo(String value) {
            addCriterion("jobNumber =", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotEqualTo(String value) {
            addCriterion("jobNumber <>", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberGreaterThan(String value) {
            addCriterion("jobNumber >", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberGreaterThanOrEqualTo(String value) {
            addCriterion("jobNumber >=", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberLessThan(String value) {
            addCriterion("jobNumber <", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberLessThanOrEqualTo(String value) {
            addCriterion("jobNumber <=", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberLike(String value) {
            addCriterion("jobNumber like", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotLike(String value) {
            addCriterion("jobNumber not like", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberIn(List<String> values) {
            addCriterion("jobNumber in", values, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotIn(List<String> values) {
            addCriterion("jobNumber not in", values, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberBetween(String value1, String value2) {
            addCriterion("jobNumber between", value1, value2, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotBetween(String value1, String value2) {
            addCriterion("jobNumber not between", value1, value2, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobdemandIsNull() {
            addCriterion("jobDemand is null");
            return (Criteria) this;
        }

        public Criteria andJobdemandIsNotNull() {
            addCriterion("jobDemand is not null");
            return (Criteria) this;
        }

        public Criteria andJobdemandEqualTo(String value) {
            addCriterion("jobDemand =", value, "jobdemand");
            return (Criteria) this;
        }

        public Criteria andJobdemandNotEqualTo(String value) {
            addCriterion("jobDemand <>", value, "jobdemand");
            return (Criteria) this;
        }

        public Criteria andJobdemandGreaterThan(String value) {
            addCriterion("jobDemand >", value, "jobdemand");
            return (Criteria) this;
        }

        public Criteria andJobdemandGreaterThanOrEqualTo(String value) {
            addCriterion("jobDemand >=", value, "jobdemand");
            return (Criteria) this;
        }

        public Criteria andJobdemandLessThan(String value) {
            addCriterion("jobDemand <", value, "jobdemand");
            return (Criteria) this;
        }

        public Criteria andJobdemandLessThanOrEqualTo(String value) {
            addCriterion("jobDemand <=", value, "jobdemand");
            return (Criteria) this;
        }

        public Criteria andJobdemandLike(String value) {
            addCriterion("jobDemand like", value, "jobdemand");
            return (Criteria) this;
        }

        public Criteria andJobdemandNotLike(String value) {
            addCriterion("jobDemand not like", value, "jobdemand");
            return (Criteria) this;
        }

        public Criteria andJobdemandIn(List<String> values) {
            addCriterion("jobDemand in", values, "jobdemand");
            return (Criteria) this;
        }

        public Criteria andJobdemandNotIn(List<String> values) {
            addCriterion("jobDemand not in", values, "jobdemand");
            return (Criteria) this;
        }

        public Criteria andJobdemandBetween(String value1, String value2) {
            addCriterion("jobDemand between", value1, value2, "jobdemand");
            return (Criteria) this;
        }

        public Criteria andJobdemandNotBetween(String value1, String value2) {
            addCriterion("jobDemand not between", value1, value2, "jobdemand");
            return (Criteria) this;
        }

        public Criteria andJobfunctionIsNull() {
            addCriterion("jobFunction is null");
            return (Criteria) this;
        }

        public Criteria andJobfunctionIsNotNull() {
            addCriterion("jobFunction is not null");
            return (Criteria) this;
        }

        public Criteria andJobfunctionEqualTo(String value) {
            addCriterion("jobFunction =", value, "jobfunction");
            return (Criteria) this;
        }

        public Criteria andJobfunctionNotEqualTo(String value) {
            addCriterion("jobFunction <>", value, "jobfunction");
            return (Criteria) this;
        }

        public Criteria andJobfunctionGreaterThan(String value) {
            addCriterion("jobFunction >", value, "jobfunction");
            return (Criteria) this;
        }

        public Criteria andJobfunctionGreaterThanOrEqualTo(String value) {
            addCriterion("jobFunction >=", value, "jobfunction");
            return (Criteria) this;
        }

        public Criteria andJobfunctionLessThan(String value) {
            addCriterion("jobFunction <", value, "jobfunction");
            return (Criteria) this;
        }

        public Criteria andJobfunctionLessThanOrEqualTo(String value) {
            addCriterion("jobFunction <=", value, "jobfunction");
            return (Criteria) this;
        }

        public Criteria andJobfunctionLike(String value) {
            addCriterion("jobFunction like", value, "jobfunction");
            return (Criteria) this;
        }

        public Criteria andJobfunctionNotLike(String value) {
            addCriterion("jobFunction not like", value, "jobfunction");
            return (Criteria) this;
        }

        public Criteria andJobfunctionIn(List<String> values) {
            addCriterion("jobFunction in", values, "jobfunction");
            return (Criteria) this;
        }

        public Criteria andJobfunctionNotIn(List<String> values) {
            addCriterion("jobFunction not in", values, "jobfunction");
            return (Criteria) this;
        }

        public Criteria andJobfunctionBetween(String value1, String value2) {
            addCriterion("jobFunction between", value1, value2, "jobfunction");
            return (Criteria) this;
        }

        public Criteria andJobfunctionNotBetween(String value1, String value2) {
            addCriterion("jobFunction not between", value1, value2, "jobfunction");
            return (Criteria) this;
        }

        public Criteria andJobsalaryIsNull() {
            addCriterion("jobsalary is null");
            return (Criteria) this;
        }

        public Criteria andJobsalaryIsNotNull() {
            addCriterion("jobsalary is not null");
            return (Criteria) this;
        }

        public Criteria andJobsalaryEqualTo(Integer value) {
            addCriterion("jobsalary =", value, "jobsalary");
            return (Criteria) this;
        }

        public Criteria andJobsalaryNotEqualTo(Integer value) {
            addCriterion("jobsalary <>", value, "jobsalary");
            return (Criteria) this;
        }

        public Criteria andJobsalaryGreaterThan(Integer value) {
            addCriterion("jobsalary >", value, "jobsalary");
            return (Criteria) this;
        }

        public Criteria andJobsalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobsalary >=", value, "jobsalary");
            return (Criteria) this;
        }

        public Criteria andJobsalaryLessThan(Integer value) {
            addCriterion("jobsalary <", value, "jobsalary");
            return (Criteria) this;
        }

        public Criteria andJobsalaryLessThanOrEqualTo(Integer value) {
            addCriterion("jobsalary <=", value, "jobsalary");
            return (Criteria) this;
        }

        public Criteria andJobsalaryIn(List<Integer> values) {
            addCriterion("jobsalary in", values, "jobsalary");
            return (Criteria) this;
        }

        public Criteria andJobsalaryNotIn(List<Integer> values) {
            addCriterion("jobsalary not in", values, "jobsalary");
            return (Criteria) this;
        }

        public Criteria andJobsalaryBetween(Integer value1, Integer value2) {
            addCriterion("jobsalary between", value1, value2, "jobsalary");
            return (Criteria) this;
        }

        public Criteria andJobsalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("jobsalary not between", value1, value2, "jobsalary");
            return (Criteria) this;
        }

        public Criteria andJobaddressIsNull() {
            addCriterion("jobaddress is null");
            return (Criteria) this;
        }

        public Criteria andJobaddressIsNotNull() {
            addCriterion("jobaddress is not null");
            return (Criteria) this;
        }

        public Criteria andJobaddressEqualTo(String value) {
            addCriterion("jobaddress =", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressNotEqualTo(String value) {
            addCriterion("jobaddress <>", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressGreaterThan(String value) {
            addCriterion("jobaddress >", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressGreaterThanOrEqualTo(String value) {
            addCriterion("jobaddress >=", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressLessThan(String value) {
            addCriterion("jobaddress <", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressLessThanOrEqualTo(String value) {
            addCriterion("jobaddress <=", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressLike(String value) {
            addCriterion("jobaddress like", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressNotLike(String value) {
            addCriterion("jobaddress not like", value, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressIn(List<String> values) {
            addCriterion("jobaddress in", values, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressNotIn(List<String> values) {
            addCriterion("jobaddress not in", values, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressBetween(String value1, String value2) {
            addCriterion("jobaddress between", value1, value2, "jobaddress");
            return (Criteria) this;
        }

        public Criteria andJobaddressNotBetween(String value1, String value2) {
            addCriterion("jobaddress not between", value1, value2, "jobaddress");
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