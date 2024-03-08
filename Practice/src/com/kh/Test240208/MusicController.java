package com.kh.Test240208;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MusicController {
	
	private List list = new ArrayList();
	
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}
	
	public List printAll() {
			return list;
		
	}
	
	
	
	public Music searchMusic(String title) {
//		// list에 넣은 music 타이틀 목록 중에 있는지 검색
//		
//		for(Music m : ()list) {
//			
//		}
//		
//		
//		List searchList = new ArrayList();
//		for(Object obj : list) {
//			if(obj instanceof Music) {
//				Music music = (Music) obj;
//				if(music.getTitle().equals(title)) {
//					searchList.add(music);
//					return searchList;
//				}
//			}
//		}
		return null;
		
		
//		ArrayList searchList = new ArrayList();
//
//		for(Object obj : bookList) {
//			if (obj instanceof Book) {
//				Book book = (Book)obj;
//				if(book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
//					searchList.add(book);
//				}
//			}
		
		
	}
	
	public Music removeMusic(String title, Music music) {
		return null;
	}
	
	public int ascTitle() {
		return 0;
	}
	
	public int descSinger() {
		return 0;
	}
	
	
	
	

}
