package com.kh.practice.array.ArrayPractice;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Controller {
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i =0; i<10; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i =9; i>=0; i--) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	public void practice4() {
		String[] fru = {"사과", "귤","포도", "복숭아"};
		System.out.print(fru[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		
		int count= 0;
		System.out.print("문자 : ");
		char voc =sc.next().charAt(0);
		
		char[] str1 = new char[str.length()];
		
		for(int i = 0; i<str1.length; i++) {
			str1[i] = str.charAt(i); // 문자열을 배열에 각각 저장.
		}
		
		System.out.print(str+ "에 "+voc+"가 존재하는 위치(인덱스) : ");
		for(int i = 0; i<str1.length; i++) { // 중복된 문자가 몇개 있는지 확인하는 메소드 
			if(str1[i] == voc) { // 0~str1의 길이에서 voc와 중복된게 있으면 count를 1증가
				count++;
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		System.out.print(voc+"개수 : "+ count);
		
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		char[] day = {'월','화', '수','목','금','토','일'};
		int cho = sc.nextInt();
		
		if(cho>=0 && cho <=6) {
			System.out.println(day[cho]+"요일");
		}else
			System.out.println("잘못 입력하셨습니다.");
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] ary = new int[input];
		int sum =0;
		
		for(int i = 0; i<ary.length; i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
			ary[i] = sc.nextInt();
		}
		for(int i = 0; i<ary.length; i++) { //배열 출력 
		System.out.print(ary[i]+" ");
		}
		System.out.println();
		
		for(int i = 0; i<ary.length; i++) { // sum에 누적 
			sum += ary[i];
		}
		
		System.out.print("총 점 : " + sum);
	
		
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n = sc.nextInt();
		int[] num = new int[n]; // 1~n까지 길이의 배열 생성 
		int[] num2 = new int[n/2]; // n/2길이의 배열 생성
		int c = 0;
		
		if(n%2 != 0 && n>=3) {
			for(int i = 0; i<(n/2+1); i++) { // 1~중간까지 오름차순.으로 정렬 
				num[i] = i+1;
			}
			
			for(int i = 0; i<num2.length; i++) { 
				// 중간부터 n까지 내림차순으로 정렬된 새로운 배열생성.
				num2[i] = n/2 -i;
			}
			System.arraycopy(num2,0, num, n/2+1, num2.length);
			// num 중간이후로 비어있는 값에 내림차순으로 정렬된 새로운 배열을 복사.
			
		}else
			System.out.print("다시 입력하세요.");
		
		for(int i = 0; i<num.length; i++) {
			System.out.print(num[i]+" "); // 출력 
		}
	} //8
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String input = sc.next();
		String[] menu = {"양념", "불닭", "간장" };
		
		if(input.equals(menu[0]) ) {
			System.out.print(menu[0]+"치킨 배달가능");
			
		}else if(input.equals(menu[1]) ){
			System.out.print(menu[1]+"치킨 배달가능");
			
		}else if(input.equals(menu[2]) ){
			System.out.print(menu[2]+"치킨 배달가능");	
		}else {
			System.out.print(input+"치킨은 없는 메뉴입니다.");
		}
		
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(- 포함) : ");
		String n = sc.nextLine();
		char[] jumin = new char[14];
		
		for(int i = 0; i<jumin.length; i++) {
			jumin[i] = n.charAt(i); // 배열에 한글자씩 주민번호 저장
		}
		
		char[] jumin2 = new char[14];
		System.arraycopy(jumin, 0, jumin2, 0, jumin.length); // 원본 jumin배열 변경없이
		
		char[] star = new char[6]; // 주민번호 뒷자리 가릴 * 배열 생성.
		for(int i = 0; i<6; i++) {
			star[i] = '*';
 		}
		
		System.arraycopy(star, 0 , jumin2 , 8 , star.length);
		// 성별자리 이후를 *로 대치
		
		for(int i = 0; i<jumin2.length; i++) {
			System.out.print(jumin2[i]); // 출력 
		}
		
		
	}
	public void practice11() {
		int[] num = new int[10]; // 길이 10 배열 생성 
		for(int i = 0; i<num.length; i++) {
			num[i] = (int) (Math.random()*10+1); //1~10 난수 배열에 1번부터 저장 
		}
		
		for(int i = 0; i<num.length; i++) {
			System.out.print(num[i]+" "); // 배열 출력 
		}
	}
	public void practice12() {
		int[] num = new int[10];
		for(int i = 0; i<num.length; i++) {
			num[i] = (int) (Math.random()*10+1);
		}
		Arrays.sort(num); // 배열 오름차순 정렬 
		
		
		for(int i = 0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("최대값 : "+num[9]); 
		System.out.print("최소값 : "+num[0]);
	}
	public void practice13() {
		
		int[] num = new int[10];
		
		for(int i = 0; i<num.length; i++) {
			num[i] = (int) (Math.random()*10+1); //10개 랜덤 숫자 생성.
			for(int j =0; j<i; j++) { 
				// 지금 배열 값(i)과 그 전 배열 (1~i)까지 비교 
				if(num[i]==num[j]) { // 배열 값이 같다면 
					i--; 	// i를 1감소 시켜서 다시 랜덤값 생성 
					break; 
				}
			}
		}	
		for(int i = 0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
	public void practice14() {
		
		int[] num = new int[6];
			
		for(int i = 0; i<num.length; i++) {
			num[i] = (int) (Math.random()*45+1); //10개 랜덤 숫자 생성.
			for(int j =0; j<i; j++) { 
				// 지금 배열 값(i)과 그 전 배열 (1~i)까지 비교 
				if(num[i]==num[j]) { // 배열 값이 같다면 
					i--; 	// i를 1감소 시켜서 다시 랜덤값 생성 
					break; 
				}
			}
		}
		Arrays.sort(num); // 오름차순 정렬 
		for(int i = 0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
	public void practice15() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.next();
		int count = 0;
		
		char[] str1 = new char[str.length()];
		
		for(int i = 0; i<str1.length; i++) {
			str1[i] = str.charAt(i); // 문자열을 배열에 각각 저장.
		}
		
		for(int i = 0; i<str1.length; i++) { // 중복된 문자가 몇개 있는지 확인하는 메소드 
			for(int j =0; j<i; j++) {
				if(str1[i] == str1[j]) { // 중복이면 count 1증가
					count++;
				}
			}
		}
		
		
		System.out.print("문자열에 있는 문자 : ");
		
		char[] tmp = new char[1];
		for(int i =0; i<str1.length; i++) {
			
			for(int j =0; j<str1.length; j++) {
				if(str1[i] ==str1[j]) {
					tmp[0] =str1[i];
					str1[j] = 0;
					str1[i] = tmp[0];
				}
			}
			System.out.print(str1[i]);
		} 

		System.out.println();
		System.out.print("문자 개수 : "+ (str.length()-count) );
	}
	
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		String copy[]; // 배열 담을거 미리 선언.
		String tmp;  // 임시값  선언.
		String yOrN=""; // 더 실행할지 안할지 결정하기 위한 변수선언 초기화.
		
		List<String> plusSize = new ArrayList<String>();
		// String 타입의 List 생성.
		// while문이 반복되며 몇개나 더 저장할지모르니까 배열보다 List 생성.
		
		System.out.print("배열의 크기를 입력하세요 : "); //배열크기입력받기
		int arraySize = sc.nextInt();
		String [] array = new String[arraySize];
	
		
		for(int i = 0; i< array.length; i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			array[i] = sc.next();
			 // 입력 받은 값 array[]에 저장.
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
			yOrN = sc.next();
			if(yOrN.equals("N")|| yOrN.equals("n")) { // n-> while loop end
				break;
			}
			System.out.print("더 입력하고 싶은 문자 개수:");
			int num = sc.nextInt();
			
			for(int i = 0; i<num; i++) {
				System.out.print(arraySize+1+"번째 문자열 : "); // 첫번째 문자열은 무조건 앞에서 입력했기때문에 +1부터 시작.
				tmp = sc.next(); // 입력값 tmp에 저장.
				plusSize.add(tmp);  //List plusSize에 tmp 값 0번째부터 추가.
			}
		}
		
		copy = new String[plusSize.size()]; // copy에 while문으로 반복된 횟수 저장.
		for( int i = 0; i<copy.length; i++) { // while문이 반복된 횟수 만큼 실행.
			copy[i] = plusSize.get(i);  // plusSize의 i번째 값을 가져와서 copy[i]에 저장.
		}
		
		for(int i = 0; i<array.length; i++) { // 추가로 입력하기전 array배열의 값을 출력.
			System.out.print( array[i] );
		}
		
		for(int i = 0; i<plusSize.size(); i++) { //while 반복이 추가된 개수만큼 반복 
			System.out.print(copy[i]); // plusSize의 i 번째 값을 출력.
		}
	}		
		
		
}

	

