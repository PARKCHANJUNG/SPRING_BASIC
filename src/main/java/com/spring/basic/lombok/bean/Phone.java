package com.spring.basic.lombok.bean;

import lombok.Data;
import lombok.ToString;

@Data(staticConstructor = "create")
public class Phone {
	private final Long id;
	private String name;

	@ToString(includeFieldNames = true)
	@Data(staticConstructor = "of")
	public static class Exercise<T> {
		private final String name;
		private final T value;
	}
}
