package com.kh.run;


import com.kh.view.MemberMenu;

public class Run {
	/*
	 * M(Model)
	 *  : 데이터 처리담당
	 *    데이터와 데이터를 처리하는 로직을 담당합니다. 모델은 데이터의 상태를 나타내고, 이 상태에 대한 변경을 처리
	 * 	  (데이터를 담기 위한 클래스(VO), 데이터들이 보관된 공간(db)과 직접적으로 접근해서 데이터 주고받기(dao))
	 * 
	 * 		dao?
	 * 		Data Access Object, 데이터베이스와의 통신,
	 * 		CRUD 작업 수행(Create, Read, Update, Delete)
	 * 		-> 데이터베이스의 레코드를 생성, 읽기, 업데이트, 삭제하는 작업
	 * 
	 * V(View)
	 *  : 화면 담당(사용자가 보게되는 시각적 요소, 출력 및 입력)
	 *    웹 페이지, GUI, 텍스트 등으로 표시
	 *  
	 * C(Controller)
	 *  : 사용자의 요청을 처리
	 *  
	 *  
	 *    * MODEL과 CONTROLLER 차이
	 *    DB, 비즈니스 로직 관리
	 *    사용자 입력 처리해 모델과 뷰 간의 상호작용 조정
	 * 
	 * */
	
	public static void main(String[] args) {
		
		new MemberMenu().mainMenu();
		
		
	}
	

}
