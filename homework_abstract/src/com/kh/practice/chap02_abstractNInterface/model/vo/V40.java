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
		"V40�� "+getMaker()+"���� ��������� ������ ������ ����."+ "\n"
		+makeCall() + "\n"
		+takeCall()+ "\n"
		+picture()+ "\n"
		+charge()+ "\n"
		+touch() + "\n"
		+"������� �� ž�� ���� : "+bluetoothPen();
		 
		
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
		String charge = "�������, ��� ��������";
		return charge;
	}


	@Override
	public String touch() {
		// TODO Auto-generated method stub
		String touch = "������";
		return touch;
	}


	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		String makecall = "��ȣ�� ������ ��ȭ��ư�� ����";
		return makecall;
	}


	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		String takecall = "��ȭ�ޱ� ��ư�� ����";
		return takecall;
	}


	@Override
	public String picture() {
		// TODO Auto-generated method stub
		String picture = "1200, 1600�� ���ī�޶�";
		return picture;
	}

}
