package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	

	public GalaxyNote9() {
		// TODO Auto-generated constructor stub
		setMaker("�Ｚ");
	}
	

	@Override
	public String printformation() {
		// TODO Auto-generated method stub
		String printinfo = 
		"������ ��Ʈ9�� "+getMaker()+"���� ��������� ������ ������ ����."+ "\n"
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
		boolean bluetoothPen = true;
		
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
		String touch = "������, ������ ����";
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
		String picture = "1300�� ���ī�޶�";
		return picture;
	}

}
