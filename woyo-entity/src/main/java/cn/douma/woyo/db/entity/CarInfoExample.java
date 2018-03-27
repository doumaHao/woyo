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

        public Criteria andCarVinIsNull() {
            addCriterion("car_vin is null");
            return (Criteria) this;
        }

        public Criteria andCarVinIsNotNull() {
            addCriterion("car_vin is not null");
            return (Criteria) this;
        }

        public Criteria andCarVinEqualTo(String value) {
            addCriterion("car_vin =", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinNotEqualTo(String value) {
            addCriterion("car_vin <>", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinGreaterThan(String value) {
            addCriterion("car_vin >", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinGreaterThanOrEqualTo(String value) {
            addCriterion("car_vin >=", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinLessThan(String value) {
            addCriterion("car_vin <", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinLessThanOrEqualTo(String value) {
            addCriterion("car_vin <=", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinLike(String value) {
            addCriterion("car_vin like", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinNotLike(String value) {
            addCriterion("car_vin not like", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinIn(List<String> values) {
            addCriterion("car_vin in", values, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinNotIn(List<String> values) {
            addCriterion("car_vin not in", values, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinBetween(String value1, String value2) {
            addCriterion("car_vin between", value1, value2, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinNotBetween(String value1, String value2) {
            addCriterion("car_vin not between", value1, value2, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarAgeIsNull() {
            addCriterion("car_age is null");
            return (Criteria) this;
        }

        public Criteria andCarAgeIsNotNull() {
            addCriterion("car_age is not null");
            return (Criteria) this;
        }

        public Criteria andCarAgeEqualTo(Integer value) {
            addCriterion("car_age =", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeNotEqualTo(Integer value) {
            addCriterion("car_age <>", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeGreaterThan(Integer value) {
            addCriterion("car_age >", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_age >=", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeLessThan(Integer value) {
            addCriterion("car_age <", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeLessThanOrEqualTo(Integer value) {
            addCriterion("car_age <=", value, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeIn(List<Integer> values) {
            addCriterion("car_age in", values, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeNotIn(List<Integer> values) {
            addCriterion("car_age not in", values, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeBetween(Integer value1, Integer value2) {
            addCriterion("car_age between", value1, value2, "carAge");
            return (Criteria) this;
        }

        public Criteria andCarAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("car_age not between", value1, value2, "carAge");
            return (Criteria) this;
        }

        public Criteria andPersonNumIsNull() {
            addCriterion("person_num is null");
            return (Criteria) this;
        }

        public Criteria andPersonNumIsNotNull() {
            addCriterion("person_num is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNumEqualTo(Integer value) {
            addCriterion("person_num =", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumNotEqualTo(Integer value) {
            addCriterion("person_num <>", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumGreaterThan(Integer value) {
            addCriterion("person_num >", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_num >=", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumLessThan(Integer value) {
            addCriterion("person_num <", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumLessThanOrEqualTo(Integer value) {
            addCriterion("person_num <=", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumIn(List<Integer> values) {
            addCriterion("person_num in", values, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumNotIn(List<Integer> values) {
            addCriterion("person_num not in", values, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumBetween(Integer value1, Integer value2) {
            addCriterion("person_num between", value1, value2, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumNotBetween(Integer value1, Integer value2) {
            addCriterion("person_num not between", value1, value2, "personNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumIsNull() {
            addCriterion("cargo_num is null");
            return (Criteria) this;
        }

        public Criteria andCargoNumIsNotNull() {
            addCriterion("cargo_num is not null");
            return (Criteria) this;
        }

        public Criteria andCargoNumEqualTo(Integer value) {
            addCriterion("cargo_num =", value, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumNotEqualTo(Integer value) {
            addCriterion("cargo_num <>", value, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumGreaterThan(Integer value) {
            addCriterion("cargo_num >", value, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cargo_num >=", value, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumLessThan(Integer value) {
            addCriterion("cargo_num <", value, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumLessThanOrEqualTo(Integer value) {
            addCriterion("cargo_num <=", value, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumIn(List<Integer> values) {
            addCriterion("cargo_num in", values, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumNotIn(List<Integer> values) {
            addCriterion("cargo_num not in", values, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumBetween(Integer value1, Integer value2) {
            addCriterion("cargo_num between", value1, value2, "cargoNum");
            return (Criteria) this;
        }

        public Criteria andCargoNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cargo_num not between", value1, value2, "cargoNum");
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