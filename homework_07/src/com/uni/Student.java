package com.uni;

public class Student extends Human{
	private String number;
	private String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age,int height
			, int weight,String number, String major) {
		
		super(name, age ,height, weight);
		this.number = number;
		this.major = major;
	}
	
	@Override
	public String printInfomation() {
//		return name+" "+age+" "+height+" "+weight+" "+number+" "+major;
		return super.printInfomation() +" "+number+" "+major;
	} 
	// �θ�Ŭ���� Human�� printInfomation�� �����ͼ�
	// �ڼ�Ŭ���� Student�� ������ �߰��ؼ� ����.

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
