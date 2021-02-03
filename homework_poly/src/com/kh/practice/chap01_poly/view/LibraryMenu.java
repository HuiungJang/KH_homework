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
		// 메인메뉴 출력.
		
		System.out.println("이름 : ");
		mem.setName(sc.nextLine());
		
		System.out.println("나이 : ");
		mem.setAge(sc.nextInt());
		sc.nextLine();
		
		System.out.println("성별 : (M / F)");
		mem.setGender(sc.next().charAt(0)); 
		sc.nextLine();
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int cho = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기
			
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
				return; // 프로그램 종료.
			}
		}
	}
	
	public void selectAll() {
		// 전체 목록 출력
		 
		Book[] bList = lc.selectAll();
		// for이용 모든 도서 목록 출력.
		// 인덱스도 같이 출력.
		for(int i = 0; i<bList.length; i++) {
			System.out.println(i+"번도서 : "+bList[i]);
		}
		// 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
	}
	
	public void searchBook() {
		// 검색 제목 키워드 입력받아 검색결과 출력
		System.out.println(" 검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		lc.searchBook(keyword);
	}
	
	public void rentBook() {
		// 대여할 도서 인덱스 입력받고
		// LibraryController의 rentBook메소드로 전달.
		// 결과값을 result로 받고 
		// 0, 1, 2일 경우 각각해당하는 출력문 출력
		
		selectAll();
		
		System.out.println("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		int result = lc.rentBook(index);
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}else if (result == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이"
					+ " 발급되었으니 마이페이지에서 확인하세요.");
			mem.setCouponCount(mem.getCouponCount()+1);
		}
		
	}
	
	
}
