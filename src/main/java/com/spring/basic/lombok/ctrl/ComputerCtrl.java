package com.spring.basic.lombok.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.basic.lombok.bean.Computer;

import lombok.extern.slf4j.Slf4j;

@RestController
public class ComputerCtrl {
	
	private static final Logger logger = LoggerFactory.getLogger(ComputerCtrl.class);
	
	@GetMapping("getComputer1")
	public void getComputer1(HttpServletRequest request, HttpServletResponse response) {
		Computer computer = new  Computer();
		computer.foo();
		logger.info("Computer1 : {}", "computer1");
	}
	
	@GetMapping("getComputer2")
	public void getComputer2(HttpServletRequest request, HttpServletResponse response) {
		Computer computer = new  Computer();
		computer.foo();
		logger.info("Computer2 : {}", "computer2");
	}

}
