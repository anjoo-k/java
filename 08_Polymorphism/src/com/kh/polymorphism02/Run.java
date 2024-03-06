package com.kh.polymorphism02;

public class Run {

	public static void main(String[] args) {
		
//		System.out.println("1. 부모타입 레퍼런스(참조변수)로 부모객체를 다루는 경우");
//		Parent p1 = new Parent();
//		p1.printParent();
//		//p1 참조변수로 Parent에만 접근 가능
		
//		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우"); *****************************************
//		Child01 c1 = new Child01();
//		c1.printParent();
//		c1.printChild01();
//		// ((Parent)c1).printParent(); 라는 의미
//		// c1 참조변수로 Child01, Parent 둘 다 접근 가능
//		// (Parent 접근 시 자동으로 형변환 된채로 진행)
		
//		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루는 경우(다형성)");
//		Parent p2 = /*(Parent)*/new Child01(); // 자동 형변환 됨(업캐스팅)
//		p2.printParent();
//		((Child01)p2).printChild01(); // 강제형변환 하면 호출 가능!!(다운캐스팅)
//		// p2 레퍼런스로 Parent에 접근은 가능하지만
//		// Child01에 접근하고자 한다면 강제 형변환을 통해서만 가능
		
		
		
		/*
		 * "상속 구조" 의 클래스 간에 형변환 가능
		 * 
		 * 1.Upcasting
		 *   자식 타입 -> 부모 타입으로 형변환
		 *   자동형변환
		 *   ex) 자식.부모메서드();
		 *       부모 = 자식객체;
		 * 
		 * 2.DownCasting
		 *   부모 타입 -> 자식타입으로 형변환
		 *   강제형변환
		 *   ex) ((자식)부모).자식메서드();
		 *   
		 */
		
		
		
		// * 다형성의 정의
		//  - 부모타입으로부터 파생된 여러 타입의 자식 객체를 부모클래스 타입 하나로 다룰 수 있는 기술
		// * 다형성을 쓰는 목적(장점)
		
		//  - 다형성 사용 전:
		//    Child01 객체 2개, Child02 객체 2개 관리해야
		Child01[] arr1 = new Child01[2];
		arr1[0] = new Child01(1, 2, 3);
		arr1[1] = new Child01();
		
		Child02[] arr2 = new Child02[2];
		arr2[0] = new Child02(1, 2, 3);
		arr2[1] = new Child02(1, 2, 3);
		//----------------------------------
		//  - 다형성 적용 후:
		Parent[] arr = new Parent[4];
		arr[0] = new Child01(1, 2, 3);
		arr[1] = new Child02(1, 2, 3);
		arr[2] = new Child01(4, 5, 6);
		arr[3] = new Child02(4, 5, 6);
		// 하나의 부모타입만으로 여러 자식객체를 받을 수 있음 -> 편리, 코드 길이 감소
		
//		((Child01)arr[0]).printChild01();
//		((Child02)arr[1]).printChild02();
//		((Child01)arr[2]).printChild01();
//		((Child02)arr[3]).printChild02();
		
		
		/* 
		 * instanceof 연산자 -> 연산 결과 true/false로 반환
		 * 현재 레퍼런스가 실제로 어떤 클래스 타입을 참조하는지 확인할 때 사용
		 */
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Child01) { // Child01 메모리공간 사용할 수 있니?
											 // 해당 참조변수가 실제 Child01을 참조하고 있니?
											 // arr[i]가 Child01 공간 사용가능해?
				((Child01)arr[i]).printChild01();
			} else {
				((Child02)arr[i]).printChild02();
			}
		}
		
		

	}
}
