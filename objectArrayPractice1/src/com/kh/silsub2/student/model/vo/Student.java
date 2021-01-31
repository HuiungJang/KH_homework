package com.kh.silsub2.student.model.vo;

public class Student {
	private int grade;
	private int group;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int grade, int group, String name, int kor, int eng, int math) {
		super();
		this.grade = grade;
		this.group = group;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
	public String stuInfo() {
		return grade+" "+group+" "+
				name+" "+kor+" "+eng+" "+math;
	}
}
