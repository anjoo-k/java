package test1;

/**
 * 배열 연습
 */

public class ArrayTest {

	public static void main(String[] args) {
		
		int [][] array = {{12, 41, 36, 56, 21},
						  {82, 10, 12, 61, 45},
						  {14, 16, 18, 78, 65},
						  {45, 26, 72, 23, 34}};
		
		double sum = 0;
		double count = 0;
		for(int i = 0; i < array.length; i++ ) {
			for(int j = 0; j < array[i].length; j++) {
				sum += (double)array[i][j];
				count++;
			}
		}
		

		double average = sum / count ;
		
		System.out.printf("합계 : %.2f", sum);
		System.out.println("\n평군 : " + average );
	}

}
