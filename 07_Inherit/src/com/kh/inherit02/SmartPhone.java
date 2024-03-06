package com.kh.inherit02;

public class SmartPhone extends Product {

	private String mobileAgency; // 통신사

	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override // annotation, 직접 적어도 가능
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + ", mobileAgency:" + this.mobileAgency;
	}
	
	
	

}
