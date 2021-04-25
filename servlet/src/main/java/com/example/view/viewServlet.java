package com.example.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "viewServlet", value = "/msg.do")
public class viewServlet extends HttpServlet {
    private static final long serialVersionUID = 65174541227013622L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String html="<html>";
        html+="<body>";
        html+="<script>";
        html+="console.log("+request.getAttribute("msg")+");";
        html+="location.replace('"+request.getContextPath()+"/mainpage.do');";
        html+="</script>";
        html+="</body>";
        html+="</html>";
        response.getWriter().write(html);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
