package prac;

import java.util.Scanner;

public class prac1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();            
		String overwrite_string = sc.next();
		int s = my_string.length() - overwrite_string.length();
		
		prac1 prac1 = new prac1();
		String answer = prac1.solution(my_string, overwrite_string, s);
		
		System.out.println(answer);
			
	
	}
	public String solution(String my_string, String overwrite_string, int s) {

		String answer = "";
		String str = "";
		for(int i = 0; i < s; i++) {
			str += my_string.charAt(i);
		}
		answer = str + overwrite_string;
	    return answer;
	    }
}

	



