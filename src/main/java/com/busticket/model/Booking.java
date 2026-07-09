package com.busticket.model;

import java.sql.Date;

public class Booking {

    private int bookingId;
    private int userId;
    private int busId;
    private Date bookingDate;
    private int seats;
    private double totalAmount;

    public Booking() {
    }

    public Booking(int bookingId, int userId, int busId,
                   Date bookingDate, int seats, double totalAmount) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.busId = busId;
        this.bookingDate = bookingDate;
        this.seats = seats;
        this.totalAmount = totalAmount;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}