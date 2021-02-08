package com.studentmanage.controller;

import java.io.IOException;
import java.util.Scanner;

import com.studentmanage.model.dao.StudentDao;
import com.studentmanage.model.vo.Student;
import com.studentmanage.view.MainView;

//Student를 관리하는 필요한 화면기능, 데이터 저장관리기능 호출하는
//역할의 객체
public class StudentController {

	private StudentDao dao=new StudentDao();
	private Student s = new Student();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() throws IOException{
		
		
		// 저장된 데이터 자동으로 불러오기
		dao.loadFile(); //프로그램 시작전에 저장된 파일 불러오기
		new MainView().mainMenu(this);
		dao.saveFile(); // 끝나면 입력한 값들 저장하기
	}
	
	public void insertStudent() throws IOException{
		//1. 학생정보를 입력할 view화면
		s=new MainView().insertStudent();
		//2. StudentDao 데이터 저장소에 저장하기
		boolean flag=//new StudentDao().insertStudent(s);
					dao.insertStudent(s);
		//3. 입력 결과에 따라 사용에게 메세지를 출력
		String msg=flag?"입력성공":"저장할 공간이 부족합니다";
		new MainView().printMsg(msg);	
		
	}
	public void insertScore() throws IOException{
		//저장된 학생을 한명선택해서 데이터를 수정
		String data=dao.searchAllStudent();
		new MainView().printMsg(data);
		
		Student s=new MainView().insertScore();//수정할 내용을 받아옴.
		
		//수정이 되면 true값 반환, 실패하면 false값을 반환
		boolean flag=dao.insertScore(s);
		
		String msg=flag?"수정성공":"수정실패";
		new MainView().printMsg(msg);
		

	}
	
	public void searchAllStudent() {
		//StudentDao의 멤버변수에 저장되어있는 데이터를 출력 -> 사용자에게 보여주는것
		String data=dao.searchAllStudent();
		new MainView().printMsg(data);
	}
	
	public void updateStudent() throws IOException{
		//저장된 학생을 한명선택해서 데이터를 수정
		String data=dao.searchAllStudent();
		new MainView().printMsg(data);
		
		//나이와 주소를 변경하는것
		Student s=new MainView().updateStudent();//수정할 내용을 받아옴.
		
		//수정이 되면 true값 반환, 실패하면 false값을 반환
		boolean flag=dao.updateStudent(s);
		
		String msg=flag?"수정성공":"수정실패";
		new MainView().printMsg(msg);
		
	}

	public void nameCheck() throws IOException{
//		String data=dao.searchAllStudent();
//		new MainView().printMsg(data);
		
		s = new MainView().nameCheck();
		// MainView에 nameCheck 실행.
		
		boolean flag = dao.nameCheck(s);
		//StudentDao에서 nameCheck에 매개변수 s	받아서 실행하고 
		//boolean flag에 저장.
		
		String msg = flag? dao.namePrint(s) : "조회실패";
		//실행됐으면 dao의 namePrint 실행 아니면 조회실패.
		new MainView().printMsg(msg);
	}
	
	public void ageCheck() {
		s = new MainView().ageCheck();
		// MainView에 nameCheck 실행.
		
		boolean flag = dao.ageCheck(s);
		//StudentDao에서 nameCheck에 매개변수 s	받아서 실행하고 
		//boolean flag에 저장.
		
		String msg = flag? dao.agePrint(s) : "조회실패";
		//실행됐으면 dao의 agePrint 실행.
		new MainView().printMsg(msg);
	}
	
	public void sumAg() throws IOException{
		s = new MainView().sumAg();
		boolean flag = dao.nameCheck(s);
		// 입력받은 이름과 dao에 저장된 이름이 같은지 확인.
		
		int sum = dao.sum(s); // 총점 불러오고 
		int ag = dao.ag(s);	// 평균 불러오고 
		
		String msg = flag? "입력한 학생의 총점 : "+ sum+" 평균 : "+ ag: "조회 실패";
		new MainView().printMsg(msg);
	}
}






