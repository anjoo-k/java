package com.kh.polymorphism02;

public class Child01 extends Parent {
	private int z;

	
	
	
	public Child01() {
		super();
	}
	
	
	public Child01(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}


	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}


	@Override
	public String toString() {
		return "Child01 [z=" + z + "]";
	}
	
	
	public void printChild01() {
		System.out.println("자식01 자식객체");
	}
	

}
