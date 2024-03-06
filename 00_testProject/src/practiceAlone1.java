
public class practiceAlone1 {
	public static void main(String[] args) {
		
//		char a ='a';
//		System.out.println((char)(a + 1)); char가 정수/실수 자료형으로 형변환 가능한 이유
		
		double pi = 3.1415;
		int wholeNumber = (int)pi;
		System.out.println(wholeNumber);
		
		long num1 = 35421000000L;
		int num2 = (int)num1;
		System.out.println(num2);
		
		short num3 = 1;
		short num4 = 2;
		short num5 = (short)(num3 + num4);
		System.out.println(num5);
	}

}
