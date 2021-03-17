package com.board.controller;

import com.board.model.service.BoardService;
import com.board.model.vo.Board;
import com.board.model.vo.Member;
import com.board.view.BoardView;

import java.util.List;

public class BoardController {
    private BoardView view= new BoardView();
    private BoardService service;

    public void mainView(){
        view.mainView(this);
    }

    public void searchAllMember(){
       List<Member> result = service.searchAllMember();
       view.memberPrintList(result);
    }

    public void searchMemberId(String id){
        List<Member> result = service.searchMemberId(id);
        view.memberPrintList(result);
    }

    public void searchMemberName(String name){
        List<Member> result = service.searchMemberName(name);
        view.memberPrintList(result);
    }

    public void enrollMember(Member m){
        int result = service.enrollMember(m);
        view.memberPrintInt(result>0? "성공" : "실패");
    }

    public void deleteMember(String name){
        int result = service.deleteMember(name);
        view.memberPrintInt(result>0? "성공" : "실패");
    }

    public void reviseMember() {
        String name = view.reviseMember();
        int cho = view.reviseMemberInfo();
        int result = 0;

        if (cho == 1) {
            String whatAddress = view.whatAddress();
            result = service.whatAddress(name, whatAddress);
            view.memberPrintInt(result > 0 ? "완료" : "실패");

        } else if (cho == 2) {
            String whatPhone = view.whatPhone();
            result = service.whatPhone(name, whatPhone);
            view.memberPrintInt(result > 0 ? "완료" : "실패");

        } else if (cho == 3) {
            String whatEmail = view.whatEmail();
            result = service.whatEmail(name, whatEmail);
            view.memberPrintInt(result > 0 ? "완료" : "실패");
        }else view.errorMsg();

    }

    public void printAllboard(){
        List<Board> b = service.printAllboard();
        view.boardPrintList(b);
    }

    public void writePost(Board b){
        int result = service.writePost(b);
        view.memberPrintInt(result>0? "성공" : "실패");
    }


    public void boardTitleSearch(String title){
        List<Board> list = service.boardTitleSearch(title);
        view.boardPrintList(list);
    }

    public void revisePost(){
        int postNum = view.revisePost();
        int cho = view.whatRevise();
        int result = 0;

        if (cho == 1) {
            String whatReviseTitle = view.whatReviseTitle();
            result = service.whatReviseTitle(postNum, whatReviseTitle);
            view.memberPrintInt(result > 0 ? "완료" : "실패");

        } else if (cho == 2) {
            String whatReviseContent = view.whatReviseContent();
            result = service.whatReviseContent(postNum, whatReviseContent);
            view.memberPrintInt(result > 0 ? "완료" : "실패");

        }else view.errorMsg();

    }


}
