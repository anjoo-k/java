import java.util.Scanner;

public class Operator04 {

	public static void main(String[] args) {
		/* 
		 * 비교연산자 / 관계연산자 (이항연산자)
		 * 두 값을 비교하는 연산자
		 * 비교연산자는 조건을 만족하면 true, 만족하지 않으면 false를 반환한다.
		 * 즉, 비교연산의 결과는 논리값이다.
		 * 
		 * 대소비교연산자 : < > <= >=
		 * 동등비교연산자 : == !=(같지 않냐)
		 * 
		 * 원시타입의 일반변수 => 동등비교를 ==, !=로 진행하면 된다.
		 * String(문자열)은 단순하게 ==로 동등비교할 수 없다.
		 * 이유는 참조변수(객체를 담는 변수)이기 때문
		 * 
		 * String 비교할 때
		 * str1.equals(str2)
		 * 
		 */
		
//		int a = 10;
//		int b = 25;
//		
//		System.out.println("a == b : " + (a == b) );
//		System.out.println("a <= b : " + (a <= b) );
//		
//		boolean result = (a > b); // true, false를 boolean에 저장해서 사용 가능
//		System.out.println("result : " + result);
//		
//		//산술연산 + 비교연산
//		System.out.println((a * 2) > (b / 5));
//		System.out.println("a가 짝수인가: " + (a % 2 == 0));
//		System.out.println("a가 홀수인가: " + (a % 2 != 0));
//		System.out.println("a가 홀수인가: " + !(a % 2 == 0));
		
		// 두 수를 입력받아 어떤 숫자가 더 큰지를 출력하는 프로그램
		
		// 첫번째 정수 : ()
		// 두번째 정수 : ()
		// 첫번째가 두번째보다 큽니다 : (true/false)
		// 첫번째 정수는 짝수입니다 : (true/false)
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 정수 : ");
//		int num1 = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("두번째 정수 : ");
//		int num2 = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.println("첫번째가 두번째보다 큽니다 : " + (num1 > num2));
//		System.out.println("첫번째 정수는 짝수입니다 : " + (num1 % 2 == 0));
//		System.out.println("첫번째 정수는 짝수입니다 : " + !(num1 % 2 == 1));
		
		//특이케이스(문자와 숫자간의 대소비교 가능!!)
		System.out.println((char)'A' + 0);
//		System.out.println('A' > 60);
//		System.out.println('Z' + 90);
		// 'A' ~ 'Z' 65 ~ 90까지의 숫자로 연달아 나열되어있다.
		
		String str1 = new String("a");
		String str2 = new String("b");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1 + " " + str2); //" " 문자열(객체)로 만들어주기 위해
		System.out.println("as".equals("as"));
		// ex)String str1 = new String("a");
		// 처음에 str1은 주소값만큼의 메모리만 차지하고 있다. new는 (주소와 연결된) 새로운 메모리 공간을 잡아준다.
		// = 비어 있는 메모리 공간에 new를 쓰면 메모리 공간을 잡아주라는 뜻
		
		//System.out.println("as" == "as"));
		//as는 여기서 리터럴. 리터럴을 위한 메모리 공간에 as를 넣어준다. 앞 as, 뒤 as
		//예전에는 두 문자가 같은 것을 몰랐는데 자바가 발전하면서 이제 같은 주소값 반환 가능
		

	}

}
