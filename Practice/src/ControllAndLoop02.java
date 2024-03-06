import java.util.Scanner;
public class ControllAndLoop02 {
	public static void main(String[] args) {
	/*
	 * 사용자 이름 입력하고, 컴퓨터와 가위바위보 하세요. 컴퓨터가 가위인지 보인지 주먹인지는
	 * 랜덤한 수를 통해 결정하고 사용자는 직접 가위바위보를 받으세요
	 * 사용자가 exit을 입력하기 전까지 가위바위보를 계속 진행하고 exit이 들어가면 반복을 멈추고
	 * 몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
	 * 
	 */
	Scanner sc = new Scanner(System.in);
	//by teacher
	String name, userChoice, comChoice;
	String[] arr = {"가위", "바위", "보"};
	int win = 0, draw = 0, lose = 0;
	
	System.out.print("사용자 이름:");
	name = sc.next();
	
	while(true) {
	System.out.print("가위바위보:");
	userChoice = sc.next();
	
	if(userChoice.equals("exit")) {
		System.out.println((win + draw + lose) + "전" + win + " 승" + draw + " 무" + lose + " 패");
		break;
	}
	if(!(userChoice.equals("가위") || userChoice.equals("바위") || userChoice.equals("보"))) {
		System.out.println("잘 못 입력하셨습니다");
		continue;
	}
	
	comChoice = arr[(int)(Math.random() * 3)]; //컴퓨터의 선택 받기
	
	System.out.println("컴퓨터 입력 : " + comChoice);
	System.out.println(name + " 입력 : " + userChoice);
	
	if(userChoice.equals(comChoice)) {
		System.out.println("비겼습니다");
		draw++;
	} else if(userChoice.equals("가위") && comChoice.equals("보") ||
			userChoice.equals("바위") && comChoice.equals("가위") ||
			userChoice.equals("보") && comChoice.equals("바위")) {
		System.out.println("이겼습니다");
		win++;
	} else {
		System.out.println("졌습니다 ㅠㅠ");
		lose++;
	}
	} 
	
	
	
	
	
	
	
//	System.out.print("사용자 이름:");
//	String name = sc.next();
//	
//	int com = (int)(Math.random() * 4 + 1); //1 가위, 2 바위 3 보
//	
//	
//	
//
//	do {
//		System.out.print("가위바위보:");
//		String rcp = sc.next();
//		
//	switch (com) {
//	case 1:
//		System.out.println("가위");
//	case 2:
//		System.out.println("바위");
//	default:
//		System.out.println("보");
//	}
//	if(rcp.equals("가위") && com == 1) {
//		System.out.println("컴퓨터:가위\n" + "박신우:" + rcp);
//	} else if(rcp.equals("바위") && com == 2) {
//		System.out.println("컴퓨터:바위\n" + "박신우:" + rcp);
//	} else {
//		System.out.println("컴퓨터:보\n" + "박신우:" + rcp);
//	}
//	System.out.println("비겼습니다");
//	
//	if(rcp.equals("가위") && com == 2 ){
//		System.out.println("컴퓨터:가위\n" + "박신우:" + rcp);
//	} else if(rcp.equals("바위") && com == 3) {
//		System.out.println("컴퓨터:바위\n" + "박신우:" + rcp);
//	} else {
//		System.out.println("컴퓨터:보\n" + "박신우:" + rcp);
//	}
//	System.out.println("졌습니다 ㅠㅠ");
//	
//	if(rcp.equals("가위") && com == 3){
//		System.out.println("컴퓨터:가위\n" + "박신우:" + rcp);
//	} else if(rcp.equals("바위") && com == 3) {
//		System.out.println("컴퓨터:바위\n" + "박신우:" + rcp);
//	} else {
//		System.out.println("컴퓨터:보\n" + "박신우:" + rcp);
//	}
//	System.out.println("이겼습니다");
//	
//	int count;
//	if(rcp.equals("exit")) {
//		
//	}
//	} while();
	
	}
}
