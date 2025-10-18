package com.ict.edu01;

public class OracleDAO implements DAO{
	public OracleDAO() {
		System.out.println("오라클생성자");
	}
	@Override
	public void play() {
		System.out.println("오라클메서드");		
	}

}
