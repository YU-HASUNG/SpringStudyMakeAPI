package com.helloworld.quickstart.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface QuickMapper {

	HashMap<String,Object> findById(HashMap<String,Object> paramMap);

	void registerItem(HashMap<String,Object> paramMap);
}
