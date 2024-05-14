package prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Queue q = new LinkedList(); 

		
		int num = Integer.parseInt(br.readLine());
		String[] str = new String[num];
		
		for(int i = 0; i < str.length; i++) {
			str[i] = st.nextToken();
			
			if(str[i].equals("push")) {
				System.out.println(q.add(str[i + 1]));
				
			} else if(str[i].equals("pop")) {
				System.out.println(q.poll());
				
			} else if(str[i].equals("size")) {
				System.out.println(q.size());
				
			} else if(str[i].equals("empty")) {
				System.out.println(q.isEmpty());
				
			} else if(str[i].equals("front")) {
				System.out.println(q.peek());
				
			} else if(str[i].equals("back")) {
				System.out.println("ooo");
			}
		}
		
		
		
		
		
		
		
	}

}
