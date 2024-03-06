
public class Conversation {
	public static void main(String[] args) {
		/*
		 * 형변환
		 * 자료형을 다른 자료형으로 변환해주는 것
		 * 
		 * 값처리 원칙
		 * 대입 연산 시 같은 자료형만 대입 가능
		 * 일반 연산 시 같은 종류의 자료형으로만 연산 가능
		 * 두 가지 이상의 자료형을 연산 시 결과는 한가지 자료형으로 나와야한다.
		 * 
		 * 자동 형변환(묵시적 형변환)
		 * 두 개 이상의 자료형을 연산할 때 하나의 자료형으로 일치시켜야 연산이 가능한다.
		 * 하여 데이터 손실이 적은 방향으로 컴파일러가 직접 형변환을 해주는 것
		 * 
		 * 강제 형변환(명시적 형변환)
		 * 값의 볌위가 큰 자료형을 값의 범위가 작은 자료형으로 변환
		 * 자동으로 컴파일러가 해주지 않기 때문에 프로그래머가 명시적으로 진행한다.
		 *  -> 데이터의 손실을 감수하고 강제 변환
		 */

		double pi = 3.1415;
		int wholeNumber = (int)pi;
		
		System.out.println(wholeNumber);
		
		long num1 = 35421000000L;
		int num2 = (int)num1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		short num3 = 1;
		short num4 = 2;
		short num5 = (short)(num3 + num4);
		// int가 기본형이므로 (short) 없이 (num3 + num4) 를 하면 int로 형변환 되어서 답이 잘~~ 나온다.
		
		System.out.println(num5);
	}

}