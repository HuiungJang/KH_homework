package com.board.model.service;

import com.board.model.common.JDBCTemplate;
import com.board.model.dao.BoardDao;
import com.board.model.vo.Board;
import com.board.model.vo.Member;

import java.sql.Connection;
import java.util.List;

public class BoardService {
    private BoardDao dao = new BoardDao();

    public List<Member> searchAllMember(){
        Connection conn = JDBCTemplate.getConnection();
        return dao.searchAllMember(conn);
    }

    public List<Member> searchMemberId(String id){
        Connection conn = JDBCTemplate.getConnection();
        return dao.searchMemberId(conn,id);
    }

    public List<Member> searchMemberName(String name){
        Connection conn = JDBCTemplate.getConnection();
        return dao.searchMemberName(conn,name);
    }

    public int enrollMember(Member m){
        Connection conn = JDBCTemplate.getConnection();
        return dao.enrollMember(conn,m);
    }

    public int deleteMember(String name){
        Connection conn = JDBCTemplate.getConnection();
        return dao.deleteMember(conn,name);
    }

    public int whatAddress(String name,String whatAddress){
        Connection conn = JDBCTemplate.getConnection();
        return dao.whatAddress(conn,name,whatAddress);
    }
    public int whatPhone(String name,String whatPhone){
        Connection conn = JDBCTemplate.getConnection();
        return dao.whatPhone(conn,name,whatPhone);
    }

    public int whatEmail(String name,String whatEmail){
        Connection conn = JDBCTemplate.getConnection();
        return dao.whatEmail(conn,name,whatEmail);
    }

    public List<Board> printAllboard(){
        Connection conn = JDBCTemplate.getConnection();
        return dao.printAllboard(conn);
    }

    public int writePost(Board b){
        Connection conn = JDBCTemplate.getConnection();
        return dao.writePost(conn,b);
    }

    public List<Board> boardTitleSearch(String title){
        Connection conn = JDBCTemplate.getConnection();
        return dao.boardTitleSearch(conn,title);
    }

    public int whatReviseTitle(int postNum,String whatReviseTitle){
        Connection conn =JDBCTemplate.getConnection();
        return dao.whatReviseTitle(conn,postNum,whatReviseTitle);
    }

    public int whatReviseContent(int postNum,String whatReviseContent){
        Connection conn = JDBCTemplate.getConnection();
        return dao.whatReviseContent(conn,postNum,whatReviseContent);
    }


}
