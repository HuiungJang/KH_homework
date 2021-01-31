package com.kh.example.practice3.model.vo;

public class Circle {
	private double PI = 3.14;
	private int radius = 1;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public void incrementRadius() {
		radius += 1;
		getAreaOfCircle();
		getSizeOfCircle();
	}
	
	public void getAreaOfCircle() {
		System.out.println(2*radius*PI);
	}
	
	public void getSizeOfCircle() {
		System.out.println(PI*PI);
	}
}
