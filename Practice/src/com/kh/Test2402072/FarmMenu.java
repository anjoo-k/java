package com.kh.Test2402072;

import java.util.HashMap;
import java.util.Scanner;

public class FarmMenu {

	Scanner sc = new Scanner(System.in);
	private FarmController fc;
// View : 사용자에게 보이는 시각적인 부분
	public void mainMenu() {
		System.out.println("========== KH 마트 ==========");

		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 직원메뉴");
			System.out.println("2. 손님메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch(menu) {
			case 1:
				this.adminMenu();
				break;
			case 2:
				this.customerMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}


		}

	}

	public void adminMenu() {
		
		while(true) {
			System.out.println("******* 직원 메뉴 *******");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				this.addNewKind();
				break;
			case 2:
				this.removeKind();
				break;
			case 3:
				this.changeAmount();
				break;
			case 4:
				this.printFarm();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			
			}
		}

	}

	public void customerMenu() {
		
		while(true) {
			System.out.println("******* 고객 메뉴 *******");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기 ");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				this.buyFarm();
				break;
			case 2:
				this.removeFarm();
				break;
			case 3:
				this.printBuyFarm();
				break;
			case 9:
				this.mainMenu();
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
		
	}

	public void addNewKind() {
		
		int kind = 0;
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			kind = sc.nextInt();
			sc.nextLine();
			
			if(kind <= 3 && kind > 0) {
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("수량 : ");
			int amount = sc.nextInt();
			sc.nextLine();					
			
			Farm f = null; //..? 초기화 안하면 오류 뜨는 것: defualt 가 있을수도 있으니까. 알려주는 것
			switch(kind) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;				
			}
			
			
			if(fc.addNewKind(f, amount)) {
				System.out.println("새 농산물이 추가되었습니다.");
				break;
			}else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			}
			
		}

		
//		Farm f = new Farm();
//		if(strKind.equals("1")) {
//			f = new Fruit(strKind, name);
//			Boolean isTrue = fc.addNewKind(f, amount);
//			if(isTrue) {
//				System.out.println("새 농산물이 추가되었습니다.");
//			} else {
//				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
//			}
//		} else if(strKind.equals("2")) {
//			f = new Vegetable(strKind, name);
//			Boolean isTrue = fc.addNewKind(f, amount);
//			if(isTrue) {
//				System.out.println("새 농산물이 추가되었습니다.");
//			} else {
//				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
//			}
//		}else if(strKind.equals("3")) {
//			f = new Nut(strKind, name);
//			Boolean isTrue = fc.addNewKind(f, amount);
//			if(isTrue) {
//				System.out.println("새 농산물이 추가되었습니다.");
//			} else {
//				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
//			}
//		}
		
		
		
	}

	public void removeKind() {
		
		while(true) {
			System.out.println("******* 고객 메뉴 *******");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기 ");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				this.buyFarm();
				break;
			case 2:
				this.removeFarm();
				break;
			case 3:
				this.printBuyFarm();
				break;
			case 9:
				this.mainMenu();
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
		
	}
	
		
		
//		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
//		System.out.print("삭제할 종류 번호 : ");
//		int kind = sc.nextInt();
//		sc.nextLine();
//		String strKind = String.valueOf(kind);		
//
//		
//		if(kind <= 3 && kind > 0) {
//		} else {
//			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
//		}
//		
//		System.out.print("이름 : ");
//		String name = sc.nextLine();
//		System.out.print("수량 : ");
//		int amount = sc.nextInt();
//		sc.nextLine();
//		
//		Farm f = new Farm();
//		if(strKind.equals("1")) {
//			f = new Fruit(strKind, name);
//			Boolean isTrue = fc.removeKind(f);
//			if(isTrue) {
//				System.out.println("농산물 삭제에 성공하였습니다.");
//			} else {
//				System.out.println("새 농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
//			}
//		} else if(strKind.equals("2")) {
//			f = new Vegetable(strKind, name);
//			Boolean isTrue = fc.removeKind(f);
//			if(isTrue) {
//				System.out.println("농산물 삭제에 성공하였습니다.");
//			} else {
//				System.out.println("새 농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
//			}
//		}else if(strKind.equals("3")) {
//			f = new Nut(strKind, name);
//			Boolean isTrue = fc.removeKind(f);
//			if(isTrue) {
//				System.out.println("농산물 삭제에 성공하였습니다.");
//			} else {
//				System.out.println("새 농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
//			}
//		}
		
		
	

	public void changeAmount() {
		
		int kind = 0;
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("수정할 수량 : ");
			kind = sc.nextInt();
			sc.nextLine();
			
			if(kind <= 3 && kind > 0) {
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			Farm f = null; //..? 초기화 안하면 오류 뜨는 것: defualt 가 있을수도 있으니까. 알려주는 것
			switch(kind) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;				
			}
			
			
			if(fc.changeAmount(f, kind)) {
				System.out.println("농산물 삭제에 성공하였습니다.");
				break;
			}else {
				System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
			}
			
		}
	}

	public void printFarm() {
		HashMap<Farm, Integer> farmList = fc.printFarm();
		for(Farm f : farmList.keySet()) {
			
			if(f instanceof Fruit) {
				Fruit tmp = (Fruit) f; 
				System.out.printf("%s: %s(%d개)", tmp.getKind(), tmp.getName(), farmList.get(f));
			} else if (f instanceof Vegetable) {
				Vegetable tmp = (Vegetable) f;
				System.out.printf("%s: %s(%d개)", tmp.getKind(), tmp.getName(), farmList.get(f));
			} else if (f instanceof Nut) {
				Nut tmp = (Nut) f;
				System.out.printf("%s: %s(%d개)", tmp.getKind(), tmp.getName(), farmList.get(f));
			}
			
		}
		
	}

	public void buyFarm() {
		int kind = 0;
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("구입할 종류 번호 : ");
			kind = sc.nextInt();
			sc.nextLine();
			
			if(kind <= 3 && kind > 0) {
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				continue;
			}
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			Farm f = null; //..? 초기화 안하면 오류 뜨는 것: defualt 가 있을수도 있으니까. 알려주는 것
			switch(kind) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;				
			}
			
			
			if(fc.buyFarm(f)) {
				System.out.println("농산물 구매에 성공하였습니다.");
				break;
			}else {
				System.out.println("“마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.”.");
			}
			
		}
	}

	public void removeFarm() {
		System.out.println("");
	}

	public void printBuyFarm() {
		System.out.println("");
	}
	
	
	
	

}
