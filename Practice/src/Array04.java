import java.util.Scanner;
public class Array04 {
	public static void main(String[] args) {
		/*
		 * "월"요일부터 "일"요일까지 요일에 대한 정보를 가지고 있는 배열을 하나 만들어 줍니다.
		 * 0 ~ 6 까지의 숫자를 입력받아 해당 인덱스에 있는 요일을 출력하고 범위에 없는 숫자를 입력 시
		 * 0 ~ 6 사이의 숫자를 입력하세요 : 를 출력하고 다시 입력을 받습이다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		//by me 그런데 0~6아니면 오류남
//		String[] str = {"일", "월", "화", "수", "목", "금", "토"};
//		
//		int i = 0;
//		while(true) {
//			System.out.print("요일을 출력하세요(0 ~ 6) : ");
//			int a = sc.nextInt();
//			if(a == 0 || a == 1 || a == 2 || a == 3 || a == 4 || a == 5 || a == 6 || a == 7) {
//				System.out.println("요일은 : " + str[a]);
//				break;
//			} else {
//				System.out.println("0 ~ 6 사이의 숫자를 입력하세요 : ");
//			}
//			i++;
//		}
		
		// by teacher			
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		int num;
		
		do {
			System.out.print("0 ~ 6 사이 숫자 입력 : ");
			num = sc.nextInt();
		} while(num < 0 || num > 6); 
		
		System.out.println(week[num] + "요일");
		
	}

}
