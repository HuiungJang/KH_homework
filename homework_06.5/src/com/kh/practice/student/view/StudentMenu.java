package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		// TODO Auto-generated constructor stub
		
		System.out.println("======== �л� ���� ��� =========");
		for(int i = 0; i<5; i++) {
			System.out.println("�̸� : "+ssm.printStudent()[i].getName()+" / "
					+"���� : "+ssm.printStudent()[i].getSubject()+" / "
					+"���� : "+ssm.printStudent()[i].getScore() );
		}
		System.out.println();
		
		System.out.println("======== �л� ���� ��� =========");
		System.out.println("�л� ���� �հ� : "+ssm.sumScore());
		System.out.println("�л� ���� �հ� : "+ssm.avgScore()[1] );
		System.out.println();
		
		System.out.println("======== ���� ��� ��� =========");
		for(int i = 0; i<5; i++) {
			if(ssm.printStudent()[i].getScore()>=60) {
				System.out.println(ssm.printStudent()[i].getName()+"�л��� ����Դϴ�.");
			}else {
				System.out.println(ssm.printStudent()[i].getName()+"�л��� ����� ����Դϴ�.");
			}
				
		}
	}
	
	
}
