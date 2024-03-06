package com.kh.Test2401262;
import java.util.Scanner;
public class AnimalManager {
	/**
	 *  * 추상클래스 : 추상메서드가 기준
	 *  - 미완성된 클래스
	 *  - 객체 생성이 불가(단, 레퍼런스 변수(참조변수) 선언 가능)
	 *  - 일반필드 + 일반메소드 [+ 추상메소드]
	 *   => 추상메서드를 가진 클래스는 반드시 추상클래스로 명시해야
	 *  
	 *  * 추상메서드가 굳이 없어도 추상클래스를 사용할 수 있을까? YES
	 *   1. (개념적) But, 단지 이 클래스가 미완성된 클래스라는 것을 알리기 위해(이 클래스 일단 쓰지마라)
	 *   2. (프로그래밍적) 객체 생성이 불가하게끔 하고자 할 때
	 *   
	 *  * 추상클래스 사용 목적
	 *   : 부모클래스에 추상메소드 존재 시
	 *    - 자식 클래스에서 강제로 오버라이딩해 동일 패턴 메서드 가지게 됨
	 *    -> 각 자식 클래스마다 실행할 내용은 다르지만 동일한 형태의 메서드로 구현하기 위해
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Animal[] animals = new Animal[5];
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println("");
		
		System.out.print("Dog의 몸무게:");
		int dogWeight = sc.nextInt();
		dog.setWeihgt(dogWeight);
		
		System.out.print("Cat의 서식처:");
		String catLocation = sc.next();
		cat.setLocation(catLocation);
		
		System.out.print("Cat의 색상:");
		String catColer = sc.next();
		cat.setColor(catColer);
			
		animals[0] = new Dog("멍멍이", "말티즈", 5); // 새 객체 생성
		animals[1] = dog; // 위에 객체 사용
		animals[2] = cat;
		animals[3] = cat;
		animals[4] = cat;
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].speak();
		}
		
//		for(Animal i : animals) {
//			i.speak();
//		}
	
	}

}
