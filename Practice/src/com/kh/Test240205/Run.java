package com.kh.Test240205;

public class Run {
	public static void main(String[] args) {
		
		Human[] aGroup = new Human[5];
		
		aGroup[0] = new Human("홍길동", 20);
		aGroup[1] = new Human("김철수", 30);
		aGroup[2] = new Human("김영희", 40);
		aGroup[3] = new Human("전우치", 50);
		aGroup[4] = new Human("최흥부", 70);
		// 김철수, 70살을 추가하고 싶다? -> 새로운 배열 만들어야
		
		// aGroup = new Human[6]; or 아래 방법(다 복사하기)
		
		Human[] tmp = new Human[aGroup.length + 1];
		for(int i = 0; i < aGroup.length; i++) {
			tmp[i] = aGroup[i];
		}
		
		tmp[5] = new Human("김철수", 70);
		
		aGroup = tmp;
		
		for(Human h : aGroup) {
			System.out.println(h); // 새로 고친 배열 출력
		}
		
		
		aGroup[2] = null; // 중간인 2번째 인덱스값 삭제: 김영희 지우고 싶으면
		
		for(int i = 2; i < 5; i++) { // 지우고 null 값 없도록 뒤쪽 배열 땡겨서 정렬하고 싶으면
			aGroup[i] = aGroup[i + 1];
		}
		aGroup[5] = null;
		
		
		System.out.println();
		
	}

}
