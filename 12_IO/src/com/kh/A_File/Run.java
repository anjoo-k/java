package com.kh.A_File;

import java.io.File;
import java.io.IOException;

/**
 *  간단하게 파일(File)을 만들어보자
 *  java.lo.File 클래스를 가지고
 *  
 */
public class Run {
	
	public static void main(String[] args) {
		
		// 1. 경로 지정을 하지 않고 파일 생성
		File f1 = new File("test.text"); // 파일 객체를 하나 만든 상태(실제 파일 x)
//		try {
//			f1.createNewFile(); // 메소드까지 실행을 해야만 파일이 만들어진다.
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		} 
		
		
		// 2. 존재하는 폴더에 파일 생성-> 해당경로까지 지정
		File f2 = new File("D:\\test.text");
//		
//		try {
//			f2.createNewFile(); // 존재하지 않는 경로로 제시 => IOException			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		//3. 폴더 먼저 만들고 파일까지 만들어지게 하는 방법
		try {
			f2.createNewFile(); // 존재하지 않는 경로로 제시 => IOException
			
			File tmpFolder = new File("D:\\tmp");
			tmpFolder.mkdir(); //폴더 만드는 메소드
			
			File f3 = new File("D:\\tmp\\test.txt");
			f3.createNewFile();
			
			// 파일 존재 유무 확인: 파일 실제로 존재하냐?
			System.out.println(f1.exists());
			System.out.println(new File("ttt.txt").exists());
			
			// 파일인지 확인: f1이 파일이냐?
			System.out.println(f1.isFile());
			System.out.println(tmpFolder.isFile());
			
			//--------------------------------------------------------
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		
		
		System.out.println("프로그램을 종료합니다."); // 실행여부 판단용
		
	}

}
