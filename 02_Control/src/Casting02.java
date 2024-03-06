import java.util.Scanner; // 정수 <-> 실수
public class Casting02 {
	public static void main(String[] args) {
		/* 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균을 출력하세요.
		 * 이 때 총점과 평균은 정수형으로 처리하세요.
		 * 
		 * ex)
		 * 국어: 90.0
		 * 수학: 90.0
		 * 영어: 90.0
		 * 총점: 270
		 * 평군: 90
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double num1 = sc.nextDouble();
		
		System.out.print("수학 : ");
		double num2 = sc.nextDouble();
		
		System.out.print("영어 : ");
		double num3 = sc.nextDouble();
		
		int total = (int)(num1 + num2 + num3);
		int average = (int)(total / 3);
		
		System.out.println("총점 : " + total);
		System.out.println("평군 : " + average);
		
		
		}

}