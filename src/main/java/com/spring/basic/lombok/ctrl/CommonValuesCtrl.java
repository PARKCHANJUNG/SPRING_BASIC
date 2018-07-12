package com.spring.basic.lombok.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.basic.lombok.bean.CommonValues;

@RestController
public class CommonValuesCtrl {
	
	@GetMapping("/getCommonValues")
	public void getCommonValues(HttpServletRequest request, HttpServletResponse response) {
		CommonValues commonValues1 = new CommonValues("0234521", 01045433433, "CHANJUNG");
		
		CommonValues commonValues2 = commonValues1.withName("PARK");
		
		//commonValues.setNumber(""); //ERROR
		
		System.out.println(commonValues1);
		System.out.println(commonValues2);
	}

}
