package com.kh.Test2401252;
import java.util.Scanner;
public class Run {
	public static void main(String[] args) {
		// 정수형 변수 num1, num2 입력받아 num1부터 num2 까지 수 중
		// 홀수만을 출력해라
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		System.out.print("num1:");
		num1 = sc.nextInt();
		System.out.print("num2:");
		num2 = sc.nextInt();
		
		int min = num1 < num2 ? num1 : num2;
		int max= num1 > num2 ? num1 : num2;
		
		for (int i = min; i <= max; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");	
			}
			
			
		}
		
		
	}

}
