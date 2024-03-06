package com.kh.Test240123;

public class Student {
	
	private String name;
	private int math;
	private int kor;
	private int eng;
	
	
	public Student (String name, int math, int kor,int eng) {
		this.name = name;
		this.math = math;
		this.kor = kor;
		this.eng = eng;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
	public double getAvg () {
		return (this.math + this.kor + this.eng) / 3.0;
	} 
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", math=" + math + ", kor=" + kor + ", eng=" + eng + ", avg=" + getAvg() + "]";
	}

}
