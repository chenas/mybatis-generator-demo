package com.example.gen.dao;

import com.example.gen.model.TLrb;
import com.example.gen.model.TLrbExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TLrbMapper {
    @SelectProvider(type=TLrbSqlProvider.class, method="countByExample")
    long countByExample(TLrbExample example);

    @DeleteProvider(type=TLrbSqlProvider.class, method="deleteByExample")
    int deleteByExample(TLrbExample example);

    @Insert({
        "insert into t_lrb (ExchangeID, StockCode, ",
        "OrgName, NoticeDate, ",
        "BeginDate, EndDate, ",
        "ReportYear, MergeType, ",
        "ReportSource, TotalIncoming, ",
        "IncomingPart, TotalCost, ",
        "TotalProfit, NetProfit, ",
        "BasicPES, DilutedPES)",
        "values (#{exchangeid,jdbcType=VARCHAR}, #{stockcode,jdbcType=VARCHAR}, ",
        "#{orgname,jdbcType=VARCHAR}, #{noticedate,jdbcType=VARCHAR}, ",
        "#{begindate,jdbcType=VARCHAR}, #{enddate,jdbcType=VARCHAR}, ",
        "#{reportyear,jdbcType=VARCHAR}, #{mergetype,jdbcType=VARCHAR}, ",
        "#{reportsource,jdbcType=VARCHAR}, #{totalincoming,jdbcType=DOUBLE}, ",
        "#{incomingpart,jdbcType=DOUBLE}, #{totalcost,jdbcType=DOUBLE}, ",
        "#{totalprofit,jdbcType=DOUBLE}, #{netprofit,jdbcType=DOUBLE}, ",
        "#{basicpes,jdbcType=DOUBLE}, #{dilutedpes,jdbcType=DOUBLE})"
    })
    int insert(TLrb record);

    @InsertProvider(type=TLrbSqlProvider.class, method="insertSelective")
    int insertSelective(TLrb record);

    @SelectProvider(type=TLrbSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ExchangeID", property="exchangeid", jdbcType=JdbcType.VARCHAR),
        @Result(column="StockCode", property="stockcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="OrgName", property="orgname", jdbcType=JdbcType.VARCHAR),
        @Result(column="NoticeDate", property="noticedate", jdbcType=JdbcType.VARCHAR),
        @Result(column="BeginDate", property="begindate", jdbcType=JdbcType.VARCHAR),
        @Result(column="EndDate", property="enddate", jdbcType=JdbcType.VARCHAR),
        @Result(column="ReportYear", property="reportyear", jdbcType=JdbcType.VARCHAR),
        @Result(column="MergeType", property="mergetype", jdbcType=JdbcType.VARCHAR),
        @Result(column="ReportSource", property="reportsource", jdbcType=JdbcType.VARCHAR),
        @Result(column="TotalIncoming", property="totalincoming", jdbcType=JdbcType.DOUBLE),
        @Result(column="IncomingPart", property="incomingpart", jdbcType=JdbcType.DOUBLE),
        @Result(column="TotalCost", property="totalcost", jdbcType=JdbcType.DOUBLE),
        @Result(column="TotalProfit", property="totalprofit", jdbcType=JdbcType.DOUBLE),
        @Result(column="NetProfit", property="netprofit", jdbcType=JdbcType.DOUBLE),
        @Result(column="BasicPES", property="basicpes", jdbcType=JdbcType.DOUBLE),
        @Result(column="DilutedPES", property="dilutedpes", jdbcType=JdbcType.DOUBLE)
    })
    List<TLrb> selectByExample(TLrbExample example);

    @UpdateProvider(type=TLrbSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TLrb record, @Param("example") TLrbExample example);

    @UpdateProvider(type=TLrbSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TLrb record, @Param("example") TLrbExample example);
}