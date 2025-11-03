package com.ict.edu01;

public class MyService {
	// 방법1 - 인터페이스를 사용하지 않은 것
	//OracleDAO oDao = new OracleDAO();
	//MySQLDAO mDao = new MySQLDAO();
	// 실제 실행하고자 하늠 메서드
	//public void biz() {
		//oDao.play(); 
		//mDao.play();
	//}
	
	// 방법2 - 인터페이스 사용
	private DAO dao;
	
	// 2.1 생성자를 이용하는 방법
	public MyService(DAO dao) {
		this.dao = dao; 
	}		
	// 2.2 setter 사용
	public MyService() {		
	}
	
	public void setDao(DAO dao) {
		this.dao = dao;
	}

	public void biz() {
		dao.play(); 		
	}

	public void biz2() {
		dao.play(); 		
	}
	
}

