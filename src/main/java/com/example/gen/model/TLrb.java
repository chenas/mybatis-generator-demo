package com.example.gen.model;

public class TLrb {
    private String exchangeid;

    private String stockcode;

    private String orgname;

    private String noticedate;

    private String begindate;

    private String enddate;

    private String reportyear;

    private String mergetype;

    private String reportsource;

    private Double totalincoming;

    private Double incomingpart;

    private Double totalcost;

    private Double totalprofit;

    private Double netprofit;

    private Double basicpes;

    private Double dilutedpes;

    public String getExchangeid() {
        return exchangeid;
    }

    public void setExchangeid(String exchangeid) {
        this.exchangeid = exchangeid == null ? null : exchangeid.trim();
    }

    public String getStockcode() {
        return stockcode;
    }

    public void setStockcode(String stockcode) {
        this.stockcode = stockcode == null ? null : stockcode.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getNoticedate() {
        return noticedate;
    }

    public void setNoticedate(String noticedate) {
        this.noticedate = noticedate == null ? null : noticedate.trim();
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate == null ? null : begindate.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getReportyear() {
        return reportyear;
    }

    public void setReportyear(String reportyear) {
        this.reportyear = reportyear == null ? null : reportyear.trim();
    }

    public String getMergetype() {
        return mergetype;
    }

    public void setMergetype(String mergetype) {
        this.mergetype = mergetype == null ? null : mergetype.trim();
    }

    public String getReportsource() {
        return reportsource;
    }

    public void setReportsource(String reportsource) {
        this.reportsource = reportsource == null ? null : reportsource.trim();
    }

    public Double getTotalincoming() {
        return totalincoming;
    }

    public void setTotalincoming(Double totalincoming) {
        this.totalincoming = totalincoming;
    }

    public Double getIncomingpart() {
        return incomingpart;
    }

    public void setIncomingpart(Double incomingpart) {
        this.incomingpart = incomingpart;
    }

    public Double getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(Double totalcost) {
        this.totalcost = totalcost;
    }

    public Double getTotalprofit() {
        return totalprofit;
    }

    public void setTotalprofit(Double totalprofit) {
        this.totalprofit = totalprofit;
    }

    public Double getNetprofit() {
        return netprofit;
    }

    public void setNetprofit(Double netprofit) {
        this.netprofit = netprofit;
    }

    public Double getBasicpes() {
        return basicpes;
    }

    public void setBasicpes(Double basicpes) {
        this.basicpes = basicpes;
    }

    public Double getDilutedpes() {
        return dilutedpes;
    }

    public void setDilutedpes(Double dilutedpes) {
        this.dilutedpes = dilutedpes;
    }
}