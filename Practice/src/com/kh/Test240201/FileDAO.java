package com.kh.Test240201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		
		File folder = new File(file);		
		return folder.exists();
		
	}
	
	public void fileSave(String file, String s) {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	/*
	 * StringBuilder : 효율적으로 문자열을 처리하기 위한 클래스
	 * 				   다양한 기능의 메소드를 제공한다.
	 * append(), insert(), delete(), replace() 등 지원
	 */
	public StringBuilder fileOpen(String file) {
		
		StringBuilder stb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String value;
			while((value = br.readLine()) != null) {
				// str += (value + "\n");
				// br.readLine(); // 끝까지 가지고 오면 null을 반환한다.
				stb.append(value);
				stb.append("\n");
			}
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stb;
	}
	
	public void fileEdit(String file, String s) {
	
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file, true))) {
			br.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
