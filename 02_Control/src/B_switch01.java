import java.util.Scanner;

public class B_switch01 {
	/*
	 * switch문도 조건문
	 * 
	 * if문과 차이
	 * => if문: 조건식 자유롭게 기술 가능
	 * => switch문 동등비교로만 수행 가능
	 *   = 실행할 구문만 실행, 자동으로 빠져나오지 x
	 * 
	 * [표현법]
	 * switch(비교대상(정수, 문자, 문자열)) {
	 *  case 값1 : 실행코드1; break;
	 *  case 값2 : 실행코드2; break;
	 *  ...
	 *  default : 위의 값 일치x 시 실행
	 *  }
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 
		 * 정수를 입력받아
		 * 1일 경우 "빨간색입니다"
		 * 2일 경우 "파란색입니다"
		 * 3일 경우 "초록색입니다."
		 * 나머지 "잘못입력하셨습니다."
		 */
		
		// switch 사용
//		System.out.print("정수(1~3) : ");
//		int num = sc.nextInt();
//		
//		switch (num) {
//		case 1:
//			System.out.println("빨간색입니다.");
//			break;
//		case 2:
//			System.out.println("파란색입니다.");
//			break;
//		case 3:
//			System.out.println("초록색입니다.");
//			break;
//		default:
//			System.out.println("잘못입력하셨습니다.");
//		}
		
		
		// if 사용
//		System.out.print("정수(1~3) : ");
//		int num = sc.nextInt();
//		
//		String color = "";
//		if (num == 1) {
//			color = "빨간색";
//		} else if (num == 2) {
//			color = "파란색";
//		} else if (num == 3) {
//			color = "초록색";
//		} else {
//			System.out.println("잘못입력하셨습니다.");
//			return;
//		}
//		
//		System.out.println(color + "입니다.");
				
		
		/*
		 * 과일을 구매하는 프로그램 작성
		 * 구매하고자 하는 과일을 입력하면
		 * 그에 맞는 가격이 출력되는 프로그램을 작성
		 * 구매하고자 하는 과일(사과, 바나나, 딸기) :
		 * xx의 가격은 xxxx입니다.(잘못입력하였습니다.)
		 * 사과 1000원, 바나나 2000원, 딸기 3000원
		 */
		
		// by me
//		System.out.print("구매하고자 하는 과일(사과, 바나나, 딸기) : ");
//		String fruitName = sc.nextLine();
//		
//		int price = 0;
//		switch(fruitName) {
//		case "사과":
//			price = 1000;
//			break;
//		case "바나나":
//			price = 2000;
//			break;
//		case "딸기":
//			price = 3000;
//			break;
//		default:
//			System.out.println("잘못입력하셨습니다.");
//			return;
//		}
//		System.out.println(fruitName + "의 가격은" + price + "원 입니다.");
		
		// by teacher
//		System.out.print("구매하고자 하는 과일(사과, 바나나, 딸기) : ");
//		String fruitName = sc.nextLine();
//		
//		int price = 0;
//		switch(fruitName) {
//		case "사과":
//			System.out.println(fruitName + "의 가격은 1000원 입니다.");
//			break;
//		case "바나나":
//			System.out.println(fruitName + "의 가격은 1000원 입니다.");
//			break;
//		case "딸기":
//			System.out.println(fruitName + "의 가격은 1000원 입니다.");
//			break;
//		default:
//			System.out.println("잘못입력하셨습니다.");
//		}
		
		
		// if 문 사용
//		System.out.print("구매하고자 하는 과일(사과, 바나나, 딸기) : ");
//		String fruitName = sc.nextLine();
//		
//		if (fruitName.equals("사과")) {
//			System.out.println(fruitName + "의 가격은 1000원 입니다.");
//		} else if (fruitName.equals("바나나")) {
//			System.out.println(fruitName + "의 가격은 1000원 입니다.");
//		} else if (fruitName.equals("딸기")) {
//			System.out.println(fruitName + "의 가격은 1000원 입니다.");
//		} else {
//			System.out.println("잘못입력하셨습니다.");
//		}
		
		
		/*
		 * 1 3 5 7 8 10 12 => 31일
		 * 4 6 9 11 => 30일
		 * 2 => 28일
		 */
		
//		int month, day;
//		System.out.print("월을 입력하세요: ");
//		month = sc.nextInt();
//		
//		switch (month) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			day = 31;
//			break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			day = 30;
//			break;
//		case 2:
//			day = 28;
//		default:
//			day = 0;
//			System.out.println("1~12까지만 입력가능합니다.");
//			return;
//		}
//		System.out.println(month + "월은" + day + "일까지입니다.");
		
		
	}
}
