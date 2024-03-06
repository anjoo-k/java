package test5;

/**
 * 객체(생성자 오버로딩) + 배열 연습
 */
public class BookArrayTest {

	public static void main(String[] args) {
		
		Book bArray [] = new Book[3];
		
		bArray[0] = new Book ("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		bArray[1] = new Book ("열혈강의 자바", "구정은", 29000, 0.1);
		bArray[2] = new Book ("객체지향 JAVA8", "금영욱", 30000, 0.1);
		
		for(int i = 0; i < bArray.length; i++) {
			System.out.println(bArray[i].toString());
			System.out.printf("할인된 가격 : %.0f", bArray[i].discount());
			System.out.println();
		}
	}

}
