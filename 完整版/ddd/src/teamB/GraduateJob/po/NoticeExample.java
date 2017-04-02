package teamB.GraduateJob.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNoticeidIsNull() {
            addCriterion("noticeid is null");
            return (Criteria) this;
        }

        public Criteria andNoticeidIsNotNull() {
            addCriterion("noticeid is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeidEqualTo(Integer value) {
            addCriterion("noticeid =", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotEqualTo(Integer value) {
            addCriterion("noticeid <>", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidGreaterThan(Integer value) {
            addCriterion("noticeid >", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("noticeid >=", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidLessThan(Integer value) {
            addCriterion("noticeid <", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidLessThanOrEqualTo(Integer value) {
            addCriterion("noticeid <=", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidIn(List<Integer> values) {
            addCriterion("noticeid in", values, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotIn(List<Integer> values) {
            addCriterion("noticeid not in", values, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidBetween(Integer value1, Integer value2) {
            addCriterion("noticeid between", value1, value2, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotBetween(Integer value1, Integer value2) {
            addCriterion("noticeid not between", value1, value2, "noticeid");
            return (Criteria) this;
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

        public Criteria andNoticeTitleIsNull() {
            addCriterion("Notice_title is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNotNull() {
            addCriterion("Notice_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleEqualTo(String value) {
            addCriterion("Notice_title =", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotEqualTo(String value) {
            addCriterion("Notice_title <>", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThan(String value) {
            addCriterion("Notice_title >", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Notice_title >=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThan(String value) {
            addCriterion("Notice_title <", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThanOrEqualTo(String value) {
            addCriterion("Notice_title <=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLike(String value) {
            addCriterion("Notice_title like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotLike(String value) {
            addCriterion("Notice_title not like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIn(List<String> values) {
            addCriterion("Notice_title in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotIn(List<String> values) {
            addCriterion("Notice_title not in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleBetween(String value1, String value2) {
            addCriterion("Notice_title between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotBetween(String value1, String value2) {
            addCriterion("Notice_title not between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeFromIsNull() {
            addCriterion("Notice_from is null");
            return (Criteria) this;
        }

        public Criteria andNoticeFromIsNotNull() {
            addCriterion("Notice_from is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeFromEqualTo(String value) {
            addCriterion("Notice_from =", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromNotEqualTo(String value) {
            addCriterion("Notice_from <>", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromGreaterThan(String value) {
            addCriterion("Notice_from >", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromGreaterThanOrEqualTo(String value) {
            addCriterion("Notice_from >=", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromLessThan(String value) {
            addCriterion("Notice_from <", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromLessThanOrEqualTo(String value) {
            addCriterion("Notice_from <=", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromLike(String value) {
            addCriterion("Notice_from like", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromNotLike(String value) {
            addCriterion("Notice_from not like", value, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromIn(List<String> values) {
            addCriterion("Notice_from in", values, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromNotIn(List<String> values) {
            addCriterion("Notice_from not in", values, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromBetween(String value1, String value2) {
            addCriterion("Notice_from between", value1, value2, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeFromNotBetween(String value1, String value2) {
            addCriterion("Notice_from not between", value1, value2, "noticeFrom");
            return (Criteria) this;
        }

        public Criteria andNoticeContextIsNull() {
            addCriterion("Notice_context is null");
            return (Criteria) this;
        }

        public Criteria andNoticeContextIsNotNull() {
            addCriterion("Notice_context is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeContextEqualTo(String value) {
            addCriterion("Notice_context =", value, "noticeContext");
            return (Criteria) this;
        }

        public Criteria andNoticeContextNotEqualTo(String value) {
            addCriterion("Notice_context <>", value, "noticeContext");
            return (Criteria) this;
        }

        public Criteria andNoticeContextGreaterThan(String value) {
            addCriterion("Notice_context >", value, "noticeContext");
            return (Criteria) this;
        }

        public Criteria andNoticeContextGreaterThanOrEqualTo(String value) {
            addCriterion("Notice_context >=", value, "noticeContext");
            return (Criteria) this;
        }

        public Criteria andNoticeContextLessThan(String value) {
            addCriterion("Notice_context <", value, "noticeContext");
            return (Criteria) this;
        }

        public Criteria andNoticeContextLessThanOrEqualTo(String value) {
            addCriterion("Notice_context <=", value, "noticeContext");
            return (Criteria) this;
        }

        public Criteria andNoticeContextLike(String value) {
            addCriterion("Notice_context like", value, "noticeContext");
            return (Criteria) this;
        }

        public Criteria andNoticeContextNotLike(String value) {
            addCriterion("Notice_context not like", value, "noticeContext");
            return (Criteria) this;
        }

        public Criteria andNoticeContextIn(List<String> values) {
            addCriterion("Notice_context in", values, "noticeContext");
            return (Criteria) this;
        }

        public Criteria andNoticeContextNotIn(List<String> values) {
            addCriterion("Notice_context not in", values, "noticeContext");
            return (Criteria) this;
        }

        public Criteria andNoticeContextBetween(String value1, String value2) {
            addCriterion("Notice_context between", value1, value2, "noticeContext");
            return (Criteria) this;
        }

        public Criteria andNoticeContextNotBetween(String value1, String value2) {
            addCriterion("Notice_context not between", value1, value2, "noticeContext");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNull() {
            addCriterion("Notice_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNotNull() {
            addCriterion("Notice_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeEqualTo(Date value) {
            addCriterionForJDBCDate("Notice_time =", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Notice_time <>", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Notice_time >", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Notice_time >=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThan(Date value) {
            addCriterionForJDBCDate("Notice_time <", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Notice_time <=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIn(List<Date> values) {
            addCriterionForJDBCDate("Notice_time in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Notice_time not in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Notice_time between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Notice_time not between", value1, value2, "noticeTime");
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