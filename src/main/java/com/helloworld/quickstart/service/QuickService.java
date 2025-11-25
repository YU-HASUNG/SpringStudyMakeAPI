package com.helloworld.quickstart.service;

import org.springframework.stereotype.Service;

import com.helloworld.quickstart.dto.ItemDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class QuickService {

	public boolean registerItem(ItemDto itemDto) {
		//TODO DB INSERT
		log.info("service registerItem...");
		return true;
	}
}
