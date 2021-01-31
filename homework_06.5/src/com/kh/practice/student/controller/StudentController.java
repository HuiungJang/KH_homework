package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	private Student[] sArr = new Student[5];
	public int CUT_LINE = 60;
	

	public StudentController() {
		// TODO Auto-generated constructor stub
		sArr[0] = new Student("��浿", "�ڹ�", 100);
		sArr[1] = new Student("�ڱ浿", "���", 50);
		sArr[2] = new Student("�̱浿", "ȭ��", 85);
		sArr[3] = new Student("���浿", "����", 60);
		sArr[4] = new Student("ȫ�浿", "�ڹ�", 20);
		
	}
	
	public Student[] printStudent() {
		for(int i = 0; i<sArr.length; i++) {
			sArr[i].inform();
		}
		return sArr;
	}
	
	public int sumScore() {
		int sum=0;
		for(int i = 0; i<sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] avg = new double[2];	
		avg[0] = sumScore();
		avg[1] = sumScore()/5;
		
		return avg;
	}
	
}