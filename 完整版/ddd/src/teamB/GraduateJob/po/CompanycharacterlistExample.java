package teamB.GraduateJob.po;

import java.util.ArrayList;
import java.util.List;

public class CompanycharacterlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanycharacterlistExample() {
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

        public Criteria andCompanycharacteridIsNull() {
            addCriterion("companyCharacterid is null");
            return (Criteria) this;
        }

        public Criteria andCompanycharacteridIsNotNull() {
            addCriterion("companyCharacterid is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycharacteridEqualTo(Integer value) {
            addCriterion("companyCharacterid =", value, "companycharacterid");
            return (Criteria) this;
        }

        public Criteria andCompanycharacteridNotEqualTo(Integer value) {
            addCriterion("companyCharacterid <>", value, "companycharacterid");
            return (Criteria) this;
        }

        public Criteria andCompanycharacteridGreaterThan(Integer value) {
            addCriterion("companyCharacterid >", value, "companycharacterid");
            return (Criteria) this;
        }

        public Criteria andCompanycharacteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyCharacterid >=", value, "companycharacterid");
            return (Criteria) this;
        }

        public Criteria andCompanycharacteridLessThan(Integer value) {
            addCriterion("companyCharacterid <", value, "companycharacterid");
            return (Criteria) this;
        }

        public Criteria andCompanycharacteridLessThanOrEqualTo(Integer value) {
            addCriterion("companyCharacterid <=", value, "companycharacterid");
            return (Criteria) this;
        }

        public Criteria andCompanycharacteridIn(List<Integer> values) {
            addCriterion("companyCharacterid in", values, "companycharacterid");
            return (Criteria) this;
        }

        public Criteria andCompanycharacteridNotIn(List<Integer> values) {
            addCriterion("companyCharacterid not in", values, "companycharacterid");
            return (Criteria) this;
        }

        public Criteria andCompanycharacteridBetween(Integer value1, Integer value2) {
            addCriterion("companyCharacterid between", value1, value2, "companycharacterid");
            return (Criteria) this;
        }

        public Criteria andCompanycharacteridNotBetween(Integer value1, Integer value2) {
            addCriterion("companyCharacterid not between", value1, value2, "companycharacterid");
            return (Criteria) this;
        }

        public Criteria andCompanycharacterIsNull() {
            addCriterion("companyCharacter is null");
            return (Criteria) this;
        }

        public Criteria andCompanycharacterIsNotNull() {
            addCriterion("companyCharacter is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycharacterEqualTo(String value) {
            addCriterion("companyCharacter =", value, "companycharacter");
            return (Criteria) this;
        }

        public Criteria andCompanycharacterNotEqualTo(String value) {
            addCriterion("companyCharacter <>", value, "companycharacter");
            return (Criteria) this;
        }

        public Criteria andCompanycharacterGreaterThan(String value) {
            addCriterion("companyCharacter >", value, "companycharacter");
            return (Criteria) this;
        }

        public Criteria andCompanycharacterGreaterThanOrEqualTo(String value) {
            addCriterion("companyCharacter >=", value, "companycharacter");
            return (Criteria) this;
        }

        public Criteria andCompanycharacterLessThan(String value) {
            addCriterion("companyCharacter <", value, "companycharacter");
            return (Criteria) this;
        }

        public Criteria andCompanycharacterLessThanOrEqualTo(String value) {
            addCriterion("companyCharacter <=", value, "companycharacter");
            return (Criteria) this;
        }

        public Criteria andCompanycharacterLike(String value) {
            addCriterion("companyCharacter like", value, "companycharacter");
            return (Criteria) this;
        }

        public Criteria andCompanycharacterNotLike(String value) {
            addCriterion("companyCharacter not like", value, "companycharacter");
            return (Criteria) this;
        }

        public Criteria andCompanycharacterIn(List<String> values) {
            addCriterion("companyCharacter in", values, "companycharacter");
            return (Criteria) this;
        }

        public Criteria andCompanycharacterNotIn(List<String> values) {
            addCriterion("companyCharacter not in", values, "companycharacter");
            return (Criteria) this;
        }

        public Criteria andCompanycharacterBetween(String value1, String value2) {
            addCriterion("companyCharacter between", value1, value2, "companycharacter");
            return (Criteria) this;
        }

        public Criteria andCompanycharacterNotBetween(String value1, String value2) {
            addCriterion("companyCharacter not between", value1, value2, "companycharacter");
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