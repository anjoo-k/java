import java.util.ArrayList;

public class GenericListRun {
	/**
	 *  * 제네릭<> 사용하는 이유
	 *  1. 명시된 타입의 객체만 저장하도록 제한
	 *  2. 컬렉션에 저장된 객체를 사용할 때 매번 형변환하는 절차를 없애기 위해
	 */
	public static void main(String[] args) {
		
		// <Music>으로 제네릭 설정 => E => Music
		ArrayList<Music> list = new ArrayList<>();
		
		list.add(new Music("비의 랩소디", "임재현"));
		list.add(new Music("사건의 지평선", "윤하"));
		// list.add("끝");  빨간줄: 제네릭 설정을 Music으로 했기 때문
		
		System.out.println(list);
		
		for(Music tmp : list) { // 향상된 for문에서 Music으로 받을 수 있게 됨
			System.out.println(tmp);
		}
		
		
	}

}
