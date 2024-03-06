package com.kh.practice01;

import java.util.Scanner;

public class TokenMenu {
	
	Scanner sc;
	private TokenController tc;
	
	public TokenMenu() {
		super();
		this.sc = new Scanner(System.in);
		this.tc = new TokenController();
	}
	
	public void mainMenu() {
		
		while(true) {
			System.out.print("1. 지정 문자열 \n2. 입력 문자열 \n9. 프로그램 끝내기\n메뉴 번호: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				this.tokenMenu();
				break;
			case 2:
				this.inputMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다 .다시 입력하세요");
				break;
			}
			
		}
		
		
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		
		System.out.println("토큰 처리 전 글자: " + str);
		System.out.println("토큰 처리 전 개수: " + str.length());
		
		// String strAfter = tc.afterToken(str); 이렇게 담아서 써줘도 된다

		System.out.println("토큰 처리 후 글자: " + tc.afterToken(str));		
		System.out.println("토큰 처리 전 개수: " + tc.afterToken(str).length());
		
		System.out.println("모두 대문자로 변환: " + tc.afterToken(str).toUpperCase());
		
	}
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요: ");
		String str = sc.next();
		
		str = tc.firstCap(str);
		System.out.println("첫 글자 대문자: " + str);
		
		
		System.out.print("찾을 문자를 입력하세요: ");
		char ch = sc.next().charAt(0);
		
		System.out.println(ch + "문자가 들어간 갯수: " + tc.findChar(str, ch));
		
	}

}
