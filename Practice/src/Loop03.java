import java.util.Scanner;
public class Loop03 {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 숫자의 단부터 9단까지 출력
		// 단, 9를 초과하는 숫자가 들어오면 "9 이하의 숫자만 입력해주세요" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int dan = sc.nextInt();
		
		//잘못된 값이 입력되었을 때 반복해서 다시 입력		
		while(dan > 9 || dan < 1) {
			System.out.println("1 이상 9이하의 숫자만 입력해주세요 : ");
			dan = sc.nextInt();
		}
		
		for(int i = dan; i <= 9; i++) {
			System.out.println("=======" + i + "단======");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			
		}
		
	}

}
