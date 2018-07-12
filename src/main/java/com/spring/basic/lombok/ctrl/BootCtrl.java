package com.spring.basic.lombok.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.basic.lombok.bean.Boot;

import lombok.extern.java.Log;

@RestController
@Log
public class BootCtrl {
	
	@GetMapping("/getBoot")
	public void getBoot(HttpServletRequest request, HttpServletResponse response) {
		Boot boot = Boot.builder()
				.id("P01")
				.name("CHANJUNG")
				.phone("01054560932")
				.addStr("HAN")
				.addStr("REX")
				.addStr("JUNG")
				.build();
		log.info("TEST");
		System.out.println(boot);
	}

}
