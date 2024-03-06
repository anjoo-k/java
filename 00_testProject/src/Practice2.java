import java.util.Scanner;

public class Practice2 {
	/*
	 * 키보드로 정수 도개를 입력받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		System.out.print("첫 번째 정수 : ");
		a = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		b = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (a + b));		
		System.out.println("빼기 결과 : " + (a - b));
		System.out.println("곱하기 결과 : " + (a * b));
		System.out.println("나누기 결과 : " + (a / b));
		
	}

}
