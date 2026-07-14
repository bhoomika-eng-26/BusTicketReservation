package com.busticket.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.busticket.dao.BusDAO;
import com.busticket.dbutil.DBConnection;
import com.busticket.model.Bus;

public class BusDAOImpl implements BusDAO {

	@Override
	public List<Bus> searchBus(String source, String destination) {

	    List<Bus> busList = new ArrayList<>();

	    String sql = "SELECT b.* FROM bus b "
	               + "JOIN route r ON b.route_id = r.route_id "
	               + "WHERE LOWER(r.source) LIKE LOWER(?) "
	               + "AND LOWER(r.destination) LIKE LOWER(?)";

	    try {

	        Connection con = DBConnection.getConnection();
	        PreparedStatement ps = con.prepareStatement(sql);

	        ps.setString(1, "%" + source + "%");
	        ps.setString(2, "%" + destination + "%");

	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {

	            Bus bus = new Bus();

	            bus.setBusId(rs.getInt("bus_id"));
	            bus.setBusName(rs.getString("bus_name"));
	            bus.setBusNumber(rs.getString("bus_number"));
	            bus.setRouteId(rs.getInt("route_id"));
	            bus.setDepartureTime(rs.getString("departure_time"));
	            bus.setArrivalTime(rs.getString("arrival_time"));
	            bus.setFare(rs.getDouble("fare"));
	            bus.setImageUrl(rs.getString("image_url"));

	            busList.add(bus);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return busList;
	}
    @Override
    public boolean addBus(Bus bus) {
        return false;
    }

    @Override
    public Bus getBusById(int busId) {
        return null;
    }

    @Override
    public List<Bus> getAllBuses() {
        return new ArrayList<>();
    }

    @Override
    public boolean updateBus(Bus bus) {
        return false;
    }

    @Override
    public boolean deleteBus(int busId) {
        return false;
    }
}