package com.spring.basic.lombok.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RestController;

import com.spring.basic.lombok.bean.Member;

@RestController
public class MemberCtrl {
	
	public void getMember(HttpServletRequest request, HttpServletResponse response) {
		//Member member = new Member("TEST");
		Member member = Member.create("TEST", "CHANJUNG");
		
		member.setPhone("01099991234");
		System.out.println(member);
	}

}
