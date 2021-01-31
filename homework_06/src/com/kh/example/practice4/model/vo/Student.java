package com.kh.example.practice4.model.vo;

public class Student {
	 private int grade;
	 private int classroom;
	 private String name;
	 private double height;
	 private char gender;
	
	 {
		grade = 0;
		classroom= 0;
		name = "";
		height = 0.0;
		gender = 0;
	 }
	 
	 public Student() {
		// TODO Auto-generated constructor stub
	}
	 
	 public void information() {
		 System.out.println(grade+ classroom+ name+ height+ gender);
	 }
}
