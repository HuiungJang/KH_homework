package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		result[0] = new GalaxyNote9().printformation();
		result[1] = new V40().printformation();
		
		for(int i =0; i<result.length; i++) {
			System.out.println(result[i]);
			System.out.println();
		}
		
		return result;
	}
}
