package com.board.model.dao;

import com.board.model.common.JDBCTemplate;
import com.board.model.vo.Board;
import com.board.model.vo.Member;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BoardDao {
    private List<Member> list = new ArrayList<>();
    private Properties pt = new Properties();


    public BoardDao() {
        File f = new File("");
        String path =f.getAbsolutePath()+File.separator+"homework_JDBC_board";
        try{
            pt.load(new FileReader(path+File.separator+"sql"+File.separator+"sql.properties"));

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<Member> searchAllMember(Connection conn){
        PreparedStatement ptmt = null;
        ResultSet rs = null;

        try{
            ptmt = conn.prepareStatement(pt.getProperty("searchAllMember"));
            rs = ptmt.executeQuery();

            while(rs.next()){
                Member m = new Member();
                m.setIndexMember(rs.getInt("indexNumber"));
                m.setMemberId(rs.getString("member_id"));
                m.setMemberPwd(rs.getString("member_pwd"));
                m.setMemberName(rs.getString("member_name"));
                m.setEmail(rs.getString("email"));
                m.setAddress(rs.getString("address"));
                m.setPhone(rs.getString("phone"));
                m.setEnrollDate(rs.getString("enroll_date"));

                list.add(m);
            }


        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(rs);
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }
        return list;
    }

    public List<Member> searchMemberId(Connection conn,String id){
        // id가 primary key가 아니니까 중복 가능 -> list로 받는다.
        PreparedStatement ptmt = null;
        ResultSet rs = null;

        try{
            ptmt = conn.prepareStatement(pt.getProperty("searchMemberId"));
            ptmt.setString(1,id);
            rs = ptmt.executeQuery();

            while(rs.next()){
                Member m = new Member();
                m.setIndexMember(rs.getInt("indexNumber"));
                m.setMemberId(rs.getString("member_id"));
                m.setMemberPwd(rs.getString("member_pwd"));
                m.setMemberName(rs.getString("member_name"));
                m.setEmail(rs.getString("email"));
                m.setAddress(rs.getString("address"));
                m.setPhone(rs.getString("phone"));
                m.setEnrollDate(rs.getString("enroll_date"));

                list.add(m);
            }


        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(rs);
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }
        return list;
    }

    public List<Member> searchMemberName(Connection conn,String name){
        PreparedStatement ptmt = null;
        ResultSet rs = null;

        try{
            ptmt = conn.prepareStatement(pt.getProperty("searchMemberName"));
            ptmt.setString(1,name);
            rs = ptmt.executeQuery();

            while(rs.next()){
                Member m = new Member();
                m.setIndexMember(rs.getInt("indexNumber"));
                m.setMemberId(rs.getString("member_id"));
                m.setMemberPwd(rs.getString("member_pwd"));
                m.setMemberName(rs.getString("member_name"));
                m.setEmail(rs.getString("email"));
                m.setAddress(rs.getString("address"));
                m.setPhone(rs.getString("phone"));
                m.setEnrollDate(rs.getString("enroll_date"));

                list.add(m);
            }


        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(rs);
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }
        return list;
    }

    public int enrollMember(Connection conn,Member m){
        int result = 0;
        PreparedStatement ptmt = null;
        try{
            ptmt = conn.prepareStatement(pt.getProperty("enrollMember"));
            ptmt.setString(1,m.getMemberId());
            ptmt.setString(2,m.getMemberPwd());
            ptmt.setString(3,m.getMemberName());
            ptmt.setString(4,m.getEmail());
            ptmt.setString(5,m.getAddress());
            ptmt.setString(6,m.getPhone());

            result=ptmt.executeUpdate();

            if(result>0) JDBCTemplate.commit(conn);
            else JDBCTemplate.rollback(conn);

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }
        return result;
    }

    public int deleteMember(Connection conn, String name){
        int result = 0;
        PreparedStatement ptmt = null;
        try{
            ptmt = conn.prepareStatement(pt.getProperty("deleteMember"));
            ptmt.setString(1,name);
            result=ptmt.executeUpdate();

            if(result>0) JDBCTemplate.commit(conn);
            else JDBCTemplate.rollback(conn);

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }
        return result;
    }

    public int whatAddress(Connection conn, String name,String whatAddress) {
        PreparedStatement ptmt = null;
        int result = 0;

        try {
            ptmt = conn.prepareStatement(pt.getProperty("whatAddress"));

            ptmt.setString(1,whatAddress);
            ptmt.setString(2,name);

            result = ptmt.executeUpdate();

            if (result > 0) JDBCTemplate.commit(conn);
            else JDBCTemplate.rollback(conn);
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }
    public int whatPhone(Connection conn, String name, String whatPhone) {
        PreparedStatement ptmt = null;
        int result = 0;

        try {
            ptmt = conn.prepareStatement(pt.getProperty("whatPhone"));

            ptmt.setString(1,whatPhone);
            ptmt.setString(2,name);

            result = ptmt.executeUpdate();

            if (result > 0) JDBCTemplate.commit(conn);
            else JDBCTemplate.rollback(conn);
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }
    public int whatEmail(Connection conn, String name, String whatEmail) {
        PreparedStatement ptmt = null;
        int result = 0;

        try {
            ptmt = conn.prepareStatement(pt.getProperty("whatEmail"));

            ptmt.setString(1,whatEmail);
            ptmt.setString(2,name);

            result = ptmt.executeUpdate();

            if (result > 0) JDBCTemplate.commit(conn);
            else JDBCTemplate.rollback(conn);
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }

    public List<Board> printAllboard(Connection conn){
        PreparedStatement ptmt = null;
        ResultSet rs= null;
        List<Board> list = new ArrayList<>();
        try{
            ptmt = conn.prepareStatement(pt.getProperty("printAllboard"));
            rs=ptmt.executeQuery();

            while(rs.next()){
                Board b = new Board();

                rs.getInt(b.getWriteNumber());
                rs.getString(b.getDiv());
                rs.getString(b.getTitle());
                rs.getString(b.getDate());

                list.add(b);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(rs);
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return list;
    }

    public int writePost(Connection conn, Board b){
        PreparedStatement ptmt=null;
        int result = 0;

        try{
            ptmt=conn.prepareStatement(pt.getProperty("writePost"));
            ptmt.setString(1,b.getDiv());
            ptmt.setString(2,b.getTitle());
            ptmt.setString(3,b.getContent());

            result = ptmt.executeUpdate();

            if(result>0) JDBCTemplate.commit(conn);
            else JDBCTemplate.rollback(conn);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }

    public List<Board> boardTitleSearch(Connection conn, String title){
        PreparedStatement ptmt= null;
        ResultSet rs = null;
        List<Board> list = new ArrayList<>();

        try{
            ptmt = conn.prepareStatement(pt.getProperty("boardTitleSearch"));
            ptmt.setString(1,title);
            rs= ptmt.executeQuery();

            while(rs.next()){
                Board b = new Board();

                rs.getInt(b.getWriteNumber());
                rs.getString(b.getDiv());
                rs.getString(b.getTitle());
                rs.getString(b.getContent());
                rs.getString(b.getDate());

                list.add(b);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            JDBCTemplate.close(rs);
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return list;
    }

    public int whatReviseTitle(Connection conn, int postNum, String whatReviseTitle){
        PreparedStatement  ptmt = null;
        int result =0;

        try{
            ptmt= conn.prepareStatement(pt.getProperty("whatReviseTitle"));
            ptmt.setString(1,whatReviseTitle);
            ptmt.setInt(2,postNum);

            result=ptmt.executeUpdate();

            if(result>0)JDBCTemplate.commit(conn);
            else JDBCTemplate.rollback(conn);

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }

    public int whatReviseContent(Connection conn, int postNum, String whatReviseContent){
        PreparedStatement  ptmt = null;
        int result =0;

        try{
            ptmt= conn.prepareStatement(pt.getProperty("whatReviseContent"));
            ptmt.setString(1,whatReviseContent);
            ptmt.setInt(2,postNum);

            result=ptmt.executeUpdate();

            if(result>0)JDBCTemplate.commit(conn);
            else JDBCTemplate.rollback(conn);

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(ptmt);
            JDBCTemplate.close(conn);
        }

        return result;
    }

}
