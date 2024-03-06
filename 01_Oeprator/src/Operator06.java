import java.util.Scanner;
public class Operator06 {
	/* 
	 * 삼항연산자 (항목 3개를 가지고 연산해주는 연산자)
	 * 
	 * [표현법] 
	 * 조건식 ? 조건식이 참일 경우 돌려줄 결과값 : 조건식이 거짓일 경우 들어올 결과값
	 * 
	 * 이 때, 조건식은 반드시 true 또는 false가 나오도록 해야된다.
	 * 주로 비교, 논리연산자를 통해 작성한다.
	 * 
	 */
	public static void main(String[] args) {
		// 입력받은 정수값이 양수인지 아닌지 판별 후 출력한다.
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수값 입력: ");
//		int num = sc.nextInt();
//		
//		String result = num > 0 ? "양수" : "음수";
//		System.out.println(result + "입니다.");
//		
//		System.out.println(num + "은 " + (num > 0 ? "양수이다." : "양수가 아니다"));
		
		
		
		//정수 하나를 입력받아 짝수인지 홀수인지 판별 후 출력
		// 정수값 입력: 5
		// 5는 홀수이다.
		
//		System.out.print("정수값 입력: ");
//		int num2 = sc.nextInt();
//		
//		String result2 = (num2 % 2 == 0) ? "짝수" : "홀수";
//		System.out.println(result2 + "이다");
//		System.out.printf("%d은 %s입니다.", num2, result2);
		
		
		//사용자에게 두 개의 정수값을 입력받으세요.
		// + 또는 -를 입력받아 그에 맞는 연산결과를 출력해 주세요.
		// 단, + 또는 - 이외에 다른 문자를 입력했을 경우 "잘못 입력했습니다." 출력
		// 첫번째 정수 : 
		// 두번째 정수 :
		// 연산자 입력(+ 또는 -) :
		// 결과: xxx or 잘못 입력했습니다.

		int a;
		int b;
		String ab;
		
		System.out.print("첫번째 정수: ");
		a = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수: ");
		b = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자 입력(+ 또는 -): ");
		char c = sc.next().charAt(0);
		
		//ab = ((c == '+') ? (a + b) : ((c == '-') ? (a - b) : "잘못 입력했습니다.")) + "";
		// ""를 더한 이유: 해당 값을 문자열로 변환함
		//System.out.print("결과: " + ab);
		
		
		
		//조건문(if)
//		if (c == '+') {
//			ab = a + b + "";
//		} else if (c == '-') {
//			ab = a - b + "";
//		} else {
//			ab = "잘못 입력했습니다.";
//		}
//		System.out.print("결과: " + ab);
		
		
		//조건문(switch)
		switch(c) {
		case '+':
			ab = a + b + "";
			System.out.println("+로 들어왔습니다.");
			break;
		case '-':
			ab = a - b + "";
			System.out.println("-로 들어왔습니다.");
			break;
		default:
			ab = "잘못 입력했습니다.";
		}
		
		System.out.print("결과: " + ab);
			
		
	}

}
