package com.kh.object;

public class NumberPrinter {
	/*
	 * static 변수(정적멤버) = 클레스 변수
	 * : 동적으로 메모리가 생기는 다른 변수와 달리 컴피일 시 정적으로
	 *   메모리 공가능 확보하고 클래스 이름으로 접근이 가능
	 *   정적(변하지 않는 고정메모리) 변수이기 때문에 모든 객체에서 똑같은 메모리를 참조한다
	 * 
	 * static 메소드(정적메소드)
	 * : 정적변수와 동일하게 컴팡리 시 정적으로 메모리 공간을 확보하고
	 *   클래스 이름으로 접근 가능
	 *   다만, 객체를 생성하지 않아도 호출이 가능하기 때문에
	 *   객체생성 시 메모리 공간이 할당되는 일반변수를 메소드 내에 사용할 수 없다.
	 *   단순하고 명확한 계산 정도에 사용하는 것이 좋다.
	 * 
	 * 
	 */
	private int myNum = 0;
	public static int count = 0;
	
	static void showInt(int n) {
		count++;
		System.out.println(n);	
	}
	
	static void showDouble(double n) {
		System.out.println(n);
	}
	
	void setMyNumber(int n) {
		myNum = n;
	}
	
	void showMyNumber() {
		showInt(myNum);
	}

}


//그럼 기본변수들은 정적변수?