package com.example.my.dao;

import java.util.List;

import org.apache.ibatis.annotations.SelectProvider;

import com.example.gen.dao.TLrbMapper;
import com.example.gen.dao.TLrbSqlProvider;
import com.example.gen.model.TLrb;
import com.example.gen.model.TLrbExample;

public interface MyTLrbMapper extends TLrbMapper{
	
	@SelectProvider(type=TLrbSqlProvider.class, method="selectByExample")
	List<TLrb> mySelect(TLrbExample example);
}