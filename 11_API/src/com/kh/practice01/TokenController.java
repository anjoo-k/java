package com.kh.practice01;

import java.util.StringTokenizer;

public class TokenController {
	
	
	public TokenController() {
		
	}
	
	public String afterToken (String str) {
		
		StringTokenizer stn = new StringTokenizer(str); // 뒤에 공백 안넣어 줘도 된다. 기본 설정이 공백
		String nstr = "";
		while(stn.hasMoreTokens()) {
			nstr += stn.nextToken();
		}
		return nstr.toString();
	}
	
	public String firstCap(String input) {
		if (input == null || input.isEmpty()) { //input 값이 비었을 때
			return input;
		}
		return (input.substring(0, 1).toUpperCase()) + (input.substring(1));
	}
	
	public int findChar(String input, char one) {
		
//		int count = 0;
//		for(int i = 0; i < input.length(); i++) {
//			if(input.charAt(i) == one) {
//				count++;
//			}
//		}
		
		int count = 0;
		for (char c : input.toCharArray()) {
			if(c == one) {
				count++;
			}
		}
		
		return count;
	}

}
