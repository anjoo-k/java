package com.kh.B_Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ServeStream {
	
	/**
	 * 보조스트림 : 기반스트림만으로 부족했던 성능을 향상시키는 스트림
	 * 			 기반스트림에서 제공하지 않는 추가적 메소드 제공 / 데이터 전송 속도 향상
	 * 	       	 -> 외부 매체와 직접 연결 불가 = 단독 사용 불가, 반드시 기반 스트림과 함께 사용
	 *  
	 */
	
	// 프로그램 -> 파일 (출력)
	public void fileSave() {
		// FileWriter : 파일과 직접적으로 연결, 2바이트 단위로 출력할 수 있는 기반 스트림
		// FileReader : 파일과 연결해서 2바이트 단위로 데이터를 입력받을 수 있는 객체
		
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
			/*
			// 1. 기반스트림 생성
			FileWriter fw = new FileWriter("c_buffer.txt");
			
			
			//2. 기반스트림 생성 시 기반스트림 객체를 전달하며 생성
			BufferedWriter bw = new BufferedWriter(fw);
			*/
			
			bw.write("안녕하세요.");
			bw.write("반갑습니다.");
			bw.newLine(); // 새로운 메소드 사용가능
			bw.write("끝");
			
			
		} catch (IOException e) {	
			e.printStackTrace();
		}

		
	}
	
	public void fileRead() {
		
		// FileReader : 파일과 연결해서 2바이트 단위로 데이터를 입력받을 수 있는 객체
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
		
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
	// 프로그램 -> 파일 출력
	public void obejectSave() {
		
		// 출력할 데이터 (Product 객체)
		Product phone1 = new Product("아이폰1", 1000000);
		Product phone2 = new Product("아이폰2", 1000000);
		Product phone3 = new Product("아이폰3", 1000000);
		
		// FileOutputStream : 파일과 연결해 1바이트 단위로 출력할 수 있는 기반스트림
		// ObjectOutputStream : 객체 단위로 출력할 수 있도록 도움주는 보조스트림(ObjectWriter 없음)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_product.txt"));) {
			
			oos.writeObject(phone1);
			oos.writeObject(phone2);
			oos.writeObject(phone3);
			// Product 클래서에 implements Serializable 해야 txt에서 확인 가능 : 체킹용
			// 객체 직렬화해서 저장해 주고 싶을 때 쓴다.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void objectRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_product.txt"));) {
			
			while(true) {
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
			}
			
			
			
			
		} catch (EOFException e) { // txt 파일에 남아 있는 객체가 없으면 EOFException 예외 발생
								   // 그러면 이 예외를 넣어서 잡아준다
			System.out.println("파일을 다 읽어들였습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			
		}
	}
	

	
	
	
}









