<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List"%>
<%@ page import="com.busticket.model.Booking"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Bookings</title>
</head>
<body>

<h2>My Bookings</h2>

<%
List<Booking> bookingList = (List<Booking>) request.getAttribute("bookingList");

if (bookingList == null || bookingList.isEmpty()) {
%>

<h3>No Bookings Found!</h3>

<%
} else {
    for (Booking booking : bookingList) {
%>

<hr>

<p><b>Booking ID:</b> <%= booking.getBookingId() %></p>
<p><b>Bus ID:</b> <%= booking.getBusId() %></p>
<p><b>Booking Date:</b> <%= booking.getBookingDate() %></p>
<p><b>Seats:</b> <%= booking.getSeats() %></p>
<p><b>Total Amount:</b> ₹<%= booking.getTotalAmount() %></p>

<form action="CancelBookingServlet" method="post">
    <input type="hidden" name="bookingId"
           value="<%= booking.getBookingId() %>">

    <input type="submit" value="Cancel Booking">
</form>

<%
    }
}
%>

<br><br>
<a href="home.jsp">Back to Home</a>

</body>
</html>