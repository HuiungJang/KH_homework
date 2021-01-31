package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.inform();
		
		Book book1 = new Book("제목1","출판사1","작가1");
		book1.inform();
		
		Book book2 = new Book("제목2","출판사2","작가2", 8000, 15.0);
		book2.inform();
	}

}
