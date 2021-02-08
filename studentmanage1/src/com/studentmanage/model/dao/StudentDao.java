package com.studentmanage.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.studentmanage.model.vo.Student;

public class StudentDao {
	
	// �л����� �����Ҽ� �ִ� ������� ����.
	public Student[] students = new Student[3];
	private static int studentsIndex=0;
	
	public StudentDao() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean insertStudent(Student s) {// ������ ��ü�� �ּҰ� ����.
		
		boolean flag = true;
		try {
			students[studentsIndex]=s;
			studentsIndex++;
		}catch(ArrayIndexOutOfBoundsException e) {
			Student[] tmp = new Student[students.length+5];
			// ArrayIndexOutOfBoundsException �߻���
			// ���� �迭 ���̺��� ���� 5�������Ѽ� ���ο� �迭�����
			// �ű�ٰ� �� ����
			System.arraycopy(students, 0, tmp, 0, students.length);
			studentsIndex = students.length;
			students = tmp;
			students[studentsIndex] =s ;
			studentsIndex++;
		}
//		boolean flag = false;
//		for(int i =0; i<students.length; i++) {
//			if(students[i] == null) { // ������̸� 
//				students[i] = s; // s�� i�� �ε����� �ְ� 
//				flag = true; // flag�� true�� ��ȯ�ϰ� 
//				break; // �ݺ��� ���� 
//			}
//		}
		return flag;
	}
	
	public boolean insertScore(Student s) {
		boolean flag = false;
		String name = s.getName();

		for(int i = 0; i<students.length; i++) {
			if(students[i].getName().equals(name)) {
				// students�迭�� getName���� �����°���
				// �Էµ� name(setName)�� ���ٸ� 
				// ��ü�迭 students�� �������� ���� ����.
				students[i].setKor(s.getKor());
				students[i].setEng(s.getEng());
				students[i].setMath(s.getMath());
				students[i].setCoding(s.getCoding());
				
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	public String searchAllStudent() {
		
		String value = ""; // �ʱ�ȭ.
		for(int i= 0; i<students.length; i++) {
			if(students[i] != null) { // ������� ������ 
				value += students[i]+"\n"; 
				// �������̵��� Student �����ͼ� �ֱ�
			}
		}
		return value;	
	}	
	
	public boolean updateStudent(Student s) {
		boolean flag = false;
		String name = s.getName(); 
		// ����� Student name���� �����ͼ� String name�� ����.
		
		for(int i = 0; i<students.length; i++) {
			
			if(students[i].getName().equals(name)) {
				// students�迭�� getName���� �����°���
				// �Էµ� name(setName)�� ���ٸ� 
				// ���̿� �ּҸ� �����ϰ� ����
				students[i].setAge(s.getAge());
				students[i].setAddress(s.getAddress());
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean nameCheck(Student s) {
		boolean flag = false;
		String name = s.getName();
		
		for(int i = 0; i<students.length; i++) {
			if(students[i].getName().equals(name)) {
				// �Է¹��� �̸��� ��ü�迭�� ����� �̸��� ������ Ȯ��
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public String namePrint(Student s) {
		
		String name = s.getName();
		//Student�� ����Ǿ��ִ� name�� �����ͼ� String name�� ����.
		for(int i = 0; i<students.length; i++) {
			if(students[i].getName().equals(name) ) {
				//String name�� studetns[]�� ����Ǿ��ִ� �̸��� ���ٸ�.
				
//				name +=	students[i].getAge()+"\n"+
//						students[i].getAddress()+"\n"+
//						students[i].getKor()+"\n"+
//						students[i].getEng()+"\n"+
//						students[i].getMath()+"\n"+
//						students[i].getCoding();
				
				name = students[i]+"\n";
				
				
				
				// ��ü�迭 students�� �ִ� �͵��� 
				// name���� String name�� ����.
				// name�� �� ������ 
				// getName�� �̸��� �����ͼ� �̹� ������ �� �� �����ϱ�.
				// �ƴϸ� �̸��� 2�� �����.
				break;
				// �������� �ݺ��� ����������
			}
		}
		return name; 
		// String name�� ��ȯ.
	}
	
	public boolean ageCheck(Student s) {
		boolean flag = false;
		int age = s.getAge();
		
		for(int i = 0; i<students.length; i++) {
			if(students[i].getAge() == age) {
				// �Է¹��� ���̿� ��ü�迭 students�� ����� ���̰� ������ Ȯ��
				
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public String agePrint(Student s) {
		
		int age = s.getAge(); // �Է¹��� ���̸� int age�� ����.
		String tmp ="";

		for(int i = 0; i<students.length; i++) {
			if( students[i].getAge() == age ) {	
				// �Է¹��� ���̿� ��ü�迭 students�� ����� ���� ���ٸ�.
				// �������̵��� student�� tmp�� ���� ����.
				tmp +=	students[i]+"\n";
						
				break;
			}
		}
		return tmp;
	}
	
	public int sum(Student s) {
		// �л��� ���� ���ؼ� �����ϴ� �޼ҵ�.
		int sum = 0; // �ʱ�ȭ.
		
		for(int i = 0; i<students.length; i++) {
			if( students[i] != null ) {
			sum = students[i].getKor()+students[i].getEng()+
					students[i].getMath()+students[i].getCoding();
			}
		}
			
		return sum;
	}
	
	public int ag(Student s) {
		int ag = 0;
		// �л��� ��� ���ؼ� �����ϴ� �޼ҵ�.
		for(int i = 0; i<students.length; i++) {
			if( students[i] != null ) {
			ag = (students[i].getKor()+students[i].getEng()+
					students[i].getMath()+students[i].getCoding())/4;
			}
		}
			
		return ag;
	}
	
	public void saveFile() {
		// ����Ǿ��ִ� sutdent�� ���Ϸ� �����ؼ� ����
		try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("studentdata.txt"))){
			
			oos.writeObject(students);
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
	}
	
	public void loadFile() {
		File f = new File("studentdata.txt");
		
		if(f.exists()) {
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentdata.txt"))){
				
				students= (Student[])ois.readObject();
				studentsIndex = students.length-1;
				
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
