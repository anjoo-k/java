import java.util.Scanner;
public class Test240118 {
	public static void main(String[] args) {
//		// 실수 num1과 num2를 사용자로부터 입력받아 +, %, / 3가지 결과를 출력해라
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 1: ");
//		double num1 = sc.nextDouble();		
//		System.out.print("정수 입력 2: ");
//		double num2 = sc.nextDouble(); 
//		
//		System.out.println("num1 * num2 = " + (num1 * num2));
//		System.out.println("num1 % num2 = " + (num1 % num2));
//		System.out.println("num1 / num2 = " + (num1 / num2));
		
		
		
//		// 정수형 변수 num3을 사용자로부터 입력받아 100보다 작으면 100이하
//		// 100 초과 200 이하
//		// 200 초과 300 이하
//		// 그것도 아니면 300 초과를 출력해라
//		System.out.print("정수 입력: ");
//		int num3 = sc.nextInt();
//		
//		if (num3 < 100) {
//			System.out.println("100이하 입니다.");
//		} else if (num3 < 200) {
//			System.out.println("100초과 200이하 입니다.");
//		} else if (num3 < 300) {
//			System.out.println("200초과 300이하 입니다.");
//		} else {
//			System.out.println("300초과입니다.");
//		}
		
		
		
//		// 수학, 영어, 국어 성적을 입력받아 평균이 60이상이면 합격입니다.
//		// 60보다 작으면 불합격입니다. 출력
//		// by me
//		System.out.print("수학 점수 : ");
//		int math = sc.nextInt();
//		System.out.print("영어 점수 : ");
//		int eng = sc.nextInt();
//		System.out.print("국어 점수 : ");
//		int lan = sc.nextInt();
//		
//		double average = (math + eng + lan) / 3;
//		
//		if(average > 60) {
//			System.out.println("합격입니다");
//		} else {
//			System.out.println("불합격입니다");
//		}
//		
//		//by teacher
//		int ko, en, ma;
//		System.out.println("수학, 영어, 국어 접수를 입력해 주세요: ");
//		ko = sc.nextInt(); //숫자만 가져가니까 띄어쓰기로 구별해서 적어주면 됌
//		en = sc.nextInt();
//		ma = sc.nextInt();
//		
//		if((ko + en + ma) / 3 >= 60) {
//			System.out.println("합격입니다");
//		} else {
//			System.out.println("불합격입니다");
//		}
			
		
		
//		// 국어성적을 입력받아 50점 이하는 F학점
//		// 50점 초과 60점 이하는 D학점
//		// 70점 초과 80점 이하는 B학점
//		// 80점 초과는 A학점을 출력하는 프로그램을 작성해라
//		
//		System.out.print("국어 점수 : ");
//		int lan2 = sc.nextInt();
//		
//		if(lan2 < 0 || lan2 > 100) {
//			System.out.println("잘 못 입력하셨습니다");
//		} else if (lan2 <= 50) {
//			System.out.println("F학점");
//		} else if (lan2 <= 60) {
//			System.out.println("D학점");
//		} else if (lan2 <= 70) {
//			System.out.println("B학점");
//		} else {
//			System.out.println("A학점");
//		}		
		
		
		
//		// 크기가 9인 1차원 배열 arr1을 작성하고 구구단 2단을 각 인덱스에 대입해라
//		// ex) arr1[0] = "2 * 1 = 2";
//		//by me
//		int[] arr1 = new int[9];
//		
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i] = (2 * (i + 1));
//			System.out.println("구구단 2단: 2 * " + (i + 1) + " = " + arr1[i] );
//		}
//		//by teacher
//		String[] arr1 = new String[9];
//		
//		for (int i = 0; i < arr1.length; i++) {
//			int su = i + 1;
//			arr1[i] = "2 * " + su + " = " + (2 * su);
//		}
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
		
		
		
		
//		// 크기가 9인 1차원 배열 arr2을 작성하고 구구단 3단을 각 인덱스에 대입해라
//		// ex) arr2[0] = "3 * 1 = 3";
//		
//		int[] arr2 = new int[9];
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i] = (3 * (i + 1));
//			System.out.println("구구단 3단: 3 * " + (i + 1) + " = " + arr2[i] );
//		}
		
		
		
		// 크기가 [8][9]인 2차원 배열 arr3을 작성하고 구구단 2~9단을 각 인덱스에 대입해라
		// ex) arr3[0][0] = "2 * 1 = 2";
		//by me
		int[][] arr3 = new int[8][9];
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("========= " + (i + 2) + "단 ==========");
			for(int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = (i + 2) * (j + 1);
				System.out.println((i + 2) + " * " + (j + 1) + " = " + arr3[i][j]);
			}
		}
//		//by teacher
//		String[][] arr3 = new String[8][9];
//		for(int j = 0; j < arr3.length; j++) {
//			for(int i = 0; i < arr3[j].length; i++) {
//				int dan = j + 2;
//				int su = i + 1;
//				arr3[j][i] = (dan + " * " + su + " = " + (dan * su));
//			}
//		}
//		for(int i = 0; i < arr3.length; i++) {
//			System.out.println("========" + (i + 2) + "========");
//			for (int j = 0; j < arr3[i].length; j++) {
//				System.out.println(arr3[i][j]);
//			}
//		}
		
		
		
//		// 구구단 한 단을 배열에 저장하는 반복문
//		for (int i = 0; i < arr1.length; i++) {
//		int su = i + 1;
//		arr1[i] = "2 * " + su + " = " + (2 * su);

		
	}
}
