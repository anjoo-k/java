
public class PrintTest {
	
	public static void main(String[] args) {
		/*
		 * 화면에 내용을 출력하기 위한 기본적인 출력문
		 * Systm.out.print("내용입력");
		 * 화면에 내용을 출려하기위한 기본적인 출력문 + 마지막 개행
		 * System.out.println("내용입력");
		*/
		
		System.out.print("안녕하세요");
		System.out.print("출력문입니다.");
		
		System.out.println();
		
		System.out.println("안녕하세요");
		System.out.println("출력문입니다.");
		
		
		/*
		 * 출력하고자 하는 값들을 제시한 형식에 맞춰서 출력하는 출력문
		 * System.out.printf("출력하고자하는 형식", 출력하고자하는 값, 값, 값);
		 */
		
		
		int n1 = 10;
		int n2 = 20;
		
		//"10 20"
		System.out.println("n1의 값은" + n1 + "n2의 값은 :" + n2);
		
		/*
		 * 포맷안에서 쓰일 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열(문자)
		 * %f : 실수
		 */
		System.out.printf("%d %f", n1, 3.14);
		System.out.println();
		
		System.out.printf("n1의 값은 : %d n2의 값은 : %f", n1, 3.14); //printf 형식 맞출 때 편하다
		System.out.println();
		
		int a = 2;
		double b = 1.5;
		String c = "안녕";
		System.out.printf("%d %f %s 입니다.", a, b, c);
		
		
	}

}
