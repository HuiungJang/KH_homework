package com.kh.silsub2.student.controller;

import java.util.Scanner;

import com.kh.silsub2.student.model.vo.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stu = new Student[10];
		Scanner sc = new Scanner(System.in);
		
		boolean go = true;// �ݺ��� ��������.
		
		
		for(int i =0; i<stu.length; i++) {
			stu[i] = new Student();
		} // ��ü �迭 �ʱ�ȭ.
		
		
		
		while(go) {
			for(int i =0; i<stu.length; i++) {
				System.out.println("�л� ������ �Է����ּ���.");
				System.out.println( (i+1)+"��° �л��Դϴ�.");
				System.out.print("�г� : ");
				stu[i].setGrade(sc.nextInt());
				sc.nextLine();
				
				System.out.print("�� : ");
				stu[i].setGroup(sc.nextInt());
				sc.nextLine();
		
				System.out.print("�̸� : ");
				stu[i].setName(sc.next());
				sc.nextLine();
		
				System.out.print("���� : ");
				stu[i].setKor(sc.nextInt());
				sc.nextLine();
		
				System.out.print("���� : ");
				stu[i].setEng(sc.nextInt());
				sc.nextLine();
		
				System.out.print("���� : ");
				stu[i].setMath(sc.nextInt());		
				
				// �л� �߰�����.
				System.out.println("�ٸ� �л��� �߰��Ͻðڽ��ϱ�?");
				System.out.print("Y / N : ");
				char tmp = sc.next().charAt(0);
				if(tmp == 'y' || tmp == 'Y') {
					continue; // �ٸ� �л� �Է� 
				}else
					System.out.println("�л� ���� �Է��� �����մϴ�.");
					break;// for�� ���� �� Ż��.
			}
			go = false;// ���� 
		}
		System.out.println("==========�Է��� �л��� ��� ���=========");
		for(int i =0; i<stu.length; i++) {
			int avg =( (stu[i].getKor() + stu[i].getEng() +stu[i].getMath()) / 3 );
			
			if(avg != 0) {
				System.out.println(stu[i].getName()+"�л��� ��� : "+avg);
			}
		} // ��ü �迭 �ʱ�ȭ.
		System.out.println("=====================================");
		
		System.out.println("�Է��� �л��� ��� �������");
		for(int i =0; i<stu.length; i++) {
			String s = stu[i]+"\n";
			
			if(stu[i].getName() != null) {
				System.out.print("�л��� ���� \n�г� : "+stu[i].getGrade()+"�� : "+stu[i].getGroup()
						+" �̸� : "+stu[i].getName()+" �������� : "+stu[i].getKor()
						+" �������� : "+stu[i].getEng()+" �������� : "+stu[i].getMath());
			}
		}
		
		
	}

}
