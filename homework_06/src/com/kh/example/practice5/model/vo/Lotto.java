package com.kh.example.practice5.model.vo;

public class Lotto {
	private int[] lotto; // 초기화 블럭으로 중복되지 않는 1~45까지의 난수6개로 초기화.
	{
		 lotto =  new int[6];
		 
		 for(int i = 0; i<6; i++) {
			 lotto[i] = (int)(Math.random()*45+1);
			 for(int j = 0; j<i; j++) {
				 if(lotto[i] == lotto[j]) {
					 i--;
					 break;
				 }
			 }
		 }
	 
	}
	
	public Lotto() {
		// TODO Auto-generated constructor stub
	}
	
	public void information() {
		// 반복문이용해서 배열 출력.
		for(int i =0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
	
}
