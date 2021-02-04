package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{

	
	public V40() {
		// TODO Auto-generated constructor stub
		setMaker("LG");
	}
	
	@Override
	public String printformation() {
		// TODO Auto-generated method stub
		String printinfo = 
		"V40는 "+getMaker()+"에서 만들어졌고 제원은 다음과 같다."+ "\n"
		+makeCall() + "\n"
		+takeCall()+ "\n"
		+picture()+ "\n"
		+charge()+ "\n"
		+touch() + "\n"
		+"블루투스 펜 탑재 여부 : "+bluetoothPen();
		 
		
		return printinfo;
	}
	


	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		boolean bluetoothPen = false;
		
		return bluetoothPen;
	}


	@Override
	public String charge() {
		// TODO Auto-generated method stub
		String charge = "고속충전, 고속 무전충전";
		return charge;
	}


	@Override
	public String touch() {
		// TODO Auto-generated method stub
		String touch = "정전식";
		return touch;
	}


	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		String makecall = "번호를 누르고 통화버튼을 누름";
		return makecall;
	}


	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		String takecall = "전화받기 버튼을 누름";
		return takecall;
	}


	@Override
	public String picture() {
		// TODO Auto-generated method stub
		String picture = "1200, 1600만 듀얼카메라";
		return picture;
	}

}
