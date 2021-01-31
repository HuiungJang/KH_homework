package com.kh.practice.dimension.DimensionPractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DimensionController {
	public void practice1() {
		String[][] s = new String[3][3];
		
		for(int i =0; i<s.length;i++) {
			for(int j =0; j<s[i].length; j++) {
				s[i][j] = i+","+j;
				System.out.print("("+s[i][j]+")");
			}
			System.out.println();
		}
		
	}
	
	
	
	public void practice2() {
		int count =0;
		
		int[][] n = new int[4][4];
		for(int i =0; i<n.length;i++) {
			for(int j =0; j<n[i].length; j++) {
				n[i][j] = count++ +1;
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	public void practice3() {
		int count =16;
		
		int[][] n = new int[4][4];
		for(int i =0; i<n.length;i++) {
			for(int j =0; j<n[i].length; j++) {
				n[i][j] = count--;
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void practice4() {
		int[][] n = new int[4][4];
		
		for(int i =0; i<n.length-1;i++) {
			for(int j =0; j<n[i].length-1; j++) {
				n[i][j] = (int)(Math.random()*10+1);
				// 3x3에 랜덤 숫자 배정 1~10

				n[3][0] = n[0][0]+n[1][0]+n[2][0];
				n[3][1] = n[0][1]+n[1][1]+n[2][1];
				n[3][2] = n[0][2]+n[1][2]+n[2][2];
				//행 합
				
				n[0][3] = n[0][0]+n[0][1]+n[0][2];
				n[1][3] = n[1][0]+n[1][1]+n[1][2];
				n[2][3] = n[2][0]+n[2][1]+n[2][2];
				// 열 합 
				
				n[3][3] = n[3][0]+n[3][1]+n[3][2]
						+n[0][3]+n[1][3]+n[2][3];
				//총 합 
			}
		}
			
		for(int i =0; i<n.length;i++) {
			for(int j =0; j<n[i].length; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		boolean repeat = true; // 반복문컨트롤.
		
		while(repeat) {
			System.out.print("행 크기 : ");
			int heng = sc.nextInt();
			
			System.out.print("열 크기 : ");
			int yeol = sc.nextInt();
		
			
			int[][] n =new int[heng][yeol];
			if(heng<=10 && heng>=1 && yeol>=1 && yeol<=10) {
				
				for(int i =0; i<n.length;i++) {
					for(int j =0; j<n[i].length; j++) {
						n[i][j]=(int)(Math.random()*25)+66;
						System.out.print( (char)n[i][j] );
					}
					System.out.println();
				}

				repeat = false; // 반복문 종료.
			}else {
				System.out.print("반드시 1~10 사이의 정수를 입력해야합니다.");
				continue; //1~10 아니면 처음부터 다시.
				}//else
			
		}//while end
	}
	
	public void practice6() {
		String[][] s =new String[][] {{"이","까","왔","앞","힘"},
										{"차","지","습","으","냅"},
										{"원","열","니","로","시"},
										{"배","심","다","좀","다"},
										{"열","히","!","더","!!"}};
		
		for(int i =0; i<s.length; i++) {
			for( int j=0; j<s[i].length; j++) {
				System.out.print(s[j][i]);
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("행의 크기 : ");
		int in = sc.nextInt();
		char[][] ary = new char[in][];
		int count =0; // a를 증가시키기 위한 변수.
		
		for(int i = 0; i<ary.length; i++) { // 행크기만큼 열크기 생성
			System.out.print(i+"행의 열 크기 : ");
			int yeol = sc.nextInt();
			ary[i] = new char[yeol];	
		}
		
		for(int i =0; i<ary.length; i++) { // 배열에 입력.
			for( int j=0; j<ary[i].length; j++) {
				ary[i][j] = (char)('a'+count++); // a부터 1씩 증가시키면서 대입.(유니코드)
			}
		}
		
		for(int i =0; i<ary.length; i++) { // 배열 출력 
			for( int j=0; j<ary[i].length; j++) {
				System.out.print(ary[i][j]);
			}
			System.out.println();
		}

		
	}
	
	public void practice8() {
		String[] stu1 = {"강건강", "남나나", "도대담", "류라라","문미미", "박보배"}; // 3행2열이니까 2개로 나눔.
		String[] stu2 =	{"송성실", "윤예의", "진재주",  "차천축", "피풍표", "홍하하"};
		
		int count = 0; // 1분단 1명씩 넘어가야하니까.
		int count2 = 0; // 2분단 1명씩 넘어가야하니끼.
		
		String[][] stu1Conv = new String[3][2]; // 1분단 저장.
		String[][] stu2Conv = new String[3][2]; // 2분단 저장.
		
		System.out.println("===1분단===");
		for(int i = 0; i<stu1Conv.length; i++) {
			for(int j = 0; j<stu1Conv[i].length; j++) {
				stu1Conv[i][j] = stu1[count++];
				System.out.print(stu1Conv[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("===2분단===");
		for(int i = 0; i<stu2Conv.length; i++) {
			for(int j = 0; j<stu2Conv[i].length; j++) {
				stu2Conv[i][j] = stu2[count2++];
				System.out.print(stu2Conv[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[] stu1 = {"강건강", "남나나", "도대담", "류라라","문미미", "박보배"};
		String[] stu2 =	{"송성실", "윤예의", "진재주",  "차천축", "피풍표", "홍하하"};
		int count = 0;
		int count2 = 0;
		
		String[][] stu1Conv = new String[3][2];
		String[][] stu2Conv = new String[3][2];
		
		System.out.println("===1분단===");
		for(int i = 0; i<stu1Conv.length; i++) {
			for(int j = 0; j<stu1Conv[i].length; j++) {
				stu1Conv[i][j] = stu1[count++];
				System.out.print(stu1Conv[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("===2분단===");
		for(int i = 0; i<stu2Conv.length; i++) {
			for(int j = 0; j<stu2Conv[i].length; j++) {
				stu2Conv[i][j] = stu2[count2++];
				System.out.print(stu2Conv[i][j]+" ");
			}
			System.out.println();
		} 
		
		
		
		System.out.println("=================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String searchName = sc.next();
		
		search1:
		for(int i = 0; i<stu1Conv.length; i++) {
			for(int j = 0; j<stu1Conv[i].length; j++) {	
				if( searchName.equals(stu1Conv[i][j]) ) {
					System.out.print("검색하신"+searchName+"학생은 1분단 ");
					if( i ==0 && j==0) {
						System.out.print("첫 번째 줄 왼쪽에 있습니다.");
						
					}else if( i ==0 && j==1) {
						System.out.print("첫 번째 줄 오른쪽에 있습니다.");
						
					}else if( i ==1 && j==0) {
						System.out.print("두 번째 줄 왼쪽에 있습니다.");
						
					}else if( i ==1 && j==1) {
						System.out.print("두 번째 줄 오른쪽에 있습니다.");
						
					}else if( i ==2 && j==0) {
						System.out.print("세 번째 줄 왼쪽에 있습니다.");
					}else if( i ==2 && j==1) {
						System.out.print("세 번째 줄 오른쪽에 있습니다.");
					}else {
						break search1; // 여기 없으면 두번째
					}
					
					/*
					 i = 0 ->첫번째줄 1-> 두번째 2-> 세번째
					j = 0 -> 왼쪽 j=1 -> 오른쪽 
					 */	
				}
			}
		}
		
		
		for(int i = 0; i<stu2Conv.length; i++) {
			for(int j = 0; j<stu2Conv[i].length; j++) {	
				if( searchName.equals(stu2Conv[i][j]) ) {
					System.out.print("검색하신"+searchName+"학생은 2분단 ");
					if( i ==0 && j==0) {
						System.out.print("첫 번째 줄 왼쪽에 있습니다.");
						
					}else if( i ==0 && j==1) {
						System.out.print("첫 번째 줄 오른쪽에 있습니다.");
						
					}else if( i ==1 && j==0) {
						System.out.print("두 번째 줄 왼쪽에 있습니다.");
						
					}else if( i ==1 && j==1) {
						System.out.print("두 번째 줄 오른쪽에 있습니다.");
						
					}else if( i ==2 && j==0) {
						System.out.print("세 번째 줄 왼쪽에 있습니다.");
					}else if( i ==2 && j==1) {
						System.out.print("세 번째 줄 오른쪽에 있습니다.");
					}
					
					/*
					 i = 0 ->첫번째줄 1-> 두번째 2-> 세번째
					j = 0 -> 왼쪽 j=1 -> 오른쪽 
					 */	
				}
			}
		}
		
		
	}



}
