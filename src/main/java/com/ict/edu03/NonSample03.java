package com.ict.edu03;

public class NonSample03 {
	public static void main(String[] args) {
		MyProcess myProcess = new MyProcess();
		myProcess.prn();
		System.out.println();
		
		MyProcess myProcess2 = new MyProcess();
		myProcess2.setName("둘리");
		myProcess2.prn();
		System.out.println();
		
		MyProcess myProcess3 = new MyProcess();
		myProcess3.setAge(26);
		myProcess3.prn();
		System.out.println();

		MyProcess myProcess4 = new MyProcess();
		myProcess4.setName("호돌이");
		myProcess4.setAge(34);
		myProcess4.prn();
		System.out.println();
		
		MyProcess myProcess5 = new MyProcess("공실이", 1008);
		myProcess5.prn();
		System.out.println();
		
		
	}
}
