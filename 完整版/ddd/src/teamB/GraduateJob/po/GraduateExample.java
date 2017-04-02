package teamB.GraduateJob.po;

import java.util.ArrayList;
import java.util.List;

public class GraduateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GraduateExample() {
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

        public Criteria andGraduatenameIsNull() {
            addCriterion("graduateName is null");
            return (Criteria) this;
        }

        public Criteria andGraduatenameIsNotNull() {
            addCriterion("graduateName is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatenameEqualTo(String value) {
            addCriterion("graduateName =", value, "graduatename");
            return (Criteria) this;
        }

        public Criteria andGraduatenameNotEqualTo(String value) {
            addCriterion("graduateName <>", value, "graduatename");
            return (Criteria) this;
        }

        public Criteria andGraduatenameGreaterThan(String value) {
            addCriterion("graduateName >", value, "graduatename");
            return (Criteria) this;
        }

        public Criteria andGraduatenameGreaterThanOrEqualTo(String value) {
            addCriterion("graduateName >=", value, "graduatename");
            return (Criteria) this;
        }

        public Criteria andGraduatenameLessThan(String value) {
            addCriterion("graduateName <", value, "graduatename");
            return (Criteria) this;
        }

        public Criteria andGraduatenameLessThanOrEqualTo(String value) {
            addCriterion("graduateName <=", value, "graduatename");
            return (Criteria) this;
        }

        public Criteria andGraduatenameLike(String value) {
            addCriterion("graduateName like", value, "graduatename");
            return (Criteria) this;
        }

        public Criteria andGraduatenameNotLike(String value) {
            addCriterion("graduateName not like", value, "graduatename");
            return (Criteria) this;
        }

        public Criteria andGraduatenameIn(List<String> values) {
            addCriterion("graduateName in", values, "graduatename");
            return (Criteria) this;
        }

        public Criteria andGraduatenameNotIn(List<String> values) {
            addCriterion("graduateName not in", values, "graduatename");
            return (Criteria) this;
        }

        public Criteria andGraduatenameBetween(String value1, String value2) {
            addCriterion("graduateName between", value1, value2, "graduatename");
            return (Criteria) this;
        }

        public Criteria andGraduatenameNotBetween(String value1, String value2) {
            addCriterion("graduateName not between", value1, value2, "graduatename");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andGraduatephoneIsNull() {
            addCriterion("graduatePhone is null");
            return (Criteria) this;
        }

        public Criteria andGraduatephoneIsNotNull() {
            addCriterion("graduatePhone is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatephoneEqualTo(String value) {
            addCriterion("graduatePhone =", value, "graduatephone");
            return (Criteria) this;
        }

        public Criteria andGraduatephoneNotEqualTo(String value) {
            addCriterion("graduatePhone <>", value, "graduatephone");
            return (Criteria) this;
        }

        public Criteria andGraduatephoneGreaterThan(String value) {
            addCriterion("graduatePhone >", value, "graduatephone");
            return (Criteria) this;
        }

        public Criteria andGraduatephoneGreaterThanOrEqualTo(String value) {
            addCriterion("graduatePhone >=", value, "graduatephone");
            return (Criteria) this;
        }

        public Criteria andGraduatephoneLessThan(String value) {
            addCriterion("graduatePhone <", value, "graduatephone");
            return (Criteria) this;
        }

        public Criteria andGraduatephoneLessThanOrEqualTo(String value) {
            addCriterion("graduatePhone <=", value, "graduatephone");
            return (Criteria) this;
        }

        public Criteria andGraduatephoneLike(String value) {
            addCriterion("graduatePhone like", value, "graduatephone");
            return (Criteria) this;
        }

        public Criteria andGraduatephoneNotLike(String value) {
            addCriterion("graduatePhone not like", value, "graduatephone");
            return (Criteria) this;
        }

        public Criteria andGraduatephoneIn(List<String> values) {
            addCriterion("graduatePhone in", values, "graduatephone");
            return (Criteria) this;
        }

        public Criteria andGraduatephoneNotIn(List<String> values) {
            addCriterion("graduatePhone not in", values, "graduatephone");
            return (Criteria) this;
        }

        public Criteria andGraduatephoneBetween(String value1, String value2) {
            addCriterion("graduatePhone between", value1, value2, "graduatephone");
            return (Criteria) this;
        }

        public Criteria andGraduatephoneNotBetween(String value1, String value2) {
            addCriterion("graduatePhone not between", value1, value2, "graduatephone");
            return (Criteria) this;
        }

        public Criteria andGraduateemailIsNull() {
            addCriterion("graduateEmail is null");
            return (Criteria) this;
        }

        public Criteria andGraduateemailIsNotNull() {
            addCriterion("graduateEmail is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateemailEqualTo(String value) {
            addCriterion("graduateEmail =", value, "graduateemail");
            return (Criteria) this;
        }

        public Criteria andGraduateemailNotEqualTo(String value) {
            addCriterion("graduateEmail <>", value, "graduateemail");
            return (Criteria) this;
        }

        public Criteria andGraduateemailGreaterThan(String value) {
            addCriterion("graduateEmail >", value, "graduateemail");
            return (Criteria) this;
        }

        public Criteria andGraduateemailGreaterThanOrEqualTo(String value) {
            addCriterion("graduateEmail >=", value, "graduateemail");
            return (Criteria) this;
        }

        public Criteria andGraduateemailLessThan(String value) {
            addCriterion("graduateEmail <", value, "graduateemail");
            return (Criteria) this;
        }

        public Criteria andGraduateemailLessThanOrEqualTo(String value) {
            addCriterion("graduateEmail <=", value, "graduateemail");
            return (Criteria) this;
        }

        public Criteria andGraduateemailLike(String value) {
            addCriterion("graduateEmail like", value, "graduateemail");
            return (Criteria) this;
        }

        public Criteria andGraduateemailNotLike(String value) {
            addCriterion("graduateEmail not like", value, "graduateemail");
            return (Criteria) this;
        }

        public Criteria andGraduateemailIn(List<String> values) {
            addCriterion("graduateEmail in", values, "graduateemail");
            return (Criteria) this;
        }

        public Criteria andGraduateemailNotIn(List<String> values) {
            addCriterion("graduateEmail not in", values, "graduateemail");
            return (Criteria) this;
        }

        public Criteria andGraduateemailBetween(String value1, String value2) {
            addCriterion("graduateEmail between", value1, value2, "graduateemail");
            return (Criteria) this;
        }

        public Criteria andGraduateemailNotBetween(String value1, String value2) {
            addCriterion("graduateEmail not between", value1, value2, "graduateemail");
            return (Criteria) this;
        }

        public Criteria andMasterskillIsNull() {
            addCriterion("masterSkill is null");
            return (Criteria) this;
        }

        public Criteria andMasterskillIsNotNull() {
            addCriterion("masterSkill is not null");
            return (Criteria) this;
        }

        public Criteria andMasterskillEqualTo(String value) {
            addCriterion("masterSkill =", value, "masterskill");
            return (Criteria) this;
        }

        public Criteria andMasterskillNotEqualTo(String value) {
            addCriterion("masterSkill <>", value, "masterskill");
            return (Criteria) this;
        }

        public Criteria andMasterskillGreaterThan(String value) {
            addCriterion("masterSkill >", value, "masterskill");
            return (Criteria) this;
        }

        public Criteria andMasterskillGreaterThanOrEqualTo(String value) {
            addCriterion("masterSkill >=", value, "masterskill");
            return (Criteria) this;
        }

        public Criteria andMasterskillLessThan(String value) {
            addCriterion("masterSkill <", value, "masterskill");
            return (Criteria) this;
        }

        public Criteria andMasterskillLessThanOrEqualTo(String value) {
            addCriterion("masterSkill <=", value, "masterskill");
            return (Criteria) this;
        }

        public Criteria andMasterskillLike(String value) {
            addCriterion("masterSkill like", value, "masterskill");
            return (Criteria) this;
        }

        public Criteria andMasterskillNotLike(String value) {
            addCriterion("masterSkill not like", value, "masterskill");
            return (Criteria) this;
        }

        public Criteria andMasterskillIn(List<String> values) {
            addCriterion("masterSkill in", values, "masterskill");
            return (Criteria) this;
        }

        public Criteria andMasterskillNotIn(List<String> values) {
            addCriterion("masterSkill not in", values, "masterskill");
            return (Criteria) this;
        }

        public Criteria andMasterskillBetween(String value1, String value2) {
            addCriterion("masterSkill between", value1, value2, "masterskill");
            return (Criteria) this;
        }

        public Criteria andMasterskillNotBetween(String value1, String value2) {
            addCriterion("masterSkill not between", value1, value2, "masterskill");
            return (Criteria) this;
        }

        public Criteria andPracticalexperienceIsNull() {
            addCriterion("practicalExperience is null");
            return (Criteria) this;
        }

        public Criteria andPracticalexperienceIsNotNull() {
            addCriterion("practicalExperience is not null");
            return (Criteria) this;
        }

        public Criteria andPracticalexperienceEqualTo(String value) {
            addCriterion("practicalExperience =", value, "practicalexperience");
            return (Criteria) this;
        }

        public Criteria andPracticalexperienceNotEqualTo(String value) {
            addCriterion("practicalExperience <>", value, "practicalexperience");
            return (Criteria) this;
        }

        public Criteria andPracticalexperienceGreaterThan(String value) {
            addCriterion("practicalExperience >", value, "practicalexperience");
            return (Criteria) this;
        }

        public Criteria andPracticalexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("practicalExperience >=", value, "practicalexperience");
            return (Criteria) this;
        }

        public Criteria andPracticalexperienceLessThan(String value) {
            addCriterion("practicalExperience <", value, "practicalexperience");
            return (Criteria) this;
        }

        public Criteria andPracticalexperienceLessThanOrEqualTo(String value) {
            addCriterion("practicalExperience <=", value, "practicalexperience");
            return (Criteria) this;
        }

        public Criteria andPracticalexperienceLike(String value) {
            addCriterion("practicalExperience like", value, "practicalexperience");
            return (Criteria) this;
        }

        public Criteria andPracticalexperienceNotLike(String value) {
            addCriterion("practicalExperience not like", value, "practicalexperience");
            return (Criteria) this;
        }

        public Criteria andPracticalexperienceIn(List<String> values) {
            addCriterion("practicalExperience in", values, "practicalexperience");
            return (Criteria) this;
        }

        public Criteria andPracticalexperienceNotIn(List<String> values) {
            addCriterion("practicalExperience not in", values, "practicalexperience");
            return (Criteria) this;
        }

        public Criteria andPracticalexperienceBetween(String value1, String value2) {
            addCriterion("practicalExperience between", value1, value2, "practicalexperience");
            return (Criteria) this;
        }

        public Criteria andPracticalexperienceNotBetween(String value1, String value2) {
            addCriterion("practicalExperience not between", value1, value2, "practicalexperience");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("classId is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classId is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(String value) {
            addCriterion("classId =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(String value) {
            addCriterion("classId <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(String value) {
            addCriterion("classId >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(String value) {
            addCriterion("classId >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(String value) {
            addCriterion("classId <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(String value) {
            addCriterion("classId <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLike(String value) {
            addCriterion("classId like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotLike(String value) {
            addCriterion("classId not like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<String> values) {
            addCriterion("classId in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<String> values) {
            addCriterion("classId not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(String value1, String value2) {
            addCriterion("classId between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(String value1, String value2) {
            addCriterion("classId not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andMottoIsNull() {
            addCriterion("motto is null");
            return (Criteria) this;
        }

        public Criteria andMottoIsNotNull() {
            addCriterion("motto is not null");
            return (Criteria) this;
        }

        public Criteria andMottoEqualTo(String value) {
            addCriterion("motto =", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotEqualTo(String value) {
            addCriterion("motto <>", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoGreaterThan(String value) {
            addCriterion("motto >", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoGreaterThanOrEqualTo(String value) {
            addCriterion("motto >=", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLessThan(String value) {
            addCriterion("motto <", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLessThanOrEqualTo(String value) {
            addCriterion("motto <=", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLike(String value) {
            addCriterion("motto like", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotLike(String value) {
            addCriterion("motto not like", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoIn(List<String> values) {
            addCriterion("motto in", values, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotIn(List<String> values) {
            addCriterion("motto not in", values, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoBetween(String value1, String value2) {
            addCriterion("motto between", value1, value2, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotBetween(String value1, String value2) {
            addCriterion("motto not between", value1, value2, "motto");
            return (Criteria) this;
        }

        public Criteria andStuLogoIsNull() {
            addCriterion("stu_logo is null");
            return (Criteria) this;
        }

        public Criteria andStuLogoIsNotNull() {
            addCriterion("stu_logo is not null");
            return (Criteria) this;
        }

        public Criteria andStuLogoEqualTo(String value) {
            addCriterion("stu_logo =", value, "stuLogo");
            return (Criteria) this;
        }

        public Criteria andStuLogoNotEqualTo(String value) {
            addCriterion("stu_logo <>", value, "stuLogo");
            return (Criteria) this;
        }

        public Criteria andStuLogoGreaterThan(String value) {
            addCriterion("stu_logo >", value, "stuLogo");
            return (Criteria) this;
        }

        public Criteria andStuLogoGreaterThanOrEqualTo(String value) {
            addCriterion("stu_logo >=", value, "stuLogo");
            return (Criteria) this;
        }

        public Criteria andStuLogoLessThan(String value) {
            addCriterion("stu_logo <", value, "stuLogo");
            return (Criteria) this;
        }

        public Criteria andStuLogoLessThanOrEqualTo(String value) {
            addCriterion("stu_logo <=", value, "stuLogo");
            return (Criteria) this;
        }

        public Criteria andStuLogoLike(String value) {
            addCriterion("stu_logo like", value, "stuLogo");
            return (Criteria) this;
        }

        public Criteria andStuLogoNotLike(String value) {
            addCriterion("stu_logo not like", value, "stuLogo");
            return (Criteria) this;
        }

        public Criteria andStuLogoIn(List<String> values) {
            addCriterion("stu_logo in", values, "stuLogo");
            return (Criteria) this;
        }

        public Criteria andStuLogoNotIn(List<String> values) {
            addCriterion("stu_logo not in", values, "stuLogo");
            return (Criteria) this;
        }

        public Criteria andStuLogoBetween(String value1, String value2) {
            addCriterion("stu_logo between", value1, value2, "stuLogo");
            return (Criteria) this;
        }

        public Criteria andStuLogoNotBetween(String value1, String value2) {
            addCriterion("stu_logo not between", value1, value2, "stuLogo");
            return (Criteria) this;
        }

        public Criteria andResumeFileIsNull() {
            addCriterion("Resume_file is null");
            return (Criteria) this;
        }

        public Criteria andResumeFileIsNotNull() {
            addCriterion("Resume_file is not null");
            return (Criteria) this;
        }

        public Criteria andResumeFileEqualTo(String value) {
            addCriterion("Resume_file =", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileNotEqualTo(String value) {
            addCriterion("Resume_file <>", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileGreaterThan(String value) {
            addCriterion("Resume_file >", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileGreaterThanOrEqualTo(String value) {
            addCriterion("Resume_file >=", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileLessThan(String value) {
            addCriterion("Resume_file <", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileLessThanOrEqualTo(String value) {
            addCriterion("Resume_file <=", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileLike(String value) {
            addCriterion("Resume_file like", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileNotLike(String value) {
            addCriterion("Resume_file not like", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileIn(List<String> values) {
            addCriterion("Resume_file in", values, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileNotIn(List<String> values) {
            addCriterion("Resume_file not in", values, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileBetween(String value1, String value2) {
            addCriterion("Resume_file between", value1, value2, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileNotBetween(String value1, String value2) {
            addCriterion("Resume_file not between", value1, value2, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andInstituteIsNull() {
            addCriterion("institute is null");
            return (Criteria) this;
        }

        public Criteria andInstituteIsNotNull() {
            addCriterion("institute is not null");
            return (Criteria) this;
        }

        public Criteria andInstituteEqualTo(String value) {
            addCriterion("institute =", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteNotEqualTo(String value) {
            addCriterion("institute <>", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteGreaterThan(String value) {
            addCriterion("institute >", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteGreaterThanOrEqualTo(String value) {
            addCriterion("institute >=", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteLessThan(String value) {
            addCriterion("institute <", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteLessThanOrEqualTo(String value) {
            addCriterion("institute <=", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteLike(String value) {
            addCriterion("institute like", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteNotLike(String value) {
            addCriterion("institute not like", value, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteIn(List<String> values) {
            addCriterion("institute in", values, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteNotIn(List<String> values) {
            addCriterion("institute not in", values, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteBetween(String value1, String value2) {
            addCriterion("institute between", value1, value2, "institute");
            return (Criteria) this;
        }

        public Criteria andInstituteNotBetween(String value1, String value2) {
            addCriterion("institute not between", value1, value2, "institute");
            return (Criteria) this;
        }

        public Criteria andGraduateyearIsNull() {
            addCriterion("graduateyear is null");
            return (Criteria) this;
        }

        public Criteria andGraduateyearIsNotNull() {
            addCriterion("graduateyear is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateyearEqualTo(Integer value) {
            addCriterion("graduateyear =", value, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearNotEqualTo(Integer value) {
            addCriterion("graduateyear <>", value, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearGreaterThan(Integer value) {
            addCriterion("graduateyear >", value, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("graduateyear >=", value, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearLessThan(Integer value) {
            addCriterion("graduateyear <", value, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearLessThanOrEqualTo(Integer value) {
            addCriterion("graduateyear <=", value, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearIn(List<Integer> values) {
            addCriterion("graduateyear in", values, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearNotIn(List<Integer> values) {
            addCriterion("graduateyear not in", values, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearBetween(Integer value1, Integer value2) {
            addCriterion("graduateyear between", value1, value2, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andGraduateyearNotBetween(Integer value1, Integer value2) {
            addCriterion("graduateyear not between", value1, value2, "graduateyear");
            return (Criteria) this;
        }

        public Criteria andStupasswordIsNull() {
            addCriterion("stupassword is null");
            return (Criteria) this;
        }

        public Criteria andStupasswordIsNotNull() {
            addCriterion("stupassword is not null");
            return (Criteria) this;
        }

        public Criteria andStupasswordEqualTo(String value) {
            addCriterion("stupassword =", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordNotEqualTo(String value) {
            addCriterion("stupassword <>", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordGreaterThan(String value) {
            addCriterion("stupassword >", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordGreaterThanOrEqualTo(String value) {
            addCriterion("stupassword >=", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordLessThan(String value) {
            addCriterion("stupassword <", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordLessThanOrEqualTo(String value) {
            addCriterion("stupassword <=", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordLike(String value) {
            addCriterion("stupassword like", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordNotLike(String value) {
            addCriterion("stupassword not like", value, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordIn(List<String> values) {
            addCriterion("stupassword in", values, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordNotIn(List<String> values) {
            addCriterion("stupassword not in", values, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordBetween(String value1, String value2) {
            addCriterion("stupassword between", value1, value2, "stupassword");
            return (Criteria) this;
        }

        public Criteria andStupasswordNotBetween(String value1, String value2) {
            addCriterion("stupassword not between", value1, value2, "stupassword");
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