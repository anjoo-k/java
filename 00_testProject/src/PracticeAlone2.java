import java.util.Scanner;

public class PracticeAlone2 {
	private static final String Angu = null;

	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("고양이 이름: ");
		String str = sc.next();
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		
		System.out.print("고양이 나이: ");
		int age = sc.nextInt();
		float age2 = (int)age;
		/*
		 * 포맷안에서 쓰일 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열(문자)
		 * %f : 실수
		 */


		
		System.out.printf("고양이 이름은 %s이고 고양이 나이는 %.2f 입니다.", str, age2);
	}

}
