package test6;

import java.util.Scanner;

/**
 * Exception 연습
 */
public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		
		System.out.print("정수 입력(2 ~ 5): ");
		int data = sc.nextInt();
		
		try {
			System.out.println("결과값 : " + c.getSum(data));
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
