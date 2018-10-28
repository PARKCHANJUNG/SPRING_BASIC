package com.spring.design.strategy.cry;

public class CryNoWay implements Cry {

	@Override
	public void cry() {
		System.out.println("울지 못한다."); // 울지 못한다 출력
	}

}
