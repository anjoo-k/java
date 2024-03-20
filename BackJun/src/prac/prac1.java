package prac;

import java.util.Scanner;

public class prac1 {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        int n = sc.nextInt();
//        System.out.println(str.repeat(n)); 여기엔 없는듯?
		
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(int i = 0; i < a.length(); i++) {
        	if(a.charAt(i) >= 97 && a.charAt(i) <= 122) {
        		System.out.println(a.toUpperCase().charAt(i));
        	} else {
        		System.out.println(a.toLowerCase().charAt(i));
        	}
        }
        
        System.out.println("!");
       
	    }
	}


