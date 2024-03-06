package com.ph.test240125;
import java.util.Scanner;
public class LibraryMenu {
	
	private LibraryController lc;
	Scanner sc;
	
	
	public LibraryMenu () { // 왜 이렇게 한다고? 생성자 만들어준거네
	
		lc = new LibraryController();
		sc = new Scanner(System.in);
	}
	
	public void MainMenu() {
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("나이:");
		int age = sc.nextInt();
		System.out.print("성별:");
		char gender = sc.next().toLowerCase().charAt(0); // .toLowerCase(): 다 소문자로 바뀐다
		
		Member member = new Member(name, age, gender);
		lc.insertMember(member);  // myInfo 출력위해 넣어준 멤버 정보
		
		while(true) {
			System.out.println("=====매뉴=====");
			System.out.println("1.마이페이지\n2.도서 전체 조회\n3.도서 검색\n4.도서 대여하기\n9.프로그램 종료하기");
			System.out.print("메뉴 번호:");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println(lc.myInfo()); //mem.toString이 나온다고?? 아 실행결과보면 그렇군************************************
				break;							 // 위에 insertMember 로 넣어준 정보
			case 2:
				this.selectAll();
				break;
			case 3:
				this.searchBook();
				break;
			case 4:
				this.rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;	
			default:
				System.out.println("잘못입력하셨습니다.");
				sc.close();
			}
			
		}
		
		
	}
	
	
	public void selectAll() { // ㅜㅜ
		Book[] bList = lc.selectAll(); // Book 주소
		for (int i = 0; i < bList.length; i++) {
			if(bList[i] == null) { // 예외코드를 습관적으로 써주자. 오류 검사
				break;
			}
			System.out.println(i+"번도서 : " + bList[i].toString());
		}
		
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드: ");
		String keyword = sc.next();
		Book[] searchList = lc.searchBook(keyword);
		
		for (int i = 0; searchList[i] != null; i++) {

			System.out.println(i+"번도서 : " + searchList[i].toString());
		}
		
	}
	public void rentBook() {
		this.selectAll();
		
		System.out.print("대여할 도서 번호 선택(0 ~ 2):");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		
		if (result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if (result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else if (result == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니\n마이페이지에서 확인하세요.");
		}
		
	}

}
