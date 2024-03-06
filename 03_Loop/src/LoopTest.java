import java.util.Scanner;
public class LoopTest {
	public static void main(String[] args) {
		
//		//길이가 제한된 반복에 많이 쓰인다.
//		System.out.println("반복문 시작전");
//		// for (초기식; 조건식; 증감식)
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("반복문 실행 : " + i);
//		}
//		
//		System.out.println("반복문 종료");
//		
//		int i = 0;
//		while (i < 10) {
//			System.out.println("반복문 실행 : " + i);
//			i++;
//		}
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0; // while문에 들어가려면 무조건 첫 조건을 넣어줘야 돌아간다(for문도 마찬가지)
		while (num != 7) {
			System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");
			System.out.print("메뉴 번호를 입력하세요 : ");
			int menu = sc.nextInt();
		
			if (menu == 1) {
				System.out.println("입력메뉴입니다.");
			} else if (menu == 2) {
				System.out.println("수정메뉴입니다.");
			} else if (menu == 3) {
				System.out.println("조회메뉴입니다.");
			} else if (menu == 4) {
				System.out.println("삭제메뉴입니다.");
			} else if (menu == 7) {
				System.out.println("프로그램이 종료됩니다.");
				return;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		
//		// do-while: 무조건 첫 조건을 넣어줘야하는 while문 단점 보완, 일단 시작할 때 첫조건 무시하고 시작해라
//		// 근데 생각보다 잘 안쓴다
//		int num;
//		do {
//			System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");
//			System.out.print("메뉴 번호를 입력하세요 : ");
//			int menu = sc.nextInt();
//		
//			if (menu == 1) {
//				System.out.println("입력메뉴입니다.");
//			} else if (menu == 2) {
//				System.out.println("수정메뉴입니다.");
//			} else if (menu == 3) {
//				System.out.println("조회메뉴입니다.");
//			} else if (menu == 4) {
//				System.out.println("삭제메뉴입니다.");
//			} else if (menu == 7) {
//			System.out.println("프로그램이 종료됩니다.");
//			} else {
//				System.out.println("잘못입력하셨습니다.");
//			}
//		} while(num != 7);
		
		
	}
}
