package test2;

/**
 *  배열 & String API 연습
 *  for-each문 연습
 */
public class StringTest {
	
	public static void main(String[] args) {
		
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[]= new double[5];
		double sum = 0;
		
		String[] st = str.split(",");
		
		int i = 0;
		
		for(String stt : st) {
			data[i] = Double.parseDouble(stt);
			sum += data[i];
			i++;
		}
		
		System.out.printf("합계: %.3f", sum);
		System.out.println();
		System.out.println("평균:" + sum / i);
		
		
		
	}

}
