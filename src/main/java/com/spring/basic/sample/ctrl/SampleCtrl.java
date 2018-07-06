package com.spring.basic.sample.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/sample")
public class SampleCtrl {
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String sample(HttpServletRequest request, HttpServletResponse response) {
		return "HELLO! SAMPLE.";
	}

}
