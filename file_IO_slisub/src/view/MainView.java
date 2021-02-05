package view;

import java.util.Scanner;

import controller.Controller;

public class MainView {
	Scanner sc =new Scanner(System.in);
	Controller c = new Controller();
	public void mainView() {
		while(true) {
			System.out.println("==== �޴� ====");
			System.out.println("1. ���� ���� ");
			System.out.println("2. ���丮 ����");
			System.out.println("3. ���Ͽ� ���ڿ� ����");
			System.out.println("4. ���Ͽ� ����� ���ڿ� ����ϰ� ����");
			System.out.print("�޴� ���� : ");
			
			int cho = sc.nextInt();
			sc.nextLine();
			
			switch(cho) {
			case 1:
				createFile();
				break;
			case 2:
				createDir();
				break;
			case 3:
				c.inputStr();
				break;
			case 4:
				printFileStr();
				return;
			}
		}
	}
	
	
	public void createFile() {
		System.out.print("���ϸ��� �Է����ּ��� : ");
		if(c.createFile(sc.nextLine()) ) {
			System.out.println("���� ���� �Ϸ�");
		}else
			System.out.println("���ϻ����� �����߽��ϴ�.");
	} 
	
	public void createDir() {
		System.out.println("���丮���� �Է����ּ��� : ");
		if(c.createDir(sc.nextLine()) ) {
			System.out.println("���丮 ���� �Ϸ�");
		}else
			System.out.println("���丮 ������ �����߽��ϴ�.");
	}
	

	public void printFileStr() {
		System.out.println("=== ���Ͽ� �Է��� ���ڿ��� ����մϴ� ===");
		c.printFileStr();
	}
	
}
