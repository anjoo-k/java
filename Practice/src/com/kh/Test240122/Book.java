package com.kh.Test240122;

public class Book {
	
	private String title;
	private String genre;
	private String writer;
	private int number;
	
	public Book(String title, String genre , String writer, int number) {
		this.title = title;
		this.genre = genre;
		this.writer = writer;
		this.number = number;
	}
	
	

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public String getWriter() {
		return writer;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	@Override
	public String toString() {
		return "Book [title=" + title + ", genre=" + genre + ", writer=" + writer + ", number=" + number + "]";
	}

}
