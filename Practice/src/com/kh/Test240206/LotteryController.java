package com.kh.Test240206;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class LotteryController {
	
	private HashSet<Lottery> lottery = new HashSet();
	private HashSet<Lottery> win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l); // boolean으로 나올 때랑 값이 나올 때랑 뭐가 다른가?
	}
	
	public boolean deleteObject(Lottery l) {
		boolean isRemove = lottery.remove(l);
		
		lottery.remove(l);
		
		if(isRemove && win != null){
			win.remove(l);	
		}

		return isRemove;
	}
	
	public HashSet<Lottery> winObject() {
		ArrayList<Lottery> list = new ArrayList<Lottery>(lottery);
		
		if(lottery.size() < 4) {
			return null;
		}
		
		while(win.size() < 4) {
			int rand = (int)Math.random() * list.size();
			win.add(list.get(rand));
//			
//			ArrayList list2 = new ArrayList();
//			list2.addAll(win);
//			if(list.equals(list2)) {
//				win.remove(list.get(i));
//				
			}
			return win;
		}
	
	
	public TreeSet<Lottery> sortedWinObject() { // 람다 외워서 sort할 때 써먹기
		TreeSet<Lottery> sortedWinSet = new TreeSet<Lottery>(new SortedLottery());
		//TreeSet 은 정렬 기준이 좀 다름
		sortedWinSet.addAll(win);
		return sortedWinSet;
		
		
//TreeSet set = new TreeSet();
//		
//		
//		TreeSet에 값을 추가하려면 add(value) 메소드를 사용하면 됩니다.
//입력되는 값이 TreeSet 내부에 존재하지 않는다면 그 값을 추가한 뒤 true를 반환하고 내부에 값이 존재한다면 false를 반환합니다.
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}

}
