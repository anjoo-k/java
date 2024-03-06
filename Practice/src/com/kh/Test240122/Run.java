package com.kh.Test240122;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ******************************************혼자 못 품, 풀어보기
//		// 정수 n(2 ~ 9)을 입력받아 2부터 n까지 중 짝수인 구구단을 출력하는 함수를 작성하세요
//		// 만약 2 ~ 9 사이의 값을 입력하지 않았다면 다시 입력하세요를 반복합니다.
//		//by teacher 1
//		System.out.print("정수 입력:");
//		int n = sc.nextInt();
//		
//		for(int i = 2; i <= n; i++) {
//			if(i % 2 != 0) {
//				continue;
//			}
//			for(int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, i * j);				
//			}
//			System.out.println();
//		}
//		//by teacher 2
//		
//		do {
//			System.out.print("정수 입력:");
//			int n = sc.nextInt();
//			if(n < 2 || n > 9) {
//				continue;
//			}
//			for(int i = 2; i <= n; i++) {
//				if(i % 2 != 0) {
//					continue;
//				}
//				for(int j = 1; j <= 9; j++) {
//					System.out.printf("%d * %d = %d\n", i, j, i * j);
//				}
//				System.out.println();
//			}
//			break;
//			
//		}while(true);
			
		//by me
//		if(n < 2 || n > 9) {
//			System.out.println("다시 입력하세요");
//		} else {
//			for(int i = 2; i <= 9; i++) {
//				System.out.println("====================");
//				if(i % 2 == 0) {
//					for(int j = 1; j <= 9; j++) {
//						System.out.println(i + " * " + j + " = " + i * j);
//					}
//				}
//				
//			}	
//		}
//				
		
		
//		// 정수 num을 입력받아 크기가 num인 정수형 배열을 만들고 1 ~ 100사이의 랜덤값으로 모든 배열의 값 대입
//		// 이후 모든 배열의 홀수 인덱스를 더한 값을 구하세요.
//		System.out.print("정수입력:");
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 100 + 1);
//			System.out.println(arr[i] + " ");
//		}
//		
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 2 == 0) {
//				sum += arr[i];
//			}
//		}
//		System.out.println("배열 홀수 인덱스 더한 총합: " + sum);
		
		
		
//		// 정수 num 입력받아 배열만들기
//		// 0 ~ (num - 1 또는 배열의 길이 - 1)까지 반복하여 Math.random() * 100 + 1 값 대입해주기
//		// 변수 sum 만들고 전체 배열 반복하여 인덱서 i 가 i % 2 = 1인 값 더하기
//		// 더한값 출력
//		
//		System.out.print("정수 입력:");
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 100 + 1);
//		}
//		
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(i % 2 == 0) {
//				sum += arr[i];
//			}
//		}
//		System.out.println(sum);
	
		
		
		
//		// 다옴과 같은 코드를 실행했을 때 예시와 같은 결과가  출력되도록 TV클래스를 작성하세요.
//		// TV myTV = new TV("삼성", 2020, 65);\
//		// myTV.show();
//		// => 삼성에서 만든 2020년형 65인치 TV
//		
//		TV myTV = new TV("삼성", 2020, 65, 100000);
//		myTV.show(); //메서드 호출
//		
//		TV myTV2 = new TV("LG", 2024, 85, 200000);
//		myTV2.show();
//		
//		
//		// one이라는 객체를 생성하고
//		// 해당객체로 myTV와 myTV2 구매가 가능한지 확인
//		
//		Human one = new Human("길동", 150000);
//		one.buy(myTV);
//		one.buy(myTV2);
		
		//===========================static=========================
//		Human choi = new Human("최길동",15000);
//		System.out.println(choi.count);
//		
//		Human kim = new Human("김길동", 15000);
//		System.out.println(Human.count);
//		//static은 표현할 때 클래스로 접근. 그 클래스에 속하는 정적변수기 때문
		
		//===========================================================
		
		/*
		 * 우리는 도서관에서 책을 관리하는 프로그램을 만든다고 가정
		 * 해당 클래스는 도서관에 책을 등록할 때 사용하는 book 객체를 생성할 Book 클래스이다.
		 * 필요하다고 생각하는 데이터와 기능을 구현해보자
		 * 
		 * Book boo1 = new Book(초기화변수);
		 * 
		 */
		
		// 사용자로부터 제목, 장르, 저자, 책번호를 입력받아
		// book 객체를 생성하고 생성된 객체의 toString 메소드를 호출하여 정보를 확인해주세요.
		
		
		
		// 문자열.toLowerCase 모든 문자를 소문자로 변경(Upper이면 대문자로 변경)
		
		Book[] bookArr = new Book[100];
		int count = 0;
		int menu = 0;
		
		while(menu != 9) {
			System.out.println("=========== 도서 관리 프로그램 ===========");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서목록출력");
			System.out.println("3. 도서검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택: ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				String title, genre, writer;
				int number;
				System.out.print("도서 제목 : ");
				title = sc.next();
				System.out.print("장르 : ");
				genre = sc.next();
				System.out.print("저자 : ");
				writer = sc.next();
				System.out.print("책 번호 : ");
				number = sc.nextInt();
				
				bookArr[count] = new Book(title, genre, writer, number);
				System.out.println("도서등록완료:" + bookArr[count++].toString()); //toString 1: 도서 등록하고 불러오고
				break;
			case 2:
				// 배열 bookArr에 등록된 모든 도서정보 출력
				//===================등록된 도서정보================
				//Book [title=개미, genre=소설, writer=베르나르, number=1]
				
				System.out.println("========= 등록된 도서 정보 ==========="); // 엥 이거 뭐가문제여
				if(bookArr[count] == null) {
					System.out.println("등록된 도서가 없습니다.");
					break;
				}
				for(int i = 0; i < bookArr.length; i++) {
					if(bookArr[i] == null) {
						break;
					}
					System.out.println(bookArr[i].toString()); //toString 2: 등록된 도서 불러오고
				}
				break;
			case 3:
				System.out.println("========= 도서검색 ===========");
				System.out.print("검색할 도서명:");
				title = sc.next();
				Book target = null;
				
				for(int i = 0; i < bookArr.length; i++) {
					if(bookArr[i] == null) {
						break;
					} else if(bookArr[i].getTitle().equals(title)) {
						target = bookArr[i]; // 만약 찾았다면 target => null 아님
						break;
					}
				}
				if(target == null) {
					System.out.println("동일한 제목읠 도서가 없습니다.");
				} else {
					System.out.println("검색 도서 정보:" + target.toString()); //toString 3: 검색한 도서 보여주고
				}
			case 9:
				System.out.println("프로그램을 종료합니다.");
			}

			
		}
		
//		by downlo
//		Book[] bookArr = new Book[100];
//		int count = 0;
//		int menu = 0;
//		
//		while(menu != 9) {
//			System.out.println("==============도서관리프로그램===============");
//			System.out.println("1. 도서등록");
//			System.out.println("2. 도서목록출력");
//			System.out.println("3. 도서검색");
//			System.out.println("9. 종료");
//			System.out.print("메뉴 선택 : ");
//			menu = sc.nextInt();
//			
//			switch(menu) {
//			case 1: {
//				int number;
//				String title, genre, author; // 제목
//				System.out.print("도서 제목 : ");
//				title = sc.next();
//				
//				System.out.print("장르 : ");
//				genre = sc.next();
//				
//				System.out.print("저자 : ");
//				author = sc.next();
//				
//				System.out.print("책 번호 : ");
//				number = sc.nextInt();
//				
//				bookArr[count] = new Book(title, genre, author, number);
//				System.out.println("도서등록 완료 : " + bookArr[count++].toString());
//			}break;
//			case 2:
//				//배열bookArr에 등록된 모든 도서정보 출력
//				// ============등록된 도서정보=================
//				//Book [title=홍길동전, genre=소설, author=박지원, number=1]
//				
//				System.out.println("============등록된 도서정보=================");
//				if (bookArr[0] == null) {
//					System.out.println("등록된 도서가 없습니다.");
//					break;
//				}
//				for (int i = 0; i < bookArr.length; i++) {
//					if (bookArr[i] == null)
//						break;
//					System.out.println(bookArr[i].toString());
//				}
//				break;
//			case 3:{
//				System.out.println("===============도서 검색==================");
//				System.out.print("검색할 도서 제목 : ");
//				String title = sc.next();
//				Book target = null;
//				
//				for (int i = 0; i < bookArr.length; i++) {
//					if (bookArr[i] == null) {
//						break;
//					} else if(bookArr[i].getTitle().equals(title)) { // Book배열 요소에 있는 제목이 입력받은 제목과 동일하다면
//						target = bookArr[i]; //만약 찾았다면 target => null아님
//						break;
//					}
//				}
//				if (target == null) {
//					System.out.println("동일한 제목의 도서가 없습니다.");
//				} else {
//					System.out.println("검색 도서 정보 : " + target.toString());
//				}
//				
//			}break;
//			case 9:
//				System.out.println("프로그램을 종료합니다.");
//			}	
//		}
//	}
//
//}
//		
//	
		
		
		
		Book[] arrPrac = new Book[100];
		int countPrac = 0;
		
		while(true) {
			System.out.print("메뉴선택: 1도서등록\n2도서목록\3도서검색\n9종료");
			int menuPrac = sc.nextInt();
			
			switch(menuPrac) {
			case 1:
				System.out.print("책제목:");
				String ti = sc.next();
				System.out.print("장르:");
				String ge = sc.next();
				System.out.print("작가:");
				String wri = sc.next();
				System.out.print("책번호:");
				int num = sc.nextInt();
				
				arrPrac[countPrac] = new Book(ti, ge, wri, num);
				System.out.println("등록된 도서:" + arrPrac[countPrac++].toString());			
				
			case 2:
				Book targetPrac = null;
				
				if(arrPrac[count] == null) {
					System.out.println("등록된 도서가 없습니다.");
					break;
				}
				for(int i = 0; i < arrPrac.length; i++) {
					
				}
				
				if(arrPrac == null) {
					
				} else {
					System.out.println("등록된 도서:" + arrPrac[countPrac++].toString());
				}
			case 3:
			case 9:
			
			
			
			
			}
			
		}
		
		
		
		
		
	}

	private static int ti(String ge, String wri, int num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
