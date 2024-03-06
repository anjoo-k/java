import java.util.Scanner;
/* 1. Scanner을 사용하기 위해서 외부로부터 가져온다.
 * java.util package에서 Scanner class를 import 하는 것
 * -> allows you to use the Scanner class in your Java program
 */

public class InputTest {
		
		/*
		 *  키보드로 값을 입력하는 방법
		 *  Scanner를 사용한다.
		 *  (java.util.Scanner 클래스를 이용하는 것이다)
		 *  Scanner 클래스 내부의 메소드를 호출하여 입력받는 것
		 * 
		 *  [사용법]
		 *  Scanner 이름 = new Scanner(System.in)
		 *  ex) Scanner sc = new Scanner(System.in);
		 * 
		 *  sc.next() : 사용자가 입력한 값 중 공백이 있을 경우 '공백 이전까지의 값만' 읽어옴
		 *  sc.nestLine() : \n(개행문자)를 포함하는 한 라인을 읽고 '\n'을 버린 나머지만 가져옴
		 *  sc.nextByte(), sc.nextShort(), sc.nextInt(), sc.nextLog()
		 *  sc.nextFloat(), sc.nextDouble()
		 *  위처럼 정수나 실수를 입력받는 코드를 작성했을 때 \n이 토큰이 함께 들어오기 때문에
		 *  sc.nextLine()을 통해서 비워주는 코드를 작성해야한다.
		 * 
		 *  close() : 더 이상 Scanner 를 사용하지 않겠다.
		 *  hasNext() : 현재 Scanner 공간에 사용자로부터 입력받은 값이 남아있는지 확인
		 * 				없으면 다른 값이 들어올때까지 무작정 기다립니다. 기다렸다가 true 리턴
		 * 
		 */
		
		public static void main(String[] args) {
//			//  2. 스캐너 클래스의 객체를 생성
//			Scanner sc = new Scanner(System.in);
//			//  System.in은 입력받은 값을 바이트 단위로 받아들이겠다. : System에 in 된걸 Scanner 해라
//			//  출력시에는 System.out 이라는 구문을 사용했다.
//			
//			System.out.print("아무거나 입력하세요: ");
//			
//			String str1 = sc.next();
//			System.out.println(str1);
//			
//			String str2 = sc.next();
//			System.out.println(str2);
//			sc.nextLine();
//	
//			
//			System.out.print("한줄 입력받기: ");
//			String st1 = sc.nextLine();
//			System.out.println(st1);
//			
//			
//			System.out.print("이름을 입력하세요: ");
//			String name = sc.next(); //   next는 \n도 같이 가져간다.
//			
//			System.out.print("나이를 입력하세요: ");
//			int age = sc.nextInt(); //   얘는 숫자만 가져가니까 \n이 남아서 엔터 치면 \n이 같이 다음 줄로 넘어간다.
//			sc.nextLine(); //   남아 있던 \n을 빼준다.
//			//  위에서 사용한 nextInt() 때문에 함께 들어온 \n을 비워주는 코드
//			
//			//   -> 근데 여기서는 선언 안해줘도 되는건가?
//			System.out.print("주소를 입력하세요: ");
//			String add = sc.nextLine();
//			
//			System.out.println(name);
//			System.out.println(age);
//			System.out.println(add);
//			
//			
//			sc.close();
//			
			
			//스캐너 객체 생성
			Scanner input = new Scanner(System.in);
			String name, address;
			int age;
			
			System.out.println("=================================");
			System.out.print("이름을 입력해주세요: ");
			name = input.nextLine();
			System.out.print("나이를 입력하세요: ");
			age = input.nextInt();
			input.nextLine();
			
			System.out.print("주소를 입력하세요: ");
			address = input.nextLine();
			
			System.out.println("이름: " + name);
			System.out.println("나이: " + age);
			System.out.println("주소: " + address);
			System.out.println("=================================");					
								
	}

}
