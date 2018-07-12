package com.spring.basic.lombok.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.basic.lombok.bean.Phone;

@RestController
public class PhoneCtrl {
	
	@GetMapping("/getPhone")
	public void getPhone(HttpServletRequest request, HttpServletResponse response) {
		//Phone phone = new Phone(1L);
		Phone phone = Phone.create(1L);
		
		System.out.println(phone);
	}

}
