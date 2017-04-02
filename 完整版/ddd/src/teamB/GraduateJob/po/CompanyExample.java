package teamB.GraduateJob.po;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andCompanyidIsNull() {
            addCriterion("companyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("companyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("companyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("companyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("companyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("companyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("companyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("companyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("companyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("companyId not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
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

        public Criteria andCompanyplaceIsNull() {
            addCriterion("companyPlace is null");
            return (Criteria) this;
        }

        public Criteria andCompanyplaceIsNotNull() {
            addCriterion("companyPlace is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyplaceEqualTo(String value) {
            addCriterion("companyPlace =", value, "companyplace");
            return (Criteria) this;
        }

        public Criteria andCompanyplaceNotEqualTo(String value) {
            addCriterion("companyPlace <>", value, "companyplace");
            return (Criteria) this;
        }

        public Criteria andCompanyplaceGreaterThan(String value) {
            addCriterion("companyPlace >", value, "companyplace");
            return (Criteria) this;
        }

        public Criteria andCompanyplaceGreaterThanOrEqualTo(String value) {
            addCriterion("companyPlace >=", value, "companyplace");
            return (Criteria) this;
        }

        public Criteria andCompanyplaceLessThan(String value) {
            addCriterion("companyPlace <", value, "companyplace");
            return (Criteria) this;
        }

        public Criteria andCompanyplaceLessThanOrEqualTo(String value) {
            addCriterion("companyPlace <=", value, "companyplace");
            return (Criteria) this;
        }

        public Criteria andCompanyplaceLike(String value) {
            addCriterion("companyPlace like", value, "companyplace");
            return (Criteria) this;
        }

        public Criteria andCompanyplaceNotLike(String value) {
            addCriterion("companyPlace not like", value, "companyplace");
            return (Criteria) this;
        }

        public Criteria andCompanyplaceIn(List<String> values) {
            addCriterion("companyPlace in", values, "companyplace");
            return (Criteria) this;
        }

        public Criteria andCompanyplaceNotIn(List<String> values) {
            addCriterion("companyPlace not in", values, "companyplace");
            return (Criteria) this;
        }

        public Criteria andCompanyplaceBetween(String value1, String value2) {
            addCriterion("companyPlace between", value1, value2, "companyplace");
            return (Criteria) this;
        }

        public Criteria andCompanyplaceNotBetween(String value1, String value2) {
            addCriterion("companyPlace not between", value1, value2, "companyplace");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andCompanypasswordIsNull() {
            addCriterion("companyPassword is null");
            return (Criteria) this;
        }

        public Criteria andCompanypasswordIsNotNull() {
            addCriterion("companyPassword is not null");
            return (Criteria) this;
        }

        public Criteria andCompanypasswordEqualTo(String value) {
            addCriterion("companyPassword =", value, "companypassword");
            return (Criteria) this;
        }

        public Criteria andCompanypasswordNotEqualTo(String value) {
            addCriterion("companyPassword <>", value, "companypassword");
            return (Criteria) this;
        }

        public Criteria andCompanypasswordGreaterThan(String value) {
            addCriterion("companyPassword >", value, "companypassword");
            return (Criteria) this;
        }

        public Criteria andCompanypasswordGreaterThanOrEqualTo(String value) {
            addCriterion("companyPassword >=", value, "companypassword");
            return (Criteria) this;
        }

        public Criteria andCompanypasswordLessThan(String value) {
            addCriterion("companyPassword <", value, "companypassword");
            return (Criteria) this;
        }

        public Criteria andCompanypasswordLessThanOrEqualTo(String value) {
            addCriterion("companyPassword <=", value, "companypassword");
            return (Criteria) this;
        }

        public Criteria andCompanypasswordLike(String value) {
            addCriterion("companyPassword like", value, "companypassword");
            return (Criteria) this;
        }

        public Criteria andCompanypasswordNotLike(String value) {
            addCriterion("companyPassword not like", value, "companypassword");
            return (Criteria) this;
        }

        public Criteria andCompanypasswordIn(List<String> values) {
            addCriterion("companyPassword in", values, "companypassword");
            return (Criteria) this;
        }

        public Criteria andCompanypasswordNotIn(List<String> values) {
            addCriterion("companyPassword not in", values, "companypassword");
            return (Criteria) this;
        }

        public Criteria andCompanypasswordBetween(String value1, String value2) {
            addCriterion("companyPassword between", value1, value2, "companypassword");
            return (Criteria) this;
        }

        public Criteria andCompanypasswordNotBetween(String value1, String value2) {
            addCriterion("companyPassword not between", value1, value2, "companypassword");
            return (Criteria) this;
        }

        public Criteria andMainIsNull() {
            addCriterion("main is null");
            return (Criteria) this;
        }

        public Criteria andMainIsNotNull() {
            addCriterion("main is not null");
            return (Criteria) this;
        }

        public Criteria andMainEqualTo(String value) {
            addCriterion("main =", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotEqualTo(String value) {
            addCriterion("main <>", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainGreaterThan(String value) {
            addCriterion("main >", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainGreaterThanOrEqualTo(String value) {
            addCriterion("main >=", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainLessThan(String value) {
            addCriterion("main <", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainLessThanOrEqualTo(String value) {
            addCriterion("main <=", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainLike(String value) {
            addCriterion("main like", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotLike(String value) {
            addCriterion("main not like", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainIn(List<String> values) {
            addCriterion("main in", values, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotIn(List<String> values) {
            addCriterion("main not in", values, "main");
            return (Criteria) this;
        }

        public Criteria andMainBetween(String value1, String value2) {
            addCriterion("main between", value1, value2, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotBetween(String value1, String value2) {
            addCriterion("main not between", value1, value2, "main");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
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