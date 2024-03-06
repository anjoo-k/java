package com.kh.Test240207;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("========== KH 사이트 ==========");
		
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				this.joinMembership();
				break;
			case 2:
				this.logIn();
				this.memberMenu();
				break;
			case 3:
				this.sameName();
				break;
			case 9:
				System.out.println("프로그램 종료.");
				this.mainMenu();
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}

		}
		

	}
	public void memberMenu() {
		System.out.println("******* 회원 메뉴 ******");
		
		while(true) {
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기 ");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				this.changePassword();
				break;
			case 2:
				this.changeName();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다.");
				this.mainMenu();
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
		

	}
	
	public void joinMembership() {
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String passWord = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		Member mem = new Member(passWord, name);
		
		if(mc.joinMembership(id, mem)) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		} else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
	
	}
	
	public void logIn() {

		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String passWord = sc.nextLine();
			
			// String result = mc.login(id, passWord);  result 로 처리해도 됌
			if(mc.login(id, passWord) != null) {
				String name = mc.login(id, passWord);
				System.out.println(name + "님, 환영합니다");
				this.memberMenu();
			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}
		}

	}
	public void changePassword() {
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("현재 비밀번호 : ");
		String passWordNow = sc.nextLine();
		System.out.print("새로운 비밀번호 : ");
		String passWordNew = sc.nextLine();
		
		
		if(mc.changePassword(id, passWordNow, passWordNew)) {
			System.out.println("비밀번호 변경에 성공했습니다.");
			this.memberMenu();
		} else {
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
		}

	}
	
	public void changeName() {

		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String passWord = sc.nextLine();


		while(true) {
			String name = mc.login(id, passWord);
			if(name != null) {
				System.out.println("현재 설정된 이름 : " + name); // 현재 아이디 받음

				System.out.println("변경할 이름 : ");
				String nameNew = sc.nextLine();
				mc.ChangeName(nameNew, passWord);
				this.memberMenu();
			} else {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
			}
		}
	}


	public void sameName() {
		System.out.println("검색할 이름 : ");
		String searchName = sc.nextLine();
		
		TreeMap result = mc.sameName(searchName);
		if(result.isEmpty()) {
			System.out.println("회원을 찾지 못하였습니다.");
		} else {
			for(Object entry : result.entrySet()) {
				Entry<String, String> en = (Entry)entry;
				System.out.println(en.getValue() + "-" + en.getKey());
				
			}
		}
		mc.sameName(searchName);
		
		//반환 값을 가지고 entrySet()을 이용하여 ‘이름-아이디’ 형식으로 출력

		

	}

}
