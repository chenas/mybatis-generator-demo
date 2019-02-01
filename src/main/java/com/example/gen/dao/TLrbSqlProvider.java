package com.example.gen.dao;

import com.example.gen.model.TLrb;
import com.example.gen.model.TLrbExample.Criteria;
import com.example.gen.model.TLrbExample.Criterion;
import com.example.gen.model.TLrbExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TLrbSqlProvider {

    public String countByExample(TLrbExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_lrb");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TLrbExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_lrb");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TLrb record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_lrb");
        
        if (record.getExchangeid() != null) {
            sql.VALUES("ExchangeID", "#{exchangeid,jdbcType=VARCHAR}");
        }
        
        if (record.getStockcode() != null) {
            sql.VALUES("StockCode", "#{stockcode,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgname() != null) {
            sql.VALUES("OrgName", "#{orgname,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticedate() != null) {
            sql.VALUES("NoticeDate", "#{noticedate,jdbcType=VARCHAR}");
        }
        
        if (record.getBegindate() != null) {
            sql.VALUES("BeginDate", "#{begindate,jdbcType=VARCHAR}");
        }
        
        if (record.getEnddate() != null) {
            sql.VALUES("EndDate", "#{enddate,jdbcType=VARCHAR}");
        }
        
        if (record.getReportyear() != null) {
            sql.VALUES("ReportYear", "#{reportyear,jdbcType=VARCHAR}");
        }
        
        if (record.getMergetype() != null) {
            sql.VALUES("MergeType", "#{mergetype,jdbcType=VARCHAR}");
        }
        
        if (record.getReportsource() != null) {
            sql.VALUES("ReportSource", "#{reportsource,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalincoming() != null) {
            sql.VALUES("TotalIncoming", "#{totalincoming,jdbcType=DOUBLE}");
        }
        
        if (record.getIncomingpart() != null) {
            sql.VALUES("IncomingPart", "#{incomingpart,jdbcType=DOUBLE}");
        }
        
        if (record.getTotalcost() != null) {
            sql.VALUES("TotalCost", "#{totalcost,jdbcType=DOUBLE}");
        }
        
        if (record.getTotalprofit() != null) {
            sql.VALUES("TotalProfit", "#{totalprofit,jdbcType=DOUBLE}");
        }
        
        if (record.getNetprofit() != null) {
            sql.VALUES("NetProfit", "#{netprofit,jdbcType=DOUBLE}");
        }
        
        if (record.getBasicpes() != null) {
            sql.VALUES("BasicPES", "#{basicpes,jdbcType=DOUBLE}");
        }
        
        if (record.getDilutedpes() != null) {
            sql.VALUES("DilutedPES", "#{dilutedpes,jdbcType=DOUBLE}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TLrbExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ExchangeID");
        } else {
            sql.SELECT("ExchangeID");
        }
        sql.SELECT("StockCode");
        sql.SELECT("OrgName");
        sql.SELECT("NoticeDate");
        sql.SELECT("BeginDate");
        sql.SELECT("EndDate");
        sql.SELECT("ReportYear");
        sql.SELECT("MergeType");
        sql.SELECT("ReportSource");
        sql.SELECT("TotalIncoming");
        sql.SELECT("IncomingPart");
        sql.SELECT("TotalCost");
        sql.SELECT("TotalProfit");
        sql.SELECT("NetProfit");
        sql.SELECT("BasicPES");
        sql.SELECT("DilutedPES");
        sql.FROM("t_lrb");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TLrb record = (TLrb) parameter.get("record");
        TLrbExample example = (TLrbExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_lrb");
        
        if (record.getExchangeid() != null) {
            sql.SET("ExchangeID = #{record.exchangeid,jdbcType=VARCHAR}");
        }
        
        if (record.getStockcode() != null) {
            sql.SET("StockCode = #{record.stockcode,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgname() != null) {
            sql.SET("OrgName = #{record.orgname,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticedate() != null) {
            sql.SET("NoticeDate = #{record.noticedate,jdbcType=VARCHAR}");
        }
        
        if (record.getBegindate() != null) {
            sql.SET("BeginDate = #{record.begindate,jdbcType=VARCHAR}");
        }
        
        if (record.getEnddate() != null) {
            sql.SET("EndDate = #{record.enddate,jdbcType=VARCHAR}");
        }
        
        if (record.getReportyear() != null) {
            sql.SET("ReportYear = #{record.reportyear,jdbcType=VARCHAR}");
        }
        
        if (record.getMergetype() != null) {
            sql.SET("MergeType = #{record.mergetype,jdbcType=VARCHAR}");
        }
        
        if (record.getReportsource() != null) {
            sql.SET("ReportSource = #{record.reportsource,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalincoming() != null) {
            sql.SET("TotalIncoming = #{record.totalincoming,jdbcType=DOUBLE}");
        }
        
        if (record.getIncomingpart() != null) {
            sql.SET("IncomingPart = #{record.incomingpart,jdbcType=DOUBLE}");
        }
        
        if (record.getTotalcost() != null) {
            sql.SET("TotalCost = #{record.totalcost,jdbcType=DOUBLE}");
        }
        
        if (record.getTotalprofit() != null) {
            sql.SET("TotalProfit = #{record.totalprofit,jdbcType=DOUBLE}");
        }
        
        if (record.getNetprofit() != null) {
            sql.SET("NetProfit = #{record.netprofit,jdbcType=DOUBLE}");
        }
        
        if (record.getBasicpes() != null) {
            sql.SET("BasicPES = #{record.basicpes,jdbcType=DOUBLE}");
        }
        
        if (record.getDilutedpes() != null) {
            sql.SET("DilutedPES = #{record.dilutedpes,jdbcType=DOUBLE}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_lrb");
        
        sql.SET("ExchangeID = #{record.exchangeid,jdbcType=VARCHAR}");
        sql.SET("StockCode = #{record.stockcode,jdbcType=VARCHAR}");
        sql.SET("OrgName = #{record.orgname,jdbcType=VARCHAR}");
        sql.SET("NoticeDate = #{record.noticedate,jdbcType=VARCHAR}");
        sql.SET("BeginDate = #{record.begindate,jdbcType=VARCHAR}");
        sql.SET("EndDate = #{record.enddate,jdbcType=VARCHAR}");
        sql.SET("ReportYear = #{record.reportyear,jdbcType=VARCHAR}");
        sql.SET("MergeType = #{record.mergetype,jdbcType=VARCHAR}");
        sql.SET("ReportSource = #{record.reportsource,jdbcType=VARCHAR}");
        sql.SET("TotalIncoming = #{record.totalincoming,jdbcType=DOUBLE}");
        sql.SET("IncomingPart = #{record.incomingpart,jdbcType=DOUBLE}");
        sql.SET("TotalCost = #{record.totalcost,jdbcType=DOUBLE}");
        sql.SET("TotalProfit = #{record.totalprofit,jdbcType=DOUBLE}");
        sql.SET("NetProfit = #{record.netprofit,jdbcType=DOUBLE}");
        sql.SET("BasicPES = #{record.basicpes,jdbcType=DOUBLE}");
        sql.SET("DilutedPES = #{record.dilutedpes,jdbcType=DOUBLE}");
        
        TLrbExample example = (TLrbExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TLrbExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}