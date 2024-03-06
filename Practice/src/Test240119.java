import java.util.Scanner;
public class Test240119 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		// 정수형 변수 age를 입력받아
//		// 7세 이하면 어린이, 19세 이하면 청소년, 20세 이하면 성인을 출력하세요.
//		System.out.print("나이 입력 : ");
//		int age = sc.nextInt();
//		
//		if(age > 0) {
//			if(age <= 7) {
//				System.out.println("어린이");
//			} else if (age <= 19) {
//				System.out.println("청소년");
//			} else {
//				System.out.println("성인");
//			}
//		}
		
		//********************************두 수 사이에 있는 값 찾기
//		// 정수 num1, num2 두 개를 입력받아 두 수 사이에 있는 3의 배수 모든 합을 구하세요.
//		System.out.print("정수입력1 : ");
//		int num1 = sc.nextInt();
//		System.out.print("정수입력2 : ");
//		int num2 = sc.nextInt();
//		
//		int min, max;
//		min = (num1 < num2 ? num1 : num2);
//		max = (num1 > num2 ? num1 : num2);
//		
//		int i = min;
//		int sum = 0;
//		while(i <= max && i >= min) {
//			if(i % 3 == 0) {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("3의 배수 합 : " + sum);
		
//		//by teacher
//		for(int i = min; i <= max; i++) {
//			if(i % 3 == 0) {
//				sum+= i;
//			}
//		}
//		System.out.printf("%d와 %d 사이의 3의 배수의 총 합 :", %d, min, sum);
		
		
//		System.out.print("정수입력 : ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		int min, max;
//		min = (num1 < num2 ? num1 : num2);
//		max = (num1 > num2 ? num1 : num2);
//		
//		int i = min;
//		int sumOdd = 0;
		
//		while(i <= max && i >= min) {
//			if(i % 2 == 1) {
//				sumOdd += i;
//			}
//			i++;
//		}
//		System.out.println("홀수합 : " + sumOdd);
//		
//		int j = min;
//		int sumEven = 0;
//		while(j <= max && j >= min) {
//			if(j % 2 == 0) {
//				sumEven += j;
//			}
//			j++;
//		}
//		System.out.println("짝수합 : " + sumEven);
		
//		//by teacher
//		int num1, num2, sum1 = 0, sum2 = 0;
//		System.out.print("정수 두 개 입력: ");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		
//		for (int i = (num1 < num2 ? num1 : num2); i <= (num1 > num2 ? num1 : num2); i++) {
//			if(i % 2 == 1) {
//				sum1 += i;
//			} else {
//				sum2 +=i;
//			}
//		}
//		
//		System.out.println("홀수의 총합: " + sum1);
//	    System.out.println("짝수의 총합: " + sum2);
		
		
			
//		// 첫째줄에 데이터 갯수 n개를 입력받고,
//		// 사용자로부터 n개의 정수를 입력받아 입력받은 반대로 출력하세요.
//		// ex) 정수 입력 : 5
//		// 숫자 입력 : 1 7 5 9 4
//		// 반대로 출력 : 4 9 5 7 1
//		System.out.print("데이터 갯수 : ");
//		int data = sc.nextInt();
//		
//		int[] arr = new int[data];
//		
//		System.out.println();
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(i+ "번째 정수 입력:");
//			arr[i] = sc.nextInt(); 
//		}
//		
//		for(int i = (arr.length - 1); i >= 0  ; i--) {
//			System.out.print(arr[i] + " ");
//		}				
//		
//		sc.close();
//		//*********************************************이해가 안돼
//		// 사용자에게 행의 크기를 입력 받고 그 수만큼 반복을 통해 열의 크기도 받아
//		// 문자형 가변 배열을 선언 및 할당하세요.
//		// 그리고 각 인덱스에 'a'부터 총 인덱스의 갯수만큼 하나씩 늘려 저장하고 출력하세요.
//		int row, col;
//		System.out.print("행의 크기(행의 갯수):");
//		row = sc.nextInt();
//		
//		char[][] arr = new char[row][];
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(i + " 행의 열 크기(열의 갯수):");
//			col = sc.nextInt();
//			arr[i] = new char[col];
//		}
//		
//		char ch = 'a';
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = ch++;
//			}
//		}	
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		
//		sc.close();
	}

}
