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
			System.out.println("�ִ� ��ϰ����� ȸ������ "+MemberManager.SIZE+"�� �Դϴ�.");
			
			System.out.println("���� ��ϵ� ȸ������ "+m.memberCount()+"���Դϴ�.");
			// ���� ����� ��ϵǾ��ִ��� �־�ߵ�.
			
			System.out.println("***** ȸ�� ���� ���α׷� *****");
			System.out.println("1. �� ȸ�� ���"); 
			System.out.println("2. ȸ����ȸ");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ����");
			System.out.println("6. ��� ���");
			System.out.println("9. ������");
			System.out.print("�޴� ���� : ");
			
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
					System.out.println("���� �����ðڽ��ϱ�? (y/n) : ");
					char cho2 = sc.next().charAt(0);
					
					if(cho2 == 'y' || cho2 =='Y') 
						return;
					
			}
		}
		
	}
	
	public void searchMenu() { // ȸ������ �˻�.
		System.out.println("**** ȸ�� ���� �˻� �޴� ****");
		System.out.println("1. ���̵�� �˻�");
		System.out.println("2. �̸����� �˻�");
		System.out.println("3. �̸��Ϸ� �˻�");
		System.out.println("9. ���� �޴��� ����");
		System.out.print("�޴� ���� : ");
		
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
		System.out.println("**** ���̵�� ȸ�� �˻� ****");
		System.out.print("ã���ô� ���̵� �Է����ּ��� : ");
		String id = sc.nextLine();
		
		return id;
		
	}
	
	public String searchName() {
		System.out.println("**** �̸����� ȸ�� �˻� ****");
		System.out.print("ã���ô� �̸��� �Է����ּ��� : ");
		String name = sc.nextLine();
		
		return name;
		
	}
	
	public String searchEmail() {
		System.out.println("**** �̸��Ϸ� ȸ�� �˻� ****");
		System.out.print("ã���ô� �̸����� �Է����ּ��� : ");
		String email = sc.nextLine();
		
		return email;
		
	}
	
	public void sortMenu() {
		System.out.println("**** ȸ�� ���� ���� ��� �޴� ****");
		System.out.println("1. ���̵�� �������� ���� ���");
		// Array.sort? 
		// ��ü �迭���� �ǳ�? -> ��ü�� �ȵ�, ���ͷ��� ��
		// ��ü�迭�� getter�� �Ἥ ���������� 
		// ù���ڸ� cahrAt�� ���ͼ� ����?
		// mArr[i].getName().charAt(0); ???
		// i�� j�� ��?
		// compareTo?
		// �迭�� List�� �ұ�?
		// sort?
		// ��...
		// ������ compareTo�� ����� �����ֱ���...
		// ������ �� ����.... �� �ð�...
		
	
		System.out.println("2. ���̵�� �������� ���� ���");
		System.out.println("3. ���� �������� ���� ���");
		System.out.println("4. ���� �������� ���� ���");
		System.out.println("5. ���� �������� ���� ���(������)");
		System.out.println("9. ���� �޴��� ����");
		System.out.print("�޴� ���� : ");
		
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
		System.out.println("**** ȸ�� ���� ���� �޴� ****");
		System.out.println("1. ��ȣ ����");
		System.out.println("2. �̸��� ����");
		System.out.println("3. ���� ����");
		System.out.println("9. ���� �޴��� ����");
		System.out.print("�޴� ���� : ");
		
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
		System.out.println("**** ȸ�� ���� �Է� �޴� ****");
		
		System.out.print("�̸��� �Է����ּ��� : ");
		String name = sc.nextLine();
		
		System.out.print("���̵� �Է����ּ��� : ");
		String id = sc.nextLine();
		
		System.out.print("��й�ȣ�� �Է����ּ��� : ");
		String password = sc.nextLine();
		
		System.out.print("�̸����� �Է����ּ��� : ");
		String email = sc.nextLine();
		
		System.out.print("������ �Է����ּ��� (��/��) :");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("���̸� �Է����ּ��� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		Member m  = new Member(name, id, password, email, gender, age);
		
		return m;
	}
	
	public String changePassword() {
		System.out.println("**** ��ȣ�� ������ ȸ�� �˻� ****");
		System.out.print("��ȣ�� ������ ���̵� �Է����ּ��� : ");
		String password = sc.nextLine();
		
		return password;
		
	}
	
	public String changeEmail() {
		System.out.println("**** �̸����� ������ ȸ�� �˻� ****");
		System.out.print("�̸����� ������ ���̵� �Է����ּ��� : ");
		String email = sc.nextLine();
		
		return email;
		
	}
	
	public String changeAge() {
		System.out.println("**** ���̸� ������ ȸ�� �˻� ****");
		System.out.print("���̸� ������ ���̵� �Է����ּ��� : ");
		String age = sc.nextLine();
		
		return age;
		
	}
	
	public String deleteMember() {
		System.out.println("**** ������ ȸ�� �˻� ****");
		System.out.print("������ ���̵� �Է����ּ��� : ");
		String id = sc.nextLine();
		
		return id;
	}
}
