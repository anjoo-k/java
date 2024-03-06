import java.util.ArrayList;

public class Run {
	public static void main(String[] args) {
		// 객체를 생성하는 시점에 어떤 타입을 사용할지 타입인자 전달
		
		Box<Integer> aBox = new Box<>();
		
		Integer[] arr = new Integer[10];
		aBox.setOb(arr);
		
		aBox.getOb()[0] = 10;
		
		
		//aBox.setOb(15);
		
		//Box<String> bBox = new Box<>("사과", 0);
		
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.set(0, "안녕");
		
		
		
		
		
		
		
	}
	
	
	
	

}


