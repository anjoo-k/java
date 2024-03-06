package controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import model.vo.PigMember;
import service.PigService;
import view.PigMenu;

public class PigController {

	public void inputPiginfo(String uniNum, String birth, String gender, String breed, double birthWeight,
			String finalDate, double finalWeight, String selection) {
		
		PigMember pm = new PigMember(uniNum, birth, gender, breed, birthWeight, finalDate, finalWeight, selection);
		
		int result = new PigService().insertPigMember(pm);
		
	}
	
	public void selectList() {
		
		ArrayList<PigMember> list = new PigService().selectList();
		
		if(list.isEmpty()) {
			new PigMenu().displayNoData("조회 결과 없음");
		} else {
			new PigMenu().displayPigList(list);
		}
		
	}
	
	public void modifyPiginfo(String uniNum, String birth, String gender, String breed, double birthWeight,
			String finalDate, double finalWeight, String selection) {
		
		PigMember pm = new PigMember();
		
		pm.setUniNum(uniNum);
		pm.setBirth(birth);
		pm.setGender(gender);
		pm.setBreed(breed);
		pm.setBirthWeight(birthWeight);
		pm.setFinalDate(finalDate);
		pm.setFinalWeight(finalWeight);
		pm.setSelection(selection);
		
		int result = new PigService().modifyPigMember(pm);
		if (result > 0) {
			new PigMenu().displaySuccess("돼지 정보 변경 성공");
		} else {
			new PigMenu().displayFail("돼지 정보 변경 실패");
		}
		
	}

	public void deletePiginfo(String uniNum) {
		int result = new PigService().deletePigMember(uniNum);
		if (result > 0) {
			new PigMenu().displaySuccess("돼지 정보 삭제 성공");
		} else {
			new PigMenu().displayFail("돼지 정보 삭제 실패");
		}
		
	}

	public void searchByUninum(String PigMem) {
		PigMember pm = new PigService().searchByPigMem(PigMem);
		
		if (pm == null) {
			new PigMenu().displayNoData("돼지 정보 없음");
		} else {
			new PigMenu().displayPigmem(pm);
		}
		
	}

	public void breedListD() {
		ArrayList<PigMember> list = new PigService().selectList();
		
		if(list.isEmpty()) {
			new PigMenu().displayNoData("조회 결과 없음");
		} else {
			new PigMenu().HashSetInD(list);
		}
	}
	

	public void breedListB() {
		ArrayList<PigMember> list = new PigService().selectList();
		
		if(list.isEmpty()) {
			new PigMenu().displayNoData("조회 결과 없음");
		} else {
			new PigMenu().HashSetInB(list);
		}
		
	}
	
	
	public static void PigCount() {
		
		ArrayList<PigMember> list = new PigService().selectList();
		
		int countD = PigMember.totalNumD;
		int countB = PigMember.totalNumB;
		
		for(PigMember pm : list) {
			if(pm.getUniNum().charAt(0) == 'D') {
				++countD;
			} else {
				++countB;
			}

	}
		System.out.println("\n듀록품종두수 : " + countD);
		System.out.println("버크셔품종두수 : " + countB);	
		
	}

	
//	public void HashSetIn() {
//
//		ArrayList<PigMember> list = new PigService().selectList();		
//		HashSet<PigMember> hashSet = new HashSet<>();
//
//		hashSet.addAll(list);
//		
//		for(PigMember pm : hashSet) {
//			if(pm.getUniNum().charAt(0) == 'D') {
//				System.out.println(pm);
//			}
//			
//		}
//
////		Iterator<PigMember> iterator = hashSet.iterator();
////		while (iterator.hasNext()) {
////			System.out.println(iterator.next());
////		}
//		
//		
//	}


}

