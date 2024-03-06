package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RunTest {
	
	public static void main(String[] args) {
		// Properties

		/*
		 * Properties 특징 - Map 계열 컬렉션(key value 세트로 담는다.) - key, value 모두
		 * setProperty(key, value)
		 * getProperty(key) : value 반환
		 * 
		 * 주로 외부파일(.properties / .xml)을 사용해서 입출력할 때 사용
		 * 입출력이 다른 map과 비교해 편해서
		 * 
		 * */

		
		
		// 파일로 출력하는 것
		
//		Properties prop = new Properties();
//		
//		prop.setProperty("C", "INSERT"); // 데이터 저장
//		prop.setProperty("R", "SELECT"); // 데이터 읽기
//		prop.setProperty("U", "UPDATE"); // 데이터 수정
//		prop.setProperty("D", "DELETE"); // 데이터 삭제
//		
//		try {
//			//prop.store(new FileOutputStream("resources/driver.properties"), "properties test");
//			prop.storeToXML(new FileOutputStream("resources/query.xml"), "properties test");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		
		// 파일 읽어오기
		Properties prop = new Properties();

		
		try {
			prop.load(new FileInputStream("resources/driver.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("driver"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));

	
	}



	}
