package com.kh.silsub1.book.model.vo;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return title+author+price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book s = (Book)obj;
			if(title.equals(s.getTitle())&&
				author.equals(s.getAuthor())&&
				price == s.getPrice()) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash( title,author,price );
		// Objects는 util에 있는 클래스이기 때문에 import해줘야함.
		// return (title+author+price).hashCode();
	} 
	
}
