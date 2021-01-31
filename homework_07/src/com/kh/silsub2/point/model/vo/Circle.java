package com.kh.silsub2.point.model.vo;
import java.lang.Math.*;

public class Circle extends Point{
	private int radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int x,int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		
		double area = Math.round(Math.PI*radius*radius*10)/10;
		double cir =  Math.round(2*Math.PI*radius*10)/10;
		
		System.out.println("¿ø");
		System.out.println("x : "+ x+" y :"+y);
		System.out.println("³ÐÀÌ : "+area);
		System.out.println("µÑ·¹ : "+cir);
		System.out.println();
		
	}
	
}
