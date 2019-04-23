package cn.qs.bean.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLosePlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLosePlanExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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

        public Criteria andHasfinishedIsNull() {
            addCriterion("hasfinished is null");
            return (Criteria) this;
        }

        public Criteria andHasfinishedIsNotNull() {
            addCriterion("hasfinished is not null");
            return (Criteria) this;
        }

        public Criteria andHasfinishedEqualTo(String value) {
            addCriterion("hasfinished =", value, "hasfinished");
            return (Criteria) this;
        }

        public Criteria andHasfinishedNotEqualTo(String value) {
            addCriterion("hasfinished <>", value, "hasfinished");
            return (Criteria) this;
        }

        public Criteria andHasfinishedGreaterThan(String value) {
            addCriterion("hasfinished >", value, "hasfinished");
            return (Criteria) this;
        }

        public Criteria andHasfinishedGreaterThanOrEqualTo(String value) {
            addCriterion("hasfinished >=", value, "hasfinished");
            return (Criteria) this;
        }

        public Criteria andHasfinishedLessThan(String value) {
            addCriterion("hasfinished <", value, "hasfinished");
            return (Criteria) this;
        }

        public Criteria andHasfinishedLessThanOrEqualTo(String value) {
            addCriterion("hasfinished <=", value, "hasfinished");
            return (Criteria) this;
        }

        public Criteria andHasfinishedLike(String value) {
            addCriterion("hasfinished like", value, "hasfinished");
            return (Criteria) this;
        }

        public Criteria andHasfinishedNotLike(String value) {
            addCriterion("hasfinished not like", value, "hasfinished");
            return (Criteria) this;
        }

        public Criteria andHasfinishedIn(List<String> values) {
            addCriterion("hasfinished in", values, "hasfinished");
            return (Criteria) this;
        }

        public Criteria andHasfinishedNotIn(List<String> values) {
            addCriterion("hasfinished not in", values, "hasfinished");
            return (Criteria) this;
        }

        public Criteria andHasfinishedBetween(String value1, String value2) {
            addCriterion("hasfinished between", value1, value2, "hasfinished");
            return (Criteria) this;
        }

        public Criteria andHasfinishedNotBetween(String value1, String value2) {
            addCriterion("hasfinished not between", value1, value2, "hasfinished");
            return (Criteria) this;
        }

        public Criteria andPlancontentIsNull() {
            addCriterion("plancontent is null");
            return (Criteria) this;
        }

        public Criteria andPlancontentIsNotNull() {
            addCriterion("plancontent is not null");
            return (Criteria) this;
        }

        public Criteria andPlancontentEqualTo(String value) {
            addCriterion("plancontent =", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentNotEqualTo(String value) {
            addCriterion("plancontent <>", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentGreaterThan(String value) {
            addCriterion("plancontent >", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentGreaterThanOrEqualTo(String value) {
            addCriterion("plancontent >=", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentLessThan(String value) {
            addCriterion("plancontent <", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentLessThanOrEqualTo(String value) {
            addCriterion("plancontent <=", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentLike(String value) {
            addCriterion("plancontent like", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentNotLike(String value) {
            addCriterion("plancontent not like", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentIn(List<String> values) {
            addCriterion("plancontent in", values, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentNotIn(List<String> values) {
            addCriterion("plancontent not in", values, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentBetween(String value1, String value2) {
            addCriterion("plancontent between", value1, value2, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentNotBetween(String value1, String value2) {
            addCriterion("plancontent not between", value1, value2, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNull() {
            addCriterion("plandate is null");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNotNull() {
            addCriterion("plandate is not null");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(Date value) {
            addCriterion("plandate =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(Date value) {
            addCriterion("plandate <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(Date value) {
            addCriterion("plandate >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(Date value) {
            addCriterion("plandate >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(Date value) {
            addCriterion("plandate <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(Date value) {
            addCriterion("plandate <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<Date> values) {
            addCriterion("plandate in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<Date> values) {
            addCriterion("plandate not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(Date value1, Date value2) {
            addCriterion("plandate between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(Date value1, Date value2) {
            addCriterion("plandate not between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlantitleIsNull() {
            addCriterion("plantitle is null");
            return (Criteria) this;
        }

        public Criteria andPlantitleIsNotNull() {
            addCriterion("plantitle is not null");
            return (Criteria) this;
        }

        public Criteria andPlantitleEqualTo(String value) {
            addCriterion("plantitle =", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleNotEqualTo(String value) {
            addCriterion("plantitle <>", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleGreaterThan(String value) {
            addCriterion("plantitle >", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleGreaterThanOrEqualTo(String value) {
            addCriterion("plantitle >=", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleLessThan(String value) {
            addCriterion("plantitle <", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleLessThanOrEqualTo(String value) {
            addCriterion("plantitle <=", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleLike(String value) {
            addCriterion("plantitle like", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleNotLike(String value) {
            addCriterion("plantitle not like", value, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleIn(List<String> values) {
            addCriterion("plantitle in", values, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleNotIn(List<String> values) {
            addCriterion("plantitle not in", values, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleBetween(String value1, String value2) {
            addCriterion("plantitle between", value1, value2, "plantitle");
            return (Criteria) this;
        }

        public Criteria andPlantitleNotBetween(String value1, String value2) {
            addCriterion("plantitle not between", value1, value2, "plantitle");
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