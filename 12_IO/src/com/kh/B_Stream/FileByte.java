 package com.kh.B_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * "바이트" 기반 스트림"을 통한 입출력 실습
 * 
 *  바이트스트림 : 데이터를 1바이트 단위로 전송하는 통로(좁은통로 -> 한글깨짐)
 *  기반스트림 : 직접적 외부매체 연결 통로
 *  
 *  xxxInputStream : xxx매체로부터 데이터를 입력받는 통로(외부매체에서 데이터를 읽어오겠다.)
 *  xxxOutputStream : xxx매체로 출력하는 통로(데이터를 외부메체로 내보내겠다.)
 *  
 */
public class FileByte {
	
	// 프로그램(자바) -> 외부매체(파일) 데이터를 출력(프로그램상의 데이터를 파일로 내보내겠다.)
	public void fileSave() {
		FileOutputStream fout = null;
		
		try {
			// 1. FileOutputStream 객체 생성 => 해당 파일과 연결통로 만들기
			//	해당 파일이 없으면 새로 만들고 통로 연결 / 있으면 있는 파일에 통로 연결
			// true 미기입 : 해당 파일이 존재할 경우 기존의 데이터를 덮어씌움(기본값 false)
			// true 기입 : 기존 데이터 뒤에 연결해서 작성됨
			fout = new FileOutputStream("a_byte.txt");
			
			
// 디폴트		fout = new FileOutputStream("a_byte.txt", false);
// 덮어쓰기	fout = new FileOutputStream("a_byte.txt", true);
			
			
			// 2. 파일에 데이터를 출력해보자
			//    숫자, 문자 출력 관계없이 실제 파일에 문자로 기록 (아스키코드표)
			//	(0 ~ 127)
			fout.write(97); // 'a' 문자가 저장
			fout.write('b'); //'b' 문자가 저장
			fout.write('최'); // 한글은 2byte이기 때문에 깨져서 저장 -> 바이트스트림으로는 제한이 있다.
			
			byte[] arr = {99, 100, 101};
			fout.write(arr); // cde 문자가 저장됨
			
			// fout.write(byte[] b, int off, int len) : byte배열의 off인덱스부터 len개만큼 출력
			fout.write(arr, 0, 1);
			
			
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { //FileNotFoundException 은 IOException 상속받음
			e.printStackTrace();
		} finally { // 이 안에 작성된 코드는 어떤 예외가 있더라도 마지막에 무조건 실행하고 빠져나가도록 한다.
			try {
				
				
				// 3. 스트림 이용 완료 시 무조건 반납해야(반드시!)
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	// 외부매체 -> 프로그램(자바) 데이터를 입력(파일로부터 데이터를 읽어들이겠다.)
	public void fileRead() {
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림
		
		
		// 1. 스트림생성(통로만들기)
		// 2. 스트림 통해 입력받음(메소드 활용)
		// 3. 사용이 끝난 스트림 반납
		
		FileInputStream fin = null;
		
		try {
			
			// 1. FileInputStream 객체 생성 = 해당 파일과 연결통로 생성			
			fin = new FileInputStream("a_byte.txt");
			
			
//			// 2. 파일로부터 데이터를 읽어들이고자 할 때 read 메서드 사용
//			//    1byte 단위로 하나씩 읽어옴 / 숫자로 읽어들임
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//
//			System.out.println(fin.read()); // 파일의 끝을 만나는 순간 -1 반환
			
			
			// 반복출력 1. 무한반복을 돌리면서 매번 검사해보자 
//			while (true) {
//				int value = fin.read();
//				if(value == -1) {
//					break;
//				}
//				System.out.print((char)value);
//			}
			
			// 반복출력 2.
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.print((char)value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
