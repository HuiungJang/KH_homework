package com.kh.silsub1.book.main;

import com.kh.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book a = new Book("å�̸�2 ","�۰�2 ",8000);
		Book b = new Book("å�̸�2 ","�۰�2 ",8000);
		// ���� ����
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		Book a2 = b; // ��������
		
		System.out.println(a2);
		System.out.println(b);
		System.out.println(a2.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a2.equals(b));
		
		
	}

}
