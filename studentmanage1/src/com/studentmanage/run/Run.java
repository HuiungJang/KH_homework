package com.studentmanage.run;

import java.io.IOException;

import com.studentmanage.controller.StudentController;

public class Run {
	//StudentController.mainMenu()-> MainView.mainMenu()
	public static void main(String[] args) throws IOException{
		
		new StudentController().mainMenu();
		
	}

}
