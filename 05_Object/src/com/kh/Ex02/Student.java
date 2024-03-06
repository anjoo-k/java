package com.kh.Ex02;

// 이름, 나이, 수학점수, 영어점수, 국어점수를
// 데이터로 가지고 있는 객체를 만들기 위한 클래스를 작성해라
// 모든 데이터는 직접 접근을 허용하지 않고 모두 간접적으로 set/get 해줄 수 있도록 작성해라
// 모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자 생성
//


public class Student {
	
	private String name;
	private int age;
	private int mathScore;
	private	int engScore;
	private int korScore;
	public Object getEvg;
	
	
	public Student(String name, int age, int mathScore, int engScore, int korScore) {
		this.name = name;
		this.age = age;
		this.mathScore = mathScore;
		this.engScore = engScore;
		this.korScore = korScore;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public int getMathScore() {
		return this.mathScore;
	}
	public int getEngScore() {
		return this.engScore;
	}
	public int getKorScore() {
		return this.korScore;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public int getEvg() {
		int evg = (this.engScore + this.korScore + this.mathScore) / 3;
		return evg;
	}

}
