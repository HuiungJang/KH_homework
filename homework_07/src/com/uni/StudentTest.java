package com.uni;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student arrays [] = new Student[3];
		// ��ü�迭 Student arrays �����ϰ� ���� 3���� �ʱ�ȭ.
		
		arrays[0] = new Student("ȫ�浿", 15, 171,81 , "201101", "����");
		arrays[1] = new Student("�ѻ��", 13, 183, 72,"201102", "����");
		arrays[2] = new Student("�Ӱ���", 16, 175, 65,"201103","����");
		// �迭�� ���� �Ҵ�.
		
		for(int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i].printInfomation() );
		}	
		// ��ü�迭�� �ڼ�Ŭ���� pritnInformation �Ҵ��ϰ� ���.
		// �迭�� ���̸�ŭ �ݺ� = �迭��ü ���.
		
			
	}

}
