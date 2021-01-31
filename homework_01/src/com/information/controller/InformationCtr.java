package com.information.controller;
import java.util.Scanner;

public class InformationCtr {
	//자신의 이름,나이, 주소
	//키 몸무게 성별을 입력받고
	//출력하는 프로그램 작성
	//몸무게는 첫째자리까지 출력
	//키는 정수로 변환해서 출력
	public void ex1(){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("당신의 이름은?");
	String name = sc.nextLine();
	//System.out.println( name );	
	
	System.out.print("당신의 나이는?");
	int age = sc.nextInt();
	//System.out.println( age );
	sc.nextLine();
	
	System.out.print("당신의 주소는?");
	String address = sc.nextLine();
	//System.out.println( address );	
	
	System.out.print("당신의 전화번호는? ex) 01012345678 :");
	int phone = sc.nextInt();
	//System.out.println( height );	
	sc.nextLine();
	
	System.out.print("당신의 이메일은?");
	String email = sc.nextLine();
	//System.out.println( height );
	sc.nextLine();
	
	System.out.print("당신의 성별(M/F)?");
	char gender = sc.nextLine().charAt(0);
	
	sc.close();
	System.out.printf("%s, %d, %s, %d, %.1f, %s", name, age, address, phone, email, gender );
	}
	
	public void ex2(){
		Scanner sc =new Scanner(System.in);
		
		System.out.print("내 이름은?");
		String name = sc.nextLine();
		
		System.out.print("내 나이는?");
		int age = sc.nextInt();
		
		System.out.print("내 주소는?");
		String address = sc.nextLine();
		
		System.out.print("내 키는?");
		double ki = sc.nextDouble();
		
		System.out.print("내 몸무게는?");
		double muge = sc.nextDouble();
		
		System.out.print("내 성별은? (M / F)");
		char gender = sc.next().charAt(0);
		
		sc.close();
		System.out.printf("%s, %d, %s, %d, %.1f, %s", name, age, address, (int)ki, muge, gender );
		
	}
	
	
}
