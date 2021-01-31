package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		// TODO Auto-generated constructor stub
		
		System.out.println("======== 학생 정보 출력 =========");
		for(int i = 0; i<5; i++) {
			System.out.println("이름 : "+ssm.printStudent()[i].getName()+" / "
					+"과목 : "+ssm.printStudent()[i].getSubject()+" / "
					+"점수 : "+ssm.printStudent()[i].getScore() );
		}
		System.out.println();
		
		System.out.println("======== 학생 성적 출력 =========");
		System.out.println("학생 점수 합계 : "+ssm.sumScore());
		System.out.println("학생 점수 합계 : "+ssm.avgScore()[1] );
		System.out.println();
		
		System.out.println("======== 성적 결과 출력 =========");
		for(int i = 0; i<5; i++) {
			if(ssm.printStudent()[i].getScore()>=60) {
				System.out.println(ssm.printStudent()[i].getName()+"학생은 통과입니다.");
			}else {
				System.out.println(ssm.printStudent()[i].getName()+"학생은 재시험 대상입니다.");
			}
				
		}
	}
	
	
}
