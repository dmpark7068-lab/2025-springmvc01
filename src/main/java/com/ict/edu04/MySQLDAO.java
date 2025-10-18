package com.ict.edu04;

import org.springframework.stereotype.Component;

@Component("mySQLDAO")
//@Component("dao")
public class MySQLDAO implements DAO{
	
	public MySQLDAO() {
		System.out.println("MySQL DAO 생성자");
	}
	@Override
	public void play() {
		System.out.println("MySQL DAO 메서드");		
	}

}
