package cn.douma.woyo.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluateInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateInfoExample() {
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

        public Criteria andEvaluateTypeIsNull() {
            addCriterion("evaluate_type is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeIsNotNull() {
            addCriterion("evaluate_type is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeEqualTo(String value) {
            addCriterion("evaluate_type =", value, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeNotEqualTo(String value) {
            addCriterion("evaluate_type <>", value, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeGreaterThan(String value) {
            addCriterion("evaluate_type >", value, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_type >=", value, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeLessThan(String value) {
            addCriterion("evaluate_type <", value, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeLessThanOrEqualTo(String value) {
            addCriterion("evaluate_type <=", value, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeLike(String value) {
            addCriterion("evaluate_type like", value, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeNotLike(String value) {
            addCriterion("evaluate_type not like", value, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeIn(List<String> values) {
            addCriterion("evaluate_type in", values, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeNotIn(List<String> values) {
            addCriterion("evaluate_type not in", values, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeBetween(String value1, String value2) {
            addCriterion("evaluate_type between", value1, value2, "evaluateType");
            return (Criteria) this;
        }

        public Criteria andEvaluateTypeNotBetween(String value1, String value2) {
            addCriterion("evaluate_type not between", value1, value2, "evaluateType");
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

        public Criteria andElavaterIdnoIsNull() {
            addCriterion("elavater_idno is null");
            return (Criteria) this;
        }

        public Criteria andElavaterIdnoIsNotNull() {
            addCriterion("elavater_idno is not null");
            return (Criteria) this;
        }

        public Criteria andElavaterIdnoEqualTo(String value) {
            addCriterion("elavater_idno =", value, "elavaterIdno");
            return (Criteria) this;
        }

        public Criteria andElavaterIdnoNotEqualTo(String value) {
            addCriterion("elavater_idno <>", value, "elavaterIdno");
            return (Criteria) this;
        }

        public Criteria andElavaterIdnoGreaterThan(String value) {
            addCriterion("elavater_idno >", value, "elavaterIdno");
            return (Criteria) this;
        }

        public Criteria andElavaterIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("elavater_idno >=", value, "elavaterIdno");
            return (Criteria) this;
        }

        public Criteria andElavaterIdnoLessThan(String value) {
            addCriterion("elavater_idno <", value, "elavaterIdno");
            return (Criteria) this;
        }

        public Criteria andElavaterIdnoLessThanOrEqualTo(String value) {
            addCriterion("elavater_idno <=", value, "elavaterIdno");
            return (Criteria) this;
        }

        public Criteria andElavaterIdnoLike(String value) {
            addCriterion("elavater_idno like", value, "elavaterIdno");
            return (Criteria) this;
        }

        public Criteria andElavaterIdnoNotLike(String value) {
            addCriterion("elavater_idno not like", value, "elavaterIdno");
            return (Criteria) this;
        }

        public Criteria andElavaterIdnoIn(List<String> values) {
            addCriterion("elavater_idno in", values, "elavaterIdno");
            return (Criteria) this;
        }

        public Criteria andElavaterIdnoNotIn(List<String> values) {
            addCriterion("elavater_idno not in", values, "elavaterIdno");
            return (Criteria) this;
        }

        public Criteria andElavaterIdnoBetween(String value1, String value2) {
            addCriterion("elavater_idno between", value1, value2, "elavaterIdno");
            return (Criteria) this;
        }

        public Criteria andElavaterIdnoNotBetween(String value1, String value2) {
            addCriterion("elavater_idno not between", value1, value2, "elavaterIdno");
            return (Criteria) this;
        }

        public Criteria andDriverOrderIdIsNull() {
            addCriterion("driver_order_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverOrderIdIsNotNull() {
            addCriterion("driver_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverOrderIdEqualTo(Long value) {
            addCriterion("driver_order_id =", value, "driverOrderId");
            return (Criteria) this;
        }

        public Criteria andDriverOrderIdNotEqualTo(Long value) {
            addCriterion("driver_order_id <>", value, "driverOrderId");
            return (Criteria) this;
        }

        public Criteria andDriverOrderIdGreaterThan(Long value) {
            addCriterion("driver_order_id >", value, "driverOrderId");
            return (Criteria) this;
        }

        public Criteria andDriverOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("driver_order_id >=", value, "driverOrderId");
            return (Criteria) this;
        }

        public Criteria andDriverOrderIdLessThan(Long value) {
            addCriterion("driver_order_id <", value, "driverOrderId");
            return (Criteria) this;
        }

        public Criteria andDriverOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("driver_order_id <=", value, "driverOrderId");
            return (Criteria) this;
        }

        public Criteria andDriverOrderIdIn(List<Long> values) {
            addCriterion("driver_order_id in", values, "driverOrderId");
            return (Criteria) this;
        }

        public Criteria andDriverOrderIdNotIn(List<Long> values) {
            addCriterion("driver_order_id not in", values, "driverOrderId");
            return (Criteria) this;
        }

        public Criteria andDriverOrderIdBetween(Long value1, Long value2) {
            addCriterion("driver_order_id between", value1, value2, "driverOrderId");
            return (Criteria) this;
        }

        public Criteria andDriverOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("driver_order_id not between", value1, value2, "driverOrderId");
            return (Criteria) this;
        }

        public Criteria andPasserOrderIsNull() {
            addCriterion("passer_order is null");
            return (Criteria) this;
        }

        public Criteria andPasserOrderIsNotNull() {
            addCriterion("passer_order is not null");
            return (Criteria) this;
        }

        public Criteria andPasserOrderEqualTo(Long value) {
            addCriterion("passer_order =", value, "passerOrder");
            return (Criteria) this;
        }

        public Criteria andPasserOrderNotEqualTo(Long value) {
            addCriterion("passer_order <>", value, "passerOrder");
            return (Criteria) this;
        }

        public Criteria andPasserOrderGreaterThan(Long value) {
            addCriterion("passer_order >", value, "passerOrder");
            return (Criteria) this;
        }

        public Criteria andPasserOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("passer_order >=", value, "passerOrder");
            return (Criteria) this;
        }

        public Criteria andPasserOrderLessThan(Long value) {
            addCriterion("passer_order <", value, "passerOrder");
            return (Criteria) this;
        }

        public Criteria andPasserOrderLessThanOrEqualTo(Long value) {
            addCriterion("passer_order <=", value, "passerOrder");
            return (Criteria) this;
        }

        public Criteria andPasserOrderIn(List<Long> values) {
            addCriterion("passer_order in", values, "passerOrder");
            return (Criteria) this;
        }

        public Criteria andPasserOrderNotIn(List<Long> values) {
            addCriterion("passer_order not in", values, "passerOrder");
            return (Criteria) this;
        }

        public Criteria andPasserOrderBetween(Long value1, Long value2) {
            addCriterion("passer_order between", value1, value2, "passerOrder");
            return (Criteria) this;
        }

        public Criteria andPasserOrderNotBetween(Long value1, Long value2) {
            addCriterion("passer_order not between", value1, value2, "passerOrder");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreIsNull() {
            addCriterion("evaluate_score is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreIsNotNull() {
            addCriterion("evaluate_score is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreEqualTo(Integer value) {
            addCriterion("evaluate_score =", value, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreNotEqualTo(Integer value) {
            addCriterion("evaluate_score <>", value, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreGreaterThan(Integer value) {
            addCriterion("evaluate_score >", value, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluate_score >=", value, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreLessThan(Integer value) {
            addCriterion("evaluate_score <", value, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreLessThanOrEqualTo(Integer value) {
            addCriterion("evaluate_score <=", value, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreIn(List<Integer> values) {
            addCriterion("evaluate_score in", values, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreNotIn(List<Integer> values) {
            addCriterion("evaluate_score not in", values, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_score between", value1, value2, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_score not between", value1, value2, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIsNull() {
            addCriterion("evaluate_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIsNotNull() {
            addCriterion("evaluate_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeEqualTo(Date value) {
            addCriterion("evaluate_time =", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotEqualTo(Date value) {
            addCriterion("evaluate_time <>", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeGreaterThan(Date value) {
            addCriterion("evaluate_time >", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluate_time >=", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeLessThan(Date value) {
            addCriterion("evaluate_time <", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluate_time <=", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIn(List<Date> values) {
            addCriterion("evaluate_time in", values, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotIn(List<Date> values) {
            addCriterion("evaluate_time not in", values, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeBetween(Date value1, Date value2) {
            addCriterion("evaluate_time between", value1, value2, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluate_time not between", value1, value2, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIsNull() {
            addCriterion("evaluate_content is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIsNotNull() {
            addCriterion("evaluate_content is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentEqualTo(String value) {
            addCriterion("evaluate_content =", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotEqualTo(String value) {
            addCriterion("evaluate_content <>", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentGreaterThan(String value) {
            addCriterion("evaluate_content >", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_content >=", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLessThan(String value) {
            addCriterion("evaluate_content <", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLessThanOrEqualTo(String value) {
            addCriterion("evaluate_content <=", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLike(String value) {
            addCriterion("evaluate_content like", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotLike(String value) {
            addCriterion("evaluate_content not like", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIn(List<String> values) {
            addCriterion("evaluate_content in", values, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotIn(List<String> values) {
            addCriterion("evaluate_content not in", values, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentBetween(String value1, String value2) {
            addCriterion("evaluate_content between", value1, value2, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotBetween(String value1, String value2) {
            addCriterion("evaluate_content not between", value1, value2, "evaluateContent");
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