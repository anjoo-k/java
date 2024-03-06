package com.kh.Test2402072;
//Model : VO(value object) 데이터를 저장하는 객체
public class Farm {
	
	private String kind;
	
	

	public Farm() {
		super();
	}



	public Farm(String kind) {
		super();
		this.kind = kind;
	}




	public String getKind() {
		return kind;
	}



	public void setKind(String kind) {
		this.kind = kind;
	}



	@Override
	public String toString() {
		return "Farm [kind=" + kind + "]";
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
