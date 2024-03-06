package com.kh.Test2402072;

import java.util.ArrayList;
import java.util.HashMap;
// Controller : 말 그대로 컨트롤러
public class FarmController {
	
	private HashMap<Farm, Integer> hMap;
	private ArrayList<Farm> list;
	
	
	public FarmController(HashMap<Farm, Integer> hMap, ArrayList<Farm> list) {
		super();
		this.hMap = new HashMap<>();
		this.list = new ArrayList<>();
	}

	public boolean addNewKind(Farm f, int amount) {
		
		if(!hMap.containsKey(f)) {
			return false;
		}else {
			hMap.put(f, amount);
			return true;
		}
		
		
//		if(f instanceof Vegetable) {
//			if(hMap.containsKey((Vegetable)f)) {
//				hMap.put((Fruit)f, amount);
//			}
//			return true;
//			} else if (f instanceof Fruit) {
//			if(hMap.containsKey((Fruit)f)) {
//				return false;
//			} else {
//				hMap.put((Fruit)f, amount);
//				return true;
//			}
//		} else if (f instanceof Nut) {
//			if(hMap.containsKey((Fruit)f)) {
//				return false;
//			} else {
//				hMap.put((Fruit)f, amount);
//				return true;
//			}
//		} 

	}

	public boolean removeKind(Farm f) {
		
		if(hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		} else {
			return false;
		}

//		if(f instanceof Vegetable) {
//			hMap.containsKey((Vegetable)f);
//			hMap.remove((Vegetable)f);
//			return true;
//		} else if (f instanceof Fruit) {
//			hMap.containsKey((Fruit)f);
//			hMap.remove((Fruit)f);
//			return true;
//		} else if (f instanceof Nut) {
//			hMap.containsKey((Nut)f);
//			hMap.remove((Nut)f);
//			return true;
//		} else {
//			return false;
//		}

	}

	public boolean changeAmount(Farm f, int amount) {
		if(hMap.containsKey(f)) {
			hMap.replace(f, amount);
			return true;
		} else {
			return false;
		}
	}

	public HashMap<Farm, Integer> printFarm() {
		return hMap;
	}

	public boolean buyFarm(Farm f) {
		Integer amount = hMap.get(f); //equals 랑 hashcode 오바리이딩 해놔서 잘 나오는 것
		if(amount != null && amount > 0) {
			list.add(f);
			hMap.replace(f, amount-1);
			return true;
		} else {
			return false;
		}
	}

	public boolean removeFarm(Farm f) {

		return false;
	}

	public ArrayList<Farm> printBuyFarm() {

		return printBuyFarm();
	}



}
