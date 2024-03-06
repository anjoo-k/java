
public class Run {
	/*
	 * 객체배열
	 * : 객체를 저장하는 배열. 일반적인 배열과 다르게 배열의 각 요소가 참조변수로 이루어져 있다.
	 *  -> 사용을 위해서는 각 요소마다 객체 생성 필요
	 *  
	 *  [표현법]
	 *  클래스명[] 배열명 = new 클래스명[크기]; -> 크기가 n개인 참조변수 배열생성
	 *  배열명[index] = new 클래스명(); -> 각 인덱스 객체 생성
	 *  
	 */
	public static void main(String[] args) {
		Human[] humanArr = new Human[3]; // -> [] [] []
		humanArr[0] = new Human("홍길동", 21, 'i');
		humanArr[1] = new Human("고길동", 44, 'j');
		humanArr[2] = new Human("김길동", 12, 'k');		
		
		for(int i = 0; i < humanArr.length; i++) {
			humanArr[i].print();
			System.out.println();
		}
		
		Human[] humanArr2 = {new Human("홍길동", 21, 'i'),
							new Human("고길동", 44, 'j'),
							new Human("김길동", 12, 'k')};
		
	}

}
