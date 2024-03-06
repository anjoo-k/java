package com.kh.Test240122;

public class TV {
	// 다옴과 같은 코드를 실행했을 때 예시와 같은 결과가  출력되도록 TV클래스를 작성하세요.
	// TV myTV = new TV("삼성", 2020, 65);\
	// myTV.show();
	// => 삼성에서 만든 2020년형 65인치 TV
	
	//필드
	private String brand;
	private int year;
	private int inch;
	private int price;
	
	//생성자
	public TV(String brand, int year, int inch, int price) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//메소드
	public void show() {
		System.out.println(this.brand + "에서 만든 " + this.year + "년형 " + this.inch + "인치 TV");
	}
}
