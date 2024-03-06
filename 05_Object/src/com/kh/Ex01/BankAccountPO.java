package com.kh.Ex01;

public class BankAccountPO {
	// 필드
	static int balance = 0; // 예금잔액
	public static void main(String[] args) {
		deposit(10000); //입금 진행
		checkMyBalance(); // 잔액 확인
		withdraw(3000); // 출금 진행
		checkMyBalance(); //잔액 확인
	}
	public static int deposit(int amount) { // 입금
		balance += amount;
		return balance;
	}
	public static int withdraw(int amount) { // 출금
		balance -= amount;
		return balance;
	}
	public static int checkMyBalance() { // 예금 조회
		System.out.println("잔액: " + balance);
		return balance;
		
	}
	
}
