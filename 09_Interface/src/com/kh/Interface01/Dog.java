package com.kh.Interface01;

public class Dog implements Animal, Baby { //컴파일오류 -> 런타임오류 -> 논리오류

	@Override
	public void move() {
		System.out.println("촐랑촐랑 뜁니다.");
		
	}

	@Override
	public void eat() {
		System.out.println("찹찹찹 먹습니다.");
		
	}

	@Override
	public void makeSound() {
		System.out.println("멍멍!");
		
	}

	
	
	
	

}
