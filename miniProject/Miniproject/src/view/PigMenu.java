package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import controller.PigController;
import model.vo.PigMember;
import service.PigService;

public class PigMenu {
	
	private Scanner sc = new Scanner(System.in);
	private PigController pc = new PigController();
	
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("=========== 종돈 관리 프로그램 ===========");
			System.out.println("1. 돼지 추가");
			System.out.println("2. 돼지 전체 조회");
			System.out.println("3. 돼지 정보 변경");
			System.out.println("4. 돼지 삭제");
			System.out.println("5. 돼지 이각 번호로 검색");
			System.out.println("6. 돼지 품종별 목록 조회");
			System.out.println("7. 품종별 돼지 두수");
			System.out.println("0. 프로그램 종료");
			System.out.print("\n *메뉴 선택* : ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				this.inputPig();
				break;
				
			case 2:
				pc.selectList();
				break;
				
			case 3:
				this.modifyPigMem();
				break;
				
			case 4:
				this.deletePigMem();
				break;
				
			case 5:
				pc.searchByUninum(this.searchUninum());
				break;
				
			case 6:
				this.selectBreed();
				break;
				
			case 7:
				pc.PigCount();
				break;
				
			case 0:
				System.out.println("\n프로그램을 종료합니다.");
				return;
				
			default:
				System.out.println("\n잘 못 입력하셨습니다. 다시입력해주세요");
			}
			
		}
				
	}




	// case 1 돼지추가
	public void inputPig() {
		System.out.println("=========== 돼지 추가 ===========");
		System.out.print("이각번호 : ");
		String uniNum = sc.nextLine();
		System.out.print("생일 : ");
		String birth = sc.nextLine();
		System.out.print("성별(암, 수) : ");
		String gender = sc.nextLine();
		System.out.print("품종 : ");
		String breed = sc.nextLine();
		System.out.print("생시체중(kg) : ");
		double birthWeight = sc.nextDouble();
		sc.nextLine();
		System.out.print("종료일 : ");
		String finalDate = sc.nextLine();
		System.out.print("종료체중(kg) : ");
		double finalWeight = sc.nextDouble();
		sc.nextLine();
		System.out.print("선발여부(선발, 미선발) : ");
		String selection = sc.nextLine();
		
		pc.inputPiginfo(uniNum, birth, gender, breed, birthWeight, finalDate, finalWeight, selection);
		
	}
	
	// case 3 정보수정
	public void modifyPigMem() {
		System.out.println("=========== 돼지 정보 변경 ===========");
		System.out.print("이각번호 : ");
		String uniNum = sc.nextLine();
		System.out.print("변경 생일 : ");
		String birth = sc.nextLine();
		System.out.print("변경 성별(암, 수) : ");
		String gender = sc.nextLine();
		System.out.print("변경 품종 : ");
		String breed = sc.nextLine();
		System.out.print("변경 생시체중(kg) : ");
		double birthWeight = sc.nextDouble();
		sc.nextLine();
		System.out.print("변경 종료일 : ");
		String finalDate = sc.nextLine();
		System.out.print("변경 종료체중(kg) : ");
		double finalWeight = sc.nextDouble();
		sc.nextLine();
		System.out.print("변경 선발여부(선발, 미선발) : ");
		String selection = sc.nextLine();
		
		pc.modifyPiginfo(uniNum, birth, gender, breed, birthWeight, finalDate, finalWeight, selection);
		
		
	}
	
	// case 4 : 돼지 삭제
	public void deletePigMem() {
		System.out.println("=========== 돼지 삭제 ===========");
		System.out.print("이각번호 : ");
		String uniNum = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(Y, N) : ");
		char c = sc.nextLine().toUpperCase().charAt(0);
		
		if(c == 'Y') {
			pc.deletePiginfo(uniNum);
		} else {
			System.out.println("메인메뉴로 돌아갑니다.");
			this.mainMenu();
		}
		
	}


	private String searchUninum() {
		System.out.println("=========== 돼지 이각번호로 검색 ===========");
		System.out.print("이각번호 : ");
		String uniNum = sc.nextLine();
	
		return uniNum;
	}
	
	private void selectBreed() {
		System.out.print("목록을 확인할 품종 선택(듀록,버크셔) : ");
		String str = sc.nextLine();
		
		if(str.equals("듀록")) {
			pc.breedListD();
		} else {
			pc.breedListB();
		}
	}



	
	public void displayNoData(String message) {
		System.out.println("\n" + message);
		
	}


	public void displayPigList(ArrayList<PigMember> list) {
		for(PigMember pm : list) {
			System.out.println(pm);
		}
	}
	


	public void HashSetInD(ArrayList<PigMember> list) {		
		HashSet<PigMember> hashSet = new HashSet<>();

		hashSet.addAll(list);

		for(PigMember pm : hashSet) {
			if(pm.getUniNum().charAt(0) == 'D') {
				System.out.println(pm);
			}

		}
	}

	public void HashSetInB(ArrayList<PigMember> list) {		
		HashSet<PigMember> hashSet = new HashSet<>();

		hashSet.addAll(list);

		for(PigMember pm : hashSet) {
			if(pm.getUniNum().charAt(0) == 'B') {
				System.out.println(pm);
			}

		}
	}

//		Iterator<PigMember> iterator = hashSet.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
	
	
	
//	public void HashSetIn() {
//
//		ArrayList<PigMember> list = new PigService().selectList();		
//		HashSet<PigMember> hashSet = new HashSet<>();
//
//		hashSet.addAll(list);
		


	
	


	public void displaySuccess(String message) {
		
		System.out.println("\n 성공 : " + message);
		
	}



	public void displayFail(String message) {
		System.out.println("\n 실패 : " + message);
		
	}



	public void displayPigmem(PigMember pm) {
		System.out.println("\n" + "검색 결과 : ");
		System.out.println(pm.toString());
		
	}




	

}
