package com.spring.basic.lombok.bean;

import lombok.AllArgsConstructor;
import lombok.NonNull;

//@NoArgsConstructor // -> 파라미터가 없는 기본생성자를 만듬.
@AllArgsConstructor // -> 모든 필드 값을 파라미터로 받는 생성자를 만듬.
public class User {

	@NonNull // -> NULL 아니어야함. NULL이 들어올 경우 NullPointException 던짐.
	private String id;
	private String name;
	private Integer age;
	
}
