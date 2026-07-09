package com.busticket.dao;

import java.util.List;
import com.busticket.model.Booking;

public interface BookingDAO {

    boolean addBooking(Booking booking);

    Booking getBookingById(int bookingId);

    List<Booking> getAllBookings();

    // Add this method
    List<Booking> getBookingsByUserId(int userId);

    boolean updateBooking(Booking booking);

    boolean deleteBooking(int bookingId);
}