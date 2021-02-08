package com.studentmanage.controller;

import java.io.IOException;
import java.util.Scanner;

import com.studentmanage.model.dao.StudentDao;
import com.studentmanage.model.vo.Student;
import com.studentmanage.view.MainView;

//Student�� �����ϴ� �ʿ��� ȭ����, ������ ���������� ȣ���ϴ�
//������ ��ü
public class StudentController {

	private StudentDao dao=new StudentDao();
	private Student s = new Student();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() throws IOException{
		
		
		// ����� ������ �ڵ����� �ҷ�����
		dao.loadFile(); //���α׷� �������� ����� ���� �ҷ�����
		new MainView().mainMenu(this);
		dao.saveFile(); // ������ �Է��� ���� �����ϱ�
	}
	
	public void insertStudent() throws IOException{
		//1. �л������� �Է��� viewȭ��
		s=new MainView().insertStudent();
		//2. StudentDao ������ ����ҿ� �����ϱ�
		boolean flag=//new StudentDao().insertStudent(s);
					dao.insertStudent(s);
		//3. �Է� ����� ���� ��뿡�� �޼����� ���
		String msg=flag?"�Է¼���":"������ ������ �����մϴ�";
		new MainView().printMsg(msg);	
		
	}
	public void insertScore() throws IOException{
		//����� �л��� �Ѹ����ؼ� �����͸� ����
		String data=dao.searchAllStudent();
		new MainView().printMsg(data);
		
		Student s=new MainView().insertScore();//������ ������ �޾ƿ�.
		
		//������ �Ǹ� true�� ��ȯ, �����ϸ� false���� ��ȯ
		boolean flag=dao.insertScore(s);
		
		String msg=flag?"��������":"��������";
		new MainView().printMsg(msg);
		

	}
	
	public void searchAllStudent() {
		//StudentDao�� ��������� ����Ǿ��ִ� �����͸� ��� -> ����ڿ��� �����ִ°�
		String data=dao.searchAllStudent();
		new MainView().printMsg(data);
	}
	
	public void updateStudent() throws IOException{
		//����� �л��� �Ѹ����ؼ� �����͸� ����
		String data=dao.searchAllStudent();
		new MainView().printMsg(data);
		
		//���̿� �ּҸ� �����ϴ°�
		Student s=new MainView().updateStudent();//������ ������ �޾ƿ�.
		
		//������ �Ǹ� true�� ��ȯ, �����ϸ� false���� ��ȯ
		boolean flag=dao.updateStudent(s);
		
		String msg=flag?"��������":"��������";
		new MainView().printMsg(msg);
		
	}

	public void nameCheck() throws IOException{
//		String data=dao.searchAllStudent();
//		new MainView().printMsg(data);
		
		s = new MainView().nameCheck();
		// MainView�� nameCheck ����.
		
		boolean flag = dao.nameCheck(s);
		//StudentDao���� nameCheck�� �Ű����� s	�޾Ƽ� �����ϰ� 
		//boolean flag�� ����.
		
		String msg = flag? dao.namePrint(s) : "��ȸ����";
		//��������� dao�� namePrint ���� �ƴϸ� ��ȸ����.
		new MainView().printMsg(msg);
	}
	
	public void ageCheck() {
		s = new MainView().ageCheck();
		// MainView�� nameCheck ����.
		
		boolean flag = dao.ageCheck(s);
		//StudentDao���� nameCheck�� �Ű����� s	�޾Ƽ� �����ϰ� 
		//boolean flag�� ����.
		
		String msg = flag? dao.agePrint(s) : "��ȸ����";
		//��������� dao�� agePrint ����.
		new MainView().printMsg(msg);
	}
	
	public void sumAg() throws IOException{
		s = new MainView().sumAg();
		boolean flag = dao.nameCheck(s);
		// �Է¹��� �̸��� dao�� ����� �̸��� ������ Ȯ��.
		
		int sum = dao.sum(s); // ���� �ҷ����� 
		int ag = dao.ag(s);	// ��� �ҷ����� 
		
		String msg = flag? "�Է��� �л��� ���� : "+ sum+" ��� : "+ ag: "��ȸ ����";
		new MainView().printMsg(msg);
	}
}






