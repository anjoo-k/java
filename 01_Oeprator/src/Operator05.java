import java.util.Scanner;

public class Operator05 {
	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * 두 개의 논리값을 연산해주는 연산자
		 * 논리연산한 결과도 논리값이다.
		 * 
		 * 논리값 && 논리값 : 왼쪽, 오른쪽 두 논리값이 모두 true 일 때 결과값이 true 이다.
		 * 논리값 || 논리값 : 왼쪽, 오른쪽 둘 중에 하나라도 true 값이 있을 경우 true 이다.
		 * 
		 * && : 두 개의 조건이 모두 true(AND = ~ 이고, 그리고, ~이면서, 뿐만아니라)
		 * 
		 * true && true => true
		 * true && false => false
		 * false && true => false
		 * false && false => false
		 * 
		 *  => && 연산자를 기준으로 앞의 결과가 false일 경우 뒤의 조건은 굳이 실행하지 않는다.
		 *  
		 *  
		 *  || : 두 개의 조건 중 하나라도 true 이면 결과값이 true 이다.( or == 또는, ~이거나)
		 *  
		 *  true || true => true
		 *  true || false => true
		 *  false || true => true
		 *  false || false => false
		 *  
		 *  => || 연산자를 기준으로 결과가 true 인 경우 뒤의 조건은 굳이 실행하지 않는다.
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//사용자에게 두 수를 입력받아 해당 숫자가 1 ~ 100 사이의 값인지 확인
		
//		System.out.println("정수 하나 입력 : ");
//		int num1 = sc.nextInt();
//		
//		// 1 <= num1 <= 100   ->   1 <= num1 && num1 <= 100
		// 연산은 한번에 하나씩!
//		boolean result = (num1  >= 1) && (num1 <= 100);//num1 값이 1 이상 "이고" num1값이 100이하이다.
//		
//		System.out.println("사용자가 입력한 값이 1이상 100이하입니다 : " + result);
//		
		/*		
		*  && : 왼, 오 모든 연산 결과 true
		*  	 하나라도 false 시 false
		*/
		 
		//사용자에게 알파벳 하나를 입력받아 대소문자를 확인
		//문자 하나 입력 : 
		//사용자가 입력한 값이 대문자 입니다 : true/false
		 
//		// 'A' => 65, 'Z' => 90 활용
//		 
//		System.out.println("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
//		 
//		//대문자 -> (65 <= ch <= 90)
//		 
		//첫번째 방법
		boolean res1 = (ch >= 65) && (ch <= 90);
		//두번째 방법 : 자동형번환 활용
		boolean res2 = (ch >= 'A') && (ch <= 'Z');
		boolean res3 = (ch >='a') && (ch <= 'z');
		
		String str = (!res2 && !res3) ? "알파벳 하나만 입력해줏세요" : ("사용자가 입력한 값이 대문자입니다 : " + res2); // res2와 res3이 둘 다 거짓이면 => 알파벳이 아니다.
		System.out.println(str);
		
		System.out.println("사용자가 입력한 값이 대문자입니다 : " + res2);
		 
		
		//사용자에게 성별을 입력받은 후 여자인지 확인
		//성별(M/F) : 
		//사용자가 여자입니까 : (true/false)
		
//		System.out.println("성별(M/F) : ");
//		char str = sc.next().charAt(0);
//		
//		boolean a = (str == 'F' || str == 'f' );
//		System.out.println("사용자가 여자입니까 : " + a);
		
		int num = 10;
		boolean result = (num > 5) && (++num > 0);
		
		System.out.println("result1 : " + result);
		System.out.println("&&연산 후의 num : " + num);
		
		
		int num2 = 10;
		boolean result2 = true || (++num2 > 0);
		System.out.println("||연산 후의 num2 : " + num2); // 두번째 조건 실행하지 않아서 num이 그대로 10으로 남아 있음
			
	}

}
