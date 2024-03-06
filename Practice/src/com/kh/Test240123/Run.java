package com.kh.Test240123;
import java.util.Scanner;
public class Run {
	public static void main(String[] args) {
		
//		StudentManagement stm = new StudentManagement();
//		
//		stm.startProgram();
		
//		new StudentManagement().startProgram();
		
		
	Scanner sc = new Scanner(System.in);
//	// 사용자로부터 이름 수학점수/국어점수/ 영어점수르 입력받아
//	String name;
//	int math, kor, eng;
//	
//	System.out.println("이름:");
//	name = sc.next();
//	
//	System.out.print("수학점수:");
//	math = sc.nextInt();
//	
//	System.out.print("국어점수:");
//	kor = sc.nextInt();
//	
//	System.out.print("영어점수:");
//	eng = sc.nextInt();
//	
//	System.out.println("평균: "+ (math + kor + eng) / 3);
//	// 평균을 실수로 구하세요
	
	// 위에서 입력받은 정보로 객체를 생성할 수 있는 Student 클래스를 작성하세요
	
	// 평균을 구하는 메소드, 모든 필드정보를 보여주는 메소드를 포함하여 작성합니다.
	
	
	
	// 해당프로그램을 작성합니다.
	// ================성적관리 프로그램==================
	// 1. 성적입력
	// 2. 모든학생 성적확인
	// 3. 학생성적검색
	// 4. 종료
	// 메뉴를 입력하세요 : 
	// -> 1번 입력 시 이름 수학점수/국어점수/ 영어점수르 입력받아 객체배열에 저장
	// -> 2번 입력 시 객체배열에 저장된 모든 
	// -> 3번 입력 시 이름을 입력받아 해당 이름의 학생 검색 후 정보출력
	// -> 9번 입력 시 종료
	
	Student[] stArr = new Student[100];
	int select = 0; //메뉴 입력용
	int index = 0; //카운터용
	
	while(select != 9) {
		System.out.println("============성적관리프로그램=============");
		System.out.println("1성적입력\n2모든학생 성적확인\n3학생성적검색\n9종료");
		System.out.print("메뉴입력:");
		select = sc.nextInt();
		
		switch(select) {
		case 1:{ // 성적 입력
			System.out.println("============성적입력=============");
			String name;
			int math, kor, eng;
			
			System.out.print("이름:");
			name = sc.next();
			
			System.out.print("수학점수:");
			math = sc.nextInt();
			
			System.out.print("국어점수:");
			kor = sc.nextInt();
			
			System.out.print("영어점수:");
			eng = sc.nextInt();
			
			int i = 0;
			boolean isTrue = false; // 중복이 존재하면 true 존재하지 않으면 false로 유지
			while(stArr[i] != null) {
				if(stArr[i].getName().equals(name)) { // 배열에 저장된 객체의 이름과 입력받은 이름이 동일할 때
					System.out.println("해당 이름으로 저장된 성적이 존재합니다.");
					isTrue = true;
					break;
				}
				i++;
			}
			
			if(!isTrue) {
				stArr[index] = new Student(name, math, kor, eng);
				System.out.println("성적 저장 완료:" + stArr[index++].toString());
			}
			
		} break;
		case 2:{ // 모든 학생의 성적 확인
			System.out.println("============학생성적확인=============");
			for (int i = 0; stArr[i] != null; i++) {
				System.out.println(stArr[i].toString());
			}
		}
		case 3:{ // 이름으로 학생 검색 후 정보 출력
			System.out.println("============학생성적검색=============");
			String name;
			System.out.print("이름입력:");
			name = sc.next();
			
			int i = 0;
			boolean isTrue = false;
			while(stArr[i] != null) {
				if(stArr[i].getName().equals(name)) {
					System.out.println(stArr[i].toString());
					isTrue = true;
					break;
				}
				i++;
			}
			if(!isTrue) {
				System.out.println("해당 이름으로 검색되는 학생 없음");
			}
		} break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
		}
		
	}
	
	
	
	
	
	
	

//		Scanner sc = new Scanner(System.in);
//		
//		Student[] studentArr = new Student[100];
//		int count = 0;
//		
//		while(true) {
//			System.out.println("========== 성적관리프로그램 ==========");
//			System.out.println("1성적입력\n2모든학생 성적확인\n3학생성적검색\n4종료");
//			System.out.println("메뉴선택:");
//			int menu = sc.nextInt();
//			switch (menu) {
//
//			case 1:
//				System.out.println("성적입력");
//				System.out.println("이름:");
//				String name = sc.next();
//				
//				System.out.print("수학점수:");
//				double math = sc.nextInt();
//				
//				System.out.print("국어점수:");
//				double kor = sc.nextInt();
//				
//				System.out.print("영어점수:");
//				double eng = sc.nextInt();
//				
//				studentArr[count] = new Student(name, math, kor, eng);
//				System.out.println("성적등록완료: "+  studentArr[count++].toString());
//				
//				break;
//			case 2:
//				if (studentArr[count] == null ) {
//					System.out.println("등록된 성적이 없습니다.");
//				}
//				for(int i = 0; i < studentArr.length; i++) {
//					if(studentArr[count] == null) {
//						System.out.println("등록된 성적이 없습니다.");
//					} else {
//						System.out.println(studentArr[i].toString());
//					}
//				}
//				
//				break;
//			case 3:
//				System.out.println("검색할 이름:");
//				name = sc.next();
//				if(studentArr[count].equals(name)) {
//					System.out.println(studentArr[count].toString());
//				}
//				break;
//			case 4:
//				System.out.println("종료합니다.");
//				break;
//			}
//			
//		}
		
	}

	

}
