package com.spring.design.strategy.animal;

import com.spring.design.strategy.cry.Cry;
import com.spring.design.strategy.fly.Fly;

public abstract class Animal {

	protected Fly fly;
	protected Cry cry;

	public Animal() { // Animal 생성자

	}

	public void performFly() { // Fly 인터페이스에 연결된 객체의 fly() 함수 실행
		fly.fly();
	}

	public void performCry() { // Cry 인터페이스에 연결된 객체의 Cry() 함수 실행
		cry.cry();
	}

	public void move() { // move() 함수 구현
		System.out.println("움직인다."); // 움직인다 출력
	}

	public abstract void display(); // display() 함수 추상화

}
