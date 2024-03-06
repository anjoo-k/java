package com.kh.Test240126;

public class PhoneController {
	
	private String[] result;
	
	public String[] method() {
		Phone[] phones = new Phone[2];    // 인터페이스에 담겼는지 객체에 담겼는지 잘 생각하기
		phones[0] = new GalaxyNote9();
		phones[1] = new V40();
		
		result = new String[phones.length];
		
		for(int i = 0; i < phones.length; i++) {
			if(phones[i] instanceof GalaxyNote9) {
				GalaxyNote9 gn = (GalaxyNote9)phones[i];
				result[i] = gn.printInformation();
			} else if (phones[i] instanceof V40) {
				V40 gn = (V40)phones[i];
				result[i] = gn.printInformation();
			}
		}
		
		return result;
	}
	
//	public String[] method() {
//        // 2개의 Phone 객체를 저장할 수 있는 객체배열 생성
//        Phone[] phones = new Phone[2];
//        // 각각의 인덱스에 다형성을 적용하여 GalaxyNote9, V40 객체 저장
//        phones[0] = new GalaxyNote9();
//        phones[1] = new V40();
//        
//        // 반환할 문자열 배열 초기화
//        result = new String[phones.length];
//        // for문을 이용하여 Phone 객체배열에 각 인덱스의 printInformation()의 반환 값을 String배열에 담아 반환
//        for (int i = 0; i < phones.length; i++) {
//        	result[i] = ((SmartPhone)phones[i]).printInformation();
//        }
//        return result;
//    }
	
	

}
