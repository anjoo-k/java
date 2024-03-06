
public class A_Array02 {
	public static void main(String[] args) {
//		int i = 10;
//		int[] iArr = new int[5];
//		System.out.println(iArr);
//		
//		double[] dArr = new double[3];
//		System.out.println(dArr);
		
		/* 실제 리터럴값을 바로 담을 수 있는 변수 = '일반변수'
		 * 주소값을 담고 있는 변수 = '참조 변수(레퍼런스 변수)'
		 * 
		 * 기본자료형(boolean, int, char, byte, long, double 등)으로 선언된 변수
		 *  -> 리터럴 값을 바로 담는 변수 = 일반변수
		 * 그 외 자료형(int[], double[], char[, ..., String, Scanner)
		 *  -> 주소값을 담는 변수 = 참조변수
		 */
		
		int[] iArr = new int[3]; // index : 0 ~ 2
		double[] dArr = new double[4]; // index : 0 ~ 3
		// 배열을 선언하고 크기 지정(메모리 할당)까지만 한 상태
		// 각각의 인덱스에 초기화 상태
		
		// 내가 각 인덱스의 초기화를 하지 않아도 값들이 담겨 있다.
		// Heap이라는 공간에 절대 빈 공간이 존재할 수 X
		// -> 따라서 공간이 만들어질 때, JVM이 기본값으로 초기화를 진행
		
		//iArr 전부 출력
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i] + " ");
		}
		System.out.println();
		//dArr 전부 출력
		for (int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i] + " ");
		}
		
		System.out.println(iArr); // 배열의 자료형 + @ + 주소값의 16진수 형태로 출력
		System.out.println(iArr.hashCode()); // 주소값의 16진수 형태
		System.out.println("안녕하세요".length()); // 문자열에서는 뒤에 ()가 필요
		System.out.println(iArr.length); // 배열의 길이(클래스에서는 ()필요x)
		System.out.println(dArr);
		
		/* 
		 * null을 가지고 있는 참조변수에 접근하여 다른 정보를 구하고자 한다면,
		 * 항상 오류가 발생 -> NullPointerException (가르키는게 없다는 오류)
		 * System.out.println(arr.hashCode());
		 * System.out.println(arr.length);
		 */
		int[] arr = null; // 아무것도 참조하고 있지 않음
		// 주소값을 담은 참조변수의 기본값이 null
		System.out.println(arr);
	
		/*
		 * ArrayIndexOutOfBoundsException
		 * : 배열에 부적잘한 인덱스 제시 시 발생(범위에서 벗어난 인덱스 제시)
		 * System.out.println(arr[5]);
		 */		
		arr = new int[5];
		System.out.println(arr[4]);
		
		// 배열의 가장 큰 단점
		// -> 한번 지정된 배열의 크기는 변경 불가
		// : 배열의 크기를 변경하고자 한다면 다시 만들어야
		System.out.println(arr.hashCode());
		arr = new int[7];
		System.out.println(arr.hashCode()); // 주소값이 변경됌 -> 새로운 곳을 참조하고 있다.
		
		/*
		 * 연결이 끊어진 기존 배열은 Heap 영역에 둥둥 떠다님ㅋㅋㅋ(어디에도 참조되어 있지 않아 사용되지 x => 더 이상 필요X)
		 *  -> 일정 시간이 지나면, "가비지 컬렉터(GC)"가 알아서 지워줌
		 *  -> 자바에서의 "자동메모리 관리" 특징 : 개발자가 코드작성에만 집중 가능
		 */
		
		arr = null; // 배열을 강제로 삭제시키고자 한다면 -> 연결고리를 끊어주면 된다(null 대입)
		
		// 배열 선언, 할당, 초기화 전부 동시에 진행하는 방법
		int[] arr2 = new int[] {1, 2, 3, 4}; // 표현법1
		int[] arr3 = {1, 2, 3, 4}; // 표현법2
		int[] arr4 = arr3;
		
		System.out.println(arr2 == arr3); // false -> 각각의 변수값에 담겨 있는 주소값을 비교하기 때문
		

	}

}
