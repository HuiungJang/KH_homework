package com.kh.practice.list.library.view;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookController bc = new BookController();

    public void bookMenu(){
        System.out.println("== Welcome KH Library ==");

        while(true){
            System.out.println("***** 메인 메뉴 *****");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서명 오름차순 정렬");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 선택 : ");
            int cho = sc.nextInt();
            sc.nextLine();

            switch(cho){
                case 1:
                    insertBook();
                    break;
                case 2:
                    selectList();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    ascBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.다시 입력해주세요.");
                    break;
            }

        }
    }

    public void insertBook(){
        System.out.println("도서명을 입력해주세요.");
        String title = sc.nextLine();
        System.out.println("저자명을 입력해주세요.");
        String author = sc.nextLine();
        System.out.println("장르를 입력해주세요.(해당 장르의 번호를 입력해주세요)");
        System.out.print("(1.인문 / 2.자연과학 / 3.의료 / 4.기타)");
        int tmp = sc.nextInt();
        sc.nextLine();
        String category= "";
        if(tmp == 1){
            category ="인문";
        }else if(tmp == 2){
            category ="자연과학";
        }else if(tmp == 3){
            category ="의료";
        }else if(tmp == 4){
            category ="기타";
        }

        System.out.println("가격을 입력해주세요.");
        int price = sc.nextInt();
        sc.nextLine();
        Book b = new Book(title,author,category,price);
        bc.insertBook(b);
    }

    public void selectList(){
        ArrayList<Book> bookList = new ArrayList<>( bc.selectList());

        if(bookList.isEmpty()){
            System.out.println("존재하는 도서가 없습니다.");
        }else {
            for(int i =0; i<bookList.size(); i++) {
                System.out.println( bookList.get(i));
            }
        }

    }

    public void searchBook(){

    }

    public void deleteBook(){

    }

    public void ascBook(){

    }

}
