package com.kh.practice.file.view;

import com.kh.practice.file.controller.FileController;

import java.util.Scanner;

public class FileMenu {
    private Scanner sc = new Scanner(System.in);
    private FileController fc = new FileController();

    public void mainMenu(){
        while(true) {
            System.out.println("***** My Note *****");
            System.out.println("1.노트 새로 만들기");
            System.out.println("2.노트 열기");
            System.out.println("3.노트 열어서 수정하기");
            System.out.println("9.끝내기");
            System.out.print("메뉴 번호 : ");
            int cho = sc.nextInt();
            sc.nextLine();

            switch (cho) {
                case 1:
                    fileSave();
                    break;
                case 2:
                    fileOpen();
                    break;
                case 3:
                    fileEdit();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                    break;
            }
        }

    }

    public void fileSave(){

        StringBuilder sb = new StringBuilder();
        String txt = "";

        do{
            System.out.println("파일에 저장할 내용을 입력하세요. \n" +
                    " ex끝it 이라고 입력하면 종료됩니다.");
            System.out.print("내용 : ");
            txt = sc.nextLine();

            if (txt !="ex끝it" ) {
                sb.append(txt+"\n");
            }

        }while(! txt.equals("ex끝it"));

        System.out.print ("저장할 파일명을 입력해주세요 (ex. myFile.txt) : ");
        String file = sc.nextLine();

        if(fc.checkName(file)){
            System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (Y/N)");
            char cho = sc.nextLine().toUpperCase().charAt(0);

            if(cho == 'Y'){
                fc.fileSave(file,sb);
            }else
                return;
        }else
            fc.fileSave(file,sb);



    }

    public void fileOpen(){
        System.out.println("열 파일명 : ");
        String file = sc.nextLine();

        if(fc.checkName(file)){
            System.out.println(fc.fileOpen(file));
        }else
            System.out.println("없는 파일입니다.");
    }


    public void fileEdit(){
        StringBuilder sb = new StringBuilder();
        String txt = "";

        System.out.println("수정할 파일명 : ");
        String file = sc.nextLine();

        if(fc.checkName(file)) {
            do {
                System.out.println("파일에 저장할 내용을 입력하세요. \n" +
                        " ex끝it 이라고 입력하면 종료됩니다.");
                System.out.print("내용 : ");
                txt = sc.nextLine();

                if (txt != "ex끝it") {
                    sb.append(txt + "\n");
                }

            } while (!txt.equals("ex끝it"));

            fc.fileEdit(file,sb);

        }else
            System.out.println("없는 파일입니다.");


    }


}
