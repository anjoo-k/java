import java.util.Scanner;
public class Test240117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		// 사용자로부터 정수형 변수 num1과 num2를 입력받아 큰 값에서 작은 값을 뺀 결과를 출력하세요.
//		//by me
//		System.out.print("num1을 입력하세요(정수) : ");
//		int num1 = sc.nextInt();
//		System.out.print("num2를 입력하세요 : ");
//		int num2 = sc.nextInt();
//		
//		int min = (num1 < num2 ? num1 : num2);
//		int max = (num1 > num2 ? num1 : num2);
//		
//		System.out.println("큰 값에서 작은 값을 빼면(정수) : " + (max - min));
//		
//		//by teacher
//		System.out.print("num1을 입력하세요(정수) : ");
//		int num1 = sc.nextInt();
//		System.out.print("num2를 입력하세요 : ");
//		int num2 = sc.nextInt();
//		
//		if (num1 > num2) {
//			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//		} else {
//			System.out.println(num2 + " - " + num1 + " = " + (num2 - num1));
//		}
		
		
		
//		// 85에서 10까지 수를 1씩 줄여가며 모든 사이의 숫자를 출력하세요.
//		for(int i = 85; i >= 10; i--) {
//			if(i > 0) {
//			System.out.print(i + " ");
//			}
//		}
		
		
//		// 임의의 숫자 하나(1~5)를 생성, 이를 맞추는 프로그램 작성
//		// 몇번만에 맞췄는지를 출력하세요.
//		// ex)
//		// 컴퓨터가 생각하는 수는 : 4(사용자입력)
//		// 컴퓨터가 생각하는 수는 : 2(사용자입력)
//		// 정답입니다. 2번 만에 맞추셨습니다.
//		// count 변수 만들어서 몇 번 입력했는지 횟수 누적하며
//		// do - while 이용해 반복해서 입력받기(사용자가 입력한 값이 랜덤 변수와 같으면 탈출)
//		//by me
//		int target = (int)(Math.random() * 5 + 1);
//		int count = 0; 
//		// *********** 이 초기화를 do while문 안에 넣으면 계속 새로이 초기화 됨. 그래서 계속 같은 값이 나옴
//		do {
//			System.out.print("컴퓨터가 생각하는 수는(1 ~ 5) : ");
//			int num  = sc.nextInt();
//			count++;
//			System.out.println("몇 번 째 입력인가요: " + count);
//			if (target == num) {
//				System.out.println("값이 같습니다. 탈출합니다.");
//				break;
//			}
//			if(num > 5 || num < 0) {
//				System.out.println("값을 잘 못 입력하셨습니다.");
//			}	
//		} while(true);
//		
//		************************ '값이 같지 않을 때'의 조건도 풀 때 생각해 보자***********************
//		// by teacher
//		int target = (int)(Math.random() * 5 + 1);
//		int num, count = 0;
//		do {
//			System.out.print("컴퓨터가 생각하는 수는(1 ~ 5) : ");
//			num  = sc.nextInt();
//			count++;			
//		} while (target != num);
//		System.out.printf("정답입니다. %d번만에 맞추셨습니다," count);


		
//		// 길이가 10인 배열 선언하고 1부터 10까지 값을 반복문 이용해
//		// 순서대로 대입하고 그 값을 출력하세요.
//		//by me
//		int[] arr = new int[10];
//		System.out.print("배열의 값은: ");
//		for(int i = 0; i < 10; i++) {
//			arr[i] = (i + 1);
//			System.out.print((i + 1) + " ");
//		}
//		
//		//by teacher
//		int[] arr = new int[10];
//		System.out.print("배열의 값은: ");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (i + 1);
//			System.out.print((i + 1) + " ");
//		}
		
		
//****************************************이거 어렵다****************************************		
//		// 로또 추첨 번호를 예상하는 프로그램 작성
//		// 임의의 숫자를 1에서 45까지 총 6개 추첨, 당첨번호를 구한다.
//		// 중복된 숫자는 있으면 안된다.
//		
//		//by teacher
//		int[] arr = new int[6];
//
//		for (int i = 0; i < arr.length; i++ ) {
//			arr[i] = (int)(Math.random() * 45 + 1);
//			if(i > 0) {
//				for (int j = 0; j < i; j++) { // 배열에서 생성된 앞 쪽만 검사해 주면 됌
//					if (arr[i] == arr[j]) {
//						i--;
//						break;
//					}
//				}	
//			}
//		}
//		System.out.printf("%d %d %d %d %d %d", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
		
		
		
	}

}
