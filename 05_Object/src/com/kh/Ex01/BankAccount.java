package com.kh.Ex01;

public class BankAccount {
	// 필드 (클래스의 데이터를 정의하는 곳)
	int balance = 0; // 예금잔액
	String accNumber; // 계좌번호 추가로 in
	String ssNumber; // 주민번호 추가로 in
	
	// 생성자 (데이처 초기화를 위한 특수목적 메소드) new BankAccount 에서 BankAccount 부분
	// 생성자의 특징: 생성자는 class와 이름이 동일한 메소드이다.
	// 반환형이 존재하지 않는다.
	// 아무 것도 만들지 않으면 컴파일러가 자동으로 기본생성자를 만들어준다. ↓바로 아래 메서드
	//1
	public BankAccount() { // 이거 안써줘도 컴파일러가 저절로 만들어줌
		System.out.println("객체생성");
	}
	//2
	public BankAccount (String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	} // BankAccount park = new BankAccount("98-765-43", "987456-432123", 10000);
	// =====> 메인메소드에서 생성자 부를때: 매개변수 모양대로 맞춰줘야 한다
	//3
	public BankAccount(String acc, String ss) {
		accNumber = acc;
		ssNumber = ss;
		balance = 0; // 계좌 돈안넣고 0으로 해서 만들어주세요!
	} // 오버로딩
	// 메서드 또는 생성자의 이름이 같지만 매개변수의 유형, 개수, 또는 순서가 다른 여러 버전을 정의하는 것
	
//	public BankAccount (String accNumber, String ssNumber, int balance) {
//		this(accNumber, ssNumber, 0);
//		// this() => 생성자에서 다른 생성자를 호출해 주는 것
//		// 항상 최상단에 위치해 있어야 한다
//		this.accNumber = accNumber; // this. 는 객체 자신, 필드값을 가리킬 때 this 써줌
//		this.accNumber = ssNumber; // this. 은 객체 자체의 필드값에 접근하는 방법
//		this.balance = balance;
//	}
	
	//---------------------------------------------------------------------------------------
	//데이터 초기값 세팅을 위한 메소드 생성
	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		accNumber = ss;
		balance = bal;
	}
	
	

	public int deposit(int amount) { // 입금
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) { // 출금
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() { // 예금 조회
		System.out.println("잔액: " + balance);
		return balance;
		
	}
	public boolean balanceEquals(BankAccount act01) { // 매개변수의 변수이름 중요x.. 메인 메서드에서 넣어주는 변수로 바뀜
		if(balance == act01.balance) { // balance: lee의 객체 3000, choi.balance: choi 객체의 1000원
			return true;
		} else {
			return false;
		}
	}	
	
}
