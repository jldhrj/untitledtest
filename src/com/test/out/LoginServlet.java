package com.test.out;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123456".equals(password)) { // 简单的验证，实际应用中需要连接到数据库进行验证
            request.getSession().setAttribute("username", username);
            response.sendRedirect("welcome.jsp"); // 如果验证通过，重定向到欢迎页面
        } else {
            request.setAttribute("errorMessage", "Invalid username or password");
            request.getRequestDispatcher("login.html").forward(request, response); // 如果验证失败，返回到登录页面并显示错误信息
        }
    }
}
