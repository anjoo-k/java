package com.ph.test240125;

public class LibraryController {
	
	private Member mem = null;
	private Book[] bList;
	
	
	public LibraryController() {
		bList = new Book[5];
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;	
	}
	
	public Member myInfo() {
		return this.mem;    
	}
	
	
	public Book[] selectAll() {
		return this.bList;
	}
	
	public Book[] searchBook(String keyword) { //ㅜㅜ ㅜㅜ
		Book[] newbList = new Book[5];
		
		int count = 0;
		for (int i = 0; i < bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				newbList[count++] = bList[i];
			}
		}
		
		return newbList;
	}
	
	public int rentBook(int index) { //ㅜ ***************************************포인트
		int result = 0;
		
		// Book으로 참조변수 생성 -> 상속관계중에 AniBook이 존재하니?
		// Book, AniBook, CookBook
		if(bList[index] instanceof AniBook) {
			AniBook aniBook = (AniBook)bList[index]; // AniBook으로 형변환! 일반 자료형 형변환이랑 똑같네
			
			if(mem.getAge() < aniBook.getAccessAge()) { // 가독성을 위해
				result = 1;
			}
		} else if(bList[index] instanceof CookBook) {
			if(((CookBook)bList[index]).isCoupon()) { // CookBook으로 다운캐스팅 하고 isCoupon 출력
				mem.setCouponCount(mem.getCouponCount() + 1);
				// Member 클래스의 setCouponCount의 멤버변수 int couponCount에
				// getCouponCount 가져와서 + 1 해서 setCoupon에 넣어주는 것
				result = 2;	
			}
		}

		return result;		
	}

	public Member getMem() {
		return mem;
	}

	public void setMem(Member mem) {
		this.mem = mem;
	}

	public Book[] getbList() {
		return bList;
	}

	public void setbList(Book[] bList) {
		this.bList = bList;
	}
	
	
	

}
