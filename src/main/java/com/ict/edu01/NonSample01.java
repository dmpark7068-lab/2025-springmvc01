package com.ict.edu01;

public class NonSample01 {
	public static void main(String[] args) {		
		// MyService의 생성자를 이용하는 방법 (DI)
		//MyService myService = new MyService(new MySQLDAO());
		//myService.biz();
		
		//MyService myService = new MyService(new OracleDAO());
		//myService.biz();
		
		// MyService의 setter 이용하는 방법 (DI)
		//MyService myService = new MyService();		
		//myService.setDao(new MySQLDAO());
		//myService.biz();
		
		MyService myService = new MyService();
		myService.setDao(new OracleDAO());
		myService.biz();
				
	}	
}
