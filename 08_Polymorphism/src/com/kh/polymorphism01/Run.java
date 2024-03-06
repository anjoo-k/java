package com.kh.polymorphism01;

/**
 * 	   클래스 참조변수      =     new 클래스 생성자;
 * (부모클래스 가능)		      (자식클래스 가능)
 * 실제 어디까지 접근이 가능한가?	  실제 어떤 형태로 메모리가 생성되는가
 * 
 */
public class Run {
	public static void main(String[] args) {
		
//		Cake c1 = new CheeseCake();
//		
//		CheeseCake c2 = new StrawberryCheeseCake();
//		
//		StrawberryCheeseCake c3 = new StrawberryCheeseCake();
//		
//		c1.yummy();
//		c2.yummy();
		
		
		CheeseCake c2 = new CheeseCake();
		Cake c1 = c2;
		
		c1.yummy();
		System.out.println(c2);
		System.out.println(c1);
		
	}

}
