package com.kh.Test2402072;

public class Nut extends Farm {
	
	private String name;
	

	public Nut() {
		super();
	}


	public Nut(String kind, String name) {
		super(kind);
		this.name = name;
	}
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	

}
