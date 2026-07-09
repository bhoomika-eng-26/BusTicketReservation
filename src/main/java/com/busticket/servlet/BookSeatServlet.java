package com.busticket.servlet;

import java.io.IOException;
import java.sql.Date;

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

@WebServlet("/BookSeatServlet")
public class BookSeatServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

    	HttpSession session = request.getSession(false);

    	System.out.println("Session = " + session);

    	if (session != null) {
    	    System.out.println("Session ID = " + session.getId());
    	    System.out.println("loggedInUser = " + session.getAttribute("loggedInUser"));
    	}

    	if (session == null) {
    	    response.sendRedirect("login.jsp");
    	    return;
    	}

        if (session == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        User user = (User) session.getAttribute("loggedInUser");

        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        int busId = Integer.parseInt(request.getParameter("busId"));
        int seats = Integer.parseInt(request.getParameter("seats"));
        Date bookingDate = Date.valueOf(request.getParameter("bookingDate"));

        Booking booking = new Booking();
        booking.setUserId(user.getUserId());
        booking.setBusId(busId);
        booking.setSeats(seats);
        booking.setBookingDate(bookingDate);
        booking.setTotalAmount(seats * 650);

        BookingDAO dao = new BookingDAOImpl();

        if (dao.addBooking(booking)) {
            response.sendRedirect("bookingSuccess.jsp");
        } else {
            response.getWriter().println("Booking Failed!");
        }
    }
}