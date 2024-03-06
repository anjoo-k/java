package com.kh.Test240207;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class MemberController {

	private HashMap <String, Member> map = new HashMap();

	public boolean joinMembership(String id, Member m) {
		
//		if(map.get(id) == null) { 이걸로 해도 된다
//			
//		}
		
		if(map.containsKey(id)) { //  일치하는 key가 있으면 true를, 없으면 false를 리턴
			return false;
		} else {
			map.put(id, m);
			return true;

		}

	}

	public String login(String id, String password) {
		Member member = map.get(id); //map.get()의 리턴값이 object니까 가능한건가?********************************************
		//		
		//		Set keySet = hm.keySet();
		//		
		//		ArrayList<Member> list = new ArrayList<Member>(map.);

		if(map.containsKey(id)) { // 아이디가 존재하고
			if(member.getPassword().equals(password)) { // 저장 비번과 입력 비번이 같으면
				return member.getName(); // 로긴 성공
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	public boolean changePassword(String id, String oldPw, String newPw) {
		Member member = map.get(id);
		if(map.containsKey(id)) {
			if(member.getPassword().equals(oldPw)) {
				member.setPassword(newPw);
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
	}

	public void ChangeName(String id, String newName) {
		//로긴해서
		//로긴한 id의 값인 이름을 변경하라
		//키 값으로 id가 있는지 찬아서
		//그 값을 변경하라?
		Member member = map.get(id);

		if(map.containsKey(id)) {
			member.setName(newName);	
		}
	}

	//		Member member2 = map.put(id, newName);
	//		
	//		map.put(id, null)
	//		
	//		member.setName(newName);
	//		map.replace(id, member.setName(newName));
	//		for(Member value  : map.values()) {
	//			
	//		}
	//		
	//		for(Map.Entry<String, Member> mem : map.entrySet()) {
	//			mem.setValue(mem.getValue());
	//		}
	public TreeMap sameName(String name){
//		// 전달 받은 name이 저장된 데이터의 이름과 같으면
//		// key로 오름차순 해주는 객체에 해당 id와 이름 저장 후 객체 반환
//		// 단, 엘리먼트 하나씩 뽑아내는 과정에서 keySet()을 쓸 것
//		if(map.containsValue(name)) { //value가 들었으면 true 안들었으면 false
//			 TreeMap<String, Member> treeMap = new TreeMap<>();
//			 List<String> keySet = new ArrayList<>(map.keySet());
//			 Collections.sort(keySet);
//			 return null;
//		}

		TreeMap result = new TreeMap (new Comparator<String>() {
		   // 정렬해서 담기라고 treemap 사용
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
			
			for(Object id : map.keySet()) { //key를 set으로 바꿔줌. 그럼 반복몬 돌릴 수 있다.
				Member member = map.get(id); //멤버객체의 모든 값을 하나씩 꺼내줌
				if(member.getName().equals(name)) { //그 값과 받은 name이 같으면
					result.put((String) id, member); 
				}
			}
			return result;

		}
	}
