package com.busticket.servlet;

import java.io.IOException;
import java.util.List;

import com.busticket.dao.BusDAO;
import com.busticket.daoimpl.BusDAOImpl;
import com.busticket.model.Bus;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SearchBusServlet")
public class SearchBusServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String source = request.getParameter("source");
        String destination = request.getParameter("destination");

        BusDAO dao = new BusDAOImpl();

        List<Bus> busList = dao.searchBus(source, destination);

        request.setAttribute("busList", busList);

        request.getRequestDispatcher("busList.jsp").forward(request, response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);

    }
}