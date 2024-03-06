package com.kh.Interface02;

public class Run {
	/**
	 * *인터페이스
	 *  - 추상메서드 + 상수필드로만 이루어진 클래스
	 *  - 추상메서드로 이루어져 객체를 직접 생성 X
	 *  - 참조변수 사용은 가능
	 *  
	 *  *추상메서드
	 *  - 미완성된 메서드로 몸통부({})가 구현되어 있지 않은 메서드
	 *  - 무조건 오버라이딩 후 호출 가능
	 *  - 
	 *  
	 */
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(5);
		shapes[1] = new Rectangle(3, 4);
		/*
		 * 배열 또는 컬렉션에서 사용
		 * 처음부터 끝까지 모두 탐색
		 * 해당 배열에 인덱스 값이 하나씩 왼쪽에 있는 값에 대입되어 반복문 진행
		 */
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int num : arr) {
			
		}
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		
		for(Shape shape : shapes) {
			System.out.println("도형의 넓이: " + shape.calculateArea());
		}
		// =
		for(int i = 0; i < shapes.length; i++) {
			Shape shape = shapes[i]; // 얕은복사? 기억났다! 주소만 복사***********************************
			System.out.println("도형의 넓이: " + shape.calculateArea());
		}
		
	}

}
