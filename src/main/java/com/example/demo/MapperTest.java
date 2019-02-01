package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.example.gen.dao.TLrbMapper;
import com.example.gen.model.TLrb;
import com.example.gen.model.TLrbExample;
import com.example.my.dao.MyTLrbMapper;

@Service
public class MapperTest implements ApplicationRunner {
	
	@Autowired
	private TLrbMapper tLrbMapper;
	@Autowired
	private MyTLrbMapper myTLrbMapper;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		TLrbExample example = new TLrbExample();
		long size = tLrbMapper.countByExample(example);
		System.out.println(size);
		List<TLrb> objs = tLrbMapper.selectByExample(example);
		objs.forEach(d->System.out.println(d.getStockcode()));
		
		List<TLrb> myobjs = myTLrbMapper.mySelect(example);
		myobjs.forEach(d->System.out.println(d.getOrgname()));
	}

	
	
}
