import java.util.*;
// 파일 시스템 안에서 *은 '전부'를 의미(현업에서는 비추)

public class A_if01 {
	/*
	 * 기본적으로 프로그램의 진행은 순차적
	 * 단, 순차적인 흐름을 바꾸고자 할 때, 제어문 이용해 직접 제어 가능
	 * 
	 * 선택적 실행 => 조건문 사용 : 오늘(240112) 배울 것
	 * 반복적 실행 => 반복문 사용 : 오늘 배울 것
	 * 그 외 흐름 제어 => 분기문
	 * 
	 *  **조건문
	 *  "조건식"을 통해 참 or 거짓 판단, 참일 경우 해당하는 코드 진행
	 *  
	 * 조건식 결과: true/false
	 * 조건식에서 주로 사용하는 연산자: 비교연산자(대조, 동등), 논리연산자(&&, ||) 
	 */
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		/* 
		 * *if문 단독 사용
		 * : if(조건식) {
		 * 		...실행문
		 *   }
		 *   => 조건식 true, 중괄호 블럭 안 코드 실행
		 *   => 조건식 false, 중괄호 블럭 안 코드 무시 
		 */
		
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		if (num > 0 ) {
//			System.out.println("양수이다.");
//		}
//		if(num < 0) {
//			System.out.println("음수이다.");
//		}
		
		
		//=================================================================
		
		/* 
		 * *if - else 문
		 * : if(조건식) {
		 *		...실행문 1
		 *   } else {
		 * 		...실행문 2
		 *   }
		 *   => 조건식 true, 실행코드 1 수행, if-else문 빠져 나감
		 *   => 조건식 false, 무조건 실행코드 2 수행
		 */
		
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		if (num > 0) {
//			System.out.println("양수이다.");
//		} else {
//			if (num < 0) {
//			System.out.println("음수이다.");
//			} else {
//				System.out.println("0이다.");
//			}
//		}
		
		
		//==================================================================
		
		/*
		 * if-else if 문
		 * 같은 비교대사으로 여러개 조건 제시할 경우
		 * : if(조건식 1) {
		 *      ...실행문 1
		 *   } else if(조건식 2) {
		 *      ...실행문 2
		 *   } else if(조건식 3) {
		 *      ...실행문 3
		 *   } else {
		 *      위 조건들이 모두 false일 경우 실행
		 *   }  
		 */
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if (num > 0) {
			System.out.println("양수이다.");
		} else if (num < 0) {
			System.out.println("음수이다.");
		} else {
				System.out.println("0이다.");
			}
		// 나중에 { } 얘네도 생략 가능
	}
}
