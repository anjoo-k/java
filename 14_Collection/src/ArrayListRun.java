import java.util.ArrayList;
import java.util.List;

public class ArrayListRun {
	/**
	 * * 컬렉션이란?
	 *  자료구조 개념이 내장되어 있는 클래스.
	 *  자바에서 '자료구조'를 담당하는 '프레임워크'이다.
	 * 
	 * (자료구조) 방대한 데이터를 보다 효율적으로 관리(추가, 삭제, 조회, 정렬, 수정)할 수 있도록 도와주는 개념
	 * (프레임워크) 이미 만들어져 있는 틀(뼈대)
	 * 
	 * 
	 *  * 배열의 단번과 컬렉션의 장점
	 *   (배열의 단점)
	 *   1. 배열은 크기를 지정해야한다. 한번 크기를 지정하면 변경할 수 없다.
	 *   	새로운 값을 추가하고자 한다면 새로운 크기의 배열을 만들고 기존의 값을 전부 복사하는 코드를 작성해야
	 *   2. 배열 중간 위치에 값을 추가하거나 삭제하는 경우, 값을 매번 땡겨주는 복잡한 코드를 작성해야 한다.
	 *   3. 한 공간에 한 타입의 데이터만 저장 가능
	 *   (컬렉션의 장점)
	 *   1. 크기를 지정해 줄 필요 없다. 지정했다고해도 더 많은 데이터가 들어오면 자동으로 사이즈를 조절한다. = 크기 제약 x
	 *   2. 중간에 값을 추가하거나 삭제하는 경우 값을 옮겨주는 작업(알고리즘) 직접 할 필요 x
	 *   	메소드 호출만으로 자동적으로(자바 내부적으로) 진행 된다.
	 *   3. 한 공간에 여러타입의 데이터 저장할 수 있다(단, 객체만 가능). = Object로 받아준다.
	 *      한 타입만 담도록 제한할 수 도 있음(제네릭)
	 *      
	 *  * 대량의 데이터를 보관해 두고 조회만 할 경우 배열 많이 사용
	 *    대량의 데이터를 보관, 추가, 삭제 등 과정이 빈번할 경우 컬렉션 사용
	 *    
	 *    + in ppt (Collection) List, Set   / Map
	 *   			저장데이터 : 데이터만 담기 / key, value 세트로 담아야
	 * 				순서		:  O	X	 / X
	 * 				중복값	:  O	X	 / key X, value O
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList(3); // 크기 정하지 않아도 된다. 정해도 상관없음
		System.out.println(list); // 비어있는 상태
		
		// E -> Element : 리스트에 담긴 데이터(요소)
		
		// 1. add(E e)
		// : 리스트에 전달된 데이터 추가 메소드
		list.add(new Music("비의 랩소디", "임재현"));
		list.add(new Music("사건의 지평선", "윤하"));
		list.add(new Music("에피소드", "이무진"));
		list.add("끝");
		
		// (컬렉션 장점 1) 지정된 크기보다 많이 넣어도 오류 발생 x 
		// (컬렉션 장점 3) 여러 타입 보관 가능
		
		System.out.println("1 add(E e) : " + list); // (list 특징) 차례대로 담긴다(0번 인덱스부터 차곡차곡)
		
		
		
		// 2. add(int index, E e)
		// 직접 인덱스 지정해 그 위치에 데이터 추가시키는 메소드
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		// (컬렉션 장점 2) 중간 위치에 데이터 추가 시 복잡한 알고리즘 직접 구현 불필요
		System.out.println("2 add : " + list);
		
		
		
		// 3. remove(int index)
		// : 해당 인덱스 위치 데이터 삭제 메소드
		list.remove(1);
		System.out.println("3 remove : " + list);
		
		
		
		// 4. set(int index, E e)
		// : 해당 인덱스 위치에 데이터를 새로 전달된 e로 수정하는 메소드
		list.set(0, new Music("모래알갱이", "임영웅"));
		System.out.println("4 set : " + list);
		
		
		
		// 5. size()
		// : 리스트 사이즈 반환하는 메소드(즉, 몇개의 데이터가 담겨있는지)
		System.out.println("5 리스트 사이즈 : " + list.size());
		
		
		
		// 6. get(int index)
		// : 해당 인덱스 위치의 객체 반환해주는 메소드
		list.get(1);
		Music m = (Music)list.get(0); // 다운캐스팅: list.get() 실행하고 (Music) 적용
		String s = (String)list.get(3);
		System.out.println("6 " + m);
		System.out.println("6 " + s);
		System.out.println("6 " + list.get(1));
		System.out.println("6 " + ((Music)(list.get(1))).getTitle());
		
//		   public E get(int index) {    => .get() ArrayList 클래스에서 메서드 찾으면, E는 Object 객체로 생각하면 된다.
//		        rangeCheck(index);		=> 
//
//		        return elementData(index);
//		    }
//		
		
		
		// 7. subList(int index1, int index2)
		// : List => 추출해서 새로운 List로 반환
		List sub = list.subList(0, 2); // 0부터 2인덱스 전까지 0 <= list < 2	
		System.out.println("7 subList : " + sub);
		
		
		// 8. addAll(Collection c)
		// : 컬렉션을 통채로 뒤에 추가시키는 메소드
		list.addAll(sub);
		System.out.println("8 addAll : " + list);
		
		
		
		// 9. isEmpty()
		// boolean 반환 => 컬렉션이 비어있는지 묻는 메소드
		System.out.println("9 isEmpty() : " + list.isEmpty());
		
		
		
		// 10. clear()
		// 전부 비워주는 메소드
//		list.clear();
		System.out.println("10 " + list);
		
		
		
		System.out.println("=========================================================================");
		
		
		
		// 반복문 이용해 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println("반복문 출력 : " + list.get(i));
		}
		
		
		
		System.out.println("=========================================================================");
		// for each문 (향상된 for 문)
		for(Object e : list) {
			System.out.println("for each문 : " + e);
		}
		
		
		
	}

}
