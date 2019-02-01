package com.example.gen.model;

import java.util.ArrayList;
import java.util.List;

public class TLrbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLrbExample() {
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

        public Criteria andExchangeidIsNull() {
            addCriterion("ExchangeID is null");
            return (Criteria) this;
        }

        public Criteria andExchangeidIsNotNull() {
            addCriterion("ExchangeID is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeidEqualTo(String value) {
            addCriterion("ExchangeID =", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidNotEqualTo(String value) {
            addCriterion("ExchangeID <>", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidGreaterThan(String value) {
            addCriterion("ExchangeID >", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidGreaterThanOrEqualTo(String value) {
            addCriterion("ExchangeID >=", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidLessThan(String value) {
            addCriterion("ExchangeID <", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidLessThanOrEqualTo(String value) {
            addCriterion("ExchangeID <=", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidLike(String value) {
            addCriterion("ExchangeID like", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidNotLike(String value) {
            addCriterion("ExchangeID not like", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidIn(List<String> values) {
            addCriterion("ExchangeID in", values, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidNotIn(List<String> values) {
            addCriterion("ExchangeID not in", values, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidBetween(String value1, String value2) {
            addCriterion("ExchangeID between", value1, value2, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidNotBetween(String value1, String value2) {
            addCriterion("ExchangeID not between", value1, value2, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andStockcodeIsNull() {
            addCriterion("StockCode is null");
            return (Criteria) this;
        }

        public Criteria andStockcodeIsNotNull() {
            addCriterion("StockCode is not null");
            return (Criteria) this;
        }

        public Criteria andStockcodeEqualTo(String value) {
            addCriterion("StockCode =", value, "stockcode");
            return (Criteria) this;
        }

        public Criteria andStockcodeNotEqualTo(String value) {
            addCriterion("StockCode <>", value, "stockcode");
            return (Criteria) this;
        }

        public Criteria andStockcodeGreaterThan(String value) {
            addCriterion("StockCode >", value, "stockcode");
            return (Criteria) this;
        }

        public Criteria andStockcodeGreaterThanOrEqualTo(String value) {
            addCriterion("StockCode >=", value, "stockcode");
            return (Criteria) this;
        }

        public Criteria andStockcodeLessThan(String value) {
            addCriterion("StockCode <", value, "stockcode");
            return (Criteria) this;
        }

        public Criteria andStockcodeLessThanOrEqualTo(String value) {
            addCriterion("StockCode <=", value, "stockcode");
            return (Criteria) this;
        }

        public Criteria andStockcodeLike(String value) {
            addCriterion("StockCode like", value, "stockcode");
            return (Criteria) this;
        }

        public Criteria andStockcodeNotLike(String value) {
            addCriterion("StockCode not like", value, "stockcode");
            return (Criteria) this;
        }

        public Criteria andStockcodeIn(List<String> values) {
            addCriterion("StockCode in", values, "stockcode");
            return (Criteria) this;
        }

        public Criteria andStockcodeNotIn(List<String> values) {
            addCriterion("StockCode not in", values, "stockcode");
            return (Criteria) this;
        }

        public Criteria andStockcodeBetween(String value1, String value2) {
            addCriterion("StockCode between", value1, value2, "stockcode");
            return (Criteria) this;
        }

        public Criteria andStockcodeNotBetween(String value1, String value2) {
            addCriterion("StockCode not between", value1, value2, "stockcode");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("OrgName is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("OrgName is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("OrgName =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("OrgName <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("OrgName >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("OrgName >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("OrgName <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("OrgName <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("OrgName like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("OrgName not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("OrgName in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("OrgName not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("OrgName between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("OrgName not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andNoticedateIsNull() {
            addCriterion("NoticeDate is null");
            return (Criteria) this;
        }

        public Criteria andNoticedateIsNotNull() {
            addCriterion("NoticeDate is not null");
            return (Criteria) this;
        }

        public Criteria andNoticedateEqualTo(String value) {
            addCriterion("NoticeDate =", value, "noticedate");
            return (Criteria) this;
        }

        public Criteria andNoticedateNotEqualTo(String value) {
            addCriterion("NoticeDate <>", value, "noticedate");
            return (Criteria) this;
        }

        public Criteria andNoticedateGreaterThan(String value) {
            addCriterion("NoticeDate >", value, "noticedate");
            return (Criteria) this;
        }

        public Criteria andNoticedateGreaterThanOrEqualTo(String value) {
            addCriterion("NoticeDate >=", value, "noticedate");
            return (Criteria) this;
        }

        public Criteria andNoticedateLessThan(String value) {
            addCriterion("NoticeDate <", value, "noticedate");
            return (Criteria) this;
        }

        public Criteria andNoticedateLessThanOrEqualTo(String value) {
            addCriterion("NoticeDate <=", value, "noticedate");
            return (Criteria) this;
        }

        public Criteria andNoticedateLike(String value) {
            addCriterion("NoticeDate like", value, "noticedate");
            return (Criteria) this;
        }

        public Criteria andNoticedateNotLike(String value) {
            addCriterion("NoticeDate not like", value, "noticedate");
            return (Criteria) this;
        }

        public Criteria andNoticedateIn(List<String> values) {
            addCriterion("NoticeDate in", values, "noticedate");
            return (Criteria) this;
        }

        public Criteria andNoticedateNotIn(List<String> values) {
            addCriterion("NoticeDate not in", values, "noticedate");
            return (Criteria) this;
        }

        public Criteria andNoticedateBetween(String value1, String value2) {
            addCriterion("NoticeDate between", value1, value2, "noticedate");
            return (Criteria) this;
        }

        public Criteria andNoticedateNotBetween(String value1, String value2) {
            addCriterion("NoticeDate not between", value1, value2, "noticedate");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNull() {
            addCriterion("BeginDate is null");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNotNull() {
            addCriterion("BeginDate is not null");
            return (Criteria) this;
        }

        public Criteria andBegindateEqualTo(String value) {
            addCriterion("BeginDate =", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotEqualTo(String value) {
            addCriterion("BeginDate <>", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThan(String value) {
            addCriterion("BeginDate >", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThanOrEqualTo(String value) {
            addCriterion("BeginDate >=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThan(String value) {
            addCriterion("BeginDate <", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThanOrEqualTo(String value) {
            addCriterion("BeginDate <=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLike(String value) {
            addCriterion("BeginDate like", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotLike(String value) {
            addCriterion("BeginDate not like", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateIn(List<String> values) {
            addCriterion("BeginDate in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotIn(List<String> values) {
            addCriterion("BeginDate not in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateBetween(String value1, String value2) {
            addCriterion("BeginDate between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotBetween(String value1, String value2) {
            addCriterion("BeginDate not between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("EndDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("EndDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("EndDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("EndDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("EndDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("EndDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("EndDate like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("EndDate not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("EndDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("EndDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("EndDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("EndDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andReportyearIsNull() {
            addCriterion("ReportYear is null");
            return (Criteria) this;
        }

        public Criteria andReportyearIsNotNull() {
            addCriterion("ReportYear is not null");
            return (Criteria) this;
        }

        public Criteria andReportyearEqualTo(String value) {
            addCriterion("ReportYear =", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearNotEqualTo(String value) {
            addCriterion("ReportYear <>", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearGreaterThan(String value) {
            addCriterion("ReportYear >", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearGreaterThanOrEqualTo(String value) {
            addCriterion("ReportYear >=", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearLessThan(String value) {
            addCriterion("ReportYear <", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearLessThanOrEqualTo(String value) {
            addCriterion("ReportYear <=", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearLike(String value) {
            addCriterion("ReportYear like", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearNotLike(String value) {
            addCriterion("ReportYear not like", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearIn(List<String> values) {
            addCriterion("ReportYear in", values, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearNotIn(List<String> values) {
            addCriterion("ReportYear not in", values, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearBetween(String value1, String value2) {
            addCriterion("ReportYear between", value1, value2, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearNotBetween(String value1, String value2) {
            addCriterion("ReportYear not between", value1, value2, "reportyear");
            return (Criteria) this;
        }

        public Criteria andMergetypeIsNull() {
            addCriterion("MergeType is null");
            return (Criteria) this;
        }

        public Criteria andMergetypeIsNotNull() {
            addCriterion("MergeType is not null");
            return (Criteria) this;
        }

        public Criteria andMergetypeEqualTo(String value) {
            addCriterion("MergeType =", value, "mergetype");
            return (Criteria) this;
        }

        public Criteria andMergetypeNotEqualTo(String value) {
            addCriterion("MergeType <>", value, "mergetype");
            return (Criteria) this;
        }

        public Criteria andMergetypeGreaterThan(String value) {
            addCriterion("MergeType >", value, "mergetype");
            return (Criteria) this;
        }

        public Criteria andMergetypeGreaterThanOrEqualTo(String value) {
            addCriterion("MergeType >=", value, "mergetype");
            return (Criteria) this;
        }

        public Criteria andMergetypeLessThan(String value) {
            addCriterion("MergeType <", value, "mergetype");
            return (Criteria) this;
        }

        public Criteria andMergetypeLessThanOrEqualTo(String value) {
            addCriterion("MergeType <=", value, "mergetype");
            return (Criteria) this;
        }

        public Criteria andMergetypeLike(String value) {
            addCriterion("MergeType like", value, "mergetype");
            return (Criteria) this;
        }

        public Criteria andMergetypeNotLike(String value) {
            addCriterion("MergeType not like", value, "mergetype");
            return (Criteria) this;
        }

        public Criteria andMergetypeIn(List<String> values) {
            addCriterion("MergeType in", values, "mergetype");
            return (Criteria) this;
        }

        public Criteria andMergetypeNotIn(List<String> values) {
            addCriterion("MergeType not in", values, "mergetype");
            return (Criteria) this;
        }

        public Criteria andMergetypeBetween(String value1, String value2) {
            addCriterion("MergeType between", value1, value2, "mergetype");
            return (Criteria) this;
        }

        public Criteria andMergetypeNotBetween(String value1, String value2) {
            addCriterion("MergeType not between", value1, value2, "mergetype");
            return (Criteria) this;
        }

        public Criteria andReportsourceIsNull() {
            addCriterion("ReportSource is null");
            return (Criteria) this;
        }

        public Criteria andReportsourceIsNotNull() {
            addCriterion("ReportSource is not null");
            return (Criteria) this;
        }

        public Criteria andReportsourceEqualTo(String value) {
            addCriterion("ReportSource =", value, "reportsource");
            return (Criteria) this;
        }

        public Criteria andReportsourceNotEqualTo(String value) {
            addCriterion("ReportSource <>", value, "reportsource");
            return (Criteria) this;
        }

        public Criteria andReportsourceGreaterThan(String value) {
            addCriterion("ReportSource >", value, "reportsource");
            return (Criteria) this;
        }

        public Criteria andReportsourceGreaterThanOrEqualTo(String value) {
            addCriterion("ReportSource >=", value, "reportsource");
            return (Criteria) this;
        }

        public Criteria andReportsourceLessThan(String value) {
            addCriterion("ReportSource <", value, "reportsource");
            return (Criteria) this;
        }

        public Criteria andReportsourceLessThanOrEqualTo(String value) {
            addCriterion("ReportSource <=", value, "reportsource");
            return (Criteria) this;
        }

        public Criteria andReportsourceLike(String value) {
            addCriterion("ReportSource like", value, "reportsource");
            return (Criteria) this;
        }

        public Criteria andReportsourceNotLike(String value) {
            addCriterion("ReportSource not like", value, "reportsource");
            return (Criteria) this;
        }

        public Criteria andReportsourceIn(List<String> values) {
            addCriterion("ReportSource in", values, "reportsource");
            return (Criteria) this;
        }

        public Criteria andReportsourceNotIn(List<String> values) {
            addCriterion("ReportSource not in", values, "reportsource");
            return (Criteria) this;
        }

        public Criteria andReportsourceBetween(String value1, String value2) {
            addCriterion("ReportSource between", value1, value2, "reportsource");
            return (Criteria) this;
        }

        public Criteria andReportsourceNotBetween(String value1, String value2) {
            addCriterion("ReportSource not between", value1, value2, "reportsource");
            return (Criteria) this;
        }

        public Criteria andTotalincomingIsNull() {
            addCriterion("TotalIncoming is null");
            return (Criteria) this;
        }

        public Criteria andTotalincomingIsNotNull() {
            addCriterion("TotalIncoming is not null");
            return (Criteria) this;
        }

        public Criteria andTotalincomingEqualTo(Double value) {
            addCriterion("TotalIncoming =", value, "totalincoming");
            return (Criteria) this;
        }

        public Criteria andTotalincomingNotEqualTo(Double value) {
            addCriterion("TotalIncoming <>", value, "totalincoming");
            return (Criteria) this;
        }

        public Criteria andTotalincomingGreaterThan(Double value) {
            addCriterion("TotalIncoming >", value, "totalincoming");
            return (Criteria) this;
        }

        public Criteria andTotalincomingGreaterThanOrEqualTo(Double value) {
            addCriterion("TotalIncoming >=", value, "totalincoming");
            return (Criteria) this;
        }

        public Criteria andTotalincomingLessThan(Double value) {
            addCriterion("TotalIncoming <", value, "totalincoming");
            return (Criteria) this;
        }

        public Criteria andTotalincomingLessThanOrEqualTo(Double value) {
            addCriterion("TotalIncoming <=", value, "totalincoming");
            return (Criteria) this;
        }

        public Criteria andTotalincomingIn(List<Double> values) {
            addCriterion("TotalIncoming in", values, "totalincoming");
            return (Criteria) this;
        }

        public Criteria andTotalincomingNotIn(List<Double> values) {
            addCriterion("TotalIncoming not in", values, "totalincoming");
            return (Criteria) this;
        }

        public Criteria andTotalincomingBetween(Double value1, Double value2) {
            addCriterion("TotalIncoming between", value1, value2, "totalincoming");
            return (Criteria) this;
        }

        public Criteria andTotalincomingNotBetween(Double value1, Double value2) {
            addCriterion("TotalIncoming not between", value1, value2, "totalincoming");
            return (Criteria) this;
        }

        public Criteria andIncomingpartIsNull() {
            addCriterion("IncomingPart is null");
            return (Criteria) this;
        }

        public Criteria andIncomingpartIsNotNull() {
            addCriterion("IncomingPart is not null");
            return (Criteria) this;
        }

        public Criteria andIncomingpartEqualTo(Double value) {
            addCriterion("IncomingPart =", value, "incomingpart");
            return (Criteria) this;
        }

        public Criteria andIncomingpartNotEqualTo(Double value) {
            addCriterion("IncomingPart <>", value, "incomingpart");
            return (Criteria) this;
        }

        public Criteria andIncomingpartGreaterThan(Double value) {
            addCriterion("IncomingPart >", value, "incomingpart");
            return (Criteria) this;
        }

        public Criteria andIncomingpartGreaterThanOrEqualTo(Double value) {
            addCriterion("IncomingPart >=", value, "incomingpart");
            return (Criteria) this;
        }

        public Criteria andIncomingpartLessThan(Double value) {
            addCriterion("IncomingPart <", value, "incomingpart");
            return (Criteria) this;
        }

        public Criteria andIncomingpartLessThanOrEqualTo(Double value) {
            addCriterion("IncomingPart <=", value, "incomingpart");
            return (Criteria) this;
        }

        public Criteria andIncomingpartIn(List<Double> values) {
            addCriterion("IncomingPart in", values, "incomingpart");
            return (Criteria) this;
        }

        public Criteria andIncomingpartNotIn(List<Double> values) {
            addCriterion("IncomingPart not in", values, "incomingpart");
            return (Criteria) this;
        }

        public Criteria andIncomingpartBetween(Double value1, Double value2) {
            addCriterion("IncomingPart between", value1, value2, "incomingpart");
            return (Criteria) this;
        }

        public Criteria andIncomingpartNotBetween(Double value1, Double value2) {
            addCriterion("IncomingPart not between", value1, value2, "incomingpart");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNull() {
            addCriterion("TotalCost is null");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNotNull() {
            addCriterion("TotalCost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcostEqualTo(Double value) {
            addCriterion("TotalCost =", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotEqualTo(Double value) {
            addCriterion("TotalCost <>", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThan(Double value) {
            addCriterion("TotalCost >", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThanOrEqualTo(Double value) {
            addCriterion("TotalCost >=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThan(Double value) {
            addCriterion("TotalCost <", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThanOrEqualTo(Double value) {
            addCriterion("TotalCost <=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostIn(List<Double> values) {
            addCriterion("TotalCost in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotIn(List<Double> values) {
            addCriterion("TotalCost not in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostBetween(Double value1, Double value2) {
            addCriterion("TotalCost between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotBetween(Double value1, Double value2) {
            addCriterion("TotalCost not between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalprofitIsNull() {
            addCriterion("TotalProfit is null");
            return (Criteria) this;
        }

        public Criteria andTotalprofitIsNotNull() {
            addCriterion("TotalProfit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalprofitEqualTo(Double value) {
            addCriterion("TotalProfit =", value, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitNotEqualTo(Double value) {
            addCriterion("TotalProfit <>", value, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitGreaterThan(Double value) {
            addCriterion("TotalProfit >", value, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitGreaterThanOrEqualTo(Double value) {
            addCriterion("TotalProfit >=", value, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitLessThan(Double value) {
            addCriterion("TotalProfit <", value, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitLessThanOrEqualTo(Double value) {
            addCriterion("TotalProfit <=", value, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitIn(List<Double> values) {
            addCriterion("TotalProfit in", values, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitNotIn(List<Double> values) {
            addCriterion("TotalProfit not in", values, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitBetween(Double value1, Double value2) {
            addCriterion("TotalProfit between", value1, value2, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitNotBetween(Double value1, Double value2) {
            addCriterion("TotalProfit not between", value1, value2, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitIsNull() {
            addCriterion("NetProfit is null");
            return (Criteria) this;
        }

        public Criteria andNetprofitIsNotNull() {
            addCriterion("NetProfit is not null");
            return (Criteria) this;
        }

        public Criteria andNetprofitEqualTo(Double value) {
            addCriterion("NetProfit =", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitNotEqualTo(Double value) {
            addCriterion("NetProfit <>", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitGreaterThan(Double value) {
            addCriterion("NetProfit >", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitGreaterThanOrEqualTo(Double value) {
            addCriterion("NetProfit >=", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitLessThan(Double value) {
            addCriterion("NetProfit <", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitLessThanOrEqualTo(Double value) {
            addCriterion("NetProfit <=", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitIn(List<Double> values) {
            addCriterion("NetProfit in", values, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitNotIn(List<Double> values) {
            addCriterion("NetProfit not in", values, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitBetween(Double value1, Double value2) {
            addCriterion("NetProfit between", value1, value2, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitNotBetween(Double value1, Double value2) {
            addCriterion("NetProfit not between", value1, value2, "netprofit");
            return (Criteria) this;
        }

        public Criteria andBasicpesIsNull() {
            addCriterion("BasicPES is null");
            return (Criteria) this;
        }

        public Criteria andBasicpesIsNotNull() {
            addCriterion("BasicPES is not null");
            return (Criteria) this;
        }

        public Criteria andBasicpesEqualTo(Double value) {
            addCriterion("BasicPES =", value, "basicpes");
            return (Criteria) this;
        }

        public Criteria andBasicpesNotEqualTo(Double value) {
            addCriterion("BasicPES <>", value, "basicpes");
            return (Criteria) this;
        }

        public Criteria andBasicpesGreaterThan(Double value) {
            addCriterion("BasicPES >", value, "basicpes");
            return (Criteria) this;
        }

        public Criteria andBasicpesGreaterThanOrEqualTo(Double value) {
            addCriterion("BasicPES >=", value, "basicpes");
            return (Criteria) this;
        }

        public Criteria andBasicpesLessThan(Double value) {
            addCriterion("BasicPES <", value, "basicpes");
            return (Criteria) this;
        }

        public Criteria andBasicpesLessThanOrEqualTo(Double value) {
            addCriterion("BasicPES <=", value, "basicpes");
            return (Criteria) this;
        }

        public Criteria andBasicpesIn(List<Double> values) {
            addCriterion("BasicPES in", values, "basicpes");
            return (Criteria) this;
        }

        public Criteria andBasicpesNotIn(List<Double> values) {
            addCriterion("BasicPES not in", values, "basicpes");
            return (Criteria) this;
        }

        public Criteria andBasicpesBetween(Double value1, Double value2) {
            addCriterion("BasicPES between", value1, value2, "basicpes");
            return (Criteria) this;
        }

        public Criteria andBasicpesNotBetween(Double value1, Double value2) {
            addCriterion("BasicPES not between", value1, value2, "basicpes");
            return (Criteria) this;
        }

        public Criteria andDilutedpesIsNull() {
            addCriterion("DilutedPES is null");
            return (Criteria) this;
        }

        public Criteria andDilutedpesIsNotNull() {
            addCriterion("DilutedPES is not null");
            return (Criteria) this;
        }

        public Criteria andDilutedpesEqualTo(Double value) {
            addCriterion("DilutedPES =", value, "dilutedpes");
            return (Criteria) this;
        }

        public Criteria andDilutedpesNotEqualTo(Double value) {
            addCriterion("DilutedPES <>", value, "dilutedpes");
            return (Criteria) this;
        }

        public Criteria andDilutedpesGreaterThan(Double value) {
            addCriterion("DilutedPES >", value, "dilutedpes");
            return (Criteria) this;
        }

        public Criteria andDilutedpesGreaterThanOrEqualTo(Double value) {
            addCriterion("DilutedPES >=", value, "dilutedpes");
            return (Criteria) this;
        }

        public Criteria andDilutedpesLessThan(Double value) {
            addCriterion("DilutedPES <", value, "dilutedpes");
            return (Criteria) this;
        }

        public Criteria andDilutedpesLessThanOrEqualTo(Double value) {
            addCriterion("DilutedPES <=", value, "dilutedpes");
            return (Criteria) this;
        }

        public Criteria andDilutedpesIn(List<Double> values) {
            addCriterion("DilutedPES in", values, "dilutedpes");
            return (Criteria) this;
        }

        public Criteria andDilutedpesNotIn(List<Double> values) {
            addCriterion("DilutedPES not in", values, "dilutedpes");
            return (Criteria) this;
        }

        public Criteria andDilutedpesBetween(Double value1, Double value2) {
            addCriterion("DilutedPES between", value1, value2, "dilutedpes");
            return (Criteria) this;
        }

        public Criteria andDilutedpesNotBetween(Double value1, Double value2) {
            addCriterion("DilutedPES not between", value1, value2, "dilutedpes");
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