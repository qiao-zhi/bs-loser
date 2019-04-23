package cn.qs.bean.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andBodylocationIsNull() {
            addCriterion("bodylocation is null");
            return (Criteria) this;
        }

        public Criteria andBodylocationIsNotNull() {
            addCriterion("bodylocation is not null");
            return (Criteria) this;
        }

        public Criteria andBodylocationEqualTo(String value) {
            addCriterion("bodylocation =", value, "bodylocation");
            return (Criteria) this;
        }

        public Criteria andBodylocationNotEqualTo(String value) {
            addCriterion("bodylocation <>", value, "bodylocation");
            return (Criteria) this;
        }

        public Criteria andBodylocationGreaterThan(String value) {
            addCriterion("bodylocation >", value, "bodylocation");
            return (Criteria) this;
        }

        public Criteria andBodylocationGreaterThanOrEqualTo(String value) {
            addCriterion("bodylocation >=", value, "bodylocation");
            return (Criteria) this;
        }

        public Criteria andBodylocationLessThan(String value) {
            addCriterion("bodylocation <", value, "bodylocation");
            return (Criteria) this;
        }

        public Criteria andBodylocationLessThanOrEqualTo(String value) {
            addCriterion("bodylocation <=", value, "bodylocation");
            return (Criteria) this;
        }

        public Criteria andBodylocationLike(String value) {
            addCriterion("bodylocation like", value, "bodylocation");
            return (Criteria) this;
        }

        public Criteria andBodylocationNotLike(String value) {
            addCriterion("bodylocation not like", value, "bodylocation");
            return (Criteria) this;
        }

        public Criteria andBodylocationIn(List<String> values) {
            addCriterion("bodylocation in", values, "bodylocation");
            return (Criteria) this;
        }

        public Criteria andBodylocationNotIn(List<String> values) {
            addCriterion("bodylocation not in", values, "bodylocation");
            return (Criteria) this;
        }

        public Criteria andBodylocationBetween(String value1, String value2) {
            addCriterion("bodylocation between", value1, value2, "bodylocation");
            return (Criteria) this;
        }

        public Criteria andBodylocationNotBetween(String value1, String value2) {
            addCriterion("bodylocation not between", value1, value2, "bodylocation");
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

        public Criteria andFilesizeIsNull() {
            addCriterion("filesize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("filesize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(Float value) {
            addCriterion("filesize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(Float value) {
            addCriterion("filesize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(Float value) {
            addCriterion("filesize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(Float value) {
            addCriterion("filesize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(Float value) {
            addCriterion("filesize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(Float value) {
            addCriterion("filesize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<Float> values) {
            addCriterion("filesize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<Float> values) {
            addCriterion("filesize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(Float value1, Float value2) {
            addCriterion("filesize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(Float value1, Float value2) {
            addCriterion("filesize not between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andHealthRadixIsNull() {
            addCriterion("health_radix is null");
            return (Criteria) this;
        }

        public Criteria andHealthRadixIsNotNull() {
            addCriterion("health_radix is not null");
            return (Criteria) this;
        }

        public Criteria andHealthRadixEqualTo(String value) {
            addCriterion("health_radix =", value, "healthRadix");
            return (Criteria) this;
        }

        public Criteria andHealthRadixNotEqualTo(String value) {
            addCriterion("health_radix <>", value, "healthRadix");
            return (Criteria) this;
        }

        public Criteria andHealthRadixGreaterThan(String value) {
            addCriterion("health_radix >", value, "healthRadix");
            return (Criteria) this;
        }

        public Criteria andHealthRadixGreaterThanOrEqualTo(String value) {
            addCriterion("health_radix >=", value, "healthRadix");
            return (Criteria) this;
        }

        public Criteria andHealthRadixLessThan(String value) {
            addCriterion("health_radix <", value, "healthRadix");
            return (Criteria) this;
        }

        public Criteria andHealthRadixLessThanOrEqualTo(String value) {
            addCriterion("health_radix <=", value, "healthRadix");
            return (Criteria) this;
        }

        public Criteria andHealthRadixLike(String value) {
            addCriterion("health_radix like", value, "healthRadix");
            return (Criteria) this;
        }

        public Criteria andHealthRadixNotLike(String value) {
            addCriterion("health_radix not like", value, "healthRadix");
            return (Criteria) this;
        }

        public Criteria andHealthRadixIn(List<String> values) {
            addCriterion("health_radix in", values, "healthRadix");
            return (Criteria) this;
        }

        public Criteria andHealthRadixNotIn(List<String> values) {
            addCriterion("health_radix not in", values, "healthRadix");
            return (Criteria) this;
        }

        public Criteria andHealthRadixBetween(String value1, String value2) {
            addCriterion("health_radix between", value1, value2, "healthRadix");
            return (Criteria) this;
        }

        public Criteria andHealthRadixNotBetween(String value1, String value2) {
            addCriterion("health_radix not between", value1, value2, "healthRadix");
            return (Criteria) this;
        }

        public Criteria andOrinameIsNull() {
            addCriterion("oriname is null");
            return (Criteria) this;
        }

        public Criteria andOrinameIsNotNull() {
            addCriterion("oriname is not null");
            return (Criteria) this;
        }

        public Criteria andOrinameEqualTo(String value) {
            addCriterion("oriname =", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameNotEqualTo(String value) {
            addCriterion("oriname <>", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameGreaterThan(String value) {
            addCriterion("oriname >", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameGreaterThanOrEqualTo(String value) {
            addCriterion("oriname >=", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameLessThan(String value) {
            addCriterion("oriname <", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameLessThanOrEqualTo(String value) {
            addCriterion("oriname <=", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameLike(String value) {
            addCriterion("oriname like", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameNotLike(String value) {
            addCriterion("oriname not like", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameIn(List<String> values) {
            addCriterion("oriname in", values, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameNotIn(List<String> values) {
            addCriterion("oriname not in", values, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameBetween(String value1, String value2) {
            addCriterion("oriname between", value1, value2, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameNotBetween(String value1, String value2) {
            addCriterion("oriname not between", value1, value2, "oriname");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
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