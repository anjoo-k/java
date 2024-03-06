import java.util.Scanner;
public class ControllAndLoop01 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 문자열을 입력받고 문자열의 검색될 문자를 입력받아 해당 문자가 몇 개 있는지 갯수를 출력하세요.
		 * 그리고 다시하시겠습니까?: 표시해준 뒤 y를 입력하면
		 * 다시 반복하고 다른 문자를 입력하면 종료
		 * 
		 * 문자열: banana
		 * 문자: a
		 * banana안에 포함된 a의 개수 : 3
		 * 다시 하시겠습니까? (y/n) : y
		 * 
		 * 문자열: banana
		 * 문자: a
		 * banana안에 포함된 a의 갯수 : 3
		 */
		Scanner sc = new Scanner(System.in);
		int count = 0;
		char tobeContinue;
		do {
		System.out.print("문자열: ");
		String str = sc.nextLine();
		
		System.out.print("문자: ");
		char a = sc.next().charAt(0);
		
		char[] arr = new char[str.length()];
		


			for(int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i);
					if(a == arr[i]) {
						count++;
					} 
			}
			System.out.println(str + " 안에 포함된 " + a + "의 갯수:" + count);
		
			System.out.print("다시하시겠습니까?(y/n)");
			tobeContinue = sc.next().charAt(0);	
			
		} while( tobeContinue == 'y');
		
		
		System.out.println("종료");
		//쓰읍 결과 이상한데
	}

}
