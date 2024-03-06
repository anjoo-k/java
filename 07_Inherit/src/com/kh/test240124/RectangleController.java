package com.kh.test240124;

public class RectangleController {
	
	private Rectangle r = new Rectangle();

	
	public String calcArea(int x, int y, int height, int width) {
		r.setY(y); // 변수 초기화 = 처음에 값을 넣어줘라
		r.setX(x);
		r.setHeight(height);
		r.setWidth(width);
		
		// r = new Rectangle(x, y, width, height); 위 방법 or 아예 객체를 새로 만들어주기
		
		int area = r.getWidth() * r.getHeight();
		// = int area =  height * width; 위 식이 더 정확
		
		return "면적 : " + r.toString() + " / " + area;
	}
	
	public String calPerimeter(int x, int y, int height, int width) {
		r.setY(y);
		r.setX(x);
		r.setHeight(height);
		r.setWidth(width);
				
		int perimeter = 2 * (r.getHeight() + r.getWidth());
		
		return "둘레 : " + r.toString() + " / " + perimeter;
	}
	
	
	

}
