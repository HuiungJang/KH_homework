package com.kh.silsub2.student.controller;

import java.util.Scanner;

import com.kh.silsub2.student.model.vo.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stu = new Student[10];
		Scanner sc = new Scanner(System.in);
		
		boolean go = true;// 반복문 종료위해.
		
		
		for(int i =0; i<stu.length; i++) {
			stu[i] = new Student();
		} // 객체 배열 초기화.
		
		
		
		while(go) {
			for(int i =0; i<stu.length; i++) {
				System.out.println("학생 정보를 입력해주세요.");
				System.out.println( (i+1)+"번째 학생입니다.");
				System.out.print("학년 : ");
				stu[i].setGrade(sc.nextInt());
				sc.nextLine();
				
				System.out.print("반 : ");
				stu[i].setGroup(sc.nextInt());
				sc.nextLine();
		
				System.out.print("이름 : ");
				stu[i].setName(sc.next());
				sc.nextLine();
		
				System.out.print("국어 : ");
				stu[i].setKor(sc.nextInt());
				sc.nextLine();
		
				System.out.print("영어 : ");
				stu[i].setEng(sc.nextInt());
				sc.nextLine();
		
				System.out.print("수학 : ");
				stu[i].setMath(sc.nextInt());		
				
				// 학생 추가여부.
				System.out.println("다른 학생을 추가하시겠습니까?");
				System.out.print("Y / N : ");
				char tmp = sc.next().charAt(0);
				if(tmp == 'y' || tmp == 'Y') {
					continue; // 다른 학생 입력 
				}else
					System.out.println("학생 정보 입력을 중지합니다.");
					break;// for문 종료 후 탈출.
			}
			go = false;// 종료 
		}
		System.out.println("==========입력한 학생의 평균 출력=========");
		for(int i =0; i<stu.length; i++) {
			int avg =( (stu[i].getKor() + stu[i].getEng() +stu[i].getMath()) / 3 );
			
			if(avg != 0) {
				System.out.println(stu[i].getName()+"학생의 평균 : "+avg);
			}
		} // 객체 배열 초기화.
		System.out.println("=====================================");
		
		System.out.println("입력한 학생의 모든 정보출력");
		for(int i =0; i<stu.length; i++) {
			String s = stu[i]+"\n";
			
			if(stu[i].getName() != null) {
				System.out.print("학생의 정보 \n학년 : "+stu[i].getGrade()+"반 : "+stu[i].getGroup()
						+" 이름 : "+stu[i].getName()+" 국어점수 : "+stu[i].getKor()
						+" 영어점수 : "+stu[i].getEng()+" 수학점수 : "+stu[i].getMath());
			}
		}
		
		
	}

}
