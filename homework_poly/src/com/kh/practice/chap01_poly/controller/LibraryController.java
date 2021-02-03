package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	
	Member mem = new Member();
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false); 
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	
	public void insertMember(Member mem) {
		// 전달받은 mem 값을 통해
		// LibraryController의 mem에 대입.
		this.mem.setName(mem.getName());
		this.mem.setAge(mem.getAge());
		this.mem.setGender(mem.getGender());
		
	}
	
	public Member myinfo() {
		// 회원레퍼런스(mem) 주소값 리턴.
		
		
		return mem;
	}
	
	public Book[] selectAll() {
		// 도서 전체목록(bList) 주소값 리턴
		
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		/*
		 * 전달받은 키워드가 포함된 도서가 여 러 개가 존재할 수 있으니 
		 * 검색된 도 서를 담아줄 Book 객체 배열을 새로 이 생성하고
		 * for문을 통해 bList 안의 도서들과 전 달받은 키워드를 비교하여 
		 * 포함하고 있는 경우 새로운 배열에 차곡차곡 담기
		 * 여기서 생성된 배열주소값 리턴.
		 */
		Book[] newBook = new Book[5];
		
		for(int i = 0; i<bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				newBook[i] = bList[i]; 
			}
			
			if(newBook[i] != null) { // 빈공간이 아니면 출력해라.
				System.out.println(newBook[i]);
			}
		}
		
		return newBook;
	}
	////////// 우선 넘어감 다시 풀기.
	
	
	
	
	
	public int rentBook(int index) {
		/*
		 * result를 0으로 초기화 한 후 
		 * 전달받 은 인덱스의 
		 * 1. 도서가 만화책인 경우
		 * ->회원의 나이와 해당 만화책의 제한 나이를 비교하여 
		 * 회원 나이가 더 적 은 경우 result를 1로 초기화
		 * 
		 * 2.도서가 요 리책인 경우 
		 * 해당 요리책의 쿠폰 유 무가 
		 * 유일 경우 회원의 couponCount 를 1증가 시키
		 * result 2로 초기화
		 */
		int count = 0;
		
		int result = 0;
		
		if(index == 1 ) {
			
			if ( ((AniBook)bList[1]).getAccessAge() > mem.getAge()) {
				result = 1;
			}// index 입력받은게 만화책일 경우
			
		}else if(index == 2 ) {
			if( ((AniBook)bList[2]).getAccessAge() > mem.getAge() ) {
				result = 1;
			}// index 입력받은게 만화책일 경우
			
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
