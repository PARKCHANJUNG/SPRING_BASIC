package com.spring.basic.lombok.bean;

import lombok.AccessLevel;
import lombok.Value;
import lombok.experimental.Wither;

@Value // -> 필드를 변경할 수 없는 객체를 생성.
public class CommonValues {

	private String usim;
	private Integer number;
	
	@Wither(AccessLevel.PUBLIC) // -> with필드명의 메소드가 생성되는데 변경한 새로운 객체를 만들어줌.
	private String name;
	
}
