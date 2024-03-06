package com.kh.Test240206;

import java.util.Comparator;

public class SortedLottery implements Comparator<Lottery> {
	
	/*
	 * 0보다 작은 값(음수): o1이 o2보다 작을 때
	 * 0: 같을 때
	 * 0보다 큰 값(양수): o1이 o2 보다 크다.
	 * 
	 * 오름차순
	 */
	@Override
	public int compare(Lottery o1, Lottery o2) {
		int num = o1.getName().compareTo(o2.getName());
		if(num == 0) {
			return o1.getPhone().compareTo(o2.getPhone()); // 이름이 같으면 폰으로 구별해야하니까
		}
		return num;
	}

}
