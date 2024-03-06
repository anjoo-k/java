
/**
 *  쓰레드 : 프로그램 내에서 실행 흐름을 가지고 있는 최소 단위
 *  	   main 메소드 실행 시 메인쓰레드가 실행되는 것
 */
public class Thread01 {
	public static void main(String[] args) {
		MyRunable task = new MyRunable();
		
		Thread t1 = new Thread(task);
		Task t2 = new Task();
		t1.start();
		t2.start();
		
		System.out.println("End : " + Thread.currentThread().getName());
	}

}
