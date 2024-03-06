import java.util.Scanner;
public class A_if02 {	// A_if02 이름을 가진 클래스
	public static void main(String[] args) { // main 메서드
		Scanner sc = new Scanner(System.in);
		
		// 나이를 입력받아
		// 13세 이하 : 어린이
		// 13세 초과 ~ 19세 이하 : 청소년
		// 19세 초과 : 성인
		// xx세는 xxx에 속합니다.
		
//		int age;
//		String type = "";
//		
//		System.out.print("나이(정수만) : ");
//		age = sc.nextInt();
//		sc.nextLine();
		
//		if (age <= 13) {
//			type = "어린이";
//		} else if (age > 13 && age <= 19) {
//			type = "청소년";
//		} else {
//			type = "성인";
//		}
//		
//		System.out.println(age + "세는 " + type + "에 속합니다");
		
		
		//if 만 이용해 만들어보라.
		
//		if (age <= 13) {
//			type = "어린이";
//		} if (age > 13 && age <= 19) {
//			type = "청소년";
//		} if (age > 19) {
//			type = "성인";
//		}
//		
//		System.out.println(age + "세는 " + type + "에 속합니다");
		
		
		//============================================================
		
		/*
		 * 성별을 (m/f)로(대소문자 상관없음) 입력받아 남학생인지 여학생인지
		 * 출력하는 프로그램을 작성하세요.
		 * 성별(m/f) :
		 * 여학생입니다 / 남학생입니다 / 잘못입력하셨습니다.
		 */
		
//		System.out.print("성별(m/f) : ");
//		char gender = sc.next().charAt(0);
//		
//		String type = "";
//		if (gender == 'm' || gender == 'M') {
//			type = "남학생입니다.";
//		} else if (gender == 'f' || gender == 'F') {
//			type = "여학생입니다.";
//		} else {
//			type = "잘 못 입력하셨습니다.";
//		}
//		
//		System.out.println(type);
		
		
		/*
		 * return 문: return 밑으로 내려가지 않고 종료
		 */
		
//		System.out.print("성별(m/f) : ");
//		char gender = sc.next().charAt(0);
//		
//		String type = "";
//		String name = "고양이";
//		if (gender == 'm' || gender == 'M') {
//			type = "남학생";
//		} else if (gender == 'f' || gender == 'F') {
//			type = "여학생";
//		} else {
//			System.out.println("잘 못 입력하셨습니다.");
//			return; // 해당 메소드 자체를 빠져나가는 구문
//		}
//		
//		System.out.println(name + " 님은" + type + "입니다." );
		
		
		//============================================================
		
		/*
		 * 정수(양수)를 입력받아
		 * 짝수인지 홀수인지 출력하는 프로그램 작성
		 * 정수(양수) 입력 : ()
		 * 짝수다. / 홀수다. / 양수가 아닙니다. 잘못입력하셨습니다.
		 */
		
		// by me
		System.out.print("정수(양수) 입력 : ");
		int num = sc.nextInt();
		
		String type;
		if (num % 2 == 0 && num > 0) {
			type = "짝수다.";
		} else if (num % 2 != 0 && num > 0) {
			type = "홀수다.";
		} else if (num <= 0) {
			type = "양수가 아닙니다.";
		} else {
			type = "잘못입력하셨습니다."; // 잘못입력하셨습니다는 영원히 안나오는건가?
		}
		
		System.out.println(type);
		
		
//		 by teacher
//		System.out.print("정수(양수) 입력 : ");
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		if (num > 0) {
//			if (num % 2 == 0) {
//				System.out.println("짝수다.");
//			} else {
//				System.out.println("홀수다.");
//			}
//		} else {
//			System.out.println("양수가 아닙니다. 잘못입력하셨습니다.");
//		}
		
	}

}

















