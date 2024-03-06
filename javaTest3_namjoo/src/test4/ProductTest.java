package test4;

import java.util.Scanner;

/**
 * class, 객체만들기 연습: getter/setter, toString, 생성자에 넣기 등
 */
public class ProductTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String name = sc.next();
		int price = sc.nextInt();
		int quantity = sc.nextInt();
		
		
		Product dg = new Product(name, price, quantity);
			
		
		System.out.println(dg.information());
		
	}

}
