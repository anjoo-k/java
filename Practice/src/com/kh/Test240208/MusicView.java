package com.kh.Test240208;

import java.util.Scanner;

public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void  mainMenu() {
		
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료 ");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				this.addList();
				break;
			case 2:
				this.addAtZero();
				break;
			case 3:
				this.printAll();
				break;
			case 4:
				this.searchMusic();
				break;
			case 5:
				this.removeMusic();
				break;
			case 6:
				this.setMusic();
				break;
			case 7:
				this.ascTitle();
				break;
			case 8:
				this.descSinger();
				break;
			case 9:
				System.out.println("종료");
				return;
			default:
				
			}
			
		}
		
		
	}
	
	public void  addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("가수 명 : ");
		String singer = sc.next();
		System.out.print("곡 명 : ");
		String title = sc.next();


		
		Music m = new Music(singer, title);
		int addList = mc.addList(m);
		
		if(addList == 1) {
			System.out.println("추가 성공");			
		} else {
			System.out.println("추가 실패”");
		}
		
	}
	
	public void  addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("가수 명 : ");
		String singer = sc.next();
		System.out.print("곡 명 : ");
		String title = sc.next();
		
		Music m = new Music(singer, title);
		int addZero = mc.addAtZero(m);
		
		if(addZero == 1) {
			System.out.println("추가 성공");			
		} else {
			System.out.println("추가 실패”");
		}
		
	
	}
	
	public void  printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		System.out.println(mc.printAll());
		
	}
	
	public void  searchMusic() {	
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("곡 명 : ");
		String title = sc.next();
		
		mc.searchMusic(title);
		
		if(true) {
			System.out.println("검색한 곡은 " + mc.searchMusic(title).toString());
		} else {
			
		}System.out.println("검색한 곡이 없습니다.");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void  removeMusic() {

		
		System.out.println("");
		System.out.println("");
		
	}
	
	public void  setMusic() {

		
		System.out.println("");
		System.out.println("");
		
	}
	
	public void  ascTitle() {

		
		System.out.println("");
		System.out.println("");
		
	}
	
	public void  descSinger() {
		
	}
	
	
	
	
	
}
