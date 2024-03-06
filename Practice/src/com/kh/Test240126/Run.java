package com.kh.Test240126;

public class Run {
	public static void main(String[] args) {
		
		PhoneController pc = new PhoneController();
		
		String[] results = pc.method();
		
//        for (String result : results) {
//            System.out.println(result);
//            System.out.println();
//		}
            
        for(int i = 0; i < results.length; i++) {
        	String result = results[i];
        	System.out.println(result);
        	System.out.println();
        }
		
		
		
	

}
}