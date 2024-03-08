
package com.kh.Ex02;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
//		// choi 객체 생성 최지원, 15살, 영어 60, 슈학 70, 국어 80
//		// kim 객체 생성 김도헌, 17살, 영어 95, 수학 85, 국어 80
//		
//		Student choi = new Student("최지원", 15, 70, 60, 80);
//		Student kim = new Student("김도헌", 17, 85, 95, 80);
//		
//		// choi의 모든 과목의 평균을 출력해라
//		// kim의 모든 과목의 평균을 출력해라
//		
//		System.out.println(choi.getName() + "님의 평균 : " + choi.getEvg());
//		System.out.println(kim.getName() + "님의 평균 : " + (kim.getEngScore() + kim.getMathScore() + kim.getKorScore()) / 3);
		
		
		
//		// 사용자로부터 이름, 나이, 영어점수, 수학점수, 국어점수를 입력받아
//		// 평균을 구하고 출력하는 프로그램 작성
//		// 이름 : 최지원
//		// 나이 : 15
//		// 영어점수 : 80
//		// 수학점수 : 100
//		// 국어점수 : 75
//		//최지원님의 평균 : 85
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름:");
//		String name = sc.next();
//		System.out.print("나이:");
//		int age = sc.nextInt();
//		System.out.print("영어점수:");
//		double eng = sc.nextInt();
//		System.out.print("수학점수:");
//		double math = sc.nextInt();
//		System.out.print("국어점수:");
//		double kor = sc.nextInt();
//		System.out.println(name + "님의 평균:" + (eng + math + kor) / 3);
//		
//		Student st1 = new Student(name, age, math, eng, kor);
		
		
		// kh대학교, evgCut : 75, enCut : 60, koCut : 60으로 객체 생성
		University kh = new University("kh대학교", 75, 60, 60);
		Student choi = new Student("최지원", 15, 70, 60, 80);
		
		// choi 학생 객체는 kh대학교에 입학 가능한지 검사
		// 가능하면 "합격입니다"
		// 불가능하다면 "불합격입니다"
		// 출력 프로그램 작성
		
		// choi 학생의 평균이 kh대학교의 평균컷보다 높은지 그리고
		// 학생 각각의 점수는 kh대학교의 각각의 컷보다 높은지
		Student kim = new Student("김도원", 17, 85, 60, 80);

		System.out.println(kh.isEvaluate(kim));

		kh.isEvaluate(choi);
		Student st1 = new Student("김씨", 19, 80, 60, 50); // 합격하면 true 나오고 불합격하면 false 나옴
		kh.isEvaluate(st1);
		
		
		
		
	}

}
