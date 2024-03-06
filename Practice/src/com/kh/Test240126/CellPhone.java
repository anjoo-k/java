package com.kh.Test240126;

public interface CellPhone extends Phone, Camera { //오버라이딩 안하니까 사실 상속 안넣어줘도 됨
	
	public abstract String charge();

}
