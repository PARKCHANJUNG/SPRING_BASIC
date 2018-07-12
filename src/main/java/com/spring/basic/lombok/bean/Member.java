package com.spring.basic.lombok.bean;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor(staticName = "create") // -> final or @NonNull 인 필드값만 파라미터를 받는 생성자를 만듬.
@ToString(exclude = "phone")
public class Member {

	private final String id;
	@NonNull
	private String name;
	
	@Getter
	@Setter
	private String phone;
	
}
