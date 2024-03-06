import java.util.Scanner;
public class Loop04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과 도출
		// 단, 해당 프로그램은 연산자 입력에 "exit" 값이 들어올 때까지 무한 반복
		// exit 들어오면 "종료합니다" 하고 종료
		// 또한 연산자가 나누기면서 두 번째 정수가 0으로 들어오면
		// "0으로 나눌 수 없습니다. 다시 입력해주세요" 출력
		// 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		
		int num1, num2;
		String str;
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			str = sc.next();
			if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		
			System.out.print("첫 번째 정수 : ");
			num1 = sc.nextInt();
		
			System.out.print("두 번째 정수 : ");
			num2 = sc.nextInt();
		
			switch (str) {
			case "+" :
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case "-" :
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case "*" :
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case "/" :
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해 주세요.");
					break;
				}
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			case "%" :
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
				break;
			default : System.out.println("없는 연산자 입니다. 다시 입력해 주세요.");
			}
		
		}
		
	}

}
