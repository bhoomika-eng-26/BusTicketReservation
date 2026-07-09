<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Bus Ticket</title>

<link rel="stylesheet" href="css/bookSeat.css">

</head>
<body>

<div class="container">

    <h2>🎫 Book Your Bus Ticket</h2>

    <form action="BookSeatServlet" method="post">

        <input type="hidden"
               name="busId"
               value="<%= request.getParameter("busId") %>">

        <div class="input-group">
            <label>Number of Seats</label>
            <input type="number"
                   name="seats"
                   min="1"
                   placeholder="Enter number of seats"
                   required>
        </div>

        <div class="input-group">
            <label>Booking Date</label>
            <input type="date"
                   name="bookingDate"
                   required>
        </div>

        <button class="btn">
            Confirm Booking
        </button>

    </form>

</div>

</body>
</html>