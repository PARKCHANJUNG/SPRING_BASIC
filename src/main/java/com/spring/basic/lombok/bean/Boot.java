package com.spring.basic.lombok.bean;

import java.util.List;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

/**
 * branch - develop
 * @author parkchanjung
 *
 */
@Builder
@ToString
public class Boot {
	
	private String id;
	private String name;
	private String phone;
	
	@Builder.Default // -> 기본값 설정 
	private Integer sex = 0;
	
	@Singular("addStr") // -> 컬렉션을 생성할 수 있음.
	private List<String> values;

}
