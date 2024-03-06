import java.util.Scanner;
public class Array06 {
	public static void main(String[] args) {
		// 3 이상인 홀수 자연수를 입력받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		// 단, 입력한 정수가 홀수가 아니거나 3미만일 경우 "다시 입력하세요"를 출력하고
		// 다시 정수를 받도록 하세요.
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		
//		
//		for (int i = 0; i < (arr.length / 2 + 1); i++) {
//			if (num % 2 == 0 || num < 3) {
//				System.out.println("다시 입력하세요.");
//			}
//			arr[i] = i + 1;
//			
//			System.out.print(arr[i] + " ");		
//		}
		
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		while (num % 2 == 0 || num < 3) {
			System.out.println("다시 입력하세요.");
			System.out.print("정수 : ");
			num = sc.nextInt();
		}
		
		int[] arr = new int[num];
		int mid = num / 2;
		
//		// A 방식
//		arr[0] = 1;
//		for (int i = 1; i <= mid; i++) {
//			arr[i] = arr[i - 1] + 1;
//		}
//		for(int i = mid + 1; i < arr.length; i++) {
//			arr[i] = arr[i - 1] - 1;
//		}
		// B 방식
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i <= mid) {
				arr[i] = ++count;
			} else {
				arr[i] = --count;
			}
		}
		// A, B 뒤에 붙여붙여
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
