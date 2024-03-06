
public class A_Method2 {
	public static void main(String[] args) {
		double myHeight = 175.9;
		hiEveryone(12, 12.5); // () 안에 들어가 있는 것은 인자, 인수, Argument
		hiEveryone(13, myHeight); // hiEveryone 이라는 함수를 불렀고, int age 값을 넣어줌
		byEveryone();
	}
	
	public static void hiEveryone (int age, double height) { // hiEveryone 은 함수의 이름
		System.out.println("제 나이는 "+ age + "세 입니다.");
		System.out.println("저의 키는 "+ height + "cm 입니다.");
	} 
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}

}
