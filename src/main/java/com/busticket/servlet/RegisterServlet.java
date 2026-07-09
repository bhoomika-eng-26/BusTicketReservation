package com.busticket.servlet;

import java.io.IOException;

import com.busticket.dao.UserDAO;
import com.busticket.daoimpl.UserDAOImpl;
import com.busticket.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");

        User user = new User();

        user.setFullName(fullName);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhone(phone);

        UserDAO userDAO = new UserDAOImpl();

        if(userDAO.addUser(user)) {
            response.sendRedirect("login.jsp");
        } else {
            response.getWriter().println("Registration Failed!");
        }
    }
}