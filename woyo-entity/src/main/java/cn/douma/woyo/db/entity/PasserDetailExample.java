package cn.douma.woyo.db.entity;

import java.util.ArrayList;
import java.util.List;

public class PasserDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PasserDetailExample() {
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

        public Criteria andIdnoIsNull() {
            addCriterion("idno is null");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNotNull() {
            addCriterion("idno is not null");
            return (Criteria) this;
        }

        public Criteria andIdnoEqualTo(String value) {
            addCriterion("idno =", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotEqualTo(String value) {
            addCriterion("idno <>", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThan(String value) {
            addCriterion("idno >", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("idno >=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThan(String value) {
            addCriterion("idno <", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThanOrEqualTo(String value) {
            addCriterion("idno <=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLike(String value) {
            addCriterion("idno like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotLike(String value) {
            addCriterion("idno not like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoIn(List<String> values) {
            addCriterion("idno in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotIn(List<String> values) {
            addCriterion("idno not in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoBetween(String value1, String value2) {
            addCriterion("idno between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotBetween(String value1, String value2) {
            addCriterion("idno not between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPriceStatusIsNull() {
            addCriterion("price_status is null");
            return (Criteria) this;
        }

        public Criteria andPriceStatusIsNotNull() {
            addCriterion("price_status is not null");
            return (Criteria) this;
        }

        public Criteria andPriceStatusEqualTo(String value) {
            addCriterion("price_status =", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusNotEqualTo(String value) {
            addCriterion("price_status <>", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusGreaterThan(String value) {
            addCriterion("price_status >", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("price_status >=", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusLessThan(String value) {
            addCriterion("price_status <", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusLessThanOrEqualTo(String value) {
            addCriterion("price_status <=", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusLike(String value) {
            addCriterion("price_status like", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusNotLike(String value) {
            addCriterion("price_status not like", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusIn(List<String> values) {
            addCriterion("price_status in", values, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusNotIn(List<String> values) {
            addCriterion("price_status not in", values, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusBetween(String value1, String value2) {
            addCriterion("price_status between", value1, value2, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusNotBetween(String value1, String value2) {
            addCriterion("price_status not between", value1, value2, "priceStatus");
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