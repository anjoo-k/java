package com.kh.api01;

public class A_Math {
	
	public void method01() {
		// java.lang.Math
		
		// 상수필드
		System.out.println("파이 : " + Math.PI);
		
		// 절대값을 알고자 할 때 : abs
		int num1 = -10;
		System.out.println("절대값 : " + Math.abs(num1));
		
		// 올림 : ceil -> int로 올려서 표현 할 때 double로 바꿔줌
		double num2 = 4.649;
		System.out.println("올림 : " + Math.ceil(num2));
		
		// 반올림 : round
		System.out.println("반올림 : " + Math.round(num2));
		
		// 버림 : floor
		System.out.println("버림 : " + Math.floor(num2));
		
		// 가장 가까운 정수 값을 알아낸 후 실수형 반환 : rint
		System.out.println("가장 가까운 정수값 : " + Math.rint(num2));
		
		// 제곱근(루트) : sqrt
		System.out.println("4의 제급근 : " + Math.sqrt(16));
		
		// 제곱 : pow
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
		
		/*
		// Math m = new Math(); 만들 수 없음
		// Why? 생성자 프라이빗
		// 내부 값, 메서드들 모두 static
		 * 
		 * *Math 특징
		 * 1. 모든 필드가 상수필드, 모든 메소드 static 메소드
		 * 2. 생성자는 private => 생성 못하게 막아둠
		 *  
		 *  ** Math처럼 한번만 메모리 영역에 올려놓고 재사용하는 개념
		 *     => 싱글톤 패턴
		 *  
		 *  
		*/
		
		
		
		/* round, rint 다른 이유 : 반올림하면 1.49999는 2가 되는데, rint하면 1이 된다.
		public void Ex_3() {
			
			      System.out.println("rint(1.5) = " + Math.rint(1.5));
			      System.out.println("rint(1.499999) = " + Math.rint(1.499999));
			      System.out.println("round(1.5) = " + Math.round(1.5));
			      System.out.println("round(1.499999) = " + Math.round(1.499999));	   
		}
		
		public void Ex_4() {
			  
			      System.out.println("rint(2.5) = " + Math.rint(2.5));
			      System.out.println("rint(1.5) = " + Math.rint(1.5));
			      System.out.println("round(2.5) = " + Math.round(2.5));
			      System.out.println("round(1.5) = " + Math.round(1.5));
		}
		
		*/
		
	}

}
