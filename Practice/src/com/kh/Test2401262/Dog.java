package com.kh.Test2401262;

public class Dog extends Animal {
	
	private int weihgt;
	public static final String PLACE = "애견까페";
	
	

	public Dog() {
		super();
	}



	public Dog(String name, String kinds, int weihgt) {
		super(name, kinds);
		this.weihgt = weihgt;
	}


	

	public int getWeihgt() {
		return weihgt;
	}



	public void setWeihgt(int weihgt) {
		this.weihgt = weihgt;
	}



	public static String getPlace() {
		return PLACE;
	}



	@Override
	public void speak() {
		System.out.println(super.toString() + "몸무게는 " + this.getWeihgt() + "입니다.");
	}
	

}
