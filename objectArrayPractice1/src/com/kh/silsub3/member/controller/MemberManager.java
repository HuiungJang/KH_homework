package com.kh.silsub3.member.controller;
import java.util.Scanner;

import com.kh.silsub3.member.model.vo.Member;
import com.kh.silsub3.member.view.MemberMenu;


public class MemberManager {
	
	public static final int SIZE = 10;
	Member[] mArr = new Member[SIZE];
	private Member m = new Member();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		new MemberMenu().mainMenu();
	}
	
	public void memberInput() {
		m = new MemberMenu().memberInput();
		// MemberMenu의 memberInput을 실행하고.
		// Member m에 저장해라.
			
		for(int i =0; i<mArr.length; i++) {
			if(mArr[i] == null) { 
				mArr[i] = new Member( m.getId(), m.getName(), m.getPassword()
						,m.getEmail(),m.getGender(),m.getAge());
				break; 
			}
		}
		// mArr[i]에 값이 비어있다면 m에서 값을 가져오고 
		// mArr[i]에 하나씩 저장하고 break;
		// memberInput이 한번 실행되면 
		// mArr[i]에 한번 저장됨.
	
	}
	
	public int memberCount() {
		int count = 0;
		
		for(int i = 0 ; i<mArr.length; i++) {
			if(mArr[i] != null) { 
				count++;
			}
		}
		
		return count; 
		
		// mArr[i]에 값이 채워져있으면
		// count에 1증가함.
	}
	
	public void searchId() {

		
		String id = new MemberMenu().searchId();
//		System.out.println(id); // id값이 잘넘어왔는지 확인 
		
		// 입력한 Id 값을 String에 저장.
		for(int i =0; i<mArr.length; i++) {
			// 10번 반복해라.
			if(mArr[i] != null) { 
				// 객체배열이 비어있지 않으면 = 채워져있으면
				if(  mArr[i].getId().equals(id) )  {	 
					// id 값과 객체배열에서 가져온 id값과 비교해라.
					System.out.println("입력한 아이디는 " +i+" 번째 인덱스에 있습니다.");
					System.out.println("==================================");
					System.out.println();	
				}else 
					System.out.println(-1);
	
			}
		}
		
	}
	
	
	public void searchName() {

		
		String name = new MemberMenu().searchName();
	//		System.out.println(id);
		for(int i =0; i<mArr.length; i++) {
			// 10번 반복해라.
			if(mArr[i] != null) { 
				if(  mArr[i].getName().equals(name) )  {	 
					System.out.println("입력한 이름은 " +i+" 번째 인덱스에 있습니다.");
					System.out.println("==================================");
					System.out.println();	
				}else 
					System.out.println(-1);
	
			}
		}
		
	}
	
	public void searchEmail() {	

		
		String email = new MemberMenu().searchEmail();
	//		System.out.println(id);
		for(int i =0; i<mArr.length; i++) {
			// 10번 반복해라.
			if(mArr[i] != null) { 
				if(  mArr[i].getEmail().equals(email) )  {	 
					System.out.println("입력한 이메일은 " +i+" 번째 인덱스에 있습니다.");
					System.out.println("==================================");
					System.out.println();	
				}else 
					System.out.println(-1);
	
			}
		}
		
	}
	
	public void sortIDAsc() {
		
		System.out.println("아이디를 오름차순으로 정렬합니다.");
		for (int i=0 ; i<memberCount() ; i++) {
			// 현재 회원수만큼 반복.
			for (int j=0 ; j<i ; j++) {
				if(mArr[i].getId().compareTo(mArr[j].getId())<0) {
					// mArr[i].getId()와 mArr[j].getId()를 비교
					// 서로 같으면 0
					// i가 j보다 크면 양수.
					// i가 j보다 작으면 음수 반환.
					// 문자열이지만.
					// 유니코드식으로 저장되기때문에 비교가능.
					Member[] tmp = new Member[1];
					tmp[0] = mArr[i];
					mArr[i] = mArr[j];
					mArr[j] = tmp[0];
				}
			}
		}
		
	}

	
	public void sortIDDes() {
		
		System.out.println("회원 아이디를 내림차순으로 정렬합니다.");
		for (int i=0 ; i<memberCount() ; i++) {
			for (int j=0 ; j<i ; j++) {
				if(mArr[i].getId().compareTo(mArr[j].getId())>0) {
					Member[] tmp = new Member[1];
					tmp[0] = mArr[i];
					mArr[i] = mArr[j];
					mArr[j] = tmp[0];
				}
			}
		}
	
	}
	
	
	public void sortAgeAsc() {
		System.out.println("회원 나이를 오름차순으로 정렬합니다.");
		for (int i=0 ; i<memberCount() ; i++) {
			for (int j=0 ; j<i ; j++) {
				if(mArr[i].getAge() <mArr[j].getAge() ) {
					Member[] tmp = new Member[1];
					tmp[0] = mArr[i];
					mArr[i] = mArr[j];
					mArr[j] = tmp[0];
				}
			}
		}
	}
	
	public void sortAgeDes() {
		System.out.println("회원 나이를 내림차순으로 정렬합니다.");
		for (int i=0 ; i<memberCount() ; i++) {
			for (int j=0 ; j<i ; j++) {
				if(mArr[i].getAge() >mArr[j].getAge() ) {
					Member[] tmp = new Member[1];
					tmp[0] = mArr[i];
					mArr[i] = mArr[j];
					mArr[j] = tmp[0];
				}
			}
		}
	}

	
	public void sortGenderDes() {
		System.out.println("회원 성별을 내림차순으로 정렬합니다.");
		
		for (int i=0 ; i<memberCount() ; i++) {
			for (int j=0 ; j<i ; j++) {
				if(mArr[i].getGender() > mArr[j].getGender() ) {
					Member[] tmp = new Member[1];
					tmp[0] = mArr[i];
					mArr[i] = mArr[j];
					mArr[j] = tmp[0];
				}
			}
		}
	}
	
	public void changePassword() {
		String password = new MemberMenu().changePassword();
		
		for(int i =0; i<mArr.length; i++) {
			if(mArr[i] != null) { 
				if(  mArr[i].getId().equals(password) )  {
					System.out.print("변경할 암호를 입력하세요 : ");
					mArr[i].setPassword( sc.nextLine() );
				}
			}
		}
	}
	
	public void changeEmail() {
		String email = new MemberMenu().changeEmail();
		
		for(int i =0; i<mArr.length; i++) {
			if(mArr[i] != null) { 
				if(  mArr[i].getId().equals(email) )  {
					System.out.print("변경할 이메일을 입력하세요 : ");
					mArr[i].setEmail( sc.nextLine() );
				}
			}
		}
	}
	
	public void changeAge() {
		String age = new MemberMenu().changeAge();
		
		for(int i =0; i<mArr.length; i++) {
			if(mArr[i] != null) { 
				if(  mArr[i].getId().equals(age) )  {
					System.out.print("변경할 나이를 입력하세요 : ");
					mArr[i].setAge( sc.nextInt() );
				}
			}
		}
	}
	
	public void deleteMember() {
		String id = new MemberMenu().deleteMember();
		
		for(int i =0; i<mArr.length; i++) {
			if( mArr[i].getId().equals(id) )  {
				mArr[i] = null; 
				break;
			}
		}
		
		System.out.println("삭제되었습니다.");

	}	
	
	public void printAllMember() {
		for(int i=0 ; i<memberCount() ; i++) {
			System.out.println("이름 : " + mArr[i].getName()+" 아이디 : "+mArr[i].getId()
					+" 비밀번호 :  "+mArr[i].getPassword()+" 이메일 : "+mArr[i].getEmail()+" 성별 : "+mArr[i].getGender()
					+" 나이 :  "+mArr[i].getAge());
		}
	}

	
}
