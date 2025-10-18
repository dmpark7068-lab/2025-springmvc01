package com.ict.edu04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Sample05 {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("com/ict/edu04/config.xml");
		
		MyService myService = (MyService)context.getBean("myService");
		myService.biz();
	}
}
