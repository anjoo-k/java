import java.util.ArrayList;

public class ArrayListPrac {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		
//		list.add("고양이");
//		list.add("강아지");
//		list.add("햄스터");
//		System.out.println(list);
//		
//		list.add(2, "고슴도치");
//		System.out.println(list);
//		
//		list.remove(3);
//		System.out.println(list);
//		
//		list.set(1, "토끼");
//		System.out.println(list);
//		
//		System.out.println(list.size());
//		
//		System.out.println(list.get(0));
//		
//		System.out.println(list.subList(1, 3));
//		
//		list.addAll(list);
//		System.out.println(list);
//		
//		System.out.println(list.isEmpty());
//		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		for(Object o : list) {
//			System.out.println(o);
//		}
		
		
		
		ArrayList list2 = new ArrayList();
		
		list2.add(2);
		list2.add(3);
		list2.add(5);
		list2.add("7");
		list2.add("11");
		
		System.out.println(list2);
		list2.remove(4);
		System.out.println(list2);
		list2.remove(2);
		System.out.println(list2);
		
		list2.set(2, 13);
		System.out.println(list2);
		
		System.out.println(list2.subList(0, 2));
		
		
		
		
		
		
		
		
		
	}

}
