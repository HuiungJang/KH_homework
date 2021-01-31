 package com.kh.silsub3.member.view;

import java.util.Scanner;

import com.kh.silsub3.member.controller.MemberManager;
import com.kh.silsub3.member.model.vo.Member;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberManager m = new MemberManager();
	public MemberMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("최대 등록가능한 회원수는 "+MemberManager.SIZE+"명 입니다.");
			
			System.out.println("현재 등록된 회원수는 "+m.memberCount()+"명입니다.");
			// 현재 몇명이 등록되어있는지 넣어야됨.
			
			System.out.println("***** 회원 관리 프로그램 *****");
			System.out.println("1. 새 회원 등록"); 
			System.out.println("2. 회원조회");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 정렬");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 선택 : ");
			
			int cho = sc.nextInt();
			sc.nextLine();
			
			switch(cho) {
				case 1: 
					m.memberInput();
					break;
				case 2: 
					searchMenu();
					break;
				case 3: 
					modifyMenu();
					break;
				case 4:
					sortMenu();
					break;
				case 5: 
					m.deleteMember();
					break;
				case 6: 
					m.printAllMember();
					break;
				
				case 9: 
					System.out.println("정말 끝내시겠습니까? (y/n) : ");
					char cho2 = sc.next().charAt(0);
					
					if(cho2 == 'y' || cho2 =='Y') 
						return;
					
			}
		}
		
	}
	
	public void searchMenu() { // 회원정보 검색.
		System.out.println("**** 회원 정보 검색 메뉴 ****");
		System.out.println("1. 아이디로 검색");
		System.out.println("2. 이름으로 검색");
		System.out.println("3. 이메일로 검색");
		System.out.println("9. 이전 메뉴로 가기");
		System.out.print("메뉴 선택 : ");
		
		int cho = sc.nextInt();
		sc.nextLine();
		
		switch(cho) {
			case 1: // 
				m.searchId();
				break;
				
			case 2: 
				m.searchName();
				break;
				
			case 3: 
				m.searchEmail();
				break;
				
			case 9:
				return;
		}
	}
	
	
	public String searchId() {
		System.out.println("**** 아이디로 회원 검색 ****");
		System.out.print("찾으시는 아이디를 입력해주세요 : ");
		String id = sc.nextLine();
		
		return id;
		
	}
	
	public String searchName() {
		System.out.println("**** 이름으로 회원 검색 ****");
		System.out.print("찾으시는 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		return name;
		
	}
	
	public String searchEmail() {
		System.out.println("**** 이메일로 회원 검색 ****");
		System.out.print("찾으시는 이메일을 입력해주세요 : ");
		String email = sc.nextLine();
		
		return email;
		
	}
	
	public void sortMenu() {
		System.out.println("**** 회원 정보 정렬 출력 메뉴 ****");
		System.out.println("1. 아이디로 오름차순 정렬 출력");
		// Array.sort? 
		// 객체 배열에도 되나? -> 객체는 안됨, 리터럴만 됨
		// 객체배열에 getter을 써서 값가져오고 
		// 첫글자만 cahrAt로 떼와서 정렬?
		// mArr[i].getName().charAt(0); ???
		// i와 j를 비교?
		// compareTo?
		// 배열을 List로 할까?
		// sort?
		// 아...
		// 문제에 compareTo를 쓰라고 나와있구나...
		// 문제를 잘 읽자.... 내 시간...
		
	
		System.out.println("2. 아이디로 내림차순 정렬 출력");
		System.out.println("3. 나이 오름차순 정렬 출력");
		System.out.println("4. 나이 내림차순 정렬 출력");
		System.out.println("5. 성별 내림차순 정렬 출력(남여순)");
		System.out.println("9. 이전 메뉴로 가기");
		System.out.print("메뉴 선택 : ");
		
		int cho = sc.nextInt();
		sc.nextLine();
		
		switch(cho) {
			case 1: 
				m.sortIDAsc();
				m.printAllMember();
				break;
			case 2: 
				m.sortIDDes();
				m.printAllMember();
				break;
			case 3: 
				m.sortAgeAsc();
				m.printAllMember();
				break;
			case 4: 
				m.sortAgeDes();
				m.printAllMember();
				break;
			case 5: 
				m.sortGenderDes();
				m.printAllMember();
				break;
				
			case 9:
				return;
		}
		
	}
	
	public void modifyMenu() {
		System.out.println("**** 회원 정보 수정 메뉴 ****");
		System.out.println("1. 암호 변경");
		System.out.println("2. 이메일 변경");
		System.out.println("3. 나이 변경");
		System.out.println("9. 이전 메뉴로 가기");
		System.out.print("메뉴 선택 : ");
		
		int cho = sc.nextInt();
		sc.nextLine();
		
		switch(cho) {
			case 1: 				
				m.changePassword();
				break;
			
			case 2: 
				m.changeEmail();
				break;
			
			case 3: 
				m.changeAge();
				break;
				
			case 9:
				return;
		}
		
	}
	
	public Member memberInput() {		
		System.out.println("**** 회원 정보 입력 메뉴 ****");
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		System.out.print("아이디를 입력해주세요 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호를 입력해주세요 : ");
		String password = sc.nextLine();
		
		System.out.print("이메일을 입력해주세요 : ");
		String email = sc.nextLine();
		
		System.out.print("성별을 입력해주세요 (남/여) :");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		Member m  = new Member(name, id, password, email, gender, age);
		
		return m;
	}
	
	public String changePassword() {
		System.out.println("**** 암호를 변경할 회원 검색 ****");
		System.out.print("암호를 변경할 아이디를 입력해주세요 : ");
		String password = sc.nextLine();
		
		return password;
		
	}
	
	public String changeEmail() {
		System.out.println("**** 이메일을 변경할 회원 검색 ****");
		System.out.print("이메일을 변경할 아이디를 입력해주세요 : ");
		String email = sc.nextLine();
		
		return email;
		
	}
	
	public String changeAge() {
		System.out.println("**** 나이를 변경할 회원 검색 ****");
		System.out.print("나이를 변경할 아이디를 입력해주세요 : ");
		String age = sc.nextLine();
		
		return age;
		
	}
	
	public String deleteMember() {
		System.out.println("**** 삭제할 회원 검색 ****");
		System.out.print("삭제할 아이디를 입력해주세요 : ");
		String id = sc.nextLine();
		
		return id;
	}
}
