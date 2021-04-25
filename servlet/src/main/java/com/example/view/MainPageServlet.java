package com.example.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MainPageServlet", value = "/mainpage.do")
public class MainPageServlet extends HttpServlet {
    private static final long serialVersionUID = 1046216511279145575L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8;");
        String html ="<html>";
        html+="<head>";
        html+="<style>";
        html+="ul>li{" +
                "display:inline-block;" +
                " margin-right:20px;" +
                "font-size:25px;" +
                "font-weight:bold;" +
                "}";
        html+="</style>";
        html+="</head>";
        html+="<body>";
        html+="<h1>HU 홈페이지에 온 것을 환영합니다 </h1>";
        HttpSession session = request.getSession();
        if(session != null&& session.getAttribute("id")!=null) {
            html += "<ul>";
            html += "<li>메인화면</li>";
            html += "<li>갤러리</li>";
            html += "<li>게시판</li>";
            html += "</ul>";
            html += "<button onclick='location.assign(\""+request.getContextPath()+"/logout.do\")'>로그아웃</button>";
        }else{
            html+= "<form action='login.do' method='post'>";
            html+= "아이디<input type='text' name='userId'><br>";
            html+= "비밀번호<input type='password' name='userPw'><br>";
            html+= "<input type='submit' value='로그인'><br>";
            html+= "<form>";

        }
        html+="</body>";
        html+="</html>";

        response.getWriter().write(html);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
