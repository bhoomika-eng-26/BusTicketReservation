package com.busticket.dao;

import java.util.List;
import com.busticket.model.Passenger;

public interface PassengerDAO {

    boolean addPassenger(Passenger passenger);

    Passenger getPassengerById(int passengerId);

    List<Passenger> getAllPassengers();

    List<Passenger> getPassengersByBooking(int bookingId);

    boolean deletePassenger(int passengerId);
}