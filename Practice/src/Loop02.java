import java.util.Scanner;
public class Loop02 {
	public static void main(String[] args) {
		// 사용자로부터 두 개의 값을 입력받아
		// 그 사이의 숫자를 모두 출력하고
		// 1 이하의 숫자가 입력 되었을 시 "1 이상의 숫자를 입력해 주세요" 출력
		Scanner sc = new Scanner(System.in);
		int min, max, num1, num2;
		System.out.print("첫 번째 숫자 : ");
		num1 = sc.nextInt();
		
		//num1이 1보다 작다면 다시 입력받기 반복
		while(num1 < 1) {
			System.out.println("1 이상의 숫자를 입력해 주세요 : ");
			num1 = sc.nextInt();
		}
		
		System.out.print("두 번째 숫자 : ");
		num2 = sc.nextInt();
		
		//num2가 1보다 작다면 다시 입력받기 반복
		while(num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해 주세요");
			num2 = sc.nextInt();	
		}
		
		min = (num1 < num2 ? num1 : num2); // 작은 값이 할당
		max = (num1 > num2 ? num1 : num2); // 큰 값이 할당
		
		// i <- num1이 num2보다 작다면 num1이 들어가고 아니면 num2가 들어가라
//		for (int i = (num1 < num2 ? num1 : num2); i++)
		
		for(int i = min; i <= max; i++) {
			System.out.println(i + " ");
		}
		
	}

}
