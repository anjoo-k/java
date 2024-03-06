package com.kh.Test240123;

import java.util.Scanner;

public class AloneStudentManagement { // 학생관리프로그램
	Scanner sc;
	Student[] stArr; // 학생목록
	
	
	public AloneStudentManagement() {
		super();
		this.sc = new Scanner(System.in);
		this.stArr = stArr = new Student[100];
	}
	
	public int printMenu() {
		System.out.println("==========성적관리프로그램==========");
		System.out.print("1.성적입력\n2.성적목록확인\n3.성적검색\n9.종료\n메뉴입력:");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void startProgram() {
		
		int menu = 0;
		while(menu != 9) {
			switch(menu) {
			case 1:{
				System.out.println("학생이름:");
				System.out.println("수학성적:");
				System.out.println("국어성적:");
				System.out.println("영어성적:");
			}
				
			case 2:
			case 3:
			case 9:{
				
				System.out.println("프로그램을 종료합니다.");
			}
			
			}
			
		}
		
	}
	
	
	
	
//	Scanner sc = new Scanner(System.in);
//	
//	AloneStudent[] arr = new AloneStudent[100];
//	int menu = 0;
//	int index = 0;
//	
//	while(menu != 9) {
//		System.out.println("==========성적관리프로그램==========");
//		System.out.print("1.성적입력\n2.성적목록확인\n3.성적검색\n9.종료\n메뉴입력:");
//		menu = sc.nextInt();
//		
//		switch(menu) {
//		case 1:{
//			int i = 0;
//			boolean isTrue = false;
//			
//			System.out.println("==========성적입력==========");
//			System.out.print("학생이름:");
//			String name = sc.next();
//			
//			System.out.print("수학성적:");
//			int math = sc.nextInt();
//			
//			System.out.print("국어성적:");
//			int kor = sc.nextInt();
//			
//			System.out.print("영어성적:");
//			int eng = sc.nextInt();
//			
//			while(arr[i] != null) { // 중복값을 찾기위해 1. arr[i]가 null이 아니고,
//				if(arr[i].getName().equals(name)) { // 2. arr[i]랑 내가 입력한 name이랑 같은 이름이면,
//					System.out.println("중복된 값이 있습니다.");
//					isTrue = true; // 중복이 존재하면 true 존재하지 않으면 false로 유지되어서,
//					break; // !'반복문'을 빠져나감!
//				}
//				i++; // 만약 arr[0]이 null이 아니라서 while문 돌고나면, i = 1이 되고
//					 // arr[1]이 null이면, while에 들어가지도 않는 것
//			}
//			if(!isTrue) { // 중복이 존재하지 않는 false 값이 아니면(true 이면), if 문 실행해서
//				arr[i] = new AloneStudent(name, math, kor, eng);
//				System.out.println("등록완료:" + arr[i].toString());
//				i++;
//			}
//		}
//		break;
//		case 2:{
//			System.out.println("==========성적목록확인==========");
//			for (int i = 0; arr[i] != null; i++) {
//				System.out.println("학생 성적 목록: " + arr[i].toString());
//			}
//		}
//		break;
//		case 3:{
//			System.out.println("==========성적검색==========");
//			System.out.print("성적확인 학생이름:");
//			String name = sc.next();
//			
//			int i = 0;
//			boolean isTrue = false;
//			while (arr[i] != null) {
//				if(arr[i].getName().equals(name)) {
//					System.out.println(name + "학생 성적: " + arr[i].toString());
//					isTrue = true;
//				}
//				i++;
//			}
//			if(!isTrue) {
//				System.out.println("해당 이름으로 검색되는 학생 없음");
//			}
//		}
//		break;
//		case 9:
//			System.out.println("프로그램을 종료합니다.");
//			return;
//		}
//	}
		
	
	

}
