package com.kh.employ;

public class EmployeeController {
	/*
	 * 실제 정보를 넘겨받아서 사원에 대한 정보를 저장하거나
	 * 반환해 주는 역할
	 */
	private Employee[] emp = new Employee[100];
	
	
	//insert => 사원을 배열에 추가해주는 메소드
	public void insert(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		for(int i = 0; i < emp.length; i++) {
			if(emp[i] == null) { //********************************************
				emp[i] = new Employee(empNo, name, gender, phone, dept, salary, bonus);
				break;
			}
		}
		
	}
	
	//empList에서 맨 마지막에 추가된 회원 삭제
	public void delEmp() {
//		 * 정말 삭제하시겠습니까?(y/n)
//		 * y => 가장 최근에 등록된 사원 삭제
//		 * 삭제된 사원 정보 출력
//		 * n을 누르면 그대로 다시 돌아옵니다.
		
//		for(int i = 0; i > emp.length; i++) {
//			if(emp[i] == null) { // i번째 인덱스가 비어있다면
//				System.out.println("삭제된 사원 정보 : " + emp[i - 1].toString());
//				emp[i - 1] = null; // 바로 전 인덱스값을 지워줘라
//				break;
//			} else if(i == (emp.length - 1)) { //마지막까지 가득 차 있다면
//				System.out.println("삭제된 사원 정보 : " + emp[i].toString());
//				emp[i] = null; // 마지막 값을 지워줘라
//			}
//		}		
		
//		if(emp[0] == null) {
//			System.out.println("삭제할 사원이 없습니다.");
//			return;
//		}
//		
//		int i = 0;
//		while(i != (emp.length - 1) && emp[i] != null) {
//			i++;
//		}
//		
//		System.out.println("삭제된 사원 정보 : " + emp[i].toString());
//		emp[i] = null;
		
	}
	
	
	
	public void empList() {
		System.out.println("========사원목록=======");
		for(int i = 0; i < emp.length; i++) {
			if(emp[i] != null) {
				break;
			}
			System.out.println(emp[i].toString() + " ");
			
		}
		}
	
	public void numDelList(int a) {
		for(int i = 0; i < emp.length; i++) {
			if(emp[i].getEmpNo() == a && emp[i] == null) {
				System.out.println("삭제할 사원 정보 : " + emp[i - 1].toString());
				emp[i - 1] = null; // 바로 전 인덱스값을 지워줘라
				break;
			}
		}
		
		
	}
	
	public void deleteEmpByEmpNo(int empNo) {
//		 * 전체 사원을 출력 ->
//		 * 삭제할 사원의 사원번호를 입력해주세요. : ?
//		 * 삭제된 사원 정보 출력
//		 * n을 누르면 그대로 다시 돌아옵니다.
		
		for(int i = 0; i < emp.length; i++) {
			if (emp[i] == null) {
				System.out.println(emp + "번 근로자를 찾을 수 없습니다.");
				break;
			} else if(emp[i].getEmpNo() == empNo) {
				System.out.println("삭제할 사원 정보 : " + emp[i].toString());
				emp[i] = null;
				
				for(int j = i; j < emp.length; j++) {
					if(j + 1 == emp.length) {
						emp[j] =null; // 맨 마지막은 무조건 null이 되겠지
						break;
					}
					emp[j] = emp[j + 1];
					
				}
				
				System.out.println(emp + "번 근로자를 삭제하였습니다.");
				break;
			}	
		}
		
	}
	
	public void EmpInfoByEmpNo(int empNo) {
//		for(int i = 0; i < emp.length; i++) {
//			if(emp[i].getEmpNo() == empNo) {
//				System.out.println(emp[i].toString());
//				break;
//			}
//		}
		
		for(Employee e : emp) {
			if(e ==null) {
				break;
			} else if(e.getBonus() == empNo) {
				System.out.println(e.toString());
				break;
			}
		}
		
	}
}
