package com.kh.silsub2.point.model.vo;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int x, int y,int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		double area = Math.round(width*height*10)/10;
		double cir = Math.round(2*(width+height)*10)/10;
		
		System.out.println("사각형");
		System.out.println("x : "+ x+" y :"+y);
		System.out.println("넓이 : "+area);
		System.out.println("둘레 : "+cir);
		System.out.println();
	}
}
