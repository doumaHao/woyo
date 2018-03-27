package cn.douma.woyo.db.entity;

import java.util.ArrayList;
import java.util.List;

public class CarInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarInfoExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCarNoIsNull() {
            addCriterion("car_no is null");
            return (Criteria) this;
        }

        public Criteria andCarNoIsNotNull() {
            addCriterion("car_no is not null");
            return (Criteria) this;
        }

        public Criteria andCarNoEqualTo(String value) {
            addCriterion("car_no =", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotEqualTo(String value) {
            addCriterion("car_no <>", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThan(String value) {
            addCriterion("car_no >", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThanOrEqualTo(String value) {
            addCriterion("car_no >=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThan(String value) {
            addCriterion("car_no <", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThanOrEqualTo(String value) {
            addCriterion("car_no <=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLike(String value) {
            addCriterion("car_no like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotLike(String value) {
            addCriterion("car_no not like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoIn(List<String> values) {
            addCriterion("car_no in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotIn(List<String> values) {
            addCriterion("car_no not in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoBetween(String value1, String value2) {
            addCriterion("car_no between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotBetween(String value1, String value2) {
            addCriterion("car_no not between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoImgIsNull() {
            addCriterion("car_no_img is null");
            return (Criteria) this;
        }

        public Criteria andCarNoImgIsNotNull() {
            addCriterion("car_no_img is not null");
            return (Criteria) this;
        }

        public Criteria andCarNoImgEqualTo(String value) {
            addCriterion("car_no_img =", value, "carNoImg");
            return (Criteria) this;
        }

        public Criteria andCarNoImgNotEqualTo(String value) {
            addCriterion("car_no_img <>", value, "carNoImg");
            return (Criteria) this;
        }

        public Criteria andCarNoImgGreaterThan(String value) {
            addCriterion("car_no_img >", value, "carNoImg");
            return (Criteria) this;
        }

        public Criteria andCarNoImgGreaterThanOrEqualTo(String value) {
            addCriterion("car_no_img >=", value, "carNoImg");
            return (Criteria) this;
        }

        public Criteria andCarNoImgLessThan(String value) {
            addCriterion("car_no_img <", value, "carNoImg");
            return (Criteria) this;
        }

        public Criteria andCarNoImgLessThanOrEqualTo(String value) {
            addCriterion("car_no_img <=", value, "carNoImg");
            return (Criteria) this;
        }

        public Criteria andCarNoImgLike(String value) {
            addCriterion("car_no_img like", value, "carNoImg");
            return (Criteria) this;
        }

        public Criteria andCarNoImgNotLike(String value) {
            addCriterion("car_no_img not like", value, "carNoImg");
            return (Criteria) this;
        }

        public Criteria andCarNoImgIn(List<String> values) {
            addCriterion("car_no_img in", values, "carNoImg");
            return (Criteria) this;
        }

        public Criteria andCarNoImgNotIn(List<String> values) {
            addCriterion("car_no_img not in", values, "carNoImg");
            return (Criteria) this;
        }

        public Criteria andCarNoImgBetween(String value1, String value2) {
            addCriterion("car_no_img between", value1, value2, "carNoImg");
            return (Criteria) this;
        }

        public Criteria andCarNoImgNotBetween(String value1, String value2) {
            addCriterion("car_no_img not between", value1, value2, "carNoImg");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNull() {
            addCriterion("engine_no is null");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNotNull() {
            addCriterion("engine_no is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNoEqualTo(String value) {
            addCriterion("engine_no =", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotEqualTo(String value) {
            addCriterion("engine_no <>", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThan(String value) {
            addCriterion("engine_no >", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThanOrEqualTo(String value) {
            addCriterion("engine_no >=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThan(String value) {
            addCriterion("engine_no <", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThanOrEqualTo(String value) {
            addCriterion("engine_no <=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLike(String value) {
            addCriterion("engine_no like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotLike(String value) {
            addCriterion("engine_no not like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoIn(List<String> values) {
            addCriterion("engine_no in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotIn(List<String> values) {
            addCriterion("engine_no not in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoBetween(String value1, String value2) {
            addCriterion("engine_no between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotBetween(String value1, String value2) {
            addCriterion("engine_no not between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Long value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Long value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Long value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Long value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Long> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Long> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Long value1, Long value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Long value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Long value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Long value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Long value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Long value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Long> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Long> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Long value1, Long value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Long value1, Long value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andCarColorIsNull() {
            addCriterion("car_color is null");
            return (Criteria) this;
        }

        public Criteria andCarColorIsNotNull() {
            addCriterion("car_color is not null");
            return (Criteria) this;
        }

        public Criteria andCarColorEqualTo(String value) {
            addCriterion("car_color =", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotEqualTo(String value) {
            addCriterion("car_color <>", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorGreaterThan(String value) {
            addCriterion("car_color >", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorGreaterThanOrEqualTo(String value) {
            addCriterion("car_color >=", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorLessThan(String value) {
            addCriterion("car_color <", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorLessThanOrEqualTo(String value) {
            addCriterion("car_color <=", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorLike(String value) {
            addCriterion("car_color like", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotLike(String value) {
            addCriterion("car_color not like", value, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorIn(List<String> values) {
            addCriterion("car_color in", values, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotIn(List<String> values) {
            addCriterion("car_color not in", values, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorBetween(String value1, String value2) {
            addCriterion("car_color between", value1, value2, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarColorNotBetween(String value1, String value2) {
            addCriterion("car_color not between", value1, value2, "carColor");
            return (Criteria) this;
        }

        public Criteria andCarImgIsNull() {
            addCriterion("car_img is null");
            return (Criteria) this;
        }

        public Criteria andCarImgIsNotNull() {
            addCriterion("car_img is not null");
            return (Criteria) this;
        }

        public Criteria andCarImgEqualTo(String value) {
            addCriterion("car_img =", value, "carImg");
            return (Criteria) this;
        }

        public Criteria andCarImgNotEqualTo(String value) {
            addCriterion("car_img <>", value, "carImg");
            return (Criteria) this;
        }

        public Criteria andCarImgGreaterThan(String value) {
            addCriterion("car_img >", value, "carImg");
            return (Criteria) this;
        }

        public Criteria andCarImgGreaterThanOrEqualTo(String value) {
            addCriterion("car_img >=", value, "carImg");
            return (Criteria) this;
        }

        public Criteria andCarImgLessThan(String value) {
            addCriterion("car_img <", value, "carImg");
            return (Criteria) this;
        }

        public Criteria andCarImgLessThanOrEqualTo(String value) {
            addCriterion("car_img <=", value, "carImg");
            return (Criteria) this;
        }

        public Criteria andCarImgLike(String value) {
            addCriterion("car_img like", value, "carImg");
            return (Criteria) this;
        }

        public Criteria andCarImgNotLike(String value) {
            addCriterion("car_img not like", value, "carImg");
            return (Criteria) this;
        }

        public Criteria andCarImgIn(List<String> values) {
            addCriterion("car_img in", values, "carImg");
            return (Criteria) this;
        }

        public Criteria andCarImgNotIn(List<String> values) {
            addCriterion("car_img not in", values, "carImg");
            return (Criteria) this;
        }

        public Criteria andCarImgBetween(String value1, String value2) {
            addCriterion("car_img between", value1, value2, "carImg");
            return (Criteria) this;
        }

        public Criteria andCarImgNotBetween(String value1, String value2) {
            addCriterion("car_img not between", value1, value2, "carImg");
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