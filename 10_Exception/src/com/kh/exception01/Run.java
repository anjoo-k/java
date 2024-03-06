package com.kh.exception01;

import java.io.IOException;
import java.util.Scanner;

public class Run {
	
	/**
	 *  * 에러 종류
	 *   (시스템 에러) 컴퓨터의 오작동으로 발생
	 *    -> 소스코드로 해결 안됨, 심각한 에러
	 *   (컴파일 에러) 소스코드 문법상 오류 = 자바에서 빨간줄로 오류 알려줌(개발자 실수)
	 *    -> 발견과 해결 쉽다
	 *   (런타임 에러) 코드 상 문제 x, 프로그램 실행 중 발생
	 *    -> 사용자 실수 or 개발자가 예측 가능하나, 처리하지 않은 에러
	 *   (논리 에러) 문법적으로 문제 없고, 실행 시에도 문제 없으나 프로그램 의도와 맞지 않는 동작이나 결과가 도출
	 *   
	 *   
	 *  * "예외" => Exception
	 *   -> 컴파일에러, 런타임에러, 논리에러 같은 개발자가 예측, 수정할 수 있는 에러를 가지고 작업
	 *   
	 *   
	 *  * "예외" 발생했을 경우,
	 *    이를 처리하는 방법을 "예외처리" 라고 함 
	 *    
	 *    
	 *  * 예외처리 하는 목적
	 *   : 예외가 실행되었을 경우 프로그램 비정상적 종료 방지
	 *    
	 *  * 예외처리 방법
	 *  1. try ~ catch 문 이용
	 *  2. throw 이용, (해당 예외를 호출한 곳으로) 예외 넘김(위임한다)  
	 *   
	 */
	public static void main(String[] args) {
		RunException ex = new RunException();
//		ex.method01();
//		ex.method02();
//		ex.method03();
		
//		Scanner sc = new Scanner(System.in);
//		try {
//			ex.method04();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
		
		
		
		// finally : try-catch 결과와 상관없이 모든 과정이 끝났을 때 무조건 실행하는 구문
		
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
		} catch(ArithmeticException e) {
			e.printStackTrace();
		} finally { 
			sc.close(); // 닫아줘야 한다. Stream 을 열어서 서버랑 연결한 후 사용 끝나면 닫아줘야...?
		}
		
		// try-with-resources 구문 : 스캐너 sc.close() 안해줘도 저절로 닫아주는 구문
		try (Scanner sc1 = new Scanner(System.in)) {
			sc.next();
		} catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
		
		
	}

}
