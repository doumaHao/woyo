package cn.douma.woyo.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RequirementInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RequirementInfoExample() {
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

        public Criteria andReqNoIsNull() {
            addCriterion("req_no is null");
            return (Criteria) this;
        }

        public Criteria andReqNoIsNotNull() {
            addCriterion("req_no is not null");
            return (Criteria) this;
        }

        public Criteria andReqNoEqualTo(String value) {
            addCriterion("req_no =", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoNotEqualTo(String value) {
            addCriterion("req_no <>", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoGreaterThan(String value) {
            addCriterion("req_no >", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoGreaterThanOrEqualTo(String value) {
            addCriterion("req_no >=", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoLessThan(String value) {
            addCriterion("req_no <", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoLessThanOrEqualTo(String value) {
            addCriterion("req_no <=", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoLike(String value) {
            addCriterion("req_no like", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoNotLike(String value) {
            addCriterion("req_no not like", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoIn(List<String> values) {
            addCriterion("req_no in", values, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoNotIn(List<String> values) {
            addCriterion("req_no not in", values, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoBetween(String value1, String value2) {
            addCriterion("req_no between", value1, value2, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoNotBetween(String value1, String value2) {
            addCriterion("req_no not between", value1, value2, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqtTypeIsNull() {
            addCriterion("reqt_type is null");
            return (Criteria) this;
        }

        public Criteria andReqtTypeIsNotNull() {
            addCriterion("reqt_type is not null");
            return (Criteria) this;
        }

        public Criteria andReqtTypeEqualTo(String value) {
            addCriterion("reqt_type =", value, "reqtType");
            return (Criteria) this;
        }

        public Criteria andReqtTypeNotEqualTo(String value) {
            addCriterion("reqt_type <>", value, "reqtType");
            return (Criteria) this;
        }

        public Criteria andReqtTypeGreaterThan(String value) {
            addCriterion("reqt_type >", value, "reqtType");
            return (Criteria) this;
        }

        public Criteria andReqtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("reqt_type >=", value, "reqtType");
            return (Criteria) this;
        }

        public Criteria andReqtTypeLessThan(String value) {
            addCriterion("reqt_type <", value, "reqtType");
            return (Criteria) this;
        }

        public Criteria andReqtTypeLessThanOrEqualTo(String value) {
            addCriterion("reqt_type <=", value, "reqtType");
            return (Criteria) this;
        }

        public Criteria andReqtTypeLike(String value) {
            addCriterion("reqt_type like", value, "reqtType");
            return (Criteria) this;
        }

        public Criteria andReqtTypeNotLike(String value) {
            addCriterion("reqt_type not like", value, "reqtType");
            return (Criteria) this;
        }

        public Criteria andReqtTypeIn(List<String> values) {
            addCriterion("reqt_type in", values, "reqtType");
            return (Criteria) this;
        }

        public Criteria andReqtTypeNotIn(List<String> values) {
            addCriterion("reqt_type not in", values, "reqtType");
            return (Criteria) this;
        }

        public Criteria andReqtTypeBetween(String value1, String value2) {
            addCriterion("reqt_type between", value1, value2, "reqtType");
            return (Criteria) this;
        }

        public Criteria andReqtTypeNotBetween(String value1, String value2) {
            addCriterion("reqt_type not between", value1, value2, "reqtType");
            return (Criteria) this;
        }

        public Criteria andReqStartAddressIsNull() {
            addCriterion("req_start_address is null");
            return (Criteria) this;
        }

        public Criteria andReqStartAddressIsNotNull() {
            addCriterion("req_start_address is not null");
            return (Criteria) this;
        }

        public Criteria andReqStartAddressEqualTo(String value) {
            addCriterion("req_start_address =", value, "reqStartAddress");
            return (Criteria) this;
        }

        public Criteria andReqStartAddressNotEqualTo(String value) {
            addCriterion("req_start_address <>", value, "reqStartAddress");
            return (Criteria) this;
        }

        public Criteria andReqStartAddressGreaterThan(String value) {
            addCriterion("req_start_address >", value, "reqStartAddress");
            return (Criteria) this;
        }

        public Criteria andReqStartAddressGreaterThanOrEqualTo(String value) {
            addCriterion("req_start_address >=", value, "reqStartAddress");
            return (Criteria) this;
        }

        public Criteria andReqStartAddressLessThan(String value) {
            addCriterion("req_start_address <", value, "reqStartAddress");
            return (Criteria) this;
        }

        public Criteria andReqStartAddressLessThanOrEqualTo(String value) {
            addCriterion("req_start_address <=", value, "reqStartAddress");
            return (Criteria) this;
        }

        public Criteria andReqStartAddressLike(String value) {
            addCriterion("req_start_address like", value, "reqStartAddress");
            return (Criteria) this;
        }

        public Criteria andReqStartAddressNotLike(String value) {
            addCriterion("req_start_address not like", value, "reqStartAddress");
            return (Criteria) this;
        }

        public Criteria andReqStartAddressIn(List<String> values) {
            addCriterion("req_start_address in", values, "reqStartAddress");
            return (Criteria) this;
        }

        public Criteria andReqStartAddressNotIn(List<String> values) {
            addCriterion("req_start_address not in", values, "reqStartAddress");
            return (Criteria) this;
        }

        public Criteria andReqStartAddressBetween(String value1, String value2) {
            addCriterion("req_start_address between", value1, value2, "reqStartAddress");
            return (Criteria) this;
        }

        public Criteria andReqStartAddressNotBetween(String value1, String value2) {
            addCriterion("req_start_address not between", value1, value2, "reqStartAddress");
            return (Criteria) this;
        }

        public Criteria andReqEndAddressIsNull() {
            addCriterion("req_end_address is null");
            return (Criteria) this;
        }

        public Criteria andReqEndAddressIsNotNull() {
            addCriterion("req_end_address is not null");
            return (Criteria) this;
        }

        public Criteria andReqEndAddressEqualTo(String value) {
            addCriterion("req_end_address =", value, "reqEndAddress");
            return (Criteria) this;
        }

        public Criteria andReqEndAddressNotEqualTo(String value) {
            addCriterion("req_end_address <>", value, "reqEndAddress");
            return (Criteria) this;
        }

        public Criteria andReqEndAddressGreaterThan(String value) {
            addCriterion("req_end_address >", value, "reqEndAddress");
            return (Criteria) this;
        }

        public Criteria andReqEndAddressGreaterThanOrEqualTo(String value) {
            addCriterion("req_end_address >=", value, "reqEndAddress");
            return (Criteria) this;
        }

        public Criteria andReqEndAddressLessThan(String value) {
            addCriterion("req_end_address <", value, "reqEndAddress");
            return (Criteria) this;
        }

        public Criteria andReqEndAddressLessThanOrEqualTo(String value) {
            addCriterion("req_end_address <=", value, "reqEndAddress");
            return (Criteria) this;
        }

        public Criteria andReqEndAddressLike(String value) {
            addCriterion("req_end_address like", value, "reqEndAddress");
            return (Criteria) this;
        }

        public Criteria andReqEndAddressNotLike(String value) {
            addCriterion("req_end_address not like", value, "reqEndAddress");
            return (Criteria) this;
        }

        public Criteria andReqEndAddressIn(List<String> values) {
            addCriterion("req_end_address in", values, "reqEndAddress");
            return (Criteria) this;
        }

        public Criteria andReqEndAddressNotIn(List<String> values) {
            addCriterion("req_end_address not in", values, "reqEndAddress");
            return (Criteria) this;
        }

        public Criteria andReqEndAddressBetween(String value1, String value2) {
            addCriterion("req_end_address between", value1, value2, "reqEndAddress");
            return (Criteria) this;
        }

        public Criteria andReqEndAddressNotBetween(String value1, String value2) {
            addCriterion("req_end_address not between", value1, value2, "reqEndAddress");
            return (Criteria) this;
        }

        public Criteria andReqTimeIsNull() {
            addCriterion("req_time is null");
            return (Criteria) this;
        }

        public Criteria andReqTimeIsNotNull() {
            addCriterion("req_time is not null");
            return (Criteria) this;
        }

        public Criteria andReqTimeEqualTo(Date value) {
            addCriterion("req_time =", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotEqualTo(Date value) {
            addCriterion("req_time <>", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThan(Date value) {
            addCriterion("req_time >", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("req_time >=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThan(Date value) {
            addCriterion("req_time <", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThanOrEqualTo(Date value) {
            addCriterion("req_time <=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeIn(List<Date> values) {
            addCriterion("req_time in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotIn(List<Date> values) {
            addCriterion("req_time not in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeBetween(Date value1, Date value2) {
            addCriterion("req_time between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotBetween(Date value1, Date value2) {
            addCriterion("req_time not between", value1, value2, "reqTime");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateIdnoIsNull() {
            addCriterion("create_idno is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdnoIsNotNull() {
            addCriterion("create_idno is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdnoEqualTo(String value) {
            addCriterion("create_idno =", value, "createIdno");
            return (Criteria) this;
        }

        public Criteria andCreateIdnoNotEqualTo(String value) {
            addCriterion("create_idno <>", value, "createIdno");
            return (Criteria) this;
        }

        public Criteria andCreateIdnoGreaterThan(String value) {
            addCriterion("create_idno >", value, "createIdno");
            return (Criteria) this;
        }

        public Criteria andCreateIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("create_idno >=", value, "createIdno");
            return (Criteria) this;
        }

        public Criteria andCreateIdnoLessThan(String value) {
            addCriterion("create_idno <", value, "createIdno");
            return (Criteria) this;
        }

        public Criteria andCreateIdnoLessThanOrEqualTo(String value) {
            addCriterion("create_idno <=", value, "createIdno");
            return (Criteria) this;
        }

        public Criteria andCreateIdnoLike(String value) {
            addCriterion("create_idno like", value, "createIdno");
            return (Criteria) this;
        }

        public Criteria andCreateIdnoNotLike(String value) {
            addCriterion("create_idno not like", value, "createIdno");
            return (Criteria) this;
        }

        public Criteria andCreateIdnoIn(List<String> values) {
            addCriterion("create_idno in", values, "createIdno");
            return (Criteria) this;
        }

        public Criteria andCreateIdnoNotIn(List<String> values) {
            addCriterion("create_idno not in", values, "createIdno");
            return (Criteria) this;
        }

        public Criteria andCreateIdnoBetween(String value1, String value2) {
            addCriterion("create_idno between", value1, value2, "createIdno");
            return (Criteria) this;
        }

        public Criteria andCreateIdnoNotBetween(String value1, String value2) {
            addCriterion("create_idno not between", value1, value2, "createIdno");
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