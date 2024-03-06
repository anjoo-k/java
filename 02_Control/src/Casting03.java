import java.util.Scanner;
public class Casting03 {
	public static void main(String[] args) {
		/*
		 * 선언 및 초기화된 5개의 변수를 가지고
		 * 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여
		 * 다음과 같은 값이 나오도록 코드를 작성하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum1 % iNum2); // 2
		System.out.println((int)dNum); //2
		
		System.out.println(dNum * iNum2); // 10.0 -> 형변환 규칙(실수>정수): 형번환 double로 맞취진다
		System.out.println((float)iNum1); // 10.0
		
		//System.out.println((double)(iNum1 / iNum2)); // 2.5
		// -> 왜 2.0 나오지?  (iNum1 / iNum2) 에서 이미 정수형 결과 2로 결론이 나버림
		
		System.out.println((double)iNum1 / iNum2); //2.5
		System.out.println(dNum); // 2.5
		
		System.out.println((int)fNum); // 3
		System.out.println((int)(iNum1 / fNum)); // 3
		// = System.out.println(iNum1 / (int)fNum); // 3
		
		System.out.println(iNum1 / fNum); // 3.3333333 -> 형변환 규칙(실수>정수): 형번환 float로 맞취진다
		System.out.println((double)iNum1 / fNum); // 3.33333333333335
		
		System.out.println(ch); // 'A'
		System.out.println((int)ch); // 65
		System.out.println((int)ch + iNum1); // 75
		System.out.println((char)(iNum1 * 8 - dNum * 2)); // 'K'75

				
	}

}























