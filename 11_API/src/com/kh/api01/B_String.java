package com.kh.api01;

import java.util.StringTokenizer;

// 아 스트링 객체가 java.lang에 만들어져 있고 
// 그걸 가져다가 새 객체도 만들고, 안에 메서드도 가져다 쓰는거군
public class B_String {
	
	public void method01() {
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// String 클래스에 toString 메서드가 오버라이딩 되어 있음!
		// -> 실제 담긴 문자열을 반환하도록
		
		// false(주소값 비교라서)
		System.out.println(str1 == str2);
		
		// String 클래스에 equals 메서드는 이미 오버라이딩 되어 있음
		// -> 주소값 비교가 아닌 담긴 문자열을 비교하도록
		System.out.println(str1.equals(str2));
		
		// String 클래스에 hashCode 이미 오버라이딩 되어 있음
		// -> 주소값이 아닌 문자열을 가지고 만든 해시코드
		System.out.println(str1.hashCode()); // 주소값을 보고싶으면.. 사실 주소값은 아님..
		System.out.println(str2.hashCode()); // 문자열을 가지고 만든 해시코드
		
		// -> 주소값을 가지고 만든 해시코드
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		//--------------------------------------------------------
		
		
		// 2. 문자열을 리터럴 값으로 생성
		System.out.println("-----------------");
		
		// 리터럴 제시 시 상수풀(String Pool) 영역에 올라감
		// String Poll 특징 : 동일한 문자열을 가질 수 없다.
		String str3 = "hello";
		String str4 = "hello";
		
		System.out.println(str3);
		System.out.println(str4);
				
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3 == str4); // 주소값이 같다. 하나의 메모리 공간 바라본다.
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		// String 클래스 == 불변클래스(변하지 않는 클래스)
		// 변경이 가능하지만 수정되는 개념이 아니라 새로 생성하여 교체하는 개념
		
		str4 = "hi";
		System.out.println(System.identityHashCode(str4));
		
		// 변경하는 순간 기존의 문자열 자리에서 변경되는 것이 아닌
		// 새로운 곳을 참조하도록 함(새로운 주소값 부여받음 == 주소값 변경)
		
		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		
		str4 = "hello";
		System.out.println(System.identityHashCode(str4));
		
		
	}
	
	public void method02() {
		String str1 = "Hello World";
		
		// 메소드명(매개변수) : 반환형
		
		// 1. 문자열.charAt(int index) : char 로 반환
		//  : 문자열에서 전달받은 index 위치의 문자만을 추출해서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		
		// 2. 문자열.concat(String str) : String
		//  : 문자열과 전달된 또다른 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!"); // 새로운 주소값으로 객체 새로 만들어 리턴
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!"; // 상수처리
		System.out.println("str3 : " + str3);
		
		// str2와 str3에 담긴 문자열은 일치하나 담겨있는 주소값은 다르다.
		System.out.println("str2와 str3 일치? : " + (str2 == str3));
		
		
		// 3. 문자열.equals(Object obg) : boolean
		//  : 문자열과 전달된 또다른 문자열을 가지고 주소값 비교가 아닌 실제 문자열 값을 가지고 동등 비교
		System.out.println("str2와 str3 일치? : " + (str2.equals(str3)));
		
		
		// 4. 문자열.contain(CarSequence s) : boolean
		System.out.println("str1에 Hello라는 문자열 포함? : " + str1.contains("Hello"));
		System.out.println("str1에 Bye라는 문자열 포함? : " + str1.contains("Bye"));
		
		
		// 5. 문자열.length() : int
		//  : 문자열의 길이를 반환하는 메서드
		System.out.println("str1의 길이 : " + str1.length());
		
		
		// 6. 문자열.substring(int beginIndex) : String
		//  : 문자열의 beginIndex 위치브터 끝까지 문자열 추출해서 리턴
		
		//	& 문자열 substring(int beginIndex, int endIndex) : String
		//  : 문자열의 beginIndex 위치부터 (endIndex - 1)위치까지 문자열 추출해서 리턴
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0, 4));
		String s = "반갑습니다.";
		System.out.println(s.substring(2));
		
		// 7. 문자열.replace(char oldChar, char newChar) : String
		//  : 문자열에서 oldChar 문자를 newChar 문자로 변환 후 새 문자열 리턴
		String str4 = str1.replace('l', 'c'); 
		System.out.println("str4 : " + str4);
		System.out.println("str1 : " + str1); // str1에는 영향 없음
		
		
		
		// 8. 문자열.toUpperCase() : String
		//  : 문자열을 대문자로 변경한 새 문자열 리턴
		//  & 문자열.toLowerCase() : String
		//  : 문자열을 소문자로 변경한 새 문자열 리턴
		String str5 = str1.toUpperCase();
		System.out.println("str5(Upper) : " + str5);
		System.out.println("Lower : " + str1.toLowerCase());
		System.out.println(str1);
//		사용 예)
//		System.out.println("계속하시겠습니까?(y/n)");
//		char cha = new java.util.Scanner(System.in).next().toUpperCase().charAt(0);
		
		
		// 9. 문자열.trim() : String
		//  : 문자열 '앞 뒤' 공백을 제거시킨 새 문자열 리턴
		String str6 = "   JA    VA    ";
		System.out.println(str6.trim());
		
		
		// 10. 문자열.toCharArray() : char
		char[] arr = str1.toCharArray(); //배열이랑 같이써야하네
		
		System.out.println(arr[0]);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 인덱스 : " + arr[i]);
		}
		
//		for(char ch1 : arr) { // 배열에 담긴 자료형이 char라서
//			System.out.println(ch1);
//		}
		
		
		// 11. static valueOf(char[] data) : String
		System.out.println(String.valueOf(arr)); // 10번 다시 조각맞추기
		// 다른 타입을 String으로
		
		
	}
	
	public void method03() {
		String str =  "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// 구분자를 기준으로 문자열을 분리시키는 방법
		
		
//		// 방법1. 분리된 문자열을 String[] 배열에 차례로 담고자 할 때
//		// 		 String 클래스에서 제공하는 split 메소드 사용
//		// 		 문자열.split(구분자) : String[]
//		
//		String[] arr = str.split(",");
//		System.out.println("배열의 길이 : " + arr.length); // 배열 길이는 아무것도 안들어 있어도 1이 나온다. 자기자신을 반환하기 때문
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		for(String str : arr) {
//		}
		
		
		// 방법2. 분리된 문자열을 각각 토큰으로 관리하고자 할 때(토큰: 문자열 하나하나)
		// 		 java.util.StringTokenizer 클래스 이용
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println(stn.countTokens());
		
		
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken()); // 토큰은 꺼내면 사라진다. 담아둬야 안사라짐
		
		System.out.println(stn.countTokens());
		
//		System.out.println(stn.nextToken()); // NoSuchElementException 예외 발생(더 이상 토큰이 없습니다.)
		
		
		// 반복하여 처음부터 끝까지 출력하는 방법
		// 1.
		//int count = stn.countTokens();
		//for(int i = 0; i < count++; i++) {
		//	System.out.println(stn.nextToken());
		//}
		
		// 2.
		//while(stn.hasMoreTokens()) {
		//	System.out.println(stn.nextToken());
		//}

		
				
		
	}

}