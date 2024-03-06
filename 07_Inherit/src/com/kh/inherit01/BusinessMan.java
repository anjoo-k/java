package com.kh.inherit01;

public class BusinessMan extends Man {
	
	String company;
	String position;
	
	
	public BusinessMan(String company, String position, String name) {
		super(name); // 인자로 문자열 하나를 전달받을 수 있는 부모생성자 : 부모 생성자 부를 때(본인 생성자는 this)
		
		this.company = company;
		this.position = position;
	}
	
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}

}
