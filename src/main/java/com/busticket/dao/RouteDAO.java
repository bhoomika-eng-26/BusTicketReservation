package com.busticket.dao;

import java.util.List;
import com.busticket.model.Route;

public interface RouteDAO {

    boolean addRoute(Route route);

    Route getRouteById(int routeId);

    List<Route> getAllRoutes();

    boolean updateRoute(Route route);

    boolean deleteRoute(int routeId);
}