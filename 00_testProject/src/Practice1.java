
import java.util.Scanner;

public class Practice1 {
	
	/*
	 * 이름, 성별, 나이, 키를 사용자에게 입력받아 각가의 값을 변수에 담고 출력하세요.
	 * 
	 * 문자열.charAt(index) : 문자열에서 내가 원하느 index의 글자를 가져온다.
	 * index : 몇번째냐(정수 넣음)
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.print("성별을 입력하세요(남/여): ");
		char gender = sc.next().charAt(0);
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm): ");
		float height = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("키 " + height + "cm인 " + age + "살" + gender + "자" + name + "님 반갑습니다^^");
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);
	}

}
