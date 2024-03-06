package com.kh.Test240213;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 홀수 짝수 출력하기
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.print("홀수:" + i + " ");
			}
		}
		
		System.out.println();
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				System.out.print("짝수:" + i + " ");
			}
		}
		System.out.println();
		
		
		
		// 랜덤으로 숫자 5개 입력받아 출력하기
		
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = (int)(Math.random() * 100 + 1); // 괄호 순서가 이렇게 중요하다고..
			System.out.print("랜덤 수 5개:" + arr[i] + " ");
		}
		
		System.out.println();
			
		// 랜덤으로 숫자 10개 입력받아 짝수만 출력하기
		
		int[] arr2 = new int[10];
		for(int i = 0; i < 5; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
			if(arr[i] % 2 == 0) {
				System.out.print("랜덤 수 10개 중 짝수:" + arr[i] + " ");
			}
			
		}
		
		System.out.println();
		
		// 문자열 입력받아 문자열 한글자씩 출력하기
		
		System.out.print("문자열 입력:");
		String str = sc.next();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print(ch + " ");
		}
		
		System.out.println();
		
		
		// 문자열(영단어) 입력받아 문자열 첫글자 대문자로 변경하기
		
		System.out.print("문자열 입력2:");
		String str2 = sc.next();
		String str3 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
		System.out.println(str3);		
		System.out.println();
		
	
	
	
	// 오버라이딩, 오버로딩에 대한 문제
		// 오버라이딩: 부모 메서드를 자식이 다시 쓴다. 오버라이딩된 메서드가 항상 우선순위를 가진다.
		// 오버로딩: 생성자의 매개변수를 달리해서 다양한 값을 받을 수 있도록 한 것. 
	
	// 상속 관계에 있는 클래스 두개를 제공해 주고 오버라이딩된 메소드 출력 시 어떤 결과가 출력되나?
		// 자식클래스의 결과가 출력된다. 제일 마지막에 오버라이된 메소드가 항상 우선순위
	
	// 클래스 하나가 주어진 상태에서 해당 클래스를 상속받는 새로운 클래스 만들고 다음과 같은 결과가 되도록 오버라이딩 해라
		// 
	
	// 똑같은 이름의 메소드 10개 제공, 에러가 발생하는 이유를 기술하라
	
	// void sample(int n); -> sample(3);, sample(5, 7.0); : 해당 코드가 문제가 되지 않도록 코드를 수정하세요.
	
	// 배열 -> 길이가 정해져 있음 : 배열의 범위를 초과하는 코드 조심
	
	// 배열을 제공, 모든 객체를 출력해라
	
	// 다형성 -> 다운캐스팅 조심
	
	// Human을 담을 수 있는 ArrayList 1개 생성하고 임의로 Human 객체 5개를 담아라.
	// 단, 해당 List에는 Human객체만 담을 수 있게 구성하세요. : 제네릭
	ArrayList<Human> arrList = new ArrayList<Human>(5);
	
	arrList.add(new Human());
		
	
	// ArrayList<Human> arr = new ArrayList<>();
	// arr.add(new Human("최지원"));
	// arr.add("김수민"); : 제네릭은 Human인데 갑분 String 문자열?
	
	// 파일에 내용작성하기, 파일로부터 내용 가져오기
	// 파일에 객체정보 저장하기(직렬화), 파일로부터 객체정보 가져오기(역직렬화) : IO
	
	// udp 또는 tcp에서 클라이언트, 서버 구성 : 네트워크
		// UDP는 상대방이 받았는지 확인하지 않고 보냄, 빠름 (신뢰성 낮음)
		// TCP는 상대방이 받았는지 확인하고 보냄, 느림 (신뢰성 높음)
	
	
	}

}
