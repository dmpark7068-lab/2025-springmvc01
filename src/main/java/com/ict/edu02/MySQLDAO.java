package com.ict.edu02;

public class MySQLDAO implements DAO{
	public MySQLDAO() {
		System.out.println("MySQL 생성자");
	}
	@Override
	public void play() {
		System.out.println("MySQL 메서드");
		
	}

}
