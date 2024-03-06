package com.kh.inherit02;

public class Desktop extends Product {

	private boolean allinOne; // 일체형인지 여부

	public Desktop(String brand, String pCode, String pName, int price, boolean allinOne) {
		super(brand, pCode, pName, price);
		this.allinOne = allinOne;
	}

	public boolean isAllinOne() {
		return allinOne;
	}

	public void setAllinOne(boolean allinOne) {
		this.allinOne = allinOne;
	}
	
	
	// super. 으로 부모에 접근 가능
	// 오버라이딩 : 부모클래스에 있는 메소드를 자식클래스에서 재정의하는 것
	
	@Override // annotation, 직접 적어도 가능
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + ", allinOne:" + this.allinOne;
	}
	
	
	
	
	


}
