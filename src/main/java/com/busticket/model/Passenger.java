package com.busticket.model;

public class Passenger {

    private int passengerId;
    private int bookingId;
    private String passengerName;
    private int age;
    private String gender;

    public Passenger() {
    }

    public Passenger(int passengerId, int bookingId, String passengerName, int age, String gender) {
        this.passengerId = passengerId;
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}