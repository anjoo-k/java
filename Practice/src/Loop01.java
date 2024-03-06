import java.util.Scanner;
public class Loop01 {
	public static void main(String[] args) {
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력
		// 단, 입력한 수는 1보다 크거나 같아야
		// 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요
		Scanner sc = new Scanner(System.in);
		
//		//by me
//		System.out.print("한 개의 값을 입력하세요: ");
//		int num = sc.nextInt();
//		
//		int i = 1;
//		while (true) {
//			if (num < 0) {
//				System.out.println("1 이상의 숫자를 입력해주세요");
//			} else if(i > num) {
//				break;
//			}
//			System.out.println("1부터 " + i + "까지 숫자 : " + i);
//			i++;
//		}
//		
		//by teacher	
		System.out.print("한 개의 값을 입력하세요: ");
		int num = sc.nextInt();
		
		while (num < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요 : ");
			num = sc.nextInt();
		}
		for(int i = 1; i <= num; i++) {
			System.out.println(i + " ");
		}
	}

}
