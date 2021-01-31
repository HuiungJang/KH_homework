package com.kh.practice.point.controller;

import com.kh.practice.model.vo.Rectangle;

public class RectangleController {
	
	Rectangle r = new Rectangle();
	
	public String calcArea
	(int x, int y, int height, int width) {
		
		String area = "면적 : "+ x+", "+y+ " "+height+" "+width+
				" "+height*width;
		
		System.out.println(area);
		return area;
	}
	
	public String calcPerimeter(int x, int y,
			int height, int width) {
		
		String peri = "둘레 : "+ x+", "+y+ " "+height+" "+width+
				" "+ 2*(height*width);
		
		System.out.println(peri);
		return peri;
	}
	
	
}
