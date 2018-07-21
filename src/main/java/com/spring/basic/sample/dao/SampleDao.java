package com.spring.basic.sample.dao;

import org.apache.ibatis.annotations.Mapper;

import com.spring.basic.sample.bean.Sample;

@Mapper
public interface SampleDao {
	
	public Sample getSample();

}
