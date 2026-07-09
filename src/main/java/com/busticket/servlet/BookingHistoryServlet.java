package com.busticket.servlet;

import java.io.IOException;
import java.util.List;

import com.busticket.dao.BookingDAO;
import com.busticket.daoimpl.BookingDAOImpl;
import com.busticket.model.Booking;
import com.busticket.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/BookingHistoryServlet")
public class BookingHistoryServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("loggedInUser");

        // Check whether user is logged in
        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        BookingDAO bookingDAO = new BookingDAOImpl();

        List<Booking> bookingList =
                bookingDAO.getBookingsByUserId(user.getUserId());

        request.setAttribute("bookingList", bookingList);

        request.getRequestDispatcher("bookingHistory.jsp")
               .forward(request, response);
    }
}