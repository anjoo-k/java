import java.util.Scanner;
public class Control03 {
	public static void main(String[] args) {
		// 아이디와 비밀번호를 입력받아 지정해둔 아이디와 비밀번호와 비교해서 
		// 로그인 성공 시 로그인 성공
		// 아이디가 틀렸을 시 "아이디가 틀렸습니다"
		// 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		
		String id = "myId";
		String pwd = "myPassword12";
		
		System.out.print("아이디 : ");
		String checkId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String checkPwd = sc.nextLine();
		 
//		// by me
//		 if (id.equals(checkId) && pwd.equals(pwd)) {
//			 System.out.println("로그인 성공");
//		 } else if (!(id.equals(checkId))) {
//			 System.out.println("아이디가 틀렸습니다.");
//		 } else if (!(pwd.equals(checkPwd))) {
//			 System.out.println("비밀번호가 틀렸습니다.");
//		 }
		 
		 //by teacher
		 if(id.equals(checkId)){
			 if(pwd.equals(checkPwd)) {
				 System.out.println("로그인 성공");
			 } else {
				 System.out.println("비밀번호가 틀렸습니다.");
			 }
		 } else
			 System.out.println("아이디가 틀렸습니다.");
		
	}

}
