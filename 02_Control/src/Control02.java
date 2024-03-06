import java.util.Scanner; // Casting02 진화발전
public class Control02 {
	public static void main(String[] args) {
		/* 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균을 출력하세요.
		 * 평균을 계산하고 합격인지 불합격인지 나타내는 프로그램을 작성하세요.
		 * 이 때 총점과 평균은 정수형으로 처리하세요.
		 * (합격조건 : 세과목 점수가 각각 40점 이상 그리고 평균이 60점 이상일 경우)
		 * 
		 * ex)
		 * 국어: 90.0
		 * 수학: 90.0
		 * 영어: 90.0
		 * 총점: 270
		 * 평군: 90
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		double num1 = sc.nextDouble();
		
		System.out.print("수학점수 : ");
		double num2 = sc.nextDouble();
		
		System.out.print("영어점수 : ");
		double num3 = sc.nextDouble();
		
		int total = (int)(num1 + num2 + num3);
		int average = (int)(total / 3);
		
		if (num1 >= 40 && num2 >= 40 && num3 >= 40 && average >= 60 ) {
			System.out.println("국어 : " + (int)num1);
			System.out.println("수학 : " + (int)num2);
			System.out.println("영어 : " + (int)num3);
			System.out.println("축하합니다, 합격입니다!");
			System.out.println("총점 : " + total);
			System.out.println("평군 : " + average);
		} else {
			System.out.println("불합격입니다.");
		}
	}
}