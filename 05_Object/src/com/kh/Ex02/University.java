package com.kh.Ex02;

// 이름, 평균 합격컷, 국어최저점수, 영어최저점수
// 모든 데이터를 매개변수로 받아 초기화하는 생성자 정의
public class University {
	private String name;
	private int evgCut;
	private int koCut;
	private int enCut;


	public University(String name, int evgCut, int koCut, int enCut) {
		this.name = name;
		this.evgCut = evgCut;
		this.koCut = koCut;
		this.enCut = enCut;
	}
	
	public String getName() {
		return this.name;
	}
	public int getEvgCut() {
		return this.evgCut;
	}
	public int getKoCut() {
		return this.koCut;
	}
	public int getEnCut() {
		return this.enCut;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEveCut(int evgCut) {
		this.evgCut = evgCut;
	}
	public void setKoCut(int koCut) {
		this.koCut = koCut;
	}
	public void setEnCut(int enCut) {
		this.enCut = enCut;
	}
	
	public int getEvg() {
		int evg = (this.evgCut + this.koCut + this.enCut) / 3;
		return evg;
	}
	
	// 합격했다면 true / 불합격했다면 false 리턴
	public boolean isEvaluate(Student st) {
		if(st.getEvg() >= this.evgCut &&
				st.getEngScore() >= this.enCut &&
						st.getKorScore() >= this.koCut) {
			return true;
		} else {
			return false;
		}
	}
	

	
}
