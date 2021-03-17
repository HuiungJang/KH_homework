package com.board.view;

import com.board.controller.BoardController;
import com.board.model.vo.Board;
import com.board.model.vo.Member;

import java.util.List;
import java.util.Scanner;

public class BoardView {
    private Scanner sc = new Scanner(System.in);
    private BoardController bc;

    public void mainView(BoardController controller){
        bc=controller;
        while(true) {
            System.out.println("메인메뉴");
            System.out.println("1.회원관리");
            System.out.println("2.게시판관리");
            System.out.println("3.프로그램 종료");
            int cho = sc.nextInt();
            sc.nextLine();
            switch (cho) {
                case 1:
                    memberSubMenu();
                    break;
                case 2:
                    boardSubMenu();
                    break;
                case 3:
                    return;
            }
        }
    }

    public void memberSubMenu(){
        System.out.println("회원관리 서브메뉴");
        System.out.println("1. 전체회원조회");
        System.out.println("2. 회원 아이디로 조회");
        System.out.println("3. 회원 이름으로 조회");
        System.out.println("4. 회원가입");
        System.out.println("5. 회원정보 수정(주소,전화번호, 이메일)");
        System.out.println("6. 회원탈퇴");
        System.out.println("7. 메인메뉴로");
        int cho = sc.nextInt();
        sc.nextLine();
        switch (cho) {
            case 1:
                bc.searchAllMember();
                break;
            case 2:
                searchMemberId();
                break;
            case 3:
                searchMemberName();
                break;
            case 4:
                enrollMember();
                break;
            case 5:
                bc.reviseMember();
                break;
            case 6:
                deleteMember();
                break;
            case 7:
                return;
        }
    }
    public void searchMemberId(){
        System.out.println("검색할 아이디 : ");
        bc.searchMemberId(sc.nextLine());
    }

    public void searchMemberName(){
        System.out.println("검색할 이름 : ");
        bc.searchMemberName(sc.nextLine());
    }

    public void enrollMember(){
        System.out.println("아이디 : ");
        String id = sc.nextLine();

        System.out.println("비밀번호 : ");
        String pwd = sc.nextLine();

        System.out.println("이름 : ");
        String name = sc.nextLine();

        System.out.println("이메일 : ");
        String email = sc.nextLine();

        System.out.println("주소 : ");
        String address = sc.nextLine();

        System.out.println("전화번호 : ");
        String phone = sc.nextLine();

        Member m = new Member(id,pwd,name,email,address,phone);
        bc.enrollMember(m);
    }

    public void deleteMember(){
        System.out.println("삭제할 회원의 이름 : ");
        bc.deleteMember(sc.nextLine());
    }

    public String reviseMember(){
        System.out.println("수정할 회원명:");
        String name = sc.nextLine();
        return name;
    }

    public int reviseMemberInfo(){
        System.out.println("1. 주소 : ");
        System.out.println("2. 전화번호 : ");
        System.out.println("3. 이메일 : ");

        System.out.println("어떤거 수정?");

        return  sc.nextInt();
    }

    public String whatAddress(){
        System.out.println("주소 어떤걸로? : ");
        String reviseAddress = sc.nextLine();

        return reviseAddress;
    }
    public String whatPhone(){
        System.out.println("전화번호 어떤걸로? : ");
        String revisePhone = sc.nextLine();

        return revisePhone;
    }
    public String whatEmail(){
        System.out.println("이메일 어떤걸로? : ");
        String reviseEmail = sc.nextLine();

        return reviseEmail;
    }

    public void boardSubMenu(){
        System.out.println("게시판 서브메뉴");
        System.out.println("1. 게시판 전체 검색");
        System.out.println("2. 게시물 등록");
        System.out.println("3. 제목으로 검색");
        System.out.println("4. 게시물 수정(제목,내용)");
        System.out.println("5. 게시물 삭제");
        System.out.println("6. 메인메뉴로");
        int cho = sc.nextInt();
        sc.nextLine();

        switch (cho) {
            case 1:
                bc.printAllboard();
                break;
            case 2:
                writePost();
                break;
            case 3:
                boardTitleSearch();
                break;
            case 4:
                revisePost();
                break;
            case 5:
                break;
            case 6:
                return;
        }
    }

    public void writePost(){
        System.out.println("공지? 일반? 비밀?");
        String div = sc.nextLine();

        System.out.println("제목 ?");
        String title = sc.nextLine();

        System.out.println("내용?");
        String content = sc.nextLine();

        Board b = new Board(div,title,content);
        bc.writePost(b);
    }

    public void boardTitleSearch(){
        System.out.println("찾을 제목 ?");
        String title = sc.nextLine();

        bc.boardTitleSearch(title);
    }

    public int revisePost(){
        System.out.println("수정할 게시글 번호?");
        int postNum = sc.nextInt();
        sc.nextLine();
        return postNum;
    }

    public int whatRevise(){
        System.out.println("1. 제목");
        System.out.println("2. 내용");
        System.out.println("어떤거 수정? ");
        int cho = sc.nextInt();
        sc.nextLine();
        return cho;
    }

    public String whatReviseTitle(){
        System.out.println("제목 어떤걸로?");
        return sc.nextLine();
    }

    public String whatReviseContent(){
        System.out.println("내용 어떤걸로?");
        return sc.nextLine();
    }


    public void memberPrintList(List<Member> list){
        for(Member m : list){
            System.out.println(m);
        }
    }

    public void boardPrintList(List<Board> list){
        for(Board b: list){
            System.out.println(b);
        }
    }

    public void memberPrintInt(String msg){
        System.out.println(msg);
    }

    public void errorMsg(){
        System.out.println("잘못입력했습니다. 다시 입력해주세요");
    }
}
