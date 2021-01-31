package com.kh.practice.chap02.loop.LoopPractice;
import java.util.Scanner;

public class Controller {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num <1) { // 1미만이라면
			System.out.print("1 이상의 숫자를 입력해주세요."); 
		}else{ // 1미만이 아니면
			for(int i = 1; i<=num; i++) { //1부터 num까지 출력하기.
				System.out.print(i);
				
			}

		}
		
	}
	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num <1) { // 1미만이라면
			System.out.print("1 이상의 숫자를 입력해주세요. \n1이상의 숫자를 입력하세요 : "); 
			int num2 = sc.nextInt();
			for(int i = 1; i<=num2; i++) { //1부터 num까지 출력하기.
					System.out.print(i);			
			}
		}else{ // 1미만이 아니면
			for(int i = 1; i<=num; i++) { //1부터 num까지 출력하기.
				System.out.print(i);	
			}
		}
	}
	public void practice3() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >=1) { // 1미만이라면
			for(int i = num; i>=1; i--) {
				System.out.println(i);
			}
		}else {
			System.out.print("1이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice4() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >=1) { // 1미만이라면
			for(int i = num; i>=1; i--) {
				System.out.println(i);
			}
		}else {
			System.out.print("1 이상의 숫자를 입력해주세요. \n1이상의 숫자를 입력하세요 : "); 
			int num2 = sc.nextInt();
			for(int i = num2; i>=1; i--) {
				System.out.println(i);
			}
		}
	}
	
	public void practice5() {
		//1~n까지 합
	
		System.out.print("정수를 하나 입력하세요 : ");
		int n = sc.nextInt();
		int sum = 0;
		
		if(n>=1) {
			System.out.print(1); //1출
			for(int i = 2; i<=n; i++) {
				int print =+ i;	//2부터 하나씩 증가시켜서 print에 각각 저장.
				System.out.print(" + "); // +를 n-1개 
				System.out.print(print);
			}	// + 2 + 3 ... + n
			System.out.print(" = ");
			for(int i = 1; i<=n; i++) {
				sum += i; // i을 1씩 n번 증가시켜서 sum에 저장.
			}System.out.print(sum);
		}
				
	}
	
	public void practice6() {
		System.out.print("첫 번째 숫자 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int n2 = sc.nextInt();
		
		if(n1<n2) {
			for(int i = n1; i<=n2; i++) {
			System.out.print(i+" ");
			}
		}else if(n1>n2) {
			for(int i = n2; i<=n1; i++) {
				System.out.print(i+" ");
			}
		}else
			System.out.print("1이상의 숫자를 입력해주세요.");
		
		
	}
	
	public void practice7() {
		System.out.print("첫 번째 숫자 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int n2 = sc.nextInt();
		
		if(n1<n2&& n1>=1 && n2>=1) {
			for(int i = n1; i<=n2; i++) {
			System.out.print(i+" ");
			}
		}else if(n1>n2&& n1>=1 && n2>=1) {
			for(int i = n2; i<=n1; i++) {
				System.out.print(i+" ");
			}
		}else if(n1 < 1 || n2 <1 ) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			System.out.print("첫 번째 숫자 : ");
			int n3 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int n4 = sc.nextInt();
			
			if(n3<n4 && n3>=1 && n4>=1) {
				for(int i = n3; i<=n4; i++) {
					System.out.print(i+" ");
				}
			}else if(n3>n4&& n3>=1 && n4>=1) {
				for(int i = n3; i<=n4; i++) {
					System.out.print(i+" ");
				}
			}
		}
	
}
	public void practice8() {
		System.out.println("숫자 : ");
		int n = sc.nextInt();
		System.out.println("====="+n+"단=====");
		
		for(int i =1; i<=9; i++) {
			System.out.print(n+" "+"* "+i+" = ");
			System.out.println(n*i);
		}
		
		
	}
	public void practice9() {
		System.out.println("숫자 : ");
		int n = sc.nextInt();
		if(n <=9) {
			for(int i =1; i<=n; i++) {
				System.out.println("====="+i+"단====="); //1~i단 출력.
				for(int j = 1; j<= 9; j++) {// 1~9 곱하기.
					System.out.print(i+" "+"* "+j+" = "); // i * j = -> i가 1번 반복될때 j는 1씩 증가하면서 9번 반복.
				System.out.println(i*j);
				}
			}
		}else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}
	
	public void practice10() {
		System.out.println("숫자 : ");
		int n = sc.nextInt();
		if(n <=9) {
			for(int i =1; i<=n; i++) {
				System.out.println("====="+i+"단====="); //1~i단 출력.
				for(int j = 1; j<= 9; j++) {// 1~9 곱하기.
					System.out.print(i+" "+"* "+j+" = "); // i * j = -> i가 1번 반복될때 j는 1씩 증가하면서 9번 반복.
				System.out.println(i*j);
				}
			}
		}else{ // 9이하가 아니면 아래실행.
			System.out.println("9 이하의 숫자만 입력해주세요.");
			System.out.println("숫자 : ");
			int n2 =sc.nextInt();
			
			for(int i =1; i<=n2; i++) {
				System.out.println("====="+i+"단====="); //1~i단 출력.
				for(int j = 1; j<= 9; j++) {// 1~9 곱하기.
					System.out.print(i+" "+"* "+j+" = "); // i * j = -> i가 1번 반복될때 j는 1씩 증가하면서 9번 반복.
				System.out.println(i*j);
				}
			}
		}
		
	}
	
	public void practice11() {
		System.out.print("시작 숫자 : ");
		int startN = sc.nextInt();
		System.out.print("공차 : ");
		int gong = sc.nextInt();
		
		if(gong>=0) { //공차만큼 커짐.
			System.out.print(startN+" ");
			for(int i =0; i<9; i++) {
				System.out.print((startN += gong) +" ");
			}
		}else { // 공차만큼 작아짐.
			System.out.print(startN+" ");
			for(int i =9; i>0; i--) {
				System.out.print((startN += gong) +" ");
			}		
		}
	}
	
	public void practice12() {
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.println("정수2 : ");
			int num2 = sc.nextInt();
		
			
			if(op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
				}
			
			
			if(op.equals("+")) {
					int sum = num1 + num2;
					System.out.println(num1+" + "+num2+" = "+sum);
					break;
				}else if(op.equals("-")) {
					int minu = num1 - num2;	
					System.out.println(num1+" - "+num2+" = "+minu);
					break;
				}else if(op.equals("/")) {
					int divi = num1 / num2;
					System.out.println(num1+" / "+num2+" = "+divi);
					break;
				}else if(op.equals("*")) {
					int multi = num1 * num2;
					System.out.println(num1+" * "+num2+" = "+multi);
					break;
				}else if(op.equals("%")) {
					int remain = num1 - num2;
					System.out.println(num1+" % "+num2+" = "+remain);
					break;
				}else {
					System.out.println("없는 연산자입니다. 다시 입력해주세요.");					
				}
			
		}
	}
	public void practice13() {
		System.out.print("정수입력 : ");
		int n = sc.nextInt();
		
		for(int i =0; i<n; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
			
}
	public void practice14() {
		System.out.print("정수입력 : ");
		int n = sc.nextInt();
		
		for(int i =0; i<n; i++) {
			for(int j = n; j-1>=i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public void practice15() {
		
		boolean sosu = false; // 소수판별
		System.out.print("숫자 : ");
		int n = sc.nextInt();
		
		if(n>=2) {
			for(int i = 2; i<n; i++) {
				if( n % i == 0) { //참이면 소수아님.
					sosu = true;
					break;
				}
			}
			if(sosu) {
				System.out.println("소수가 아닙니다.");
			}else {
				System.out.println("소수입니다.");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice16() {
		while(true) {
			
			/*
			 * boolean flag = true;
		 for(int i =0; i<n; i++) {
			 if(n%i==0) {
				 flag = false;
				 break;
			 }
		 }
		 System.out.print(flag? "소수입니다." : "소수가 아닙니다.");
			 */
			
			System.out.print("숫자 : ");
			int n = sc.nextInt();
			boolean sosu = false;
			
			if(n>=2) {
				for(int i = 2; i<n; i++) {
					if( n % i == 0) { 
						sosu = true;
						break;
					}
				}
				if(sosu) {
					System.out.println("소수가 아닙니다.");
					break;
				}else {
					System.out.println("소수입니다.");
					break;
				}
			}else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
	}
	public void practice17() {
		System.out.print("숫자 : ");
		int n = sc.nextInt();
		int count = 0; // 소수출력.
		int cycle = 0; // 소수 개수 출력.

		 for(int i=2; i<=n; i++){
             for(int j=2; j<=i; j++){
                  if(i%j ==0) {
                    count ++;
                  }    
             } // for j
             if(count==1){
               System.out.print(i+" ");
               cycle++;
             }
             count=0;
         } //for i
		 System.out.println();
		 System.out.print("2부터"+n+"까지 소수의 개수는 "+cycle+"개입니다."); 
	}
	
	public void practice18() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int n = sc.nextInt();
		int gong = n/6;
		
		for(int i =1; i<=n; i++) {
			if(i%2 == 0 || i % 3==0) {
				System.out.print(i+ " "); //2와 3의 배수 출력.
			}
		}
		System.out.println();
		
		System.out.println("count : "+gong);

	}
	
	public void practice19() {
		System.out.print("정수입력 : ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) { //아래로가면서 좁아지는 삼각형.
			for(int j = n-1; j>=0; j--) {
				if(i<j) {
					System.out.print(' ');
				}else
					System.out.print('*');
				
			}
			System.out.println();
		}
	}
	public void practice20() {
		System.out.print("정수입력 : ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			for(int j =0; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println(); //밑변길이가n인 삼각형.
		}
		for(int i = n-1; i>0; i--) { // n-1개의 별부터 1개씩 줄어드는 삼각형.
			for(int j = 0; j<i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public void practice21() {
		System.out.print("정수입력 : ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) { // n번 반복 
			
			for(int j=0; j<n-i; j++){ // n번마다 공백 n-i번 반복 
                System.out.print(" ");
            }
			for(int j=0; j<2*i+1; j++) { // n번마다 별 홀수번 반복 
                System.out.print("*");
            }
			System.out.println(); // 한줄띄우기 
		}
		
	}
	public void practice22() {
		System.out.print("정수입력 : ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) { // 끝행 끝열에만 별찍힘. -> i, j = 0 or n-1일때만 
			System.out.println();
			for(int j = 0; j<n; j++) {
				if(i == 0 || i == n-1) { //양 끝열 *
					System.out.print('*');
				}else if(j == 0 || j == n-1) { //양 끝행 *
					System.out.print('*');
				}else //아니면 끝행 끝열아니면 공백 
					System.out.print(' ');
			}
		}
		
		
	}
	
}


