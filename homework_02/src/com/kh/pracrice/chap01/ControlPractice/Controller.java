package com.kh.pracrice.chap01.ControlPractice;
import java.util.Scanner;

public class Controller {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.println("1. 입력 \n2. 수정 \n3. 조회 "
				+ "\n4. 삭제  \n7.종료 \n 메뉴번호를 입력하세요. : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
			System.out.println("입력 메뉴입니다.");
			break;
		case 2 :
			System.out.println("수정 메뉴입니다.");
			break;
		case 3 :
			System.out.println("조회 메뉴입니다.");
			break;
		case 4 :
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			break;
			
		}
	}
	public void practice2() {
		System.out.println("정수를 입력해주세요.");
		int num = sc.nextInt();
		if(num > 0 && (num%2 == 0)) {
			System.out.println("짝수다");
		}else if(num > 0 && (num%2 != 0)) {
			System.out.println("홀수다");
		}else
			System.out.println("양수만 입력해주세요.");
	}
	public void practice3() {
		System.out.println("국어점수 :");
		int kor = sc.nextInt();
		System.out.println("영어점수 :");
		int eng = sc.nextInt();
		System.out.println("수학점수 :");
		int math = sc.nextInt();
		double avg = (kor+eng+math)/3;
		
		if(kor >= 40 && eng >= 40 
				&& math>= 40 && avg>= 60) {
			System.out.println("국어점수 : "+kor);
			System.out.println("수학점수 : "+math);
			System.out.println("영어점수 : "+eng);
			
			System.out.println("합계 "+kor+eng+math);
			System.out.println("평균 "+avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		String season = "";
		
		
		switch(month) {
		case 1 : case 2: case 12:
			season = "겨울";
			System.out.println(month+"월은 "+season+"입니다.");
			break;
			
		case 3:case 4:case 5:
			season = "봄";
			System.out.println(month+"월은 "+season+"입니다.");
			break;
			
		case 6:case 7:case 8:
			season = "여름";
			System.out.println(month+"월은 "+season+"입니다.");
			break;
			
		case 9:case 10:case 11:
			season = "가을";
			System.out.println(month+"월은 "+season+"입니다.");
			break;
		
		default :
			season = "해당하는 계절이 없습니다.";
			System.out.println(month+"월은 잘못 입력된 달입니다.");
			break;
		}
		
	}
	public void practice5() {
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		
		System.out.println("비밀번호 : ");
		String psw = sc.nextLine();
		
		if(id.equals("myId")&&psw.equals("myPassword12")) {
			System.out.println("로그인 성공");
		}else if(id.equals("myId")) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(psw.equals("myPassword12")) {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String id = sc.nextLine();
		
		if(id.equals("관리자")) {
			System.out.println("회원관리, 게시글관리, 게시글 작성, 댓글 작성, 게시글 조회");
		}else if(id.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}else {
			System.out.println("게시글 조회");
		}
	}
	public void practice7() {
		System.out.println("키(m)를 입력해주세요 : ");
		double ki = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해주세요 : ");
		double mom = sc.nextDouble();
		double bmi = mom/ki*ki;
		
		if(bmi<18.5) {
			System.out.println("BMI 지수 : "+bmi);
			System.out.println("저체중");
		}else if(bmi >=18.5 && bmi <23) {
			System.out.println("BMI 지수 : "+bmi);
			System.out.println("정상체중");
		}else if(bmi >=23 && bmi <25) {
			System.out.println("BMI 지수 : "+bmi);
			System.out.println("과체중");
		}else if(bmi >=25 && bmi <30) {
			System.out.println("BMI 지수 : "+bmi);
			System.out.println("비만");
		}else{
			System.out.println("BMI 지수 : "+bmi);
			System.out.println("고도비만");
		}
		sc.nextLine();
	}
	public void practice8() {
		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();

		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("연산자를 입력(+, -, *, /, %) : ");
		char oper = sc.next().charAt(0);	
		
		if(oper == '+') {
			double result1 = num1 + num2;
			System.out.println(num1 +" + "+num2+" = "+ result1);
			
		}else if(oper == '-') {
			double result2 = num1 - num2;
			System.out.println(num1 +" - "+num2+" = "+ result2);
			
		}else if(oper == '*') {
			double result3 = num1 * num2;
			System.out.println(num1 +" * "+num2+" = "+ result3);
			
		}else if(oper == '/') {
			double result4 = num1 / num2;
			System.out.println(num1 +" / "+num2+" = "+ result4);
			
		}else if(oper == '%'){
			double result5 = num1 % num2;
			System.out.println(num1 +" % "+num2+" = "+ result5);
		}
	}
	public void practice9() {
		System.out.println("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.println("기말 고사 점수 : ");
		int fi = sc.nextInt();
		System.out.println("과제 점수 : ");
		int hw = sc.nextInt();
		System.out.println("출석 회수 : ");
		int chul = sc.nextInt();
		
		double score = (mid*0.2) + (fi*0.3) + (hw*0.3) +chul;
		
		if(score >= 70) {
			System.out.println("================= 결과 =================");
			System.out.println("중간 고사 점수(20) : "+(mid*0.2)+"\n"+"기말고사 점수(30) : "+(fi*0.3)+"\n"
					+ "과제 점수\t(30) : "+(hw*0.3)+"\n"+"출석 점수\t(20) :"+(double)chul+"\n"+"총점 : "+score);
			System.out.println("Pass");
		}else if(chul<=14) {
			System.out.println("Fail [출석 회수 부족("+chul+"/20)]");
					
		}else if(score < 70){
			System.out.println("================= 결과 =================");
			System.out.println("중간 고사 점수(20) : "+(mid*0.2)+"\n"+"기말고사 점수(30) : "+(fi*0.3)+"\n"
					+ "과제 점수\t(30) : "+(hw*0.3)+"\n"+"출석 점수\t(20) :"+(double)chul+"\n"+"총점 : "+score);
			System.out.println("Fail [점수미달]");
		}
	
	}
	
	public void practice10() {
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴출력 \n2. 짝수/홀수 \n3. 합격/불합격 \n4. 계절  "
				+ "\n5. 로그인  \n6. 권한 확인 \n7. BMI \n8. 계산기 \n9. P/F");
		int select = sc.nextInt();
		System.out.print("선택 : "+ select);
		
		if(select == 1) {
			System.out.println("1. 입력 \n2. 수정 \n3. 조회 "
					+ "\n4. 삭제  \n7.종료 \n 메뉴번호를 입력하세요. : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.println("입력 메뉴입니다.");
				break;
			case 2 :
				System.out.println("수정 메뉴입니다.");
				break;
			case 3 :
				System.out.println("조회 메뉴입니다.");
				break;
			case 4 :
				System.out.println("삭제 메뉴입니다.");
				break;
			case 7 :
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
		}else if(select == 2) {
			System.out.println("정수를 입력해주세요.");
			int num = sc.nextInt();
			if(num > 0 && (num%2 == 0)) {
				System.out.println("짝수다");
			}else if(num > 0 && (num%2 != 0)) {
				System.out.println("홀수다");
			}else
				System.out.println("양수만 입력해주세요.");
		}else if(select == 3) {
			System.out.println("국어점수 :");
			int kor = sc.nextInt();
			System.out.println("영어점수 :");
			int eng = sc.nextInt();
			System.out.println("수학점수 :");
			int math = sc.nextInt();
			double avg = (kor+eng+math)/3;
			
			if(kor >= 40 && eng >= 40 
					&& math>= 40 && avg>= 60) {
				System.out.println("국어점수 : "+kor);
				System.out.println("수학점수 : "+math);
				System.out.println("영어점수 : "+eng);
				
				System.out.println("합계 "+kor+eng+math);
				System.out.println("평균 "+avg);
				System.out.println("축하합니다, 합격입니다!");
			}else {
				System.out.println("불합격입니다.");
			}
		}else if(select == 4) {
			System.out.print("1~12 사이의 정수 입력 : ");
			int month = sc.nextInt();
			String season = "";
			
			
			switch(month) {
			case 1 : case 2: case 12:
				season = "겨울";
				System.out.println(month+"월은 "+season+"입니다.");
				break;
				
			case 3:case 4:case 5:
				season = "봄";
				System.out.println(month+"월은 "+season+"입니다.");
				break;
				
			case 6:case 7:case 8:
				season = "여름";
				System.out.println(month+"월은 "+season+"입니다.");
				break;
				
			case 9:case 10:case 11:
				season = "가을";
				System.out.println(month+"월은 "+season+"입니다.");
				break;
			
			default :
				season = "해당하는 계절이 없습니다.";
				System.out.println(month+"월은 잘못 입력된 달입니다.");
				break;
			}
		}else if(select == 5) {
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			
			System.out.println("비밀번호 : ");
			String psw = sc.nextLine();
			
			if(id.equals("myId")&&psw.equals("myPassword12")) {
				System.out.println("로그인 성공");
			}else if(id.equals("myId")) {
				System.out.println("비밀번호가 틀렸습니다.");
			}else if(psw.equals("myPassword12")) {
				System.out.println("아이디가 틀렸습니다.");
			}
		}else if(select == 6) {
			System.out.println("권한을 확인하고자 하는 회원 등급 : ");
			String id = sc.nextLine();
			
			if(id.equals("관리자")) {
				System.out.println("회원관리, 게시글관리, 게시글 작성, 댓글 작성, 게시글 조회");
			}else if(id.equals("회원")) {
				System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			}else {
				System.out.println("게시글 조회");
			}
		}else if(select == 7) {
			System.out.println("키(m)를 입력해주세요 : ");
			double ki = sc.nextDouble();
			System.out.println("몸무게(kg)를 입력해주세요 : ");
			double mom = sc.nextDouble();
			double bmi = mom/ki*ki;
			
			if(bmi<18.5) {
				System.out.println("BMI 지수 : "+bmi);
				System.out.println("저체중");
			}else if(bmi >=18.5 && bmi <23) {
				System.out.println("BMI 지수 : "+bmi);
				System.out.println("정상체중");
			}else if(bmi >=23 && bmi <25) {
				System.out.println("BMI 지수 : "+bmi);
				System.out.println("과체중");
			}else if(bmi >=25 && bmi <30) {
				System.out.println("BMI 지수 : "+bmi);
				System.out.println("비만");
			}else{
				System.out.println("BMI 지수 : "+bmi);
				System.out.println("고도비만");
			}
		}else if(select == 8) {
			System.out.println("피연산자1 입력 : ");
			int num1 = sc.nextInt();

			System.out.println("피연산자2 입력 : ");
			int num2 = sc.nextInt();
			
			System.out.println("연산자를 입력(+, -, *, /, %) : ");
			char oper = sc.next().charAt(0);	
			
			if(oper == '+') {
				double result1 = num1 + num2;
				System.out.println(num1 +" + "+num2+" = "+ result1);
				
			}else if(oper == '-') {
				double result2 = num1 - num2;
				System.out.println(num1 +" - "+num2+" = "+ result2);
				
			}else if(oper == '*') {
				double result3 = num1 * num2;
				System.out.println(num1 +" * "+num2+" = "+ result3);
				
			}else if(oper == '/') {
				double result4 = num1 / num2;
				System.out.println(num1 +" / "+num2+" = "+ result4);
				
			}else if(oper == '%'){
				double result5 = num1 % num2;
				System.out.println(num1 +" % "+num2+" = "+ result5);
			}
		}else if(select == 9) {
			System.out.println("중간 고사 점수 : ");
			int mid = sc.nextInt();
			System.out.println("기말 고사 점수 : ");
			int fi = sc.nextInt();
			System.out.println("과제 점수 : ");
			int hw = sc.nextInt();
			System.out.println("출석 회수 : ");
			int chul = sc.nextInt();
			
			double score = (mid*0.2) + (fi*0.3) + (hw*0.3) +chul;
			
			if(score >= 70) {
				System.out.println("================= 결과 =================");
				System.out.println("중간 고사 점수(20) : "+(mid*0.2)+"\n"+"기말고사 점수(30) : "+(fi*0.3)+"\n"
						+ "과제 점수\t(30) : "+(hw*0.3)+"\n"+"출석 점수\t(20) :"+(double)chul+"\n"+"총점 : "+score);
				System.out.println("Pass");
			}else if(chul<=14) {
				System.out.println("Fail [출석 회수 부족("+chul+"/20)]");
						
			}else if(score < 70){
				System.out.println("================= 결과 =================");
				System.out.println("중간 고사 점수(20) : "+(mid*0.2)+"\n"+"기말고사 점수(30) : "+(fi*0.3)+"\n"
						+ "과제 점수\t(30) : "+(hw*0.3)+"\n"+"출석 점수\t(20) :"+(double)chul+"\n"+"총점 : "+score);
				System.out.println("Fail [점수미달]");
			}
		}
	}
	public void practice11() {
		System.out.print("비밀번호 입력(1000~9999) : ");
		int psw = sc.nextInt();
		
		if(psw >= 1000 && psw<= 9999) {
			String psw_C = Integer.toString(psw);
			
			verity:
			for(int i = 0; i<4; i++) {
				for(int j =0; j<4; j++) {
					if(i!=j && psw_C.charAt(i) == psw_C.charAt(j)) {
						System.out.println("실패");
						break verity;
					}
				}
				System.out.println("성공");
				break;
			}
			
		}else {
			System.out.println("자리수 안맞음");
		}
		
		
		
	}
}
