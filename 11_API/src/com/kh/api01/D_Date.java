package com.kh.api01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D_Date {
	
	/**
	 *  *java.util.Date
	 */
	public void method01() {
		
		Date date1 = new Date();
		System.out.println(date1);
		
		// 내가 원하는 날짜(2023년 07월 27일)로 세팅
		// 1) 매개변수 생성자 이용
		Date date2 = new Date(2023 - 1900, 7 - 1, 27); // 자바에서 연월일 잘 안씀..
		System.out.println(date2);
		
		// 2) 기본생성자로 생성한 후 setter 메서드로 값 변경
		date1.setYear(2023-1900);
		date1.setMonth(7 - 1);
		date1.setDate(date2.getDate() + 10);
		date1.setHours(2);
		date1.setMinutes(56);
		date1.setSeconds(37);
		System.out.println(date1);
		System.out.println(date2);
		
		System.out.println(date1.getTime());
		System.out.println(date2.getTime()); // 초로 바꾼 값이 나옴
		System.out.println(date1.getTime() > date2.getTime()); //비교가 가능
		
		
		//2023년 07월 27일 02시 56분 37초
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String FormatDate = sdf.format(date1);
		System.out.println(FormatDate);
		
		
		
	}

}

















