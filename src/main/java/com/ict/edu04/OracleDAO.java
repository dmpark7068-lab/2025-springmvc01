package com.ict.edu04;

import org.springframework.stereotype.Component;

//@Component("oracleDAO")
@Component("dao")
public class OracleDAO implements DAO{
	
	public OracleDAO() {
		System.out.println("Oracle DAO 생성자");
	}
	@Override
	public void play() {
		System.out.println("Oracle DAO 메서드");
		
	}

}
