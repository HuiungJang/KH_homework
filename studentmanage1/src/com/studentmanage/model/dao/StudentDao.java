package com.studentmanage.model.dao;

import com.studentmanage.model.vo.Student;
import com.studentmanage.view.MainView;

public class StudentDao {
	
	// 학생들을 보관할수 있는 멤버변수 생성.
	public Student[] students = new Student[5];
	
	
	public StudentDao() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean insertStudent(Student s) {// 생성된 객체의 주소값 들어옴.
		
		boolean flag = false;
		for(int i =0; i<students.length; i++) {
			if(students[i] == null) { // 빈공간이면 
				students[i] = s; // s를 i번 인덱스에 넣고 
				flag = true; // flag를 true로 반환하고 
				break; // 반복문 종료 
			}
		}
		return flag;
	}
	
	public boolean insertScore(Student s) {
		boolean flag = false;
		String name = s.getName();
		
		for(int i = 0; i<students.length; i++) {
			if(students[i].getName().equals(name)) {
				// students배열의 getName에서 가져온값이
				// 입력된 name(setName)과 같다면 
				// 객체배열 students에 국영수코 점수 저장.
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
		
		String value = ""; // 초기화.
		for(int i= 0; i<students.length; i++) {
			if(students[i] != null) { // 빈공간이 없으면 
				value += students[i]+"\n"; 
				// 오버라이딩된 Student 가져와서 넣기
			}
		}
		return value;	
	}	
	
	public boolean updateStudent(Student s) {
		boolean flag = false;
		String name = s.getName(); 
		// 저장된 Student name값을 가져와서 String name에 저장.
		
		for(int i = 0; i<students.length; i++) {
			
			if(students[i].getName().equals(name)) {
				// students배열의 getName에서 가져온값이
				// 입력된 name(setName)과 같다면 
				// 나이와 주소를 수정하고 종료
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
				// 입력받은 이름과 객체배열에 저장된 이름이 같은지 확인
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public String namePrint(Student s) {
		
		String name = s.getName();
		//Student에 저장되어있는 name을 가져와서 String name에 저장.
		for(int i = 0; i<students.length; i++) {
			if(students[i].getName().equals(name) ) {
				//String name이 studetns[]에 저장되어있는 이름과 같다면.
				name +=	students[i].getAge()+"\n"+
						students[i].getAddress()+"\n"+
						students[i].getKor()+"\n"+
						students[i].getEng()+"\n"+
						students[i].getMath()+"\n"+
						students[i].getCoding();
				// 객체배열 students에 있는 것들을 
				// name빼고 String name에 저장.
				// name을 뺀 이유는 
				// getName로 이름을 가져와서 이미 저장을 한 번 했으니까.
				// 아니면 이름이 2번 저장됨.
				break;
				// 끝났으면 반복문 빠져나가고
			}
		}
		return name; 
		// String name를 반환.
	}
	
	public boolean ageCheck(Student s) {
		boolean flag = false;
		int age = s.getAge();
		
		for(int i = 0; i<students.length; i++) {
			if(students[i].getAge() == age) {
				// 입력받은 나이와 객체배열 students에 저장된 나이가 같은지 확인
				
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public String agePrint(Student s) {
		
		int age = s.getAge(); // 입력받은 나이를 int age에 저장.
		String tmp ="";

		for(int i = 0; i<students.length; i++) {
			if( students[i].getAge() == age ) {	
				// 입력받은 나이와 객체배열 students에 저장된 값이 같다면.
				// 오버라이딩된 student를 tmp에 전부 저장.
				tmp +=	students[i]+"\n";
						
				break;
			}
		}
		return tmp;
	}
	
	public int sum(Student s) {
		// 학생의 총점 구해서 저장하는 메소드.
		int sum = 0; // 초기화.
		
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
		// 학생의 평균 구해서 저장하는 메소드.
		for(int i = 0; i<students.length; i++) {
			if( students[i] != null ) {
			ag = (students[i].getKor()+students[i].getEng()+
					students[i].getMath()+students[i].getCoding())/4;
			}
		}
			
		return ag;
	}
}
