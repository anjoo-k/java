package com.kh.Test240123;
import java.util.Scanner;


public class StudentManagement { // 학생관리프로그램
	Scanner sc;
	Student[] stArr; // 학생목록
	
	
	public StudentManagement() {
		super();
		this.sc = new Scanner(System.in);
		this.stArr = stArr = new Student[100];
	}
	
	public int printMenu() {
		System.out.println("============성적관리프로그램=============");
		System.out.println("1성적입력\n2모든학생 성적확인\n3학생성적검색\n4마지막저장정보삭제\n5조건검색\n9종료");
		System.out.print("메뉴입력:");
		int select = sc.nextInt();
		sc.nextInt();
		return select;
	}
	
	public void startProgram() {
		int select = 0;
		while(select != 9) {
			select = this.printMenu();
			// void return 가져다 쓰는거 -> 둘 다 메서드를 가져다 쓰는건 동일한데 void는 그 매서드 읽고, 그 다음 줄부터 그대로 읽어나감
			//						 -> return은 그 메서드를 계산하고, return값을 읽어나감
			// 매개변수 언제 쓰는가? 필요할 때 만듬
			
			
			switch(select) {
			case 1: // 성적입력
				this.insertGrade();
				break;
			case 2: // 모든 학생 성적 확인
				this.insertCheck();
				break;
			case 3: // 이름으로 학생 검색 후 정보 출력
				this.insertSearch();
				break;
			case 4: // ** 새롭게 기능 추가해보자: 마지막으로 저장된 정보 삭제
				this.insertDelete();
			case 5:
				this.printGradeByCondition();
			case 9:		
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			}
		}
	}
	
	public void insertGrade() {
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
			if(stArr[i++].getName().equals(name)) { // 배열에 저장된 객체의 이름과 입력받은 이름이 동일할 때
				System.out.println("해당 이름으로 저장된 성적이 존재합니다.");
				isTrue = true;
				break;
			}
		}
		if(!isTrue) {
			stArr[i] = new Student(name, math, kor, eng);
			System.out.println("성적 저장 완료:" + stArr[i].toString());
		}
		
	}
	
	public void insertCheck() {
		System.out.println("============학생성적확인=============");
		for (int i = 0; stArr[i] != null; i++) {
			System.out.println(stArr[i].toString());
		}
		if(stArr[0] == null) {
			System.out.println("입력된 성적이 없습니다.");
		}
	}
	
	public void insertSearch() {
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
	}
	
	public void insertDelete() {
		System.out.println("============마지막저장정보삭제=============");
		if(stArr[0] == null) {
			System.out.println("삭제할 성적이 없습니다.");
			return;
		}
		for(int i = 1; i < stArr.length; i++) {
			if(stArr[i] == null) {
				System.out.println("삭제정보:" + stArr[i - 1]);
				stArr[i - 1] = null;
				System.out.println("삭제를 완료하였습니다.");
				break;
			}
				
		}
	}
	
	public void printGradeByCondition() {
		// 1. 평균 2. 수학 3. 국어 4. 영어
		// (다른번호 입력 시 잘못입력하셨습니다. 출력하고 성적관리프로그램으로 돌악가기)
		// 조회할 조건 입력 : 1
		// 기준점수(이상) : 50
		// 기준점수(이하) : 30
		// 50이상 30이하의 평균학생 목록 출력
		System.out.println("============조건검색=============");
		int select, max, min = 0;
		System.out.println("1. 평균 2. 수학 3. 국어 4. 영어");
		System.out.println("조회활 조건 입력:");
		select = sc.nextInt();
		
		System.out.println("기준점수(이상):");
		min = sc.nextInt();
		System.out.println("기준점수(이하):");
		max = sc.nextInt();
		
		switch(select) {
		case 1: // 평균
			for(int i = 0; stArr[i] != null; i++) { // 생성된 것 까지만 배열 반복해서 탐색
				double avg = stArr[i].getAvg();
				if (min <= avg && max >= avg) {
					System.out.println(stArr[i].toString());
				}
				break;
			}
		case 2: // 수학
			for(int i = 0; stArr[i] != null; i++) { // 생성된 것 까지만 배열 반복해서 탐색
				int math = stArr[i].getMath();
				if (min <= math && max >= math) {
					System.out.println(stArr[i].toString());
				}
			}
			break;
		case 3: // 국어
			for(int i = 0; stArr[i] != null; i++) { // 생성된 것 까지만 배열 반복해서 탐색
				int kor = stArr[i].getKor();
				if (min <= kor && max >= kor) {
					System.out.println(stArr[i].toString());
				}
			}
			break;
		case 4: // 영어
			for(int i = 0; stArr[i] != null; i++) { // 생성된 것 까지만 배열 반복해서 탐색
				int eng = stArr[i].getEng();
				if (min <= eng && max >= eng) {
					System.out.println(stArr[i].toString());
				}
			}
			break;
			default:
				System.out.println("잘못입력하셨습니다. 성적관리 프로그램으로 돌아갑니다.");	
		}		
			
	}		

	
	
	
	
	
	
	

}
