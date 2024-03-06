import java.util.Scanner;
public class A_Array03 {
	public static void main(String[] args) {
//		// 1. 크기가 10인 정수형 배열 생성 후,
//		int[] arr = new int[10];
//		
//		// 2. 반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값 대입
//		// 매번 1 ~ 100 사이의 랜덤값
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 100 + 1);
//		}
//		
//		// 3. 반복문을 활용해서 해당 배열의 0번 인덱스 ~ 마지막 인덱스까지 담겨있는 값을 전부 출력
//		// arr[x] : XX
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 100 + 1);
//			System.out.println("arr[" + i + "] : " + arr[i]);
//		}
		

		
		
//		// 1. 사용자에게 배열의 길이를 입력받은 후,
//		// 해당 크기의 문자열 배열을 생성해라
		Scanner sc = new Scanner(System.in);
//		System.out.print("배열 길이 입력 : ");
//		int length = sc.nextInt();
//		
//		String[] arr = new String[length];
//		sc.nextLine();
//		
//		// 2. 반복문을 활용해서 매번 사용자에게 과일명을 입력받아 그 값을 매 인덱스 자리에 대입(0 ~ 마지막 인덱스)
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print("과일 이름 : ");
//			arr[i] = sc.next();
//		}
//		
//		// 3. 반복문 이용해 0 ~ 마지막 인덱스까지 담긴 값 출력
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println("arr[" + i + "] : " + arr[i]);
//		}
		
		
		
//		// 1. 사용자에게 문자열 한개 입력받기
		// 2. char배열 생성해두기(배열의 길이 == 문자열의 길이)
		// 3. 반복문을 통해서 해당 문자열에서 각각 인덱스별 문자를 char 배열의 각 인덱스에 대입
		// 4. 반복문을 이용해서 해당 배열의 0 ~ 마지막 인덱스까지 담긴 값을 출력
		
		
//		// 사용자에게 문자열 하나 입력받은 후  ********************* 문자, 문자열 문제 어려워 ***********
//		// 각각의 인덱스에 있는 문자들을 char 배열에 옮겨 담기
//		// 1. 사용자에게 문자열 한개 입력받기
//		System.out.print("문자열 입력 : ");
//		String str = sc.next();
//				
//		// 2. char배열 생성해두기(배열의 길이 == 문자열의 길이)
//		char[] chArr = new char[str.length()];
//		
//		// 3. 반복문을 통해서 해당 문자열에서 각각 인덱스별 문자를 char 배열의 각 인덱스에 대입
//		for(int i = 0; i < chArr.length; i++) {
//			chArr[i] = str.charAt(i);
//		}
//		
//		// 4. 반복문을 이용해서 해당 배열의 0 ~ 마지막 인덱스까지 담긴 값을 출력
//		for(int i = 0; i < chArr.length; i++) {
//			chArr[i] = str.charAt(i);
//			System.out.println("chArr[" + i + "] : " + chArr[i]);
//		}
		

		
//		// 1. 사용자에게 배열의 길이를 입력받은 후 해당 크기만큼의 정수 배열 생성
//		System.out.print("배열의 길이 : ");
//		int num = sc.nextInt();
//		int[] nArr = new int[num];
//		
//		// 2. 반복문 활용, 0 ~ 마지막 인덱스까지 매번 1 ~ 100 사이의 랜던값 발생시켜 대입
//		for(int i = 0; i < nArr.length; i++) {
//			nArr[i] = (int)(Math.random() * 100 + 1);
//		}
//		
//		// 3. 반복문 활용, 배열에 담긴 모든 값을 출력함과 동시에
//		// 짝수인 값들의 총 합을 구해라.
//		int sum = 0;
//		for(int i = 0; i < nArr.length; i++) {
//			System.out.println("배열에 담긴 모든 값 : " + nArr[i]);
//			if (nArr[i] % 2 == 0) {
//				sum += nArr[i]; 
//			}
//		}
//		
//		// 4. 위에서 구한 짝수값의 총합 출력
//			System.out.println("짝수값 총 합 : " + sum);
//		
		
	}
}
