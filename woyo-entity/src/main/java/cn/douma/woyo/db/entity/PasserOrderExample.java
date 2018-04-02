package cn.douma.woyo.db.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PasserOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PasserOrderExample() {
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

        public Criteria andPasserShareIdIsNull() {
            addCriterion("passer_share_id is null");
            return (Criteria) this;
        }

        public Criteria andPasserShareIdIsNotNull() {
            addCriterion("passer_share_id is not null");
            return (Criteria) this;
        }

        public Criteria andPasserShareIdEqualTo(Long value) {
            addCriterion("passer_share_id =", value, "passerShareId");
            return (Criteria) this;
        }

        public Criteria andPasserShareIdNotEqualTo(Long value) {
            addCriterion("passer_share_id <>", value, "passerShareId");
            return (Criteria) this;
        }

        public Criteria andPasserShareIdGreaterThan(Long value) {
            addCriterion("passer_share_id >", value, "passerShareId");
            return (Criteria) this;
        }

        public Criteria andPasserShareIdGreaterThanOrEqualTo(Long value) {
            addCriterion("passer_share_id >=", value, "passerShareId");
            return (Criteria) this;
        }

        public Criteria andPasserShareIdLessThan(Long value) {
            addCriterion("passer_share_id <", value, "passerShareId");
            return (Criteria) this;
        }

        public Criteria andPasserShareIdLessThanOrEqualTo(Long value) {
            addCriterion("passer_share_id <=", value, "passerShareId");
            return (Criteria) this;
        }

        public Criteria andPasserShareIdIn(List<Long> values) {
            addCriterion("passer_share_id in", values, "passerShareId");
            return (Criteria) this;
        }

        public Criteria andPasserShareIdNotIn(List<Long> values) {
            addCriterion("passer_share_id not in", values, "passerShareId");
            return (Criteria) this;
        }

        public Criteria andPasserShareIdBetween(Long value1, Long value2) {
            addCriterion("passer_share_id between", value1, value2, "passerShareId");
            return (Criteria) this;
        }

        public Criteria andPasserShareIdNotBetween(Long value1, Long value2) {
            addCriterion("passer_share_id not between", value1, value2, "passerShareId");
            return (Criteria) this;
        }

        public Criteria andDriverShareIdIsNull() {
            addCriterion("driver_share_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverShareIdIsNotNull() {
            addCriterion("driver_share_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverShareIdEqualTo(Long value) {
            addCriterion("driver_share_id =", value, "driverShareId");
            return (Criteria) this;
        }

        public Criteria andDriverShareIdNotEqualTo(Long value) {
            addCriterion("driver_share_id <>", value, "driverShareId");
            return (Criteria) this;
        }

        public Criteria andDriverShareIdGreaterThan(Long value) {
            addCriterion("driver_share_id >", value, "driverShareId");
            return (Criteria) this;
        }

        public Criteria andDriverShareIdGreaterThanOrEqualTo(Long value) {
            addCriterion("driver_share_id >=", value, "driverShareId");
            return (Criteria) this;
        }

        public Criteria andDriverShareIdLessThan(Long value) {
            addCriterion("driver_share_id <", value, "driverShareId");
            return (Criteria) this;
        }

        public Criteria andDriverShareIdLessThanOrEqualTo(Long value) {
            addCriterion("driver_share_id <=", value, "driverShareId");
            return (Criteria) this;
        }

        public Criteria andDriverShareIdIn(List<Long> values) {
            addCriterion("driver_share_id in", values, "driverShareId");
            return (Criteria) this;
        }

        public Criteria andDriverShareIdNotIn(List<Long> values) {
            addCriterion("driver_share_id not in", values, "driverShareId");
            return (Criteria) this;
        }

        public Criteria andDriverShareIdBetween(Long value1, Long value2) {
            addCriterion("driver_share_id between", value1, value2, "driverShareId");
            return (Criteria) this;
        }

        public Criteria andDriverShareIdNotBetween(Long value1, Long value2) {
            addCriterion("driver_share_id not between", value1, value2, "driverShareId");
            return (Criteria) this;
        }

        public Criteria andConsumeSeatIsNull() {
            addCriterion("consume_seat is null");
            return (Criteria) this;
        }

        public Criteria andConsumeSeatIsNotNull() {
            addCriterion("consume_seat is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeSeatEqualTo(Integer value) {
            addCriterion("consume_seat =", value, "consumeSeat");
            return (Criteria) this;
        }

        public Criteria andConsumeSeatNotEqualTo(Integer value) {
            addCriterion("consume_seat <>", value, "consumeSeat");
            return (Criteria) this;
        }

        public Criteria andConsumeSeatGreaterThan(Integer value) {
            addCriterion("consume_seat >", value, "consumeSeat");
            return (Criteria) this;
        }

        public Criteria andConsumeSeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("consume_seat >=", value, "consumeSeat");
            return (Criteria) this;
        }

        public Criteria andConsumeSeatLessThan(Integer value) {
            addCriterion("consume_seat <", value, "consumeSeat");
            return (Criteria) this;
        }

        public Criteria andConsumeSeatLessThanOrEqualTo(Integer value) {
            addCriterion("consume_seat <=", value, "consumeSeat");
            return (Criteria) this;
        }

        public Criteria andConsumeSeatIn(List<Integer> values) {
            addCriterion("consume_seat in", values, "consumeSeat");
            return (Criteria) this;
        }

        public Criteria andConsumeSeatNotIn(List<Integer> values) {
            addCriterion("consume_seat not in", values, "consumeSeat");
            return (Criteria) this;
        }

        public Criteria andConsumeSeatBetween(Integer value1, Integer value2) {
            addCriterion("consume_seat between", value1, value2, "consumeSeat");
            return (Criteria) this;
        }

        public Criteria andConsumeSeatNotBetween(Integer value1, Integer value2) {
            addCriterion("consume_seat not between", value1, value2, "consumeSeat");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(BigDecimal value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(BigDecimal value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<BigDecimal> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
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