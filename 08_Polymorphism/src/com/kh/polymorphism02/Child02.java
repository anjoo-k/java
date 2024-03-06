package com.kh.polymorphism02;

public class Child02 extends Parent {
	private int n;

	
	
	public Child02() {
		super();
	}



	public Child02(int x, int y, int n) {
		super(x, y);
		this.n = n;
	}



	public int getN() {
		return n;
	}



	public void setN(int n) {
		this.n = n;
	}



	@Override
	public String toString() {
		return "Child02 [n=" + n + "]";
	}
	
	public void printChild02() {
		System.out.println("자식02 자식객체");
	}
	

}
