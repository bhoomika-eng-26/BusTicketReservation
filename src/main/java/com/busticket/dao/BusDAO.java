package com.busticket.dao;

import java.util.List;
import com.busticket.model.Bus;

public interface BusDAO {

    boolean addBus(Bus bus);

    Bus getBusById(int busId);

    List<Bus> getAllBuses();

    List<Bus> searchBus(String source, String destination);

    boolean updateBus(Bus bus);

    boolean deleteBus(int busId);
}