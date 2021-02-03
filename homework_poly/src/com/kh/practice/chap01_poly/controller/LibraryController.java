package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	
	Member mem = new Member();
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false); 
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}
	
	
	public void insertMember(Member mem) {
		// ���޹��� mem ���� ����
		// LibraryController�� mem�� ����.
		this.mem.setName(mem.getName());
		this.mem.setAge(mem.getAge());
		this.mem.setGender(mem.getGender());
		
	}
	
	public Member myinfo() {
		// ȸ�����۷���(mem) �ּҰ� ����.
		
		
		return mem;
	}
	
	public Book[] selectAll() {
		// ���� ��ü���(bList) �ּҰ� ����
		
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		/*
		 * ���޹��� Ű���尡 ���Ե� ������ �� �� ���� ������ �� ������ 
		 * �˻��� �� ���� ����� Book ��ü �迭�� ���� �� �����ϰ�
		 * for���� ���� bList ���� ������� �� �޹��� Ű���带 ���Ͽ� 
		 * �����ϰ� �ִ� ��� ���ο� �迭�� �������� ���
		 * ���⼭ ������ �迭�ּҰ� ����.
		 */
		Book[] newBook = new Book[5];
		
		for(int i = 0; i<bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				newBook[i] = bList[i]; 
			}
			
			if(newBook[i] != null) { // ������� �ƴϸ� ����ض�.
				System.out.println(newBook[i]);
			}
		}
		
		return newBook;
	}
	////////// �켱 �Ѿ �ٽ� Ǯ��.
	
	
	
	
	
	public int rentBook(int index) {
		/*
		 * result�� 0���� �ʱ�ȭ �� �� 
		 * ���޹� �� �ε����� 
		 * 1. ������ ��ȭå�� ���
		 * ->ȸ���� ���̿� �ش� ��ȭå�� ���� ���̸� ���Ͽ� 
		 * ȸ�� ���̰� �� �� �� ��� result�� 1�� �ʱ�ȭ
		 * 
		 * 2.������ �� ��å�� ��� 
		 * �ش� �丮å�� ���� �� ���� 
		 * ���� ��� ȸ���� couponCount �� 1���� ��Ű
		 * result 2�� �ʱ�ȭ
		 */
		int count = 0;
		
		int result = 0;
		
		if(index == 1 ) {
			
			if ( ((AniBook)bList[1]).getAccessAge() > mem.getAge()) {
				result = 1;
			}// index �Է¹����� ��ȭå�� ���
			
		}else if(index == 2 ) {
			if( ((AniBook)bList[2]).getAccessAge() > mem.getAge() ) {
				result = 1;
			}// index �Է¹����� ��ȭå�� ���
			
		}else if(index == 0 && ((CookBook)bList[0]).getCoupon() == true) {
			
			result = 2;
			
			
		}else if(index == 3 && ((CookBook)bList[0]).getCoupon() == true) {

			result = 2;
			
		}else if(index == 4 &&((CookBook)bList[0]).getCoupon() == true ) {
	
			result = 2;
		
		}
		
		return result;
	}
	
	
}
