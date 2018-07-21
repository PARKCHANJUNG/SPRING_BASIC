package com.spring.basic.sample.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.basic.sample.dao.SampleDao;

@RestController
public class SampleCtrl {
	
	@Autowired
	private SampleDao sampleDao;
	
	@GetMapping("sample")
	public String sample(HttpServletRequest request, HttpServletResponse response) {
		sampleDao.getSample();	
		return "HELLO! SAMPLE.";
	}

}
