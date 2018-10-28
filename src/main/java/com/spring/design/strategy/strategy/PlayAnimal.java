package com.spring.design.strategy.strategy;

import com.spring.design.strategy.animal.Animal;
import com.spring.design.strategy.animal.Eagle;
import com.spring.design.strategy.animal.Tiger;
import com.spring.design.strategy.animal.Turtle;

/**
 * 참고 : http://hyeonstorage.tistory.com/146
 * 참고 : http://arabiannight.tistory.com/entry/%EC%9E%90%EB%B0%94Java-%ED%8C%A8%ED%84%B4-1%EC%8A%A4%ED%8A%B8%EB%9E%98%ED%8B%B0%EC%A7%80-%ED%8C%A8%ED%84%B4Strategy-Pattern
 * 
 * @author parkchanjung
 *
 */
public class PlayAnimal {

	public static void main(String[] args) { // main 함수 실행

		Animal tiger = new Tiger(); // Animal 클래스를 상속받은 Tiger 객체 생성

		tiger.display(); // Tiger의 display() 함수 실행
		tiger.performCry(); // Tiger의 performCry() 함수 실행
		tiger.performFly(); // Tiger의 performFly() 함수 실행

		System.out.println("------------------");

		Animal eagle = new Eagle(); // Animal 클래스를 상속받은 Eagle 객체 생성

		eagle.display(); // Eagle의 display() 함수 실행
		eagle.performCry(); // Eagle의 performCry() 함수 실행
		eagle.performFly(); // Eagle의 performFly() 함수 실행

		System.out.println("------------------");

		Animal turtle = new Turtle(); // Animal 클래스를 상속받은 Turtle 객체 생성

		turtle.display(); // Turtle의 display() 함수 실행
		turtle.performCry(); // Turtle의 performCry() 함수 실행
		turtle.performFly(); // Turtle의 performFly() 함수 실행
	}

}
