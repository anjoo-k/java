package com.kh.Test2402052;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookController  {
	
	private List bookList = new ArrayList();
	
	
	
	public BookController() {
		super();
	}

	{
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	
	public void insertBook(Book bk) {
		this.bookList.add(bk);
		
	}
	
	public ArrayList<Book> selectList() {
		return (ArrayList) this.bookList;
				
	}
	
	public ArrayList searchBook(String keyword) {
		ArrayList searchList = new ArrayList();

		for(Object obj : bookList) {
			if (obj instanceof Book) {
				Book book = (Book)obj;
				if(book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
					searchList.add(book);
				}
			}

			//		for(int i = 0; i < bookList.size(); i++) {
			//			if(bookList.contains(keyword)) {
			//				searchList.add(bookList.get(i));
			//			}
			//		}
			
		}
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		// index로 제거, obj로 제거
		Book removeBook = null;
			
		for(Object obj : this.bookList) {
			if(obj instanceof Book) {
				Book book = (Book)obj;
				if(book.getTitle().equals(title) && book.getAuthor().equals(author)) {
					bookList.remove(book);
					return removeBook = book;
				}
			}
			
		}
		
		return removeBook; // 못찾은거니까
	}
	
	/*
	 * 문자열.compareTo => 두 문자열이 동일한 경우 : 0
	 * 				     사전적으로 먼저 위치한 문자열이 앞에 나온 경우 : 음수
	 * 				     사전적으로 먼저 위치한 문자열이 뒤에 나온 경우 : 양수
	 */		
	
	public int ascBook() { // 람다
		try {
			this.bookList.sort((obj1, obj2) -> ((Book)obj1).getTitle().compareTo(((Book)obj2).getTitle()));
			return 1;
		} catch(Exception e) {
			return 0;
		}
		
		
//		this.bookList.sort(new Comparator<Book>() {
//			@Override
//			public int compare (Book obj1, Book obj2) {
//				return obj1.getTitle().compareTo(obj2.getTitle());
//			}
//		});
		
	}
	
}
