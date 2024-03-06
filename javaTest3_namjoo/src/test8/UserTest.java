package test8;

/**
 * Object 활용, 캐스팅
 */
public class UserTest { 
	public static void main(String[] args) {
		 
		User[] users = new User[3];
		
		users[0] = new User("user01", "pass01", "김철수", 32, 'M', "010-1234-5678");
		users[1] = new User("user02", "pass02", "이영희", 25, 'F', "010-5555-7777");
		users[2] = new User("user03", "pass03", "황진이", 20, 'F', "010-9874-5632");
		
		System.out.println("user list -----------------------------");
		for(User u : users) {
			System.out.println(u.toString());
		}
		
		
		User[] copyUsers = new User[users.length];
		for(int i = 0; i < users.length; i++) {
			copyUsers[i] = (User)users[i].clone();
			// clone 메서드 : Users를 copyUser스에 깊음복사 하려고 만듬
		}
		
		System.out.println("copyuser list -------------------------");
		for(User cu : copyUsers) {
			System.out.println(cu.toString());
		}
		
		System.out.println("비교결과 --------------------------------");
		for(int i = 0; i < users.length; i++) {
			System.out.println(users[i].equals(copyUsers[i]));
			// boolean Object 메서드 : Users랑 copyUsers가 같냐는 이 부부을 위해서 boolean Object 메서드를 만들었음
		}
		
		
	}

}
