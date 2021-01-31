package com.kh.silsub2.point.main;


import com.kh.silsub2.point.model.vo.Circle;
import com.kh.silsub2.point.model.vo.Point;
import com.kh.silsub2.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] c = new Circle[3];
		Rectangle[] r = new Rectangle[3];
	
		c[0] = new Circle(1,2,3);
		c[1] = new Circle(4,3,5);
		c[2] = new Circle(1,4,6);

		for(int i = 0; i<c.length;i++) {
			c[i].draw();
		}
		
		
		r[0] = new Rectangle(2,3,4,5);
		r[1] = new Rectangle(4,3,4,1);
		r[2] = new Rectangle(5,6,6,8);
		
		
		for(int i = 0; i<c.length;i++) {
			r[i].draw();
		}
		
		System.out.println("=======실습문제 3=========");
		Point[] p = new Circle[5];
		Point[] p2 = new Rectangle[5];
		
		p[0] = new Circle(1,3,4);
		p[1] = new Circle(1,3,6);
		p[2] = new Circle(1,3,7);
		p[3] = new Circle(1,1,9);
		p[4] = new Circle(1,4,2);
		
		
		p2[0] = new Rectangle(3,1,2,1);
		p2[1] = new Rectangle(3,1,6,4);
		p2[2] = new Rectangle(3,1,6,2);
		p2[3] = new Rectangle(3,1,3,12);
		p2[4] = new Rectangle(3,1,2,19);
		
		
		
		for(int i = 0; i<p.length; i++) {
			p[i].draw();
		}
		
		for(int i = 0; i<p2.length; i++) {
			p2[i].draw();
		}
		
		System.out.println("======================");
	}
}
