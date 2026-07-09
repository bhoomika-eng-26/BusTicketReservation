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
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserDAO userDAO = new UserDAOImpl();

        User user = userDAO.loginUser(email, password);

        if (user != null) {

            HttpSession session = request.getSession();
            session.setAttribute("loggedInUser", user);

            response.sendRedirect("home.jsp");

        } else {

            response.getWriter().println("Invalid Email or Password!");

        }
    }
}
