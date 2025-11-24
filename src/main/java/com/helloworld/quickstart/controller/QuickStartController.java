package com.helloworld.quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.helloworld.quickstart.dto.ItemDto;
import com.helloworld.quickstart.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class QuickStartController {

	@GetMapping("/dummy")
	public String dummy() {
		log.info("dummy");
		return "{}";
	}

	@GetMapping("/dummy2")
	public String dummy2() {
		log.info("dummy2");
		return "dummy2";
	}

	@GetMapping("/member")
	public String getMember(
		@RequestParam("empNo") String empNo,
		@RequestParam("year") String year
	) {
		log.info("empNo: {}", empNo);
		log.info("year: {}", year);
		return "ok";
	}

	@GetMapping("/company/{id}")
	public String getCompany(@PathVariable("id") String id) {
		log.info("id: {}", id);
		return "ok";
	}

	@PostMapping("/item")
	public ResponseDto registerItem(@RequestBody ItemDto item) {
		log.info("item: {}", item);
		ResponseDto responseDto = new ResponseDto();
		responseDto.setMessage("ok");
		return responseDto;
	}
}
