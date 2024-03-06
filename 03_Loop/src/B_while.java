import java.util.Scanner;
import java.lang.Math;
public class B_while {
	/*
	 * while 문
	 * 
	 * [초기식;]
	 * while(조건식) {
	 * 		반복적으로 실행할 코드;
	 * 		[증감식;]
	 * }
	 * 
	 * 조건식의 결과거 true일 경우 해당 코드 실행
	 * 
	 * 조건식 검사 -> true일 경우 실행코드 실행
	 * 조건식 검사 -> true일 경우 실행코드 실행
	 * 조건식 검사 -> false일 경우 실행코드 실행 x -> 반복문 탈출
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
//		//System.out.println("안녕하세요"); 5번 출력
//		for (int i = 0; i < 5; i++) {
//			System.out.println("안녕하세요");
//		}
//		int i = 0;
//		while (i < 5) {
//			System.out.println("안녕하세요");
//			i++;
//		}
		
//		// 1 ~ 1000사이의 홀수만 출력
//		int i = 1; // 조건식 쓰기
//		while (i <= 10000) {
//			if (i % 2 == 1) {
//			System.out.print(i + " ");
//			}
//			i++;
//		}
//		System.out.println();
//		i = 1; //2씩 증해도 홀수겠져?  &  변수 다시 잡아주기
//		while (i <= 10000) {
//			System.out.print(i + " ");
//			i += 2;
//		}
		
//		// 1부터 랜덤값(1 ~ 100사이) 까지의 합계를 출력
//		// 1에서부터 xx까지의 총 합계 : xxxx
//		int random = (int)(Math.random() * 100 + 1);
//		int sum = 0;
//		for (int i = 1; i <= random; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		// for문으로 = while문으로
//		int random = (int)(Math.random() * 100 + 1);
//		int sum = 0;
//		int i = 1;
//		while (i <= random) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1에서부터 " + random + "까지의 총 합계 : " + sum);

		// 사용자에게 문자열을 입력받아
		// 해당 문자열의 짝수자리 글자만 출력
		// 문자열을 입력 : hello
		// el 출력
		//
		// 입력받은 문자열 반복문을 하나씩 전부 출력해보기
		// & 짝수자리만 출력하기
//		System.out.print("문자열을 입력 : "); // 문자열 출력
//		String str = sc.next();
//		int i = 0;
//		while (i < str.length()) {
//				System.out.println(str.charAt(i++));
//			}
		
		System.out.print("문자열을 입력 : "); // 문자열 출력
		String str = sc.next();
		int i = 0;
		while (i < str.length()) {
				System.out.println(str.charAt(i));
				i++;
			}
		
//		System.out.print("문자열을 입력 : "); // 짝수자리만 출력 *****************************문자열 나 진짜 문제
//		String str = sc.next();
//		int i = 0;
//		while (i < str.length()) {
//			if (i % 2 == 1) {
//				System.out.println(str.charAt(i));
//			}
//			i++;
//		}
		
//		System.out.print("문자열을 입력 : "); // 짝수자리만 출력
//		String str = sc.next();
//		int i = 1;
//		while (i < str.length()) {
//				System.out.println(str.charAt(i));
//			i += 2;
//		}
		
		
	}

}
