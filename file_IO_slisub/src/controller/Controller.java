package controller;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Controller {
	String fName = new String();
	
	public boolean createFile(String name) {
		File f = new File(name);
		fName = f.getName();
		
		boolean create = false;
		
		try {
			if(f.createNewFile()) {
				create = true;
			}
		}catch(IOException e ) {
			e.printStackTrace();
		}
		
		return create;
	}
	
	public boolean createDir(String name) {
		boolean create = false;
		
		String path = Controller.class
				.getResource("/").getPath();
		
		path = path.substring(0,path.lastIndexOf("bin"));
		
		File dir = new File(path+"/"+name);
		
		
		if(dir.mkdir()) {
			create = true;
		}
		
		
		return create;
	}
	public void inputStr() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세요 :");
		try(FileWriter w = new FileWriter(fName) ) {
			w.write(sc.nextLine());
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printFileStr() {
		try(FileReader fr = new FileReader(fName)){
			int data = -1;
			StringBuffer sb =new StringBuffer();
			
			while((data = fr.read()) != -1) {
				sb.append((char)data);
			}
			System.out.println(sb);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}

	
}
