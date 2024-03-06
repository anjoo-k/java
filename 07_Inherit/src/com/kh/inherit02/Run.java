package com.kh.inherit02;

/**
 *  * 상속의 장점
 *    - 적은 양의 코드로 새로운 클래스 작성 가능
 *    - 코드를 공통으로 관리, 코드의 추가나 변경 용이: 프로그램 생산성, 유지보수성 좋아짐
 *    
 *  * 상속의 특징
 *    - 클래스간의 상속에 있어서는 다중상속 불가(즉, 부모는 하나)
 *    - 부모클래스에 정의되어 있는 protected 필드는 자식클래스에서 직접접근 가능
 *    - 자식객체는 부모클래스에 있는 메소드를 마치 내 것처럼 호출 가능
 *      + 오버라이딩 : 부모클래스에 정의된 기능을 자식클래스에서 수정 가능
 *    - 명시되어있지 않지만, 모든 클래스(자바에서 제공하는, 직접 만든 클래스)는 Object 클래스의 후손!
 *      -> Object 클래스에 있는 메소드를 마음대로 호출 가능
 *      -> 오버라이딩해 재정의 가능      
 */
public class Run {
	public static void main(String[] args) {
		Tv t = new Tv("엘지", "t-01", "엄청얇은티비", 3500000, 65);
		Desktop d = new Desktop("삼성", "d-01", "엄청고사양데스크탑", 2600000, true);
		SmartPhone s = new SmartPhone("애플", "p-01", "아이폰", 1300000, "KT");
		/*
		 * 새 클래스의 공통적인 필드와 메소드가 존재
		 * 이런 중복된 코드를 따로 "부모" 클래스로 한번만 정의해두면 중복된 코드 줄일 수 있음
		 *  => 수정과 같은 유지보수 요청이 들어왔을 때 하나하나 찾아서 수정할 필요 X
		 *     정의해둔 부모클래스만 수정하면 전체적으로 반영
		 */
		
		
		System.out.println(t.information());
		System.out.println(d.information());
		System.out.println(s.information()); // 우왕
	
	}

}
