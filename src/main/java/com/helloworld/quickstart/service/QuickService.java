package com.helloworld.quickstart.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helloworld.quickstart.dto.ItemDto;
import com.helloworld.quickstart.entity.ItemEntity;
import com.helloworld.quickstart.mapper.QuickMapper;
import com.helloworld.quickstart.repository.ItemRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class QuickService {

	@Autowired
	private QuickMapper quickMapper;

	@Autowired
	private ItemRepository itemRepository;

	public boolean registerItem(ItemDto itemDto) {
		// HashMap<String,Object> paramMap = new HashMap<>();
		// paramMap.put("id",itemDto.getId());
		// paramMap.put("name",itemDto.getName());
		//
		// quickMapper.registerItem(paramMap);

		ItemEntity itemEntity = new ItemEntity();
		itemEntity.setId(itemDto.getId());
		itemEntity.setName(itemDto.getName());

		itemRepository.save(itemEntity);

		return true;
	}

	public ItemDto findItem(String id) {
		HashMap<String,Object> paramMap = new HashMap<>();
		paramMap.put("id", id);

		HashMap<String,Object> response = quickMapper.findById(paramMap);

		ItemDto itemDto = new ItemDto();
		itemDto.setId(response.get("ID").toString());
		itemDto.setName(response.get("NAME").toString());

		return itemDto;
	}

	public ItemDto getItemById(String id) {
		ItemEntity itemEntity = itemRepository.findById(id).get();

		ItemDto itemDto = new ItemDto();
		itemDto.setId(itemEntity.getId());
		itemDto.setName(itemEntity.getName());

		return itemDto;
	}
}
