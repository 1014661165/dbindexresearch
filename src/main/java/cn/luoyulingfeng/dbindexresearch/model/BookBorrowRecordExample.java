package cn.luoyulingfeng.dbindexresearch.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookBorrowRecordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
    public BookBorrowRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
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

        public Criteria andPersonNoIsNull() {
            addCriterion("person_no is null");
            return (Criteria) this;
        }

        public Criteria andPersonNoIsNotNull() {
            addCriterion("person_no is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNoEqualTo(String value) {
            addCriterion("person_no =", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoNotEqualTo(String value) {
            addCriterion("person_no <>", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoGreaterThan(String value) {
            addCriterion("person_no >", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoGreaterThanOrEqualTo(String value) {
            addCriterion("person_no >=", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoLessThan(String value) {
            addCriterion("person_no <", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoLessThanOrEqualTo(String value) {
            addCriterion("person_no <=", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoLike(String value) {
            addCriterion("person_no like", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoNotLike(String value) {
            addCriterion("person_no not like", value, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoIn(List<String> values) {
            addCriterion("person_no in", values, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoNotIn(List<String> values) {
            addCriterion("person_no not in", values, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoBetween(String value1, String value2) {
            addCriterion("person_no between", value1, value2, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonNoNotBetween(String value1, String value2) {
            addCriterion("person_no not between", value1, value2, "personNo");
            return (Criteria) this;
        }

        public Criteria andPersonTypeIsNull() {
            addCriterion("person_type is null");
            return (Criteria) this;
        }

        public Criteria andPersonTypeIsNotNull() {
            addCriterion("person_type is not null");
            return (Criteria) this;
        }

        public Criteria andPersonTypeEqualTo(Integer value) {
            addCriterion("person_type =", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeNotEqualTo(Integer value) {
            addCriterion("person_type <>", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeGreaterThan(Integer value) {
            addCriterion("person_type >", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_type >=", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeLessThan(Integer value) {
            addCriterion("person_type <", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeLessThanOrEqualTo(Integer value) {
            addCriterion("person_type <=", value, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeIn(List<Integer> values) {
            addCriterion("person_type in", values, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeNotIn(List<Integer> values) {
            addCriterion("person_type not in", values, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeBetween(Integer value1, Integer value2) {
            addCriterion("person_type between", value1, value2, "personType");
            return (Criteria) this;
        }

        public Criteria andPersonTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("person_type not between", value1, value2, "personType");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeIsNull() {
            addCriterion("borrow_time is null");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeIsNotNull() {
            addCriterion("borrow_time is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeEqualTo(Date value) {
            addCriterion("borrow_time =", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeNotEqualTo(Date value) {
            addCriterion("borrow_time <>", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeGreaterThan(Date value) {
            addCriterion("borrow_time >", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("borrow_time >=", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeLessThan(Date value) {
            addCriterion("borrow_time <", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeLessThanOrEqualTo(Date value) {
            addCriterion("borrow_time <=", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeIn(List<Date> values) {
            addCriterion("borrow_time in", values, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeNotIn(List<Date> values) {
            addCriterion("borrow_time not in", values, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeBetween(Date value1, Date value2) {
            addCriterion("borrow_time between", value1, value2, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeNotBetween(Date value1, Date value2) {
            addCriterion("borrow_time not between", value1, value2, "borrowTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wj_book_borrow
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wj_book_borrow
     *
     * @mbggenerated
     */
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