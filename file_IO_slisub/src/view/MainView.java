package view;

import java.util.Scanner;

import controller.Controller;

public class MainView {
	Scanner sc =new Scanner(System.in);
	Controller c = new Controller();
	public void mainView() {
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 파일 생성 ");
			System.out.println("2. 디렉토리 생성");
			System.out.println("3. 파일에 문자열 저장");
			System.out.println("4. 파일에 저장된 문자열 출력하고 종료");
			System.out.print("메뉴 선택 : ");
			
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
		System.out.print("파일명을 입력해주세요 : ");
		if(c.createFile(sc.nextLine()) ) {
			System.out.println("파일 생성 완료");
		}else
			System.out.println("파일생성이 실패했습니다.");
	} 
	
	public void createDir() {
		System.out.println("디렉토리명을 입력해주세요 : ");
		if(c.createDir(sc.nextLine()) ) {
			System.out.println("디렉토리 생성 완료");
		}else
			System.out.println("디렉토리 생성에 실패했습니다.");
	}
	

	public void printFileStr() {
		System.out.println("=== 파일에 입력한 문자열을 출력합니다 ===");
		c.printFileStr();
	}
	
}
