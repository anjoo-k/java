import java.util.Scanner;
public class Test240116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		// 정수형 변수 num1, num2를 사용자로부터 입력받아
//		// + - * / % 의 결과값을 각각 출력하세요.
//		
//		System.out.print("정수형 변수 1: ");
//		int num1 = sc.nextInt();
//		System.out.print("정수형 변수 2: ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("+: " + (num1 + num2));
//		System.out.println("-: " + (num1 - num2));
//		System.out.println("*: " + (num1 * num2));
//		System.out.println("/: " + (num1 / num2));
//		System.out.println("%: " + (num1 % num2));
		
		
//		//가위바위보를 진행합니다. user1의 가위, 바위 보 정보와 1>3, 2>1, 3>1
//		//user2의 가위, 바위, 보 정보를 받아 누가 이겼는지를 출력하세요.
//		//가위바위보 정보는 숫자로 입력받습니다(가위 = 1, 바위 = 2, 보 = 3)
//		System.out.print("가위바위보(가위 = 1, 바위 = 2, 보 = 3) user1: ");
//		int user1 = sc.nextInt();
//		System.out.print("가위바위보(가위 = 1, 바위 = 2, 보 = 3) user2: ");
//		int user2 = sc.nextInt();
//		//by me
//		while(true) {
//			if (user1 == user2) {
//				System.out.println("비겼습니다.");
//				break;
//			} else if (user1 == 1 && user2 == 3) {
//				System.out.println("user1이 이겼습니다.");
//				break;
//			} else if (user1 == 2 && user2 == 1) {
//				System.out.println("user1이 이겼습니다.");
//				break;
//			} else if (user1 == 3 && user2 == 1) {
//				System.out.println("user1이 이겼습니다.");
//				break;
//			} else {
//				System.out.println("user2가 이겨습니다.");
//				break;
//			}
//		}
//		//by teacher
//		System.out.print("가위바위보(가위 = 1, 바위 = 2, 보 = 3) user1: ");
//		int user1 = sc.nextInt();
//		System.out.print("가위바위보(가위 = 1, 바위 = 2, 보 = 3) user2: ");
//		int user2 = sc.nextInt();
//		
//		if (user1 == user2) {
//			System.out.println("비겼습니다.");
//		} else if ((user1 == 1 && user2 == 3) || (user1 == 2 && user2 == 1) || (user1 == 3 && user2 == 1)) {
//			System.out.println("user1가 이겼습니다.");
//		} else {
//			System.out.println("user2가 이겼습니다.");
//		}
	
		
//		// 15 ~ 111까지의 수를 순서대로 출력하세요.
//		for (int i = 15; i <= 111; i++) {
//			System.out.print(i + " ");
//		}
		
		
//		//숫자를 입력받아 * 2인 숫자를 출력하세요.
//		//유저가 숫자 0을 입력할 때까지 반복하세요.
//		//by me
//		while (true) {
//			System.out.print("숫자를 입력하세요: ");
//			int a = sc.nextInt();
//			System.out.println("* 2 인 숫자를 출력합니다: " + (a * 2));
//			if (a == 2) {
//				System.out.println("끝");
//				break;
//			}
//		}
//		//by teacher
//		int num;
//		do {
//			System.out.print("숫자를 입력하세요: ");
//			num = sc.nextInt();
//			if (num == 0) {
//				break;
//			}
//			System.out.println(num + " * 2 = " + (num * 2));
//		} while(true);
		
		
//		//user3의 가위바위보 정보를 입력받고
//		//컴퓨터의 랜덤한 가위바위보 정보를 생성해
//		//누가 이겼는지 출력하세요.
//		//가위바위보 정보는 숫자로 입력받습니다(가의 = 1, 바위 = 2, 보 = 3) 1>3, 2>1, 3>1
//		//해당 행위를 user3이 5를 입력받을 때까지 반복하세요.

//		
//		while(true) {
//			System.out.print("user3의 가위바위보: ");
//			int user3 = sc.nextInt();
//
//			int random = (int)(Math.random() * 3 + 1);
//			System.out.println("시스템 랜덤 가위바위보: " + random);
//			sc.nextLine();
//			
//			if (user3 == random) {
//				System.out.println("비겼습니다.");
//				
//			} else if ((user3 == 1 && random == 3) || (user3 == 2 && random == 1) || (user3 == 3 && random == 1)) {
//				System.out.println("user3이 이겼습니다.");
//				
//			} else if ((user3 == 3 && random == 1) || (user3 == 1 && random == 2) || (user3 == 1 && random == 3)) {
//				System.out.println("시스템이 이겼습니다.");	
//			} else if (user3 == 5) {
//				System.out.println("종료합니다.");
//				break;
//			}
//		}
	}

}
