package com.kh.practice.book.view;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

import java.util.Calendar;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookController bc = new BookController();
    private Book[]  bArr;

    public BookMenu() {
        bc.makeFile();
        bArr = bc.fileRead();
    }

    public void mainMenu(){

        while(true){
            System.out.println("1. 도서 추가 저장");
            System.out.println("2. 저장 도서 출력");
            System.out.println("9. 프로그램 끝내기");
            System.out.print("메뉴 출력 : ");
            int cho = sc.nextInt();
            sc.nextLine();

            switch (cho){
                case 1:
                    fileSave();
                    break;
                case 2:
                    fileRead();
                    break;
                case 9:
                    return;
                default :
                    System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
                    break;
            }
        }

    }

    public void fileSave(){
        System.out.print("도서명 : ");
        String title = sc.nextLine();

        System.out.print("저자명 : ");
        String author = sc.nextLine();

        System.out.print("도서가격 : ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.print("출판날짜 (yyyy-mm-dd) : ");
        String[] dateSplit = sc.nextLine().split("-");
        // - 기준으로 쪼개기

        Calendar date = Calendar.getInstance();
        // Canlendar클래스는 생성못하니까 가져오기.

        int[] time = {Integer.parseInt(dateSplit[0]),
                Integer.parseInt(dateSplit[1]),
                Integer.parseInt(dateSplit[2]) };
        // 쪼개 놓은거 int로 변환하기.

        date.set(time[0],time[1],time[2]);
        // Calendar클래스에 넣기

        System.out.print("할인률 : ");
        double discount = sc.nextDouble();
        sc.nextLine();

        Book b = new Book(title,author,price,date,discount);
        // Book객체에 넣기
        for(int i =0; i< bArr.length; i++){
            // 객체배열에 저장하기
            if(bArr[i] == null){
                bArr[i] = b;
                break;
            }
        }

        bc.fileSave(bArr);


    }

    public void fileRead(){

        for(int i = 0; i<bc.fileRead().length; i++){
            // 객체배열 출력하기
           if(bc.fileRead()[i] != null){
               // 반환받은 객체배열이 빈값이 아니면 출력
               System.out.println(bc.fileRead()[i]);
           }
        }

    }

}
