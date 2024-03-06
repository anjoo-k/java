package com.kh.object;

/*
 *   *클래스의 구조
 *   옵션 class 이름 {
 *   	  //필드 영역
 *   			{사용할 데이터 선언]
 *   
 *   	  //생성자 영역
 *   			{데이터 초기화하는 특수목적 메소드인 생상저 저의}
 *   
 *   	  //메소드 영역
 *   			{클래스의 기능 정의 영역}
 *   }
 *   
 *   
 *   *접근제한자 : 해당 구조에 접근할 수 있는 범위 제한
 *     - public > protected > default > private
 *    
 *     - 클래스에 사용 가능한 접근제한자 2가지
 *       : default(아무 것도 안쓴 것), public
 *     - 필드 or 메소드에서 사용할 수 있는 접근제한자
 *       : ↓ public 어디서든(같은 패키지, 다른 패키지 모두) 접근 가능
 *         ↓ protected 같은 패키지에서만 or 다른 패키지일 경우 상속구조(부모자식 관계)에서만 접근 가능
 *         ↓ default 같은 패키지에서만 접근 가능
 *         ↓ private only 해당 클래스에서만 접근 가능
 *        -> 위에서 아래로 내려올수록 접근할 수 있는 범위 좁아진다.
 *         
 *         
 */	

public class Student { // 학생을 추상화 해서 만든 클래스
	// 필드영역
	// 자료형 변수명;
	
	//// 필드를 public 접근제한자로 작성
	////  => 필드에 직접적으로 접근해서 값을 대입하거나 값을 가져올 수 있음
	////  => 외부에서 값을 변경하거나 조회 권한이 없는 사람이 값을 쉽게 가져올 수 있음
	////  = 캡술화를 진행함
	 
	private String name; // public 유무 노상관
	private int age; //// if 나이는 1년 1살씩 증가, 나이는 무조건 0보다 크다.
	private double height;
	
	public static int count = 0;
	
	
	// 생성자영역
	// 매개변수가 있는 생성자 작성 시 기본생성자 생성 X
	// 옵션 클래스명(초기화하고자 하는 값을 담은 매개변수){초기화}
	public Student (){
		this("입력안됨", 0, 0); // this(name, age, 0) : 이렇게 사용도 가능
		//this.name = "입력안됨";
		//this.age  = 0;
		//this.height = 0;
	}
	public Student (String name, int age, double height){
		this.name = name;
		this.age  = age;
		this.height = height;
		
		this.count++;
	}
	public Student (String name, int age){
		this(name, age, 0);
		//this.name = name;
		//this.age  = age;
		//this.height = 0;
	}
	
	//// getter, setter **************************** 우와 이해안돼
	//// getter : 해당 필드에 값을 가지고 오기 위한 메소드, setter가 필드에 넣어준 값 뺌
	//// setter : 해당 필드에 값을 대입시키기 위한 메소드, 필드에 값 넣어줌
	
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age > 0 ? age : 1;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void ageUp() {
		this.age += 1;
	}
	
	
	
	
	//메소드영역
	//
	// <표현법>
	// 옵션 메소드명(매개변수) { 
	//			기능코드
	// }
	//
	// 매개변수
	// : 해당 메소드 호출 시 전달값(인자)을 받기 위한 변수 선언문
	// (해당 메소드 내에서만 사용 가능)
	public void print() {
		System.out.println("안녕하세요. " + this.age + "살 " + name + "입니다.");
	}
	
	// 메소드 오버로딩
	// 동일한 이름의 메소드가 있을 때, 매개변수의 갯수 또는 자료형에 따라 메소드 구분 가능
	
	public void print(String gender) {
		System.out.println("안녕하세요. " + this.age + "살 " + this.name +"이고 성별은 " + gender + " 입니다.");
	}
	

}
