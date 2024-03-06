import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetRun {
	public static void main(String[] args) {
		// Object에 equals() => 두 객체의 "주소값"을 비교, 일치하면 true/불일치 false 반환
		// Object에 hashCode() => 해당 객체의 "주소값"을 가지가 10진수 형태로 만들어 반환
		
		HashSet hsi = new HashSet(); //equal는 주소값을 비교한다! 주소값의 hashCode 비교
		
		hsi.add("반갑습니다.");
		hsi.add(new String("반갑습니다.")); // equal 오버라이딩 되어 있다.
		hsi.add(new String("여러분"));
		hsi.add(new String("안녕하세요"));
		hsi.add(new String("여러분"));
		System.out.println(hsi); // 저장 순서를 유지하지 않는다! 중복된 데이터(동일객체) 보관 불가!
		// String의 equals() 오버라이딩 => "실제 담긴 문자열"을 가지고 동등비교를 진행하여 일치 true/불일치 false 반환
		// String에 hashCode() 오버라이딩 => "실제 담긴 문자열"을 가지고 10진수 형태로 만들어 반환
		
		
		
		HashSet hs2 = new HashSet();
		hs2.add(new Student("공유", 43, 100));
		hs2.add(new Student("최지원", 20, 85));
		hs2.add(new Student("홍길동", 25, 20));
		hs2.add(new Student("공유", 43, 100).equals(new Student("공유", 43, 100)));
		
		// HashSet이라는 공간에 객체가 추가될 때 마다 동일 객체인지 비교!
		// (해쉬코드, 이퀄스 오버라이딩 해주면 중복값은 없어진다.)
		// 동일객체 : 각 개체마다 hashCode 결과가 일치하고, equals 메소드로 비교 시 true가 나올 때
		
		
		// Student에 equals() 오버라이딩 => "실제 각 필드에 담긴 데이터" 가 다 일치하면 true/일치하지 않으면 false
		// Student에 hashCode() 오버라이딩 => "실제 각 필드에 담긴 데이터"가 일치하면 동일한 10진수 반환
		
		
		
		System.out.println(hs2);
		
		
		
		// hs2.get(1); 인덱스 없음. get 메소드가 정의되어 있지 않음 -> 한개씩 무작위로 가져올 수 있음
		// HashSet에 담긴 모든 객체들이 순차적으로 접근 가능
		// 1. for문 사용가능 (for each 문으로만 가능)
		
		for(Object s : hs2) {
			System.out.println("값꺼내기: " + s); // 순서없이 나온다.
		}
		
		// 2. ArrayList에 담아준 다음 그 ArrayList를 반복문으로 돌려가며 접근 가능
		//  방법1. ArrayList 생성 후 addAll 메소드를 이용해서 통채로 추가
		ArrayList list = new ArrayList();
		list.addAll(hs2);  
		//  방법2. ArrayList 생성과 동시에 통채로 추가
		ArrayList list2 = new ArrayList(hs2);
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println("ArrayList 담아서 값꺼내기: " + list2.get(i));
		}
		
		// 3. Iterator 반복자를 이용해 순차적 접근
		Iterator it = hs2.iterator();
		while(it.hasNext()) { // 다음에 가져올 값이 있을까?
			Student s = (Student) it.next(); // 형변환 싫으면 제네릭 써주면 된다(앞에 2402052 Book 만든거)
			System.out.println("Iterator로 값꺼내기" + s);
		} // StringTokenizer와 비슷한 개념
		
	}

}
