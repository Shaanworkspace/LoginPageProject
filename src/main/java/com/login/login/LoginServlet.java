package com.login.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

//        if (userDao.isValidUser(username, password)) {
//            HttpSession session = req.getSession();
//            session.setAttribute("username", username);
//            resp.sendRedirect("welcome.jsp");
//            //System.out.println("Hi - "+username);
//        } else {
//            resp.sendRedirect("login.jsp?error=1");
//            System.out.println("Error A gya");
//        }
}
}