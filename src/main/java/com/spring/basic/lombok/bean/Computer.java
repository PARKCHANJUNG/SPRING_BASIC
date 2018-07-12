package com.spring.basic.lombok.bean;

import lombok.Synchronized;

public class Computer {

	private final Object readLock = new Object();

	@Synchronized
	public static void hello() {
		System.out.println("world");
	}

	@Synchronized
	public int answerToLife() {
		return 42;
	}

	@Synchronized("readLock")
	public void foo() {
		System.out.println("bar");
	}

}
