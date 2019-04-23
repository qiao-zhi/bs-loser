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

        public Criteria andBreakfastIsNull() {
            addCriterion("breakfast is null");
            return (Criteria) this;
        }

        public Criteria andBreakfastIsNotNull() {
            addCriterion("breakfast is not null");
            return (Criteria) this;
        }

        public Criteria andBreakfastEqualTo(String value) {
            addCriterion("breakfast =", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotEqualTo(String value) {
            addCriterion("breakfast <>", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastGreaterThan(String value) {
            addCriterion("breakfast >", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastGreaterThanOrEqualTo(String value) {
            addCriterion("breakfast >=", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLessThan(String value) {
            addCriterion("breakfast <", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLessThanOrEqualTo(String value) {
            addCriterion("breakfast <=", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLike(String value) {
            addCriterion("breakfast like", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotLike(String value) {
            addCriterion("breakfast not like", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastIn(List<String> values) {
            addCriterion("breakfast in", values, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotIn(List<String> values) {
            addCriterion("breakfast not in", values, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastBetween(String value1, String value2) {
            addCriterion("breakfast between", value1, value2, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotBetween(String value1, String value2) {
            addCriterion("breakfast not between", value1, value2, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastheatIsNull() {
            addCriterion("breakfastheat is null");
            return (Criteria) this;
        }

        public Criteria andBreakfastheatIsNotNull() {
            addCriterion("breakfastheat is not null");
            return (Criteria) this;
        }

        public Criteria andBreakfastheatEqualTo(Float value) {
            addCriterion("breakfastheat =", value, "breakfastheat");
            return (Criteria) this;
        }

        public Criteria andBreakfastheatNotEqualTo(Float value) {
            addCriterion("breakfastheat <>", value, "breakfastheat");
            return (Criteria) this;
        }

        public Criteria andBreakfastheatGreaterThan(Float value) {
            addCriterion("breakfastheat >", value, "breakfastheat");
            return (Criteria) this;
        }

        public Criteria andBreakfastheatGreaterThanOrEqualTo(Float value) {
            addCriterion("breakfastheat >=", value, "breakfastheat");
            return (Criteria) this;
        }

        public Criteria andBreakfastheatLessThan(Float value) {
            addCriterion("breakfastheat <", value, "breakfastheat");
            return (Criteria) this;
        }

        public Criteria andBreakfastheatLessThanOrEqualTo(Float value) {
            addCriterion("breakfastheat <=", value, "breakfastheat");
            return (Criteria) this;
        }

        public Criteria andBreakfastheatIn(List<Float> values) {
            addCriterion("breakfastheat in", values, "breakfastheat");
            return (Criteria) this;
        }

        public Criteria andBreakfastheatNotIn(List<Float> values) {
            addCriterion("breakfastheat not in", values, "breakfastheat");
            return (Criteria) this;
        }

        public Criteria andBreakfastheatBetween(Float value1, Float value2) {
            addCriterion("breakfastheat between", value1, value2, "breakfastheat");
            return (Criteria) this;
        }

        public Criteria andBreakfastheatNotBetween(Float value1, Float value2) {
            addCriterion("breakfastheat not between", value1, value2, "breakfastheat");
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

        public Criteria andDinnerIsNull() {
            addCriterion("dinner is null");
            return (Criteria) this;
        }

        public Criteria andDinnerIsNotNull() {
            addCriterion("dinner is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerEqualTo(String value) {
            addCriterion("dinner =", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerNotEqualTo(String value) {
            addCriterion("dinner <>", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerGreaterThan(String value) {
            addCriterion("dinner >", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerGreaterThanOrEqualTo(String value) {
            addCriterion("dinner >=", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerLessThan(String value) {
            addCriterion("dinner <", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerLessThanOrEqualTo(String value) {
            addCriterion("dinner <=", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerLike(String value) {
            addCriterion("dinner like", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerNotLike(String value) {
            addCriterion("dinner not like", value, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerIn(List<String> values) {
            addCriterion("dinner in", values, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerNotIn(List<String> values) {
            addCriterion("dinner not in", values, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerBetween(String value1, String value2) {
            addCriterion("dinner between", value1, value2, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerNotBetween(String value1, String value2) {
            addCriterion("dinner not between", value1, value2, "dinner");
            return (Criteria) this;
        }

        public Criteria andDinnerheatIsNull() {
            addCriterion("dinnerheat is null");
            return (Criteria) this;
        }

        public Criteria andDinnerheatIsNotNull() {
            addCriterion("dinnerheat is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerheatEqualTo(Float value) {
            addCriterion("dinnerheat =", value, "dinnerheat");
            return (Criteria) this;
        }

        public Criteria andDinnerheatNotEqualTo(Float value) {
            addCriterion("dinnerheat <>", value, "dinnerheat");
            return (Criteria) this;
        }

        public Criteria andDinnerheatGreaterThan(Float value) {
            addCriterion("dinnerheat >", value, "dinnerheat");
            return (Criteria) this;
        }

        public Criteria andDinnerheatGreaterThanOrEqualTo(Float value) {
            addCriterion("dinnerheat >=", value, "dinnerheat");
            return (Criteria) this;
        }

        public Criteria andDinnerheatLessThan(Float value) {
            addCriterion("dinnerheat <", value, "dinnerheat");
            return (Criteria) this;
        }

        public Criteria andDinnerheatLessThanOrEqualTo(Float value) {
            addCriterion("dinnerheat <=", value, "dinnerheat");
            return (Criteria) this;
        }

        public Criteria andDinnerheatIn(List<Float> values) {
            addCriterion("dinnerheat in", values, "dinnerheat");
            return (Criteria) this;
        }

        public Criteria andDinnerheatNotIn(List<Float> values) {
            addCriterion("dinnerheat not in", values, "dinnerheat");
            return (Criteria) this;
        }

        public Criteria andDinnerheatBetween(Float value1, Float value2) {
            addCriterion("dinnerheat between", value1, value2, "dinnerheat");
            return (Criteria) this;
        }

        public Criteria andDinnerheatNotBetween(Float value1, Float value2) {
            addCriterion("dinnerheat not between", value1, value2, "dinnerheat");
            return (Criteria) this;
        }

        public Criteria andLunchIsNull() {
            addCriterion("lunch is null");
            return (Criteria) this;
        }

        public Criteria andLunchIsNotNull() {
            addCriterion("lunch is not null");
            return (Criteria) this;
        }

        public Criteria andLunchEqualTo(String value) {
            addCriterion("lunch =", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchNotEqualTo(String value) {
            addCriterion("lunch <>", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchGreaterThan(String value) {
            addCriterion("lunch >", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchGreaterThanOrEqualTo(String value) {
            addCriterion("lunch >=", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchLessThan(String value) {
            addCriterion("lunch <", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchLessThanOrEqualTo(String value) {
            addCriterion("lunch <=", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchLike(String value) {
            addCriterion("lunch like", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchNotLike(String value) {
            addCriterion("lunch not like", value, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchIn(List<String> values) {
            addCriterion("lunch in", values, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchNotIn(List<String> values) {
            addCriterion("lunch not in", values, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchBetween(String value1, String value2) {
            addCriterion("lunch between", value1, value2, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchNotBetween(String value1, String value2) {
            addCriterion("lunch not between", value1, value2, "lunch");
            return (Criteria) this;
        }

        public Criteria andLunchheatIsNull() {
            addCriterion("lunchheat is null");
            return (Criteria) this;
        }

        public Criteria andLunchheatIsNotNull() {
            addCriterion("lunchheat is not null");
            return (Criteria) this;
        }

        public Criteria andLunchheatEqualTo(Float value) {
            addCriterion("lunchheat =", value, "lunchheat");
            return (Criteria) this;
        }

        public Criteria andLunchheatNotEqualTo(Float value) {
            addCriterion("lunchheat <>", value, "lunchheat");
            return (Criteria) this;
        }

        public Criteria andLunchheatGreaterThan(Float value) {
            addCriterion("lunchheat >", value, "lunchheat");
            return (Criteria) this;
        }

        public Criteria andLunchheatGreaterThanOrEqualTo(Float value) {
            addCriterion("lunchheat >=", value, "lunchheat");
            return (Criteria) this;
        }

        public Criteria andLunchheatLessThan(Float value) {
            addCriterion("lunchheat <", value, "lunchheat");
            return (Criteria) this;
        }

        public Criteria andLunchheatLessThanOrEqualTo(Float value) {
            addCriterion("lunchheat <=", value, "lunchheat");
            return (Criteria) this;
        }

        public Criteria andLunchheatIn(List<Float> values) {
            addCriterion("lunchheat in", values, "lunchheat");
            return (Criteria) this;
        }

        public Criteria andLunchheatNotIn(List<Float> values) {
            addCriterion("lunchheat not in", values, "lunchheat");
            return (Criteria) this;
        }

        public Criteria andLunchheatBetween(Float value1, Float value2) {
            addCriterion("lunchheat between", value1, value2, "lunchheat");
            return (Criteria) this;
        }

        public Criteria andLunchheatNotBetween(Float value1, Float value2) {
            addCriterion("lunchheat not between", value1, value2, "lunchheat");
            return (Criteria) this;
        }

        public Criteria andRecommendviderIsNull() {
            addCriterion("recommendvider is null");
            return (Criteria) this;
        }

        public Criteria andRecommendviderIsNotNull() {
            addCriterion("recommendvider is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendviderEqualTo(String value) {
            addCriterion("recommendvider =", value, "recommendvider");
            return (Criteria) this;
        }

        public Criteria andRecommendviderNotEqualTo(String value) {
            addCriterion("recommendvider <>", value, "recommendvider");
            return (Criteria) this;
        }

        public Criteria andRecommendviderGreaterThan(String value) {
            addCriterion("recommendvider >", value, "recommendvider");
            return (Criteria) this;
        }

        public Criteria andRecommendviderGreaterThanOrEqualTo(String value) {
            addCriterion("recommendvider >=", value, "recommendvider");
            return (Criteria) this;
        }

        public Criteria andRecommendviderLessThan(String value) {
            addCriterion("recommendvider <", value, "recommendvider");
            return (Criteria) this;
        }

        public Criteria andRecommendviderLessThanOrEqualTo(String value) {
            addCriterion("recommendvider <=", value, "recommendvider");
            return (Criteria) this;
        }

        public Criteria andRecommendviderLike(String value) {
            addCriterion("recommendvider like", value, "recommendvider");
            return (Criteria) this;
        }

        public Criteria andRecommendviderNotLike(String value) {
            addCriterion("recommendvider not like", value, "recommendvider");
            return (Criteria) this;
        }

        public Criteria andRecommendviderIn(List<String> values) {
            addCriterion("recommendvider in", values, "recommendvider");
            return (Criteria) this;
        }

        public Criteria andRecommendviderNotIn(List<String> values) {
            addCriterion("recommendvider not in", values, "recommendvider");
            return (Criteria) this;
        }

        public Criteria andRecommendviderBetween(String value1, String value2) {
            addCriterion("recommendvider between", value1, value2, "recommendvider");
            return (Criteria) this;
        }

        public Criteria andRecommendviderNotBetween(String value1, String value2) {
            addCriterion("recommendvider not between", value1, value2, "recommendvider");
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

        public Criteria andSportnumberIsNull() {
            addCriterion("sportnumber is null");
            return (Criteria) this;
        }

        public Criteria andSportnumberIsNotNull() {
            addCriterion("sportnumber is not null");
            return (Criteria) this;
        }

        public Criteria andSportnumberEqualTo(Float value) {
            addCriterion("sportnumber =", value, "sportnumber");
            return (Criteria) this;
        }

        public Criteria andSportnumberNotEqualTo(Float value) {
            addCriterion("sportnumber <>", value, "sportnumber");
            return (Criteria) this;
        }

        public Criteria andSportnumberGreaterThan(Float value) {
            addCriterion("sportnumber >", value, "sportnumber");
            return (Criteria) this;
        }

        public Criteria andSportnumberGreaterThanOrEqualTo(Float value) {
            addCriterion("sportnumber >=", value, "sportnumber");
            return (Criteria) this;
        }

        public Criteria andSportnumberLessThan(Float value) {
            addCriterion("sportnumber <", value, "sportnumber");
            return (Criteria) this;
        }

        public Criteria andSportnumberLessThanOrEqualTo(Float value) {
            addCriterion("sportnumber <=", value, "sportnumber");
            return (Criteria) this;
        }

        public Criteria andSportnumberIn(List<Float> values) {
            addCriterion("sportnumber in", values, "sportnumber");
            return (Criteria) this;
        }

        public Criteria andSportnumberNotIn(List<Float> values) {
            addCriterion("sportnumber not in", values, "sportnumber");
            return (Criteria) this;
        }

        public Criteria andSportnumberBetween(Float value1, Float value2) {
            addCriterion("sportnumber between", value1, value2, "sportnumber");
            return (Criteria) this;
        }

        public Criteria andSportnumberNotBetween(Float value1, Float value2) {
            addCriterion("sportnumber not between", value1, value2, "sportnumber");
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