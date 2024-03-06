package com.kh.Test240208;

public class Music {
	
	private String title;
	private String singer;
	
	
	public Music() {
		super();
	}


	public Music(String singer, String title) {
		super();
		this.title = title;
		this.singer = singer;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getSinger() {
		return singer;
	}


	public void setSinger(String singer) {
		this.singer = singer;
	}


	@Override
	public String toString() {
		return "[" + singer  + " - " + title + "]";
	}


	@Override
	public int hashCode() {
		String str = singer + title;
		return str.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Music) {
			Music music = (Music) obj;
			if(this.getSinger().equals(music.getSinger()) && this.getTitle().equals(music.getTitle())) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	
	
//	@Override
//	public int hashCode() { // 모든 필드에 담긴 값이 일치하면 동일한 hashCode 반환
//		String str = name + age + score;
//		return str.hashCode();
//	}
//
//
//	// Sudent.equals(Student 객체) 와 같은 방식으로 호출될 것
//	@Override
//	public boolean equals(Object obj) { // 현재객체와 전달받은 객체의 각 필드값이 모두 일치하면 true/하나라도 일치하지 않으면 false
//		// this(현재객체)      ←→      obj(전달받은 객체)
//		//   Student					Object 타입
//		
//		if(obj instanceof Student) {
//			Student other = (Student) obj;
//			if(this.getName().equals(other.getName()) &&
//					this.getAge() == other.getAge() &&
//					this.getScore() == other.getScore()) {
//				return true;
//			} else {
//				return false;
//			}
//		} else {
//			return false;
//		}
//	
//	}
//	
	

	}
}
