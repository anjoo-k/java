import java.util.Scanner;
public class Array07 {
	public static void main(String[] args) {
		// 사용자가 입력한 값이 배열에 있는지 검색하여
		// 있으면 "ㅇㅇㅇ치킨 배달 가능", 없으면 "ㅇㅇㅇ치킨은 없는 메뉴입니다"를 출력하세요
		// 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("치킨 메뉴 고르기: ");
		String pick =sc.next();
		
		String[] menu = {"후라이드", "양념", "반반"};
		
		boolean isTrue = false;
		
		for(int i = 0; i < menu.length; i++) {
			if(pick.equals(menu[i])) {
				isTrue = true;
				break;
			}
		}
		
		if (isTrue) {
			System.out.println(pick + "치킨 배달 가능");
		} else {
			System.out.println(pick + "치킨은 없는 메뉴입니다");
		}
		

		
//		boolean isTrue = false;
//		
//		System.out.print("원하는 치킨 메뉴 : ");
//		String pick = sc.next();
//		
//		String[] menu = {"후라이드", "양념", "간장", "마늘"};
//		
//		for(int i = 0; i < menu.length; i++) {
//			if(menu[i].equals(pick)) {
//				isTrue = true;
//				break;
//			}
//		}
//		
//		if (isTrue) {
//			System.out.println(pick + "치킨 배달 가능");
//		} else {
//			System.out.println(pick + "치킨은 없는 메뉴입니다");
//		}
//		
	}

}
