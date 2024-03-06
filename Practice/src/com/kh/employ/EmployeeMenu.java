package com.kh.employ;

import java.util.Scanner;

/*
 * 화면에 출력하는 것과
 * 사용자로부터 입력받는 것을 처리해주는 객체
 */
public class EmployeeMenu {
	
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	
	//메인 화면을 출력하는 메소드
	public void EmployeeMainMenu() {
		
		/*
		 * 1. 사원추가
		 * 사원번호, 이름, 성별, 휴대폰번호,
		 * 추가정보를 더 입력하시겠습니까?(y/n)
		 * y일 때만 부서, 연봉, 보너스율 입력받고
		 * 해당 데이터를 활용하여 사원추가
		 * 9. 프로그램 종료
		 * 메뉴 번호를 누르세요:
		 * (정수하나 입력받기)
		 */
		
		int menu;
		while(true) {
			System.out.print("1.사원추가\n2.사원전체출력\n3.사원삭제\n4.사원검색출력\n9.프로그램 종료\n메뉴 번호를 누르세요:");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				this.insertEmp();
				break;
			case 2:
				ec.empList();
				break;
			case 3:
				/*
				 * 정말 삭제하시겠습니까?(y/n)
				 * y => 가장 최근에 등록된 사원 삭제
				 * 삭제된 사원 정보 출력
				 * n을 누르면 그대로 다시 돌아옵니다.
				 * 
				 * 
				 * 전체 사원을 출력 ->
				 * 삭제할 사원의 사원번호를 입력해주세요. : ?
				 * 삭제된 사원 정보 출력
				 * n을 누르면 그대로 다시 돌아옵니다.
				 * 
				 */
				delEmp();
				break;
			case 4:
				/*
				 * 정보를 출력할 사원의 사번을 입력하세요 : 
				 * 사원정보 : 
				 */
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
				}
			
		}
	
		}

	
	//회원을 추가하기 위한 기능을 입력 받는 기능
	public void insertEmp() {
		System.out.print("사원번호:");
		int empNum = sc.nextInt();
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("성별:");
		char gender = sc.next().charAt(0);
		System.out.print("휴대폰:");
		String pNum = sc.next();
		
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n):"); //********************************************************
		boolean isContinue = sc.next().toLowerCase().charAt(0) == 'y';
		
		String dpm;
		int sal;
		double bon;
		
			if(isContinue) { // 추가정보 입력 받음(y 입력했을 때)
				System.out.print("부서:");
				dpm = sc.next();
				System.out.print("연봉:");
				sal = sc.nextInt();
				System.out.print("보너스율:");
				bon = sc.nextDouble();
				
				ec.insert(empNum, name, gender, pNum, dpm, sal, bon);
				
			} else {
				ec.insert(empNum, name, gender, pNum, "부서없음", 0, 0.0);
					}
			
	}
	
	public void delEmp() {
//		System.out.print("정말 삭제하시겠습니까?: ");
//		char ch = sc.next().toLowerCase().charAt(0);
//		
//		if(ch == 'y') {
//			em.delEmp();		
//		}
		
		ec.empList();
		
		System.out.print("삭제할 사원의 사원번호를 입력해주세요. :");
		int empNo = sc.nextInt();
		System.out.println();
		System.out.print("n을 누르면 메뉴로 돌아갑니다. :");
		boolean isContinue = sc.next().toLowerCase().charAt(0) == 'n';
		if(isContinue) {
			EmployeeMainMenu();
		}
		ec.deleteEmpByEmpNo(empNo);


		// 입력된 사원번호를 가져와서 비교해서 같으면 삭제
	
		
	}
	
	public void printEmpInfoByEmpNo() {
//		 * 정보를 출력할 사원의 사번을 입력하세요 : 
//		 * 사원정보 : 
		
		System.out.println("정보를 출력할 사원의 사번 입력 : ");
		int EmpNo = sc.nextInt();
		ec.EmpInfoByEmpNo(EmpNo);
	}
	
	
	
	
	
	
}
