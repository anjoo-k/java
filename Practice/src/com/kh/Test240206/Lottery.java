package com.kh.Test240206;

import com.kh.Test2402052.Book;

public class Lottery {
	
	private String name;
	private String phone;
	
	public Lottery() {
		super();
	}
	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return name + "(" + phone + ")";
	}
	@Override
	public int hashCode() {
		String str = this.name + this.phone;
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		boolean isEquals = false;
		if(obj instanceof Lottery) {
			Lottery tmp = (Lottery) obj;
			if(this.getName().equals(tmp) &&
					this.getPhone().equals(tmp)) {
				isEquals = true;
			}
		}
		return isEquals;

	}
	
	
	

}
