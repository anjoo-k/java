package com.kh.Test2401262;

public abstract class Animal {
	private String name;
	private String kinds;
	
	
	
	protected Animal() {
		super();
	}


	protected Animal(String name, String kinds) { //매개변수 있으면 초기화 해주는 것?
		super();
		this.name = name;
		this.kinds = kinds;
	}


	@Override
	public String toString() {
		return "저의 이름은" + this.name + "이고, 종류는 " + this.kinds + "입니다.";
	}
	
	public abstract void speak();

}
