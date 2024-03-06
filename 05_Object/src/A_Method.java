
public class A_Method {
	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		hiEveryone(12); // () 안에 들어가 있는 것은 인자, 인수, Argument
		hiEveryone(13); // hiEveryone 이라는 함수를 불렀고, int age 값을 넣어줌
		System.out.println("프로그램의 끝");
	}
	
	public static void hiEveryone (int age) { // hiEveryone 은 함수의 이름
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는 "+ age + "세 입니다.");
	} 

}
