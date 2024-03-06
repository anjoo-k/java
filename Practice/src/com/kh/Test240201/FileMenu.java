package com.kh.Test240201;

import java.util.Scanner;

public class FileMenu {
	
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("***** My Note *****");
			System.out.print("1.노트 새로 만들기\n2.노트 열기\n3.노트 열어서 수정하기\n9.끝내기\n메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine(); //버퍼값 비워주기. 개행
			
			switch(menu) {
			case 1 :
				this.fileSave();
				break;
			case 2:
				this.fileOpen();
				break;
			case 3:
				this.fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		
	}
	
	public void fileSave() {
		StringBuilder strb = new StringBuilder();

		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.\nex끝it 이라고 입력하면 종료됩니다");
			System.out.print("내용 : ");
			String str = sc.nextLine(); // 한줄씩 받을꺼니까 Line
			
			if(str.equals("ex끝it")) {
				break;
			} else {
				strb.append(str + "\n");
			}
		}
			
			while(true) {
				System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
				String str1 = sc.nextLine();
				
				if(fc.checkName(str1)) { // 파일명이 존재한다면,
					
					System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
					boolean isTrue = sc.next().toLowerCase().charAt(0) == 'y';
					sc.nextLine();
					if(isTrue) { // y를 입력 시 -> 덮어쓰기
						fc.fileSave(str1, strb);
						break;
					}
				} else {
					fc.fileSave(str1, strb);
					break;
				}
				
			}

		
		
		
		
//		Char str2 = sc.next().toLowerCase().charAt(0);
//		
//		if(str2 == 'y') {
//			fc.fileSave(str, strb);
//		} else if(str2 == 'n') {
//			continue;
//		} else {
//			fc.fileSave(str, strb);
//		}
//	}
		
		
	}
	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String str = sc.next();
		
		if(fc.checkName(str)) {
			StringBuilder content = fc.fileOpen(str);
			System.out.println(content);
		} else {
			System.out.println("없는 파일입니다.");
			this.mainMenu();
		}
	
	}
	
	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String str = sc.next();
		
		if(fc.checkName(str)) {
			StringBuilder strb = new StringBuilder();
			
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.\nex끝it 이라고 입력하면 종료됩니다");
				System.out.print("내용 : ");
				String str1 = sc.nextLine(); // 한줄씩 받을꺼니까 Line
				
				if(str.equals("ex끝it")) {
					break;
				} else {
					strb.append(str + "\n");
				}
				
		} 
		} else {
			System.out.println("없는 파일입니다.");
			this.mainMenu();
		
	} 
	}
}
			
//			while(true) {
//				System.out.println("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
//				char str1 = sc.next().toLowerCase().charAt(0);
//				if(str1 == 'y' && fc.checkName(str)) {
//					System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
//					char str2 = sc.next().toLowerCase().charAt(0);
//					if(str2 == 'y') {
//						fc.fileSave(str, strb);
//					} else if(str2 == 'n') {
//						continue;
//					} else {
//						fc.fileSave(str, strb);
//					}
//				
//		} 
//			}
//			}
	