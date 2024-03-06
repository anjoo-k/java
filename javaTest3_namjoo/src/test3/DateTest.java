package test3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date 함수 연습 : SimpleDateFormat 등
 */
public class DateTest {
	
	public static void main(String[] args) {
		
		
		Date birth = new Date(1987 - 1900, 5 - 1, 27);
		Date today = new Date();

		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일 수요일");
		String FormatDate = sdf.format(birth);
		
		SimpleDateFormat sdfNow = new SimpleDateFormat("yyyy년 MM월 dd일");
		String FormatDateNow = sdfNow.format(today);

		long age = (today.getYear() - birth.getYear()); // 일수
		
				
		System.out.println("현재: " + FormatDateNow);
		System.out.println("나이: " + age + " 세");
		
		System.out.println("나이: " + (today.getYear() - birth.getYear()) + " 세");
		
		
		
	}

}
