package com.spring.design.strategy.fly;

public class FlyNoway implements Fly {

	@Override
	public void fly() {
		System.out.println("날지 못한다."); // 날지 못한다 출력
	}

}
