import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class MapRun {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		// 계층구조를 보면
		// List계열, Set계열 클래스는 Collection을 구현한 클래스
		// => 객체를 추가하고자 할 때, 공통적으로 add 메소드 사용!
		
		// Map 계열은 Collection을 구현한 클래스가 아님
		// => 객체를 추가하고자 할 때 put 메서드 이용(key + value 세트로 담아야)
		
		
		// 1. put(K key, V value) : Map에 키 벨류 세트로 추가시켜주는 메소드
		hm.put("다이제", new Snack("초코맛", 1000));
		hm.put("칸쵸", new Snack("초코맛", 500));
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("먹태깡", new Snack("짠맛", 300));
		System.out.println(hm); // {키=벨류, 키=벨류...}
		// 저장 순서는 유지 안됨. value 값이 중복되어도 키값이 중복되지 않는다면 잘 저장됨
		
		hm.put("새우깡", new Snack("매운맛", 600));
		// 동일한 키값으로 다시 추가하는 경우 value값이 덮어씌워진다 (중복된 키값 공존할 수 없음! 키값이 식별자 역할)
		System.out.println(hm); 
		
		
		// 2. get(Object key) : V => 해당 키값을 가지는 value 값을 반환시켜주는 메소드
		Snack s = (Snack)hm.get("다이제");
		System.out.println("get : " + s);
		
		
		// 3. size() : 담겨있는 객체 갯수 반환
		System.out.println("size : " + hm.size());
		
		
		// 4. replace(k key, v value) => 해당 키값을 찾아서 다시 전달한 value값으로 수정시켜주는 메소드
		hm.replace("먹태깡", new Snack("엄청 짠맛", 600));
		System.out.println("replace : " + hm); // put과 동일하게 사용 가능하나, put은 없으면 새로 생성, replace는 단지 교체만 가능
		
		
		// 5. remove(Object key) => 해당 키 값을 찾아서 그 벨류세트를 삭제시켜주는 메소드
		hm.remove("칸쵸");
		System.out.println("remove : " + hm);
		
		
		// 6. 전체 목록 출력
		// for each => 안됨
//		for (Object obj : hm) {
//			
//		}
		
		// ArrayList로 변경가능? ㄴㄴ
		// ArrayList list = new ArrayList(hm);
		// Collection 에서 만들어진 것이 아니니까
		
		// Iterator 반복자 이용 가능? ㄴㄴ
		// Iterator 호출 불가 : List계열 혹은 Set계열에서만 가능
		
		// 전체 목록 출력하고 싶다?
		// Map -> Set 변경 메소드 제공
		//  방법 1. keySet() 이용
		Set keySet = hm.keySet();
		System.out.println(keySet); // properties 기억나니
	
		Iterator itKey = keySet.iterator();
		while(itKey.hasNext()) {
			String key = (String)itKey.next();
			Snack vlaue = (Snack)hm.get(key);
			System.out.println("전체목록keySet() : " + key + " : " + vlaue);
		}
		
		//=========================================================================
		
		//  방법 2. entrySet() 이용하는 방법
		
		Set entrySet = hm.entrySet(); // key + value 세트의 집합
		
		Iterator itEntry = entrySet.iterator();
		
		while (itEntry.hasNext()) {
			Entry entry = (Entry)itEntry.next(); // Entry객체 안에 key, value값이 다 담겨있음
			
			String key = (String)entry.getKey();
			Snack value = (Snack)entry.getValue();
			
			System.out.println("전체목록entrySet() : " + key + " : " + value);
		}
		
		
		// Properties : Map계열의 컬렉션 => 키 + 벨류 세트로 저장
		
		Properties prop = new Properties();
		
		// Map 계열이기 때문에 put 메소드 이용해 키 + 벨류 세트로 담는다
//		prop.put("다이제", new Snack("초코맛", 1000));
//		prop.put("칸쵸", new Snack("초코맛", 500));
//		prop.put("새우깡", new Snack("짠맛", 500));
		prop.setProperty("list", "ArrayList");
		prop.setProperty("set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println("prop : " + prop); //저장 순서 유지 X, key값 중복 시 덮어씌움
		System.out.println("prop.get : " + prop.get("새우깡"));
		
		// Properties 사용하는 경우는 주로 Properties에 담긴 것을 파일로 출력 또는 입력받을 때 사용
		// 즉, Properties에서 제공하는 store(), load() 등의 메소드 사용하기 위해
		
		Properties prop2 = new Properties();
		try {
			// store : Properties에 담겨있는 key-value값을 파일형태로 저장할 때 사용하는 메소드
			prop.store(new FileOutputStream("test.propeties"), "properiestTest");
			// ClassCastException
			// 내부적으로 store 실행 시 properties에 담겨있는 키 + 벨류 세트를 String으로 형변환해서 출력
			
			// storeToXML : Properties에 담겨있는 key-value 값을 xml 파일형태로 저장할 때 사용하는 메소드
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
			
			// load : 파일로부터 정보를 읽어온다
			prop2.load(new FileInputStream("test.propeties"));
			// loadFromXML : xml파일로부터 정보를 읽어온다
			prop2.loadFromXML(new FileInputStream("test.xml"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * properties 파일 사용 이유
		 * 프로그램상에 필요한 기본 환경설정(서버 ip 주소, dbms 경로...)관련 구문을 기술할 것
		 *  => 모두 문자열이기때문에 개발자가 아닌 일반관리자가 해당 문서를 수정하기 쉽지 않다.
		 *  
		 *  xml -> 프로그래밍 언어간에 호환성 좋음
		 */
				
	}

}
