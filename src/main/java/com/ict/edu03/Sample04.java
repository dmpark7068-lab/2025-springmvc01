package com.ict.edu03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Sample04 {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("com/ict/edu03/config.xml");
		
		MyProcess myProcess = (MyProcess)context.getBean("myProcess");
		myProcess.prn();
		
		MyProcess myProcess2 = (MyProcess)context.getBean("myProcess2");
		myProcess2.prn();
	}
}
