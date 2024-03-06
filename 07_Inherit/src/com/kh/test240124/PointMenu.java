package com.kh.test240124;
import java.util.Scanner;

public class PointMenu  {
	
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("======= 메뉴 ======");
			System.out.print("1.원\n2.사각형\n9.끝내기\n메뉴번호:");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		}
				
		
		
	}
	public void circleMenu() {
		
		while(true) {
			System.out.println("======= 원메뉴 ======");
			System.out.print("1.원 둘레\n2.원 넓이\n9.메인으로\n메뉴번호:");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				calcCircum(); // 원들레
				break;
			case 2:
				calcCircleArea();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
		
	public void rectangleMenu() {
		
		while(true) {
			System.out.println("======= 사격형메뉴 ======");
			System.out.print("1.사각형 둘레\n2.사각형 넓이\n9.메인으로\n메뉴번호:");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				calcPerimeter();
				break;
			case 2:
				clacRectArea();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
		
	}
	public void calcCircum() {
		System.out.print("x 좌표:");
		int x = sc.nextInt();
		System.out.print("y 좌표:");
		int y = sc.nextInt();
		System.out.print("반지름:");
		int radi = sc.nextInt();
		
		System.out.println(cc.calPerimeter(x, y, radi));		
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표:");
		int x = sc.nextInt();
		System.out.print("y 좌표:");
		int y = sc.nextInt();
		System.out.print("반지름:");
		int radi = sc.nextInt();
		
		System.out.println(cc.calcArea(x, y, radi));	
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표:");
		int x = sc.nextInt();
		System.out.print("y 좌표:");
		int y = sc.nextInt();
		System.out.print("높이:");
		int h = sc.nextInt();
		System.out.print("넓이:");
		int w = sc.nextInt();
		
		System.out.println(rc.calPerimeter(x, y, h, w));
	
	}
	
	public void clacRectArea() {
		System.out.print("x 좌표:");
		int x = sc.nextInt();
		System.out.print("y 좌표:");
		int y = sc.nextInt();
		System.out.print("높이:");
		int h = sc.nextInt();
		System.out.print("넓이:");
		int w = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, h, w));
	}



}
