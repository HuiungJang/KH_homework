package com.uni;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student arrays [] = new Student[3];
		// 객체배열 Student arrays 생성하고 길이 3으로 초기화.
		
		arrays[0] = new Student("홍길동", 15, 171,81 , "201101", "영문");
		arrays[1] = new Student("한사람", 13, 183, 72,"201102", "건축");
		arrays[2] = new Student("임걱정", 16, 175, 65,"201103","무영");
		// 배열에 값을 할당.
		
		for(int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i].printInfomation() );
		}	
		// 객체배열에 자손클래스 pritnInformation 할당하고 출력.
		// 배열의 길이만큼 반복 = 배열전체 출력.
		
			
	}

}
