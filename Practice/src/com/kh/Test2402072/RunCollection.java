package com.kh.Test2402072;

/**
 * *MVC 패턴
 *  각 클래스마다 역할(데이터, 화면, 요청처리)을 부여해서 작업!
 *  => 유지보수 용이
 *  
 *  M(Model) : 데이터를 담당하는 역할
 *  데이터를 담기 위한 클래스, 비즈니스 로직 처리 위한 클래스, 데이터 보관된 보관함과 연결해 입출력 수행하는 클래스
 *  V(View) : 화면을 담당하는 역할
 *  사용자에게 보여주는 시각적인 요소(출력문, 입력문)
 *  C(Controller) : 사용자가 요청한 내용을 처리한 후 결과 반환 역할(데이터 출입구)
 *  
 *  
 */
public class RunCollection {
	public static void main(String[] args) {
		new FarmMenu().mainMenu();
	}

}
