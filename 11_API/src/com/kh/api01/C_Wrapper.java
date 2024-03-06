package com.kh.api01;

public class C_Wrapper {
	
	/**
	 *  * Wrapper 클래스           원시타입 저장할 수 있는 클래스
	 *  : 기본 자료형을 객체로 포장해 줄 수 있는 클래스가 래퍼클래스이다.
	 *  
	 *  	기본자료형     <-->    Wrapper클래스[겍체]
	 *  	boolean				Boolean
	 *  	char				Char
	 *  	byte				Byte
	 *  	short				Short
	 *  	int					Int
	 *  	long				Long
	 *  	float				Float
	 *  	double				Double
	 *  
	 *  => 기본자료형을 객체로 표현해야하는 경우
	 *    - 메소드 호출해줄 때
	 *      :메소드의 매개변수로 기본자료형이 아닌 객체타입만 요구될 때
	 *    - 다형성을 적용시키고 싶을 때  
	 *  
	 */
	public void method01() {
		// Boxing : 기본자료형 -> Wrapper클래스 자료형
		int num1 = 10;
		int num2 = 15;
		
		// System.out.println(num1.equals(num2));
		
		
		// 1. 객체생성구문 이용
		Integer i1 = new Integer(num1); // num1 => i1
		Integer i2 = new Integer(num2); // num2 => i2
		
		System.out.println(i1); // 주소값이 아닌 이유: Integer 안의 toString은 오버라이딩 되어 있다
		System.out.println(i2); 
		
		System.out.println(i1.equals(i2));
		
		// 두 값을 비교해서 앞쪽이 크면 1 반환, 뒤쪽이 크면 -1 반환, 같으면 0 반환
		System.out.println(i1.compareTo(i2));
		
		
		// 2. (AutoBoxing) 객체 생성 하지 않고 곧바로 대입하는 방법
		Integer i3 = num1;
		System.out.println(i3);
		
		// 객체생성을 통해서 반드시 변환해야하는 경우
		// -> 문자열을 Integer 타입으로 변환하고 싶을 때
		Integer i4 = new Integer("123"); // "123" -> 123(숫자로 읽는다)
		System.out.println(i4);
		
		
		
		
		
		
		
		// UnBoxing : Wrapper클래스 자료형 -> 기본자료형
		
		// 1. 해당 Wrapper 클래스에서 제공하는 xxxValue() 메소드 이용
		int num3 = i3.intValue(); // i3 -> num3
		int num4 = i4.intValue();
		
		// 2. (AutoBoxing) 메소드 사용하지 않고 바로 대입하는 방법
		int num5 = i1; // toString이 뭐라구여..?
		
		System.out.println("=================");
		
		
		
		// 기본자료형 < -- > String
		String str1 = "10";
		String str2 = "15.5";
		
		System.out.println(str1 + str2); // 문자열로 작업
		
		// 1. String -> 기본자료형
		//	    "10" -> 10
		// 	  "15.5" -> 15.5
		// 해당 Wrapper클래스.parsexxx() 사용
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		System.out.println(i + d);

		
		// 2. 기본자료형 -> String
		//	       10 -> "10"
		// 	     15.5 -> "15.5"
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		
		
		
		
	}
	

}
























