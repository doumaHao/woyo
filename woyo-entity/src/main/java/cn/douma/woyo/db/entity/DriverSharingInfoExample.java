package cn.douma.woyo.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DriverSharingInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriverSharingInfoExample() {
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Long value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Long value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Long value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Long value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Long value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Long> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Long> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Long value1, Long value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Long value1, Long value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("contract_type is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(String value) {
            addCriterion("contract_type =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(String value) {
            addCriterion("contract_type <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(String value) {
            addCriterion("contract_type >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(String value) {
            addCriterion("contract_type >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(String value) {
            addCriterion("contract_type <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(String value) {
            addCriterion("contract_type <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLike(String value) {
            addCriterion("contract_type like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotLike(String value) {
            addCriterion("contract_type not like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<String> values) {
            addCriterion("contract_type in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<String> values) {
            addCriterion("contract_type not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(String value1, String value2) {
            addCriterion("contract_type between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(String value1, String value2) {
            addCriterion("contract_type not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andSetoffTimeIsNull() {
            addCriterion("setoff_time is null");
            return (Criteria) this;
        }

        public Criteria andSetoffTimeIsNotNull() {
            addCriterion("setoff_time is not null");
            return (Criteria) this;
        }

        public Criteria andSetoffTimeEqualTo(Date value) {
            addCriterion("setoff_time =", value, "setoffTime");
            return (Criteria) this;
        }

        public Criteria andSetoffTimeNotEqualTo(Date value) {
            addCriterion("setoff_time <>", value, "setoffTime");
            return (Criteria) this;
        }

        public Criteria andSetoffTimeGreaterThan(Date value) {
            addCriterion("setoff_time >", value, "setoffTime");
            return (Criteria) this;
        }

        public Criteria andSetoffTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("setoff_time >=", value, "setoffTime");
            return (Criteria) this;
        }

        public Criteria andSetoffTimeLessThan(Date value) {
            addCriterion("setoff_time <", value, "setoffTime");
            return (Criteria) this;
        }

        public Criteria andSetoffTimeLessThanOrEqualTo(Date value) {
            addCriterion("setoff_time <=", value, "setoffTime");
            return (Criteria) this;
        }

        public Criteria andSetoffTimeIn(List<Date> values) {
            addCriterion("setoff_time in", values, "setoffTime");
            return (Criteria) this;
        }

        public Criteria andSetoffTimeNotIn(List<Date> values) {
            addCriterion("setoff_time not in", values, "setoffTime");
            return (Criteria) this;
        }

        public Criteria andSetoffTimeBetween(Date value1, Date value2) {
            addCriterion("setoff_time between", value1, value2, "setoffTime");
            return (Criteria) this;
        }

        public Criteria andSetoffTimeNotBetween(Date value1, Date value2) {
            addCriterion("setoff_time not between", value1, value2, "setoffTime");
            return (Criteria) this;
        }

        public Criteria andSetoffDateIsNull() {
            addCriterion("setoff_date is null");
            return (Criteria) this;
        }

        public Criteria andSetoffDateIsNotNull() {
            addCriterion("setoff_date is not null");
            return (Criteria) this;
        }

        public Criteria andSetoffDateEqualTo(String value) {
            addCriterion("setoff_date =", value, "setoffDate");
            return (Criteria) this;
        }

        public Criteria andSetoffDateNotEqualTo(String value) {
            addCriterion("setoff_date <>", value, "setoffDate");
            return (Criteria) this;
        }

        public Criteria andSetoffDateGreaterThan(String value) {
            addCriterion("setoff_date >", value, "setoffDate");
            return (Criteria) this;
        }

        public Criteria andSetoffDateGreaterThanOrEqualTo(String value) {
            addCriterion("setoff_date >=", value, "setoffDate");
            return (Criteria) this;
        }

        public Criteria andSetoffDateLessThan(String value) {
            addCriterion("setoff_date <", value, "setoffDate");
            return (Criteria) this;
        }

        public Criteria andSetoffDateLessThanOrEqualTo(String value) {
            addCriterion("setoff_date <=", value, "setoffDate");
            return (Criteria) this;
        }

        public Criteria andSetoffDateLike(String value) {
            addCriterion("setoff_date like", value, "setoffDate");
            return (Criteria) this;
        }

        public Criteria andSetoffDateNotLike(String value) {
            addCriterion("setoff_date not like", value, "setoffDate");
            return (Criteria) this;
        }

        public Criteria andSetoffDateIn(List<String> values) {
            addCriterion("setoff_date in", values, "setoffDate");
            return (Criteria) this;
        }

        public Criteria andSetoffDateNotIn(List<String> values) {
            addCriterion("setoff_date not in", values, "setoffDate");
            return (Criteria) this;
        }

        public Criteria andSetoffDateBetween(String value1, String value2) {
            addCriterion("setoff_date between", value1, value2, "setoffDate");
            return (Criteria) this;
        }

        public Criteria andSetoffDateNotBetween(String value1, String value2) {
            addCriterion("setoff_date not between", value1, value2, "setoffDate");
            return (Criteria) this;
        }

        public Criteria andDepartureIdIsNull() {
            addCriterion("departure_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartureIdIsNotNull() {
            addCriterion("departure_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureIdEqualTo(Long value) {
            addCriterion("departure_id =", value, "departureId");
            return (Criteria) this;
        }

        public Criteria andDepartureIdNotEqualTo(Long value) {
            addCriterion("departure_id <>", value, "departureId");
            return (Criteria) this;
        }

        public Criteria andDepartureIdGreaterThan(Long value) {
            addCriterion("departure_id >", value, "departureId");
            return (Criteria) this;
        }

        public Criteria andDepartureIdGreaterThanOrEqualTo(Long value) {
            addCriterion("departure_id >=", value, "departureId");
            return (Criteria) this;
        }

        public Criteria andDepartureIdLessThan(Long value) {
            addCriterion("departure_id <", value, "departureId");
            return (Criteria) this;
        }

        public Criteria andDepartureIdLessThanOrEqualTo(Long value) {
            addCriterion("departure_id <=", value, "departureId");
            return (Criteria) this;
        }

        public Criteria andDepartureIdIn(List<Long> values) {
            addCriterion("departure_id in", values, "departureId");
            return (Criteria) this;
        }

        public Criteria andDepartureIdNotIn(List<Long> values) {
            addCriterion("departure_id not in", values, "departureId");
            return (Criteria) this;
        }

        public Criteria andDepartureIdBetween(Long value1, Long value2) {
            addCriterion("departure_id between", value1, value2, "departureId");
            return (Criteria) this;
        }

        public Criteria andDepartureIdNotBetween(Long value1, Long value2) {
            addCriterion("departure_id not between", value1, value2, "departureId");
            return (Criteria) this;
        }

        public Criteria andDestinationIdIsNull() {
            addCriterion("destination_id is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIdIsNotNull() {
            addCriterion("destination_id is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationIdEqualTo(Long value) {
            addCriterion("destination_id =", value, "destinationId");
            return (Criteria) this;
        }

        public Criteria andDestinationIdNotEqualTo(Long value) {
            addCriterion("destination_id <>", value, "destinationId");
            return (Criteria) this;
        }

        public Criteria andDestinationIdGreaterThan(Long value) {
            addCriterion("destination_id >", value, "destinationId");
            return (Criteria) this;
        }

        public Criteria andDestinationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("destination_id >=", value, "destinationId");
            return (Criteria) this;
        }

        public Criteria andDestinationIdLessThan(Long value) {
            addCriterion("destination_id <", value, "destinationId");
            return (Criteria) this;
        }

        public Criteria andDestinationIdLessThanOrEqualTo(Long value) {
            addCriterion("destination_id <=", value, "destinationId");
            return (Criteria) this;
        }

        public Criteria andDestinationIdIn(List<Long> values) {
            addCriterion("destination_id in", values, "destinationId");
            return (Criteria) this;
        }

        public Criteria andDestinationIdNotIn(List<Long> values) {
            addCriterion("destination_id not in", values, "destinationId");
            return (Criteria) this;
        }

        public Criteria andDestinationIdBetween(Long value1, Long value2) {
            addCriterion("destination_id between", value1, value2, "destinationId");
            return (Criteria) this;
        }

        public Criteria andDestinationIdNotBetween(Long value1, Long value2) {
            addCriterion("destination_id not between", value1, value2, "destinationId");
            return (Criteria) this;
        }

        public Criteria andTotelSeatIsNull() {
            addCriterion("totel_seat is null");
            return (Criteria) this;
        }

        public Criteria andTotelSeatIsNotNull() {
            addCriterion("totel_seat is not null");
            return (Criteria) this;
        }

        public Criteria andTotelSeatEqualTo(Integer value) {
            addCriterion("totel_seat =", value, "totelSeat");
            return (Criteria) this;
        }

        public Criteria andTotelSeatNotEqualTo(Integer value) {
            addCriterion("totel_seat <>", value, "totelSeat");
            return (Criteria) this;
        }

        public Criteria andTotelSeatGreaterThan(Integer value) {
            addCriterion("totel_seat >", value, "totelSeat");
            return (Criteria) this;
        }

        public Criteria andTotelSeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("totel_seat >=", value, "totelSeat");
            return (Criteria) this;
        }

        public Criteria andTotelSeatLessThan(Integer value) {
            addCriterion("totel_seat <", value, "totelSeat");
            return (Criteria) this;
        }

        public Criteria andTotelSeatLessThanOrEqualTo(Integer value) {
            addCriterion("totel_seat <=", value, "totelSeat");
            return (Criteria) this;
        }

        public Criteria andTotelSeatIn(List<Integer> values) {
            addCriterion("totel_seat in", values, "totelSeat");
            return (Criteria) this;
        }

        public Criteria andTotelSeatNotIn(List<Integer> values) {
            addCriterion("totel_seat not in", values, "totelSeat");
            return (Criteria) this;
        }

        public Criteria andTotelSeatBetween(Integer value1, Integer value2) {
            addCriterion("totel_seat between", value1, value2, "totelSeat");
            return (Criteria) this;
        }

        public Criteria andTotelSeatNotBetween(Integer value1, Integer value2) {
            addCriterion("totel_seat not between", value1, value2, "totelSeat");
            return (Criteria) this;
        }

        public Criteria andRemainderSeatIsNull() {
            addCriterion("remainder_seat is null");
            return (Criteria) this;
        }

        public Criteria andRemainderSeatIsNotNull() {
            addCriterion("remainder_seat is not null");
            return (Criteria) this;
        }

        public Criteria andRemainderSeatEqualTo(Integer value) {
            addCriterion("remainder_seat =", value, "remainderSeat");
            return (Criteria) this;
        }

        public Criteria andRemainderSeatNotEqualTo(Integer value) {
            addCriterion("remainder_seat <>", value, "remainderSeat");
            return (Criteria) this;
        }

        public Criteria andRemainderSeatGreaterThan(Integer value) {
            addCriterion("remainder_seat >", value, "remainderSeat");
            return (Criteria) this;
        }

        public Criteria andRemainderSeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("remainder_seat >=", value, "remainderSeat");
            return (Criteria) this;
        }

        public Criteria andRemainderSeatLessThan(Integer value) {
            addCriterion("remainder_seat <", value, "remainderSeat");
            return (Criteria) this;
        }

        public Criteria andRemainderSeatLessThanOrEqualTo(Integer value) {
            addCriterion("remainder_seat <=", value, "remainderSeat");
            return (Criteria) this;
        }

        public Criteria andRemainderSeatIn(List<Integer> values) {
            addCriterion("remainder_seat in", values, "remainderSeat");
            return (Criteria) this;
        }

        public Criteria andRemainderSeatNotIn(List<Integer> values) {
            addCriterion("remainder_seat not in", values, "remainderSeat");
            return (Criteria) this;
        }

        public Criteria andRemainderSeatBetween(Integer value1, Integer value2) {
            addCriterion("remainder_seat between", value1, value2, "remainderSeat");
            return (Criteria) this;
        }

        public Criteria andRemainderSeatNotBetween(Integer value1, Integer value2) {
            addCriterion("remainder_seat not between", value1, value2, "remainderSeat");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Long value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Long value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Long value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Long value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Long value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Long> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Long> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Long value1, Long value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Long value1, Long value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Long value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Long value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Long value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Long value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Long value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Long> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Long> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Long value1, Long value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Long value1, Long value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andNoContractIsNull() {
            addCriterion("no_contract is null");
            return (Criteria) this;
        }

        public Criteria andNoContractIsNotNull() {
            addCriterion("no_contract is not null");
            return (Criteria) this;
        }

        public Criteria andNoContractEqualTo(String value) {
            addCriterion("no_contract =", value, "noContract");
            return (Criteria) this;
        }

        public Criteria andNoContractNotEqualTo(String value) {
            addCriterion("no_contract <>", value, "noContract");
            return (Criteria) this;
        }

        public Criteria andNoContractGreaterThan(String value) {
            addCriterion("no_contract >", value, "noContract");
            return (Criteria) this;
        }

        public Criteria andNoContractGreaterThanOrEqualTo(String value) {
            addCriterion("no_contract >=", value, "noContract");
            return (Criteria) this;
        }

        public Criteria andNoContractLessThan(String value) {
            addCriterion("no_contract <", value, "noContract");
            return (Criteria) this;
        }

        public Criteria andNoContractLessThanOrEqualTo(String value) {
            addCriterion("no_contract <=", value, "noContract");
            return (Criteria) this;
        }

        public Criteria andNoContractLike(String value) {
            addCriterion("no_contract like", value, "noContract");
            return (Criteria) this;
        }

        public Criteria andNoContractNotLike(String value) {
            addCriterion("no_contract not like", value, "noContract");
            return (Criteria) this;
        }

        public Criteria andNoContractIn(List<String> values) {
            addCriterion("no_contract in", values, "noContract");
            return (Criteria) this;
        }

        public Criteria andNoContractNotIn(List<String> values) {
            addCriterion("no_contract not in", values, "noContract");
            return (Criteria) this;
        }

        public Criteria andNoContractBetween(String value1, String value2) {
            addCriterion("no_contract between", value1, value2, "noContract");
            return (Criteria) this;
        }

        public Criteria andNoContractNotBetween(String value1, String value2) {
            addCriterion("no_contract not between", value1, value2, "noContract");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgIsNull() {
            addCriterion("complete_flg is null");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgIsNotNull() {
            addCriterion("complete_flg is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgEqualTo(String value) {
            addCriterion("complete_flg =", value, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgNotEqualTo(String value) {
            addCriterion("complete_flg <>", value, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgGreaterThan(String value) {
            addCriterion("complete_flg >", value, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgGreaterThanOrEqualTo(String value) {
            addCriterion("complete_flg >=", value, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgLessThan(String value) {
            addCriterion("complete_flg <", value, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgLessThanOrEqualTo(String value) {
            addCriterion("complete_flg <=", value, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgLike(String value) {
            addCriterion("complete_flg like", value, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgNotLike(String value) {
            addCriterion("complete_flg not like", value, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgIn(List<String> values) {
            addCriterion("complete_flg in", values, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgNotIn(List<String> values) {
            addCriterion("complete_flg not in", values, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgBetween(String value1, String value2) {
            addCriterion("complete_flg between", value1, value2, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andCompleteFlgNotBetween(String value1, String value2) {
            addCriterion("complete_flg not between", value1, value2, "completeFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNull() {
            addCriterion("delete_flg is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNotNull() {
            addCriterion("delete_flg is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgEqualTo(String value) {
            addCriterion("delete_flg =", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotEqualTo(String value) {
            addCriterion("delete_flg <>", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThan(String value) {
            addCriterion("delete_flg >", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThanOrEqualTo(String value) {
            addCriterion("delete_flg >=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThan(String value) {
            addCriterion("delete_flg <", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThanOrEqualTo(String value) {
            addCriterion("delete_flg <=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLike(String value) {
            addCriterion("delete_flg like", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotLike(String value) {
            addCriterion("delete_flg not like", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIn(List<String> values) {
            addCriterion("delete_flg in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotIn(List<String> values) {
            addCriterion("delete_flg not in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgBetween(String value1, String value2) {
            addCriterion("delete_flg between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotBetween(String value1, String value2) {
            addCriterion("delete_flg not between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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