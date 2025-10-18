package com.ict.edu04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyService {
	
	// @Autowired 클래스를 자료형으로 사용하는데 해당 클래스를 자동으로 연결해 주는 역활을 한다.
	// @Qualifier 연결할 클래스 ID 와 변수이름이 다를때 사용
	// 만약에 연결할 클래스 ID 와 변수이름이 같으면 생략 가능
	@Autowired
//	@Qualifier("mySQLDAO")
//	@Qualifier("oracleDAO")	
	private DAO dao;
	
	public void setDao(DAO dao) {
		this.dao = dao;
	}

	public MyService() {
		System.out.println("MyService 기본생성자");
	}
	public MyService(DAO dao) {
		System.out.println("MyService DAO를 받는 생성자");
		this.dao = dao;	
	}
	
	// 실행하고자 하는 메서드
	public void biz() {
		dao.play();
	}
	 
}
