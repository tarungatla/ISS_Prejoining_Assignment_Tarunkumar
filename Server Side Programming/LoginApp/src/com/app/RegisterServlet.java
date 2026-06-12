package com.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (LoginServlet.users.containsKey(username)) {
            // Username already taken
            request.setAttribute("msg", "Username already exists! Choose another.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else {
            // Register new user
            LoginServlet.users.put(username, password);
            request.setAttribute("msg", "Registration successful! Please login.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}