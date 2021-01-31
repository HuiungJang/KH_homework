package com.kh.practice.func.OperatorPractice;
import java.util.Scanner;

public class Controller {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		// 키보드로 입력 받은 하나의 정수
		// 양수 -> "양수다" 아니면 -> "양수가 아니다"
		// 예) 정수 : -9
		// 양수가 아니다
		System.out.println("=====입력한 정수가 양수인지 아닌지 판별=====");
		System.out.print("정수 : ");
		
		String num = sc.nextLine();
		char tmp = num.charAt(0);
		
		System.out.println((tmp == '-')? "양수가 아니다":"양수다");
		
	}
	public void practice2() {
		System.out.println("=====입력한 정수 판별=====");
		System.out.print("정수 : ");
		
		String num = sc.nextLine();
		char tmp = num.charAt(0);
		
		System.out.println((tmp!='-')? (tmp == '0')? "0이다" : "양수다" : "음수다"); 
	}
	public void practice3() {
		System.out.println("=====입력한 짝홀수 판별=====");
		System.out.print("정수 : ");
		
		int num = sc.nextInt();
		System.out.println((num%2 == 0)? "짝수다" : "홀수다");
	}
	
	public void practice4() {
		System.out.println("사탕나누기");
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사탕 수 : ");
		int candy = sc.nextInt();
		sc.nextLine();
		
		System.out.println("1인당 사탕개수 : " + (candy/person));
		System.out.println("남는 사탕개수 : " + (candy%person));
	}
	
	public void practice5() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("반(숫자만) : ");
		int group = sc.nextInt();
		sc.nextLine();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		String tmp = (gender == 'M')? "남학생": "여학생";
		sc.nextLine();
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		float score = sc.nextFloat();
		sc.nextLine();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",
				grade, group, num, name, tmp, score);
	}
	public void practice6() {
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String tmp = (age <= 13)? "어린이" : (age>13 && age<=19)? "청소년" : "성인";
		
		System.out.println(tmp);
	}
	
	public void practice7() {
		System.out.print("국어 : ");
		float kor = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("영어 : ");
		float eng = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("수학 : ");
		float mat = sc.nextFloat();
		
		System.out.println("합계 : "+ (int)(kor+eng+mat));
		System.out.printf("평균 : %.1f \n", ((kor+eng+mat)/3));
		System.out.println((kor >= 40 && (kor+eng+mat)/3 >= 60 && eng >= 40 
				&& mat >= 40)? "합격": "불합격");
	}
	public void practice8() {
			System.out.print("주민번호를 입력하세요( - 포함) : ");
			char name = sc.nextLine().charAt(7);
			
			System.out.println(name == 1? "남자" : "여자" );
	}
	
	public void practice9() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		sc.nextLine();
		System.out.println();
		System.out.println((num3 <= num1 || num3 > num2)? "true":"false");
	}
	public void practice10() {
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		System.out.println((num1 == num2 && num2 == num3)? "true":"false");
	}
	public void practice11() {
		System.out.print("A사원의 연봉 : ");
		float salary1 = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("B사원의 연봉 : ");
		float salary2 = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("C사원의 연봉 : ");
		float salary3 = sc.nextFloat();
		sc.nextLine();
		
		float tmp1 = (float)(salary1*1.4);
		float tmp2 = (float)(salary3*1.15);
		
		System.out.printf("A사원의 연봉/연봉+a : %.0f/%.1f \n",salary1,tmp1);
		System.out.println((tmp1>=3000)? "3000 이상" :"3000 미만");
		
		System.out.printf("B사원의 연봉/연봉+a : %.0f/%.1f \n",salary2,salary2);
		System.out.println((salary2>=3000)? "3000 이상" :"3000 미만");
		
		System.out.printf("C사원의 연봉/연봉+a : %.0f/%.1f \n",salary2,tmp2);
		System.out.println((tmp2>=3000)? "3000 이상" :"3000 미만");
	
		
	}
}
