package com.kh.Ex01;

public class BankAccountRun {
	public static void main(String[] args) {
//		// 두 개의 인스턴스(객체)가 생성된다.
//		//BankAccount라는 클래스로 yoon이라는 참조변수 생성, lee, choi 각각의 인스턴스를 새로운 공간으로 만듬
//		BankAccount lee = new BankAccount();
//		BankAccount choi = new BankAccount(); // 참조 변수 myAcnt2 선언 하고, 생성되는 인스턴스를 가리킴
//		
//		// 각각의 인스턴스 객체를 대상으로 예금을 진행	
//		lee.deposit(5000); // myAcnt1이 참조하는 인스턴스의 deposit 호출
//		choi.deposit(3000);
//		
//		//각각의 인스턴스 객체를 대상으로 출금 진행
//		lee.withdraw(2000); // lee(BankAccount) 객체의 withdraw 메서드를 호출해서 2000원 넣어라.
//		choi.withdraw(2000);
//		
//		//각각의 인스턴스 객체의 잔액의 조회
//		lee.checkMyBalance();
//		choi.checkMyBalance();
//		
//		System.out.println(lee.balanceEquals(choi)); 
//		// lee 객체의 balanceEquals 메서드를 호출하면서 choi 객체를 매개변수로 전달
//		
//		choi.checkMyBalance();
		
		BankAccount choi2 = new BankAccount(); //()는 매개변수 자리
		choi2.initAccount("12-456-78", "123457-898765", 10000);	
		
		BankAccount park = new BankAccount();
		park.initAccount("98-765-43", "987456-432123", 10000);
	}
	
}  