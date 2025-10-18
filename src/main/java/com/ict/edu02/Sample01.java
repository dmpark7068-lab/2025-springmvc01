package com.ict.edu02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Sample01 {
	public static void main(String[] args) {
		// Spring Container 에서 객체(Bean)를 생성하고 관리하낟.
		//Container 가 객체를 생성하고 관리 할 수 있도록 ** 설정 정보를 만들어야 한다.
		// Spring Container => BeanFactory => ApplicationContext(java)
		//                                 => WebApplicationContext(Web)  
		ApplicationContext context = new GenericXmlApplicationContext("com/ict/edu02/config.xml");
		
		// 설정정보에서 필요한 객체를 가져오자
		MyService myService = (MyService)context.getBean("myService");
		myService.biz();		
	}
}
