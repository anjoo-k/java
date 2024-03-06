package com.kh.Interface01;
import java.util.Scanner;
public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//다형성을 활용하여 Animal 타입의 배열 만들어보자
		
		Animal[] animals = new Animal[5]; //객체생성 아님. 참조변수만 만든 것
		
		for(int i = 0; i < animals.length; i++) {
			
			System.out.println("추가할 동물을 선택해 주세요.");
			System.out.print("1.강아지 2.고양이 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				animals[i] = new Dog();
				break;
			case 2:
				animals[i] = new Cat();
				break;
			}
			// animals[i].makeSound();
		} // break 없이 sound 실행했을 때 야옹만 나오는 이유
		  // Cat 객체로 Dog 객체가 덮어씌워진다. 왜냐면 animals[0] = new Dog(); 했다가 또 animals[0] = new Cat(); 되니까
		
		for(int i = 0; i < animals.length; i++) { // 채팅용도로만 쓴다? 뭔말이지 -> 체킹용도ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
			if(animals[i] instanceof Baby) {
				System.out.println("잠들어있습니다.");
			} else {
				animals[i].makeSound();
			}
			
		}
		
		
		
	}
}
