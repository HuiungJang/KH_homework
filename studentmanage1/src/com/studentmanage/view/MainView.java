package com.studentmanage.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.studentmanage.controller.StudentController;
import com.studentmanage.model.vo.Student;

//Ŭ���̾�Ʈ���� ���̴� ȭ���� ����ϴ� ����� �����ϴ� Ŭ����
//���θ޴�, ���ȭ��, ��ȸȭ�� -> �޼ҵ�(���)
public class MainView {
	Scanner sc=new Scanner(System.in);
	Student s = new Student();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	public void mainMenu(StudentController stc) throws IOException{
		
		while(true) {
			System.out.println("===== �л����� ���α׷� =====");
			System.out.println("1. ��ü�л���ȸ");
			System.out.println("2. �л����");
			System.out.println("3. �л�����");
			System.out.println("4. �л��������");
			System.out.println("5. �̸����� �л���ȸ");
			System.out.println("6. ���̷� �л���ȸ");
			System.out.println("7. �л� ����/��ձ��ϱ�");
			//������ ����� �л�����, �л����� �� �����Է¹ް�
			//������ �л��� ���� ����!
			System.out.println("0. ����");
			System.out.print("�Է� : ");
			int cho=sc.nextInt();
			switch(cho) {
				case 1 : stc.searchAllStudent();break;
				case 2 : //new StudentController()
						stc.insertStudent();break;
				case 3 : stc.updateStudent();break;
				case 4 : stc.insertScore();break;
				case 5 : stc.nameCheck(); break;
				case 6 : stc.ageCheck();break;
				case 7 : stc.sumAg();break;
				case 0 : System.out.println("�л����� ���α׷��� �����մϴ�.");
						return;
			}
		}
	}
	
	
	public Student insertStudent() throws IOException{
		System.out.println("==== �л���� =====");
		System.out.print("�̸� : ");
		String name=br.readLine();
		
		System.out.print("���� : ");
		int age=sc.nextInt();
		
		System.out.print("�б� : ");
		sc.nextLine();
		String school=br.readLine();
		
		System.out.print("�ּ� : ");
		String address=br.readLine();
		
		s =new Student(name, age, school,address);
		return s;
	}
	
	public Student insertScore() throws IOException{
		System.out.println("==== �л� ���� ��� =====");
		System.out.print("���� ����� �л��� : ");
		s.setName( br.readLine() );
		
		System.out.print("���� : ");
		s.setKor(sc.nextInt());
		sc.nextLine();
		
		System.out.print("���� : ");
		s.setEng(sc.nextInt());
		sc.nextLine();
		
		System.out.print("���� : ");
		s.setMath(sc.nextInt());
		sc.nextLine();
		
		System.out.print("�ڵ� : ");
		s.setCoding(sc.nextInt());
		sc.nextLine();
		

		return s;
	}
	
	public void printMsg(String msg) {
		System.out.println("==== �ý��� �޼��� ====");
		System.out.println(msg);
		System.out.println("=====================");
	}
	
	
	public Student updateStudent() throws IOException{
		Student s=new Student();
		System.out.println("====== �л����� ���� ======");
		System.out.print("������ �л��� : ");
		s.setName(sc.next());
		System.out.print("������ ���� : ");
		s.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("������ �ּ� : ");
		s.setAddress(br.readLine() );
		
		return s;
	}
	
	public Student nameCheck() throws IOException{
		
		System.out.println("==== �л� ��ȸ =====");
		System.out.print("��ȸ�� �л� �̸� : ");
		s.setName( br.readLine() );

		return s;
	}
	
	public Student ageCheck() {
		
		System.out.println("==== ���̷� �л� ��ȸ =====");
		System.out.print("��ȸ�� ���� : ");
		s.setAge( sc.nextInt() );

		return s;
	}
	
	public Student sumAg() throws IOException{
		System.out.println("==== �л� ������ ��� =====");
		System.out.print("��ȸ�� �л� �̸� : ");
		s.setName( br.readLine() );
		
		return s;
	}
	
}









