package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book{ // Book »ó¼Ó
	private int accessAge;
	
	public AniBook() {
		// TODO Auto-generated constructor stub
	}

	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}

	
	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return "AniBook [accessAge=" + accessAge + ", getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor()
				+ ", getPublisher()=" + getPublisher() + "]";
	}

	
	
	
}
