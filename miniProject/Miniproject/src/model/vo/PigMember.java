package model.vo;

import java.sql.Date;

public class PigMember {
	
	private int pNum;
	private String uniNum; 
	private String birth;
	private String gender;
	private String breed;
	private double birthWeight;
	private String finalDate;
	private double finalWeight;
	private String selection;
	public static int totalNumD;
	public static int totalNumB;
	
	
		
	public PigMember() {
		super();
	}



	public PigMember(int pNum, String uniNum, String birth, String gender, String breed, double birthWeight,
			String finalDate, double finalWeight, String selection) {
		super();
		this.pNum = pNum;
		this.uniNum = uniNum;
		this.birth = birth;
		this.gender = gender;
		this.breed = breed;
		this.birthWeight = birthWeight;
		this.finalDate = finalDate;
		this.finalWeight = finalWeight;
		this.selection = selection;
	}
	
	public PigMember(String uniNum, String birth, String gender, String breed, double birthWeight,
			String finalDate, double finalWeight, String selection) {
		super();
		this.uniNum = uniNum;
		this.birth = birth;
		this.gender = gender;
		this.breed = breed;
		this.birthWeight = birthWeight;
		this.finalDate = finalDate;
		this.finalWeight = finalWeight;
		this.selection = selection;
	}
	



	public int getpNum() {
		return pNum;
	}





	public void setpNum(int pNum) {
		this.pNum = pNum;
	}





	public String getUniNum() {
		return uniNum;
	}





	public void setUniNum(String uniNum) {
		this.uniNum = uniNum;
	}





	public String getBirth() {
		return birth;
	}





	public void setBirth(String birth) {
		this.birth = birth;
	}





	public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public String getBreed() {
		return breed;
	}





	public void setBreed(String breed) {
		this.breed = breed;
	}





	public double getBirthWeight() {
		return birthWeight;
	}





	public void setBirthWeight(double birthWeight) {
		this.birthWeight = birthWeight;
	}





	public String getFinalDate() {
		return finalDate;
	}





	public void setFinalDate(String finalDate) {
		this.finalDate = finalDate;
	}





	public double getFinalWeight() {
		return finalWeight;
	}





	public void setFinalWeight(double finalWeight) {
		this.finalWeight = finalWeight;
	}





	public String getSelection() {
		return selection;
	}





	public void setSelection(String selection) {
		this.selection = selection;
	}







	@Override
	public String toString() {
		return "돼지정보 [" + pNum + ",  " + uniNum + ", 생일:" + birth + ", 성별:" + gender + ", 품종:" + breed + 
				", 생시체중:" + birthWeight + ", 종료일령:" + finalDate + ", 종료체중:" + finalWeight
				+ ", 선발여부:" + selection + "]";
	}


	
	

}
