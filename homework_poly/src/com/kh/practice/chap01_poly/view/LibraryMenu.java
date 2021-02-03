package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController  lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	Member mem = new Member();

	
	public void mainMenu() {
		// ���θ޴� ���.
		
		System.out.println("�̸� : ");
		mem.setName(sc.nextLine());
		
		System.out.println("���� : ");
		mem.setAge(sc.nextInt());
		sc.nextLine();
		
		System.out.println("���� : (M / F)");
		mem.setGender(sc.next().charAt(0)); 
		sc.nextLine();
		
		while(true) {
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			int cho = sc.nextInt();
			sc.nextLine(); // ���� ����
			
			System.out.println(mem);
			
			switch(cho) {
			case 1:
				lc.myinfo();
				break;
			case 2: 
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				return; // ���α׷� ����.
			}
		}
	}
	
	public void selectAll() {
		// ��ü ��� ���
		 
		Book[] bList = lc.selectAll();
		// for�̿� ��� ���� ��� ���.
		// �ε����� ���� ���.
		for(int i = 0; i<bList.length; i++) {
			System.out.println(i+"������ : "+bList[i]);
		}
		// 0������ : �������� ���� / ������ / tvN / true
	}
	
	public void searchBook() {
		// �˻� ���� Ű���� �Է¹޾� �˻���� ���
		System.out.println(" �˻��� ���� Ű���� : ");
		String keyword = sc.nextLine();
		lc.searchBook(keyword);
	}
	
	public void rentBook() {
		// �뿩�� ���� �ε��� �Է¹ް�
		// LibraryController�� rentBook�޼ҵ�� ����.
		// ������� result�� �ް� 
		// 0, 1, 2�� ��� �����ش��ϴ� ��¹� ���
		
		selectAll();
		
		System.out.println("�뿩�� ���� ��ȣ ���� : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		int result = lc.rentBook(index);
		if(result == 0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		}else if(result == 1) {
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
		}else if (result == 2) {
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������"
					+ " �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
			mem.setCouponCount(mem.getCouponCount()+1);
		}
		
	}
	
	
}
