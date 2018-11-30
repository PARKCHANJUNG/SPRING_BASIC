package com.spring.basic.lombok.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCtrl {

	@Test
	public void getUser(HttpServletRequest request, HttpServletResponse response) {
		//ERROR -> @NonNull때문에1
		//User user = new User();
	}
}
