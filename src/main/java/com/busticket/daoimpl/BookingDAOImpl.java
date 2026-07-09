package com.busticket.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.busticket.dao.BookingDAO;
import com.busticket.dbutil.DBConnection;
import com.busticket.model.Booking;

public class BookingDAOImpl implements BookingDAO {

    @Override
    public boolean addBooking(Booking booking) {

        String sql = "INSERT INTO booking(user_id, bus_id, booking_date, seats, total_amount) VALUES(?,?,?,?,?)";

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, booking.getUserId());
            ps.setInt(2, booking.getBusId());
            ps.setDate(3, booking.getBookingDate());
            ps.setInt(4, booking.getSeats());
            ps.setDouble(5, booking.getTotalAmount());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public Booking getBookingById(int bookingId) {

        String sql = "SELECT * FROM booking WHERE booking_id=?";

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, bookingId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Booking booking = new Booking();

                booking.setBookingId(rs.getInt("booking_id"));
                booking.setUserId(rs.getInt("user_id"));
                booking.setBusId(rs.getInt("bus_id"));
                booking.setBookingDate(rs.getDate("booking_date"));
                booking.setSeats(rs.getInt("seats"));
                booking.setTotalAmount(rs.getDouble("total_amount"));

                return booking;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Booking> getAllBookings() {

        List<Booking> bookingList = new ArrayList<>();

        String sql = "SELECT * FROM booking";

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Booking booking = new Booking();

                booking.setBookingId(rs.getInt("booking_id"));
                booking.setUserId(rs.getInt("user_id"));
                booking.setBusId(rs.getInt("bus_id"));
                booking.setBookingDate(rs.getDate("booking_date"));
                booking.setSeats(rs.getInt("seats"));
                booking.setTotalAmount(rs.getDouble("total_amount"));

                bookingList.add(booking);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bookingList;
    }

    @Override
    public List<Booking> getBookingsByUserId(int userId) {

        List<Booking> bookingList = new ArrayList<>();

        String sql = "SELECT * FROM booking WHERE user_id=?";

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Booking booking = new Booking();

                booking.setBookingId(rs.getInt("booking_id"));
                booking.setUserId(rs.getInt("user_id"));
                booking.setBusId(rs.getInt("bus_id"));
                booking.setBookingDate(rs.getDate("booking_date"));
                booking.setSeats(rs.getInt("seats"));
                booking.setTotalAmount(rs.getDouble("total_amount"));

                bookingList.add(booking);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bookingList;
    }

    @Override
    public boolean updateBooking(Booking booking) {

        String sql = "UPDATE booking SET user_id=?, bus_id=?, booking_date=?, seats=?, total_amount=? WHERE booking_id=?";

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, booking.getUserId());
            ps.setInt(2, booking.getBusId());
            ps.setDate(3, booking.getBookingDate());
            ps.setInt(4, booking.getSeats());
            ps.setDouble(5, booking.getTotalAmount());
            ps.setInt(6, booking.getBookingId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteBooking(int bookingId) {

        String sql = "DELETE FROM booking WHERE booking_id=?";

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, bookingId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}