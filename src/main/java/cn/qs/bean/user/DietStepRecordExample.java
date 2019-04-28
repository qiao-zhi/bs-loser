package cn.qs.bean.user;

import java.util.ArrayList;
import java.util.List;

public class DietStepRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DietStepRecordExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatorusernameIsNull() {
            addCriterion("creatorusername is null");
            return (Criteria) this;
        }

        public Criteria andCreatorusernameIsNotNull() {
            addCriterion("creatorusername is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorusernameEqualTo(String value) {
            addCriterion("creatorusername =", value, "creatorusername");
            return (Criteria) this;
        }

        public Criteria andCreatorusernameNotEqualTo(String value) {
            addCriterion("creatorusername <>", value, "creatorusername");
            return (Criteria) this;
        }

        public Criteria andCreatorusernameGreaterThan(String value) {
            addCriterion("creatorusername >", value, "creatorusername");
            return (Criteria) this;
        }

        public Criteria andCreatorusernameGreaterThanOrEqualTo(String value) {
            addCriterion("creatorusername >=", value, "creatorusername");
            return (Criteria) this;
        }

        public Criteria andCreatorusernameLessThan(String value) {
            addCriterion("creatorusername <", value, "creatorusername");
            return (Criteria) this;
        }

        public Criteria andCreatorusernameLessThanOrEqualTo(String value) {
            addCriterion("creatorusername <=", value, "creatorusername");
            return (Criteria) this;
        }

        public Criteria andCreatorusernameLike(String value) {
            addCriterion("creatorusername like", value, "creatorusername");
            return (Criteria) this;
        }

        public Criteria andCreatorusernameNotLike(String value) {
            addCriterion("creatorusername not like", value, "creatorusername");
            return (Criteria) this;
        }

        public Criteria andCreatorusernameIn(List<String> values) {
            addCriterion("creatorusername in", values, "creatorusername");
            return (Criteria) this;
        }

        public Criteria andCreatorusernameNotIn(List<String> values) {
            addCriterion("creatorusername not in", values, "creatorusername");
            return (Criteria) this;
        }

        public Criteria andCreatorusernameBetween(String value1, String value2) {
            addCriterion("creatorusername between", value1, value2, "creatorusername");
            return (Criteria) this;
        }

        public Criteria andCreatorusernameNotBetween(String value1, String value2) {
            addCriterion("creatorusername not between", value1, value2, "creatorusername");
            return (Criteria) this;
        }

        public Criteria andDietsIsNull() {
            addCriterion("diets is null");
            return (Criteria) this;
        }

        public Criteria andDietsIsNotNull() {
            addCriterion("diets is not null");
            return (Criteria) this;
        }

        public Criteria andDietsEqualTo(String value) {
            addCriterion("diets =", value, "diets");
            return (Criteria) this;
        }

        public Criteria andDietsNotEqualTo(String value) {
            addCriterion("diets <>", value, "diets");
            return (Criteria) this;
        }

        public Criteria andDietsGreaterThan(String value) {
            addCriterion("diets >", value, "diets");
            return (Criteria) this;
        }

        public Criteria andDietsGreaterThanOrEqualTo(String value) {
            addCriterion("diets >=", value, "diets");
            return (Criteria) this;
        }

        public Criteria andDietsLessThan(String value) {
            addCriterion("diets <", value, "diets");
            return (Criteria) this;
        }

        public Criteria andDietsLessThanOrEqualTo(String value) {
            addCriterion("diets <=", value, "diets");
            return (Criteria) this;
        }

        public Criteria andDietsLike(String value) {
            addCriterion("diets like", value, "diets");
            return (Criteria) this;
        }

        public Criteria andDietsNotLike(String value) {
            addCriterion("diets not like", value, "diets");
            return (Criteria) this;
        }

        public Criteria andDietsIn(List<String> values) {
            addCriterion("diets in", values, "diets");
            return (Criteria) this;
        }

        public Criteria andDietsNotIn(List<String> values) {
            addCriterion("diets not in", values, "diets");
            return (Criteria) this;
        }

        public Criteria andDietsBetween(String value1, String value2) {
            addCriterion("diets between", value1, value2, "diets");
            return (Criteria) this;
        }

        public Criteria andDietsNotBetween(String value1, String value2) {
            addCriterion("diets not between", value1, value2, "diets");
            return (Criteria) this;
        }

        public Criteria andDietsheatIsNull() {
            addCriterion("dietsheat is null");
            return (Criteria) this;
        }

        public Criteria andDietsheatIsNotNull() {
            addCriterion("dietsheat is not null");
            return (Criteria) this;
        }

        public Criteria andDietsheatEqualTo(String value) {
            addCriterion("dietsheat =", value, "dietsheat");
            return (Criteria) this;
        }

        public Criteria andDietsheatNotEqualTo(String value) {
            addCriterion("dietsheat <>", value, "dietsheat");
            return (Criteria) this;
        }

        public Criteria andDietsheatGreaterThan(String value) {
            addCriterion("dietsheat >", value, "dietsheat");
            return (Criteria) this;
        }

        public Criteria andDietsheatGreaterThanOrEqualTo(String value) {
            addCriterion("dietsheat >=", value, "dietsheat");
            return (Criteria) this;
        }

        public Criteria andDietsheatLessThan(String value) {
            addCriterion("dietsheat <", value, "dietsheat");
            return (Criteria) this;
        }

        public Criteria andDietsheatLessThanOrEqualTo(String value) {
            addCriterion("dietsheat <=", value, "dietsheat");
            return (Criteria) this;
        }

        public Criteria andDietsheatLike(String value) {
            addCriterion("dietsheat like", value, "dietsheat");
            return (Criteria) this;
        }

        public Criteria andDietsheatNotLike(String value) {
            addCriterion("dietsheat not like", value, "dietsheat");
            return (Criteria) this;
        }

        public Criteria andDietsheatIn(List<String> values) {
            addCriterion("dietsheat in", values, "dietsheat");
            return (Criteria) this;
        }

        public Criteria andDietsheatNotIn(List<String> values) {
            addCriterion("dietsheat not in", values, "dietsheat");
            return (Criteria) this;
        }

        public Criteria andDietsheatBetween(String value1, String value2) {
            addCriterion("dietsheat between", value1, value2, "dietsheat");
            return (Criteria) this;
        }

        public Criteria andDietsheatNotBetween(String value1, String value2) {
            addCriterion("dietsheat not between", value1, value2, "dietsheat");
            return (Criteria) this;
        }

        public Criteria andRecommendvideoIsNull() {
            addCriterion("recommendvideo is null");
            return (Criteria) this;
        }

        public Criteria andRecommendvideoIsNotNull() {
            addCriterion("recommendvideo is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendvideoEqualTo(String value) {
            addCriterion("recommendvideo =", value, "recommendvideo");
            return (Criteria) this;
        }

        public Criteria andRecommendvideoNotEqualTo(String value) {
            addCriterion("recommendvideo <>", value, "recommendvideo");
            return (Criteria) this;
        }

        public Criteria andRecommendvideoGreaterThan(String value) {
            addCriterion("recommendvideo >", value, "recommendvideo");
            return (Criteria) this;
        }

        public Criteria andRecommendvideoGreaterThanOrEqualTo(String value) {
            addCriterion("recommendvideo >=", value, "recommendvideo");
            return (Criteria) this;
        }

        public Criteria andRecommendvideoLessThan(String value) {
            addCriterion("recommendvideo <", value, "recommendvideo");
            return (Criteria) this;
        }

        public Criteria andRecommendvideoLessThanOrEqualTo(String value) {
            addCriterion("recommendvideo <=", value, "recommendvideo");
            return (Criteria) this;
        }

        public Criteria andRecommendvideoLike(String value) {
            addCriterion("recommendvideo like", value, "recommendvideo");
            return (Criteria) this;
        }

        public Criteria andRecommendvideoNotLike(String value) {
            addCriterion("recommendvideo not like", value, "recommendvideo");
            return (Criteria) this;
        }

        public Criteria andRecommendvideoIn(List<String> values) {
            addCriterion("recommendvideo in", values, "recommendvideo");
            return (Criteria) this;
        }

        public Criteria andRecommendvideoNotIn(List<String> values) {
            addCriterion("recommendvideo not in", values, "recommendvideo");
            return (Criteria) this;
        }

        public Criteria andRecommendvideoBetween(String value1, String value2) {
            addCriterion("recommendvideo between", value1, value2, "recommendvideo");
            return (Criteria) this;
        }

        public Criteria andRecommendvideoNotBetween(String value1, String value2) {
            addCriterion("recommendvideo not between", value1, value2, "recommendvideo");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSportsIsNull() {
            addCriterion("sports is null");
            return (Criteria) this;
        }

        public Criteria andSportsIsNotNull() {
            addCriterion("sports is not null");
            return (Criteria) this;
        }

        public Criteria andSportsEqualTo(String value) {
            addCriterion("sports =", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsNotEqualTo(String value) {
            addCriterion("sports <>", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsGreaterThan(String value) {
            addCriterion("sports >", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsGreaterThanOrEqualTo(String value) {
            addCriterion("sports >=", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsLessThan(String value) {
            addCriterion("sports <", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsLessThanOrEqualTo(String value) {
            addCriterion("sports <=", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsLike(String value) {
            addCriterion("sports like", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsNotLike(String value) {
            addCriterion("sports not like", value, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsIn(List<String> values) {
            addCriterion("sports in", values, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsNotIn(List<String> values) {
            addCriterion("sports not in", values, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsBetween(String value1, String value2) {
            addCriterion("sports between", value1, value2, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsNotBetween(String value1, String value2) {
            addCriterion("sports not between", value1, value2, "sports");
            return (Criteria) this;
        }

        public Criteria andSportsheatIsNull() {
            addCriterion("sportsheat is null");
            return (Criteria) this;
        }

        public Criteria andSportsheatIsNotNull() {
            addCriterion("sportsheat is not null");
            return (Criteria) this;
        }

        public Criteria andSportsheatEqualTo(String value) {
            addCriterion("sportsheat =", value, "sportsheat");
            return (Criteria) this;
        }

        public Criteria andSportsheatNotEqualTo(String value) {
            addCriterion("sportsheat <>", value, "sportsheat");
            return (Criteria) this;
        }

        public Criteria andSportsheatGreaterThan(String value) {
            addCriterion("sportsheat >", value, "sportsheat");
            return (Criteria) this;
        }

        public Criteria andSportsheatGreaterThanOrEqualTo(String value) {
            addCriterion("sportsheat >=", value, "sportsheat");
            return (Criteria) this;
        }

        public Criteria andSportsheatLessThan(String value) {
            addCriterion("sportsheat <", value, "sportsheat");
            return (Criteria) this;
        }

        public Criteria andSportsheatLessThanOrEqualTo(String value) {
            addCriterion("sportsheat <=", value, "sportsheat");
            return (Criteria) this;
        }

        public Criteria andSportsheatLike(String value) {
            addCriterion("sportsheat like", value, "sportsheat");
            return (Criteria) this;
        }

        public Criteria andSportsheatNotLike(String value) {
            addCriterion("sportsheat not like", value, "sportsheat");
            return (Criteria) this;
        }

        public Criteria andSportsheatIn(List<String> values) {
            addCriterion("sportsheat in", values, "sportsheat");
            return (Criteria) this;
        }

        public Criteria andSportsheatNotIn(List<String> values) {
            addCriterion("sportsheat not in", values, "sportsheat");
            return (Criteria) this;
        }

        public Criteria andSportsheatBetween(String value1, String value2) {
            addCriterion("sportsheat between", value1, value2, "sportsheat");
            return (Criteria) this;
        }

        public Criteria andSportsheatNotBetween(String value1, String value2) {
            addCriterion("sportsheat not between", value1, value2, "sportsheat");
            return (Criteria) this;
        }

        public Criteria andStepnumberIsNull() {
            addCriterion("stepnumber is null");
            return (Criteria) this;
        }

        public Criteria andStepnumberIsNotNull() {
            addCriterion("stepnumber is not null");
            return (Criteria) this;
        }

        public Criteria andStepnumberEqualTo(Integer value) {
            addCriterion("stepnumber =", value, "stepnumber");
            return (Criteria) this;
        }

        public Criteria andStepnumberNotEqualTo(Integer value) {
            addCriterion("stepnumber <>", value, "stepnumber");
            return (Criteria) this;
        }

        public Criteria andStepnumberGreaterThan(Integer value) {
            addCriterion("stepnumber >", value, "stepnumber");
            return (Criteria) this;
        }

        public Criteria andStepnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("stepnumber >=", value, "stepnumber");
            return (Criteria) this;
        }

        public Criteria andStepnumberLessThan(Integer value) {
            addCriterion("stepnumber <", value, "stepnumber");
            return (Criteria) this;
        }

        public Criteria andStepnumberLessThanOrEqualTo(Integer value) {
            addCriterion("stepnumber <=", value, "stepnumber");
            return (Criteria) this;
        }

        public Criteria andStepnumberIn(List<Integer> values) {
            addCriterion("stepnumber in", values, "stepnumber");
            return (Criteria) this;
        }

        public Criteria andStepnumberNotIn(List<Integer> values) {
            addCriterion("stepnumber not in", values, "stepnumber");
            return (Criteria) this;
        }

        public Criteria andStepnumberBetween(Integer value1, Integer value2) {
            addCriterion("stepnumber between", value1, value2, "stepnumber");
            return (Criteria) this;
        }

        public Criteria andStepnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("stepnumber not between", value1, value2, "stepnumber");
            return (Criteria) this;
        }

        public Criteria andStepsequenceIsNull() {
            addCriterion("stepsequence is null");
            return (Criteria) this;
        }

        public Criteria andStepsequenceIsNotNull() {
            addCriterion("stepsequence is not null");
            return (Criteria) this;
        }

        public Criteria andStepsequenceEqualTo(Integer value) {
            addCriterion("stepsequence =", value, "stepsequence");
            return (Criteria) this;
        }

        public Criteria andStepsequenceNotEqualTo(Integer value) {
            addCriterion("stepsequence <>", value, "stepsequence");
            return (Criteria) this;
        }

        public Criteria andStepsequenceGreaterThan(Integer value) {
            addCriterion("stepsequence >", value, "stepsequence");
            return (Criteria) this;
        }

        public Criteria andStepsequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("stepsequence >=", value, "stepsequence");
            return (Criteria) this;
        }

        public Criteria andStepsequenceLessThan(Integer value) {
            addCriterion("stepsequence <", value, "stepsequence");
            return (Criteria) this;
        }

        public Criteria andStepsequenceLessThanOrEqualTo(Integer value) {
            addCriterion("stepsequence <=", value, "stepsequence");
            return (Criteria) this;
        }

        public Criteria andStepsequenceIn(List<Integer> values) {
            addCriterion("stepsequence in", values, "stepsequence");
            return (Criteria) this;
        }

        public Criteria andStepsequenceNotIn(List<Integer> values) {
            addCriterion("stepsequence not in", values, "stepsequence");
            return (Criteria) this;
        }

        public Criteria andStepsequenceBetween(Integer value1, Integer value2) {
            addCriterion("stepsequence between", value1, value2, "stepsequence");
            return (Criteria) this;
        }

        public Criteria andStepsequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("stepsequence not between", value1, value2, "stepsequence");
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