package com.spring.design.strategy.animal;

import com.spring.design.strategy.cry.BirdCry;
import com.spring.design.strategy.fly.FlyWithWings;

public class Eagle extends Animal {

	public Eagle() { // Eagle 객체 생성자
		cry = new BirdCry(); // Animal의 cry 변수에 Cry 인터페이스의 BirdCry를 연결한다.
		fly = new FlyWithWings(); // Animal 의 fly 변수에 Fly 인터페이스의 FlyWithWings를 연결한다.
	}

	public void display() { // display 함수 구현
		System.out.println("독수리"); // 독수리 출력
	}

}
