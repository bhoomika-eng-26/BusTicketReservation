<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="com.busticket.model.Bus" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Available Buses</title>

<link rel="stylesheet" href="css/bus.css">

</head>
<body>

<h1 class="title">🚌 Available Buses</h1>

<div class="bus-container">

<%
List<Bus> busList = (List<Bus>) request.getAttribute("busList");

if (busList == null || busList.isEmpty()) {
%>

<h2 style="text-align:center;color:red;">No buses found!</h2>

<%
} else {

    int imageNo = 1;

    for (Bus bus : busList) {

        if(imageNo > 5){
            imageNo = 1;
        }
%>

<div class="bus-card">

    <img src="<%= bus.getImageUrl() %>" alt="Bus" class="bus-image">    
    <div class="bus-details">

        <h2><%= bus.getBusName() %></h2>

        <p><strong>Bus Number:</strong> <%= bus.getBusNumber() %></p>

        <p><strong>Departure:</strong> <%= bus.getDepartureTime() %></p>

        <p><strong>Arrival:</strong> <%= bus.getArrivalTime() %></p>

        <p><strong>Fare:</strong> ₹<%= bus.getFare() %></p>

        <form action="bookSeat.jsp" method="get">

            <input type="hidden"
                   name="busId"
                   value="<%= bus.getBusId() %>">

            <button class="book-btn">
                Book Now
            </button>

        </form>

    </div>

</div>

<%
        imageNo++;
    }
}
%>

</div>

</body>
</html>