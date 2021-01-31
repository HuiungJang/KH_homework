package com.studentmanage.model.vo;


//데이터보관클래스
public class Student {

	private String name;
	private int age;
	private String school;
	private String address;
	private int kor;
	private int eng;
	private int math;
	private int coding;
	
	public Student() {
	}
	
	public Student(String name, int age, 
			String school, String address) {
		this.name=name;
		this.age=age;
		this.school=school;
		this.address=address;
	}
	
	public Student(String name, int age, String school, 
			String address, int kor, int eng, 
			int math, int coding) {
		this(name, age, school, address);
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.coding=coding;
	}
	
	public Student(int kor, int eng, 
			int math, int coding) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.coding=coding;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public int getCoding() {
		return coding;
	}

	public void setCoding(int coding) {
		this.coding = coding;
	}
	
	
	public String toString() {
		return name+"\t"+age+"\t"+address+"\t"+kor+"\t"
				+eng+"\t"+math+"\t"+coding;
	}
	
	
}






