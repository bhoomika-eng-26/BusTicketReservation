package com.busticket.servlet;

import java.io.IOException;

import com.busticket.dao.BookingDAO;
import com.busticket.daoimpl.BookingDAOImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CancelBookingServlet")
public class CancelBookingServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        int bookingId = Integer.parseInt(request.getParameter("bookingId"));

        BookingDAO bookingDAO = new BookingDAOImpl();

        if (bookingDAO.deleteBooking(bookingId)) {

            response.sendRedirect("BookingHistoryServlet");

        } else {

            response.getWriter().println("Booking Cancellation Failed!");

        }
    }
}