package com.example.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "LoginServlet", value = "/login.do")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = -4543763158626640745L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean result= false;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB","kh","kh");
            pstmt = conn.prepareStatement("select * from student_tb");
            rs = pstmt.executeQuery();
            System.out.println("이프문 바깥쪽은 되니?");
            if(rs.next()){
                System.out.println("이프문 안쪽은 되니?");
                result=true;
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String path ="";

        if(result){
            System.out.println("세션 안쪽은 되니?");

            HttpSession session = request.getSession();
            session.setAttribute("id",id);
            path="/msg.do";
        }
        System.out.println("세션 바깥쪽은 되니?");

        RequestDispatcher rd = request.getRequestDispatcher(path);
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
