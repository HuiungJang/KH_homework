package com.oop.controller;

import com.oop.model.dto.Employee;

public class EmpArrayTest {
	public static void main(String[] args) {
		Employee[] ear = new Employee[3];
		
		ear[0] = new Employee();
		ear[1] = new Employee(201503,"박길동",29,'M',"010-1234-5678","경기도 의정부시");
		ear[2] = new Employee(201004,"김철수","개발부","과장",34,'M',4500000,0.15,"010-2143-9876" ,"서울시 노원구 노원동 123");
		
		for(int i = 0; i<ear.length; i++) {
			System.out.println(ear[i].empInformation());
		}
		System.out.println("-----------------------------------------------");
		ear[0] = new Employee(201305,"이영희","총무부","대리",28,'F',3750000,0.1,
							"010-9512-7534" ,"경기도 동두천");
		
		ear[1] = new Employee(201503,"박길동","기획부","사원",29,'M',2900000,0.05,
							"010-1234-5678" ,"경기도 의정부시");
		
		for(int i = 0; i<ear.length-1; i++) {
			System.out.println(ear[i].empInformation());
		}
		System.out.println("-----------------------------------------------");
		for(int i = 0; i<ear.length; i++) {
			System.out.println(ear[i].getEmpName()+"의 연봉 : "
		+( ear[i].getSalary() + ( ear[i].getSalary() * ear[i].getBonusPoint() ) )*12 );
		}
		
		System.out.println("-----------------------------------------------");
		double avg =( ( (ear[0].getSalary() + ( ear[0].getSalary() * ear[0].getBonusPoint() ) )*12)
					+( (ear[1].getSalary() + ( ear[1].getSalary() * ear[1].getBonusPoint() ) )*12)
					+( (ear[2].getSalary() + ( ear[2].getSalary() * ear[2].getBonusPoint() ) )*12) )/3;
		
		
	
		System.out.println("직원들 연봉의 평균 : " + avg );
	}
}
