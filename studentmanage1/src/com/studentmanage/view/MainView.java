package com.studentmanage.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.studentmanage.controller.StudentController;
import com.studentmanage.model.vo.Student;

//클라이언트에게 보이는 화면을 출력하는 기능을 제공하는 클래스
//메인메뉴, 등록화면, 조회화면 -> 메소드(기능)
public class MainView {
	Scanner sc=new Scanner(System.in);
	Student s = new Student();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	public void mainMenu(StudentController stc) throws IOException{
		
		while(true) {
			System.out.println("===== 학생관리 프로그램 =====");
			System.out.println("1. 전체학생조회");
			System.out.println("2. 학생등록");
			System.out.println("3. 학생수정");
			System.out.println("4. 학생점수등록");
			System.out.println("5. 이름으로 학생조회");
			System.out.println("6. 나이로 학생조회");
			System.out.println("7. 학생 총점/평균구하기");
			//점수를 등록할 학생선정, 학생선정 후 점수입력받고
			//선정된 학생의 점수 수정!
			System.out.println("0. 종료");
			System.out.print("입력 : ");
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
				case 0 : System.out.println("학생관리 프로그램을 종료합니다.");
						return;
			}
		}
	}
	
	
	public Student insertStudent() throws IOException{
		System.out.println("==== 학생등록 =====");
		System.out.print("이름 : ");
		String name=br.readLine();
		
		System.out.print("나이 : ");
		int age=sc.nextInt();
		
		System.out.print("학교 : ");
		sc.nextLine();
		String school=br.readLine();
		
		System.out.print("주소 : ");
		String address=br.readLine();
		
		s =new Student(name, age, school,address);
		return s;
	}
	
	public Student insertScore() throws IOException{
		System.out.println("==== 학생 점수 등록 =====");
		System.out.print("점수 등록할 학생명 : ");
		s.setName( br.readLine() );
		
		System.out.print("국어 : ");
		s.setKor(sc.nextInt());
		sc.nextLine();
		
		System.out.print("영어 : ");
		s.setEng(sc.nextInt());
		sc.nextLine();
		
		System.out.print("수학 : ");
		s.setMath(sc.nextInt());
		sc.nextLine();
		
		System.out.print("코딩 : ");
		s.setCoding(sc.nextInt());
		sc.nextLine();
		

		return s;
	}
	
	public void printMsg(String msg) {
		System.out.println("==== 시스템 메세지 ====");
		System.out.println(msg);
		System.out.println("=====================");
	}
	
	
	public Student updateStudent() throws IOException{
		Student s=new Student();
		System.out.println("====== 학생정보 수정 ======");
		System.out.print("수정할 학생명 : ");
		s.setName(sc.next());
		System.out.print("수정할 나이 : ");
		s.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("수정할 주소 : ");
		s.setAddress(br.readLine() );
		
		return s;
	}
	
	public Student nameCheck() throws IOException{
		
		System.out.println("==== 학생 조회 =====");
		System.out.print("조회할 학생 이름 : ");
		s.setName( br.readLine() );

		return s;
	}
	
	public Student ageCheck() {
		
		System.out.println("==== 나이로 학생 조회 =====");
		System.out.print("조회할 나이 : ");
		s.setAge( sc.nextInt() );

		return s;
	}
	
	public Student sumAg() throws IOException{
		System.out.println("==== 학생 총점과 평균 =====");
		System.out.print("조회할 학생 이름 : ");
		s.setName( br.readLine() );
		
		return s;
	}
	
}









