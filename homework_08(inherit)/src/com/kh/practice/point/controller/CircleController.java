package com.kh.practice.point.controller;

import com.kh.practice.model.vo.Circle;

public class CircleController {
	
	Circle c = new Circle();
	
	public String calcArea
	(int x, int y, int radius) {
		// 받은 매개변수를 이용하여 필드들을 
		// 초기화하고 초기화한 정보와 면적 반환
		// 면적 : PI * 반지름 * 반지름
		String area = "면적 : " + x+", "+ y +", "+ radius+" / "+Math.PI*radius*radius;
		
		System.out.println(area);
		
		return area;
	}
	
	public String calcCircum(int x, int y,
			int radius) {
		
		String cir = "둘레 : "+ x+", "+ y +", "+ radius+" / "+Math.PI*2*radius;
		
		System.out.println(cir);
		
		return cir;
	}
	
}
