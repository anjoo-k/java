package com.kh.Test240126;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	
	private String maker; // 제조사정보
	
	
	
	


	public SmartPhone() {
		this.maker = ""; //의미없음. 어차피 상속에 의해 값 들어감
	}
	
	
	public abstract String printInformation();
	
	
	public SmartPhone(String maker) {
		super();
		this.maker = maker;
	}



	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	

}
