package teamB.GraduateJob.po;

import java.util.ArrayList;
import java.util.List;

public class TalkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TalkExample() {
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

        public Criteria andTalkidIsNull() {
            addCriterion("talkId is null");
            return (Criteria) this;
        }

        public Criteria andTalkidIsNotNull() {
            addCriterion("talkId is not null");
            return (Criteria) this;
        }

        public Criteria andTalkidEqualTo(Integer value) {
            addCriterion("talkId =", value, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidNotEqualTo(Integer value) {
            addCriterion("talkId <>", value, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidGreaterThan(Integer value) {
            addCriterion("talkId >", value, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("talkId >=", value, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidLessThan(Integer value) {
            addCriterion("talkId <", value, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidLessThanOrEqualTo(Integer value) {
            addCriterion("talkId <=", value, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidIn(List<Integer> values) {
            addCriterion("talkId in", values, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidNotIn(List<Integer> values) {
            addCriterion("talkId not in", values, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidBetween(Integer value1, Integer value2) {
            addCriterion("talkId between", value1, value2, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidNotBetween(Integer value1, Integer value2) {
            addCriterion("talkId not between", value1, value2, "talkid");
            return (Criteria) this;
        }

        public Criteria andThemeIsNull() {
            addCriterion("theme is null");
            return (Criteria) this;
        }

        public Criteria andThemeIsNotNull() {
            addCriterion("theme is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEqualTo(String value) {
            addCriterion("theme =", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotEqualTo(String value) {
            addCriterion("theme <>", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThan(String value) {
            addCriterion("theme >", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThanOrEqualTo(String value) {
            addCriterion("theme >=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThan(String value) {
            addCriterion("theme <", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThanOrEqualTo(String value) {
            addCriterion("theme <=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLike(String value) {
            addCriterion("theme like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotLike(String value) {
            addCriterion("theme not like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeIn(List<String> values) {
            addCriterion("theme in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotIn(List<String> values) {
            addCriterion("theme not in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeBetween(String value1, String value2) {
            addCriterion("theme between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotBetween(String value1, String value2) {
            addCriterion("theme not between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andExpectnumberIsNull() {
            addCriterion("expectNumber is null");
            return (Criteria) this;
        }

        public Criteria andExpectnumberIsNotNull() {
            addCriterion("expectNumber is not null");
            return (Criteria) this;
        }

        public Criteria andExpectnumberEqualTo(String value) {
            addCriterion("expectNumber =", value, "expectnumber");
            return (Criteria) this;
        }

        public Criteria andExpectnumberNotEqualTo(String value) {
            addCriterion("expectNumber <>", value, "expectnumber");
            return (Criteria) this;
        }

        public Criteria andExpectnumberGreaterThan(String value) {
            addCriterion("expectNumber >", value, "expectnumber");
            return (Criteria) this;
        }

        public Criteria andExpectnumberGreaterThanOrEqualTo(String value) {
            addCriterion("expectNumber >=", value, "expectnumber");
            return (Criteria) this;
        }

        public Criteria andExpectnumberLessThan(String value) {
            addCriterion("expectNumber <", value, "expectnumber");
            return (Criteria) this;
        }

        public Criteria andExpectnumberLessThanOrEqualTo(String value) {
            addCriterion("expectNumber <=", value, "expectnumber");
            return (Criteria) this;
        }

        public Criteria andExpectnumberLike(String value) {
            addCriterion("expectNumber like", value, "expectnumber");
            return (Criteria) this;
        }

        public Criteria andExpectnumberNotLike(String value) {
            addCriterion("expectNumber not like", value, "expectnumber");
            return (Criteria) this;
        }

        public Criteria andExpectnumberIn(List<String> values) {
            addCriterion("expectNumber in", values, "expectnumber");
            return (Criteria) this;
        }

        public Criteria andExpectnumberNotIn(List<String> values) {
            addCriterion("expectNumber not in", values, "expectnumber");
            return (Criteria) this;
        }

        public Criteria andExpectnumberBetween(String value1, String value2) {
            addCriterion("expectNumber between", value1, value2, "expectnumber");
            return (Criteria) this;
        }

        public Criteria andExpectnumberNotBetween(String value1, String value2) {
            addCriterion("expectNumber not between", value1, value2, "expectnumber");
            return (Criteria) this;
        }

        public Criteria andExpecttimeIsNull() {
            addCriterion("expectTime is null");
            return (Criteria) this;
        }

        public Criteria andExpecttimeIsNotNull() {
            addCriterion("expectTime is not null");
            return (Criteria) this;
        }

        public Criteria andExpecttimeEqualTo(String value) {
            addCriterion("expectTime =", value, "expecttime");
            return (Criteria) this;
        }

        public Criteria andExpecttimeNotEqualTo(String value) {
            addCriterion("expectTime <>", value, "expecttime");
            return (Criteria) this;
        }

        public Criteria andExpecttimeGreaterThan(String value) {
            addCriterion("expectTime >", value, "expecttime");
            return (Criteria) this;
        }

        public Criteria andExpecttimeGreaterThanOrEqualTo(String value) {
            addCriterion("expectTime >=", value, "expecttime");
            return (Criteria) this;
        }

        public Criteria andExpecttimeLessThan(String value) {
            addCriterion("expectTime <", value, "expecttime");
            return (Criteria) this;
        }

        public Criteria andExpecttimeLessThanOrEqualTo(String value) {
            addCriterion("expectTime <=", value, "expecttime");
            return (Criteria) this;
        }

        public Criteria andExpecttimeLike(String value) {
            addCriterion("expectTime like", value, "expecttime");
            return (Criteria) this;
        }

        public Criteria andExpecttimeNotLike(String value) {
            addCriterion("expectTime not like", value, "expecttime");
            return (Criteria) this;
        }

        public Criteria andExpecttimeIn(List<String> values) {
            addCriterion("expectTime in", values, "expecttime");
            return (Criteria) this;
        }

        public Criteria andExpecttimeNotIn(List<String> values) {
            addCriterion("expectTime not in", values, "expecttime");
            return (Criteria) this;
        }

        public Criteria andExpecttimeBetween(String value1, String value2) {
            addCriterion("expectTime between", value1, value2, "expecttime");
            return (Criteria) this;
        }

        public Criteria andExpecttimeNotBetween(String value1, String value2) {
            addCriterion("expectTime not between", value1, value2, "expecttime");
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