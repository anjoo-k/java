import java.util.Scanner;
public class Array03 {
	public static void main(String[] args) {
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		 * 갯수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String str = sc.next();
		
		char[] ch = new char[str.length()];
		
		for(int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
		}
		System.out.print("문자 : ");
		char target = sc.next().charAt(0);
		
		int count = 0;
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == target) {
				count++;
				System.out.println("인덱스" + i + " ");
			}

		}
		
		
		System.out.println("\n" + target + "개수 : " + count);
		
		
		/* 문자열을 입력하고
		 * 배열을 만들고
		 * 배열에 값을 넣고
		 * 
		 * 검색할 문자를 설정하고
		 * 검색할 문자가 문자열 몇 번번째에 몇 개인지 출력
		 * (하나하나 체크해 봐야겠죠?)
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
//		
//		System.out.print("문자열 : ");
//		String str = sc.nextLine();
//		char[] chArr = new char[str.length()];
//		
//		System.out.print("문자 : ");
//		String ch = sc.nextLine();
//		
//		int count = 0;
//		for(int i = 0; i < chArr.length; i++ ) {
//			chArr[i] = str.charAt(i); 
//		}
//		System.out.println(count);
//		
//
//		int count = 0;
//		for(int i = 0; i < chArr.length; i++ ) {
//			str.charAt(i);
//			count++;
//			System.out.println(str + "에 " + ch + "가 존재하는 위치(인덱스) : " + chArr[i]);
//			System.out.println(count);
//		}
		
		
//		// 1. 문자열을 입력받아
//		System.out.print("문자열 : ");
//		String str = sc.next();
//		int count = 0;
//		
//		// 2. 배열을 만들어서 문자열 -> 문자로 바꿔서 배열에 넣는다.
//		char[] chArr = new char[str.length()]; // 내가 입력한 문자(hello) 길이와 같은 배열 생성
//		
//		// 3. 문자열 -> 문자로 바꿔서 배열에 넣는다.
//		for (int i = 0; i < chArr.length; i++) { // 문자열을 문자로 바꿀 때 charAt 이용해 하나씩 가져오기
//			chArr[i] = str.charAt(i); // chArr[0] = 'h', chArr[1] = 'e'..
//		}
//		
//		// 4. 문자 하나 입력받기
//		System.out.print("문자 : ");
//		char target = sc.next().charAt(0);
//		
//		// 5. 검색할 문자가 문자열에 맞게 들어가 있는지
//		// 갯수와 몇 번째 인덱스에 위치하는지 인덱스를 검색
//		
//		System.out.println(str + "에 존재하는 위치(인덱스) : ");
//		
//		for (int i = 0; i < chArr.length; i++) {
//			if (target == chArr[i]) { // 배열의 i번재 값과 문자가 동일한지 체크
//				count++; // 동일한 문자 발견 시 숫자 기록해주기
//				System.out.println(i + " "); // 인덱스 출력
//			}
//		}
//		System.out.println("\n" + target + "개수 : " + count);
		

		
		
		

		
		
	}

}
