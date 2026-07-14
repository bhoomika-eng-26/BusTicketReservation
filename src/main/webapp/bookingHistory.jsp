<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List"%>
<%@ page import="com.busticket.model.Booking"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>My Bookings - BusGo</title>


<style>

body {
    margin:0;
    font-family: Arial, sans-serif;
    background:#f4f7fb;
}


/* Navbar */

.navbar {
    background:#667eea;
    padding:18px 50px;
    display:flex;
    justify-content:space-between;
    align-items:center;
    color:white;
}


.logo {
    font-size:28px;
    font-weight:bold;
}


.navbar a {
    color:white;
    text-decoration:none;
    margin-left:25px;
}



/* Main */

.container {

    padding:40px;

}


h1 {

    text-align:center;
    color:#333;

}



/* Booking Card */

.booking-card {

    width:500px;
    margin:25px auto;
    background:white;
    padding:25px;
    border-radius:20px;
    box-shadow:0px 8px 20px rgba(0,0,0,0.15);

}



.header {

    display:flex;
    justify-content:space-between;
    border-bottom:1px solid #ddd;
    padding-bottom:15px;

}



.status {

    background:#28a745;
    color:white;
    padding:8px 15px;
    border-radius:20px;

}



.details {

    margin-top:20px;

}



.details p {

    font-size:17px;
    color:#444;

}



/* Cancel Button */

.cancel-btn {

    width:100%;
    padding:12px;
    background:#dc3545;
    color:white;
    border:none;
    border-radius:25px;
    font-size:16px;
    cursor:pointer;

}


.cancel-btn:hover {

    background:#b52a37;

}



.home-btn {

    display:block;
    width:180px;
    text-align:center;
    margin:30px auto;
    padding:12px;
    background:#667eea;
    color:white;
    text-decoration:none;
    border-radius:25px;

}



.empty {

    text-align:center;
    font-size:22px;
    color:#777;

}



footer {

    text-align:center;
    color:#777;
    margin-top:40px;

}

</style>

</head>


<body>


<div class="navbar">

<div class="logo">
🚌 BusGo
</div>


<div>

<a href="home.jsp">Home</a>
<a href="searchBus.jsp">Search Bus</a>

</div>


</div>



<div class="container">


<h1>🎫 My Bookings</h1>



<%

List<Booking> bookingList = (List<Booking>) request.getAttribute("bookingList");


if (bookingList == null || bookingList.isEmpty()) {

%>


<p class="empty">
No Bookings Found! 😔
</p>


<%

} else {


for (Booking booking : bookingList) {

%>



<div class="booking-card">


<div class="header">

<h3>
Booking #<%= booking.getBookingId() %>
</h3>


<span class="status">
Confirmed
</span>


</div>



<div class="details">


<p>
🚌 <b>Bus ID:</b>
<%= booking.getBusId() %>
</p>


<p>
📅 <b>Booking Date:</b>
<%= booking.getBookingDate() %>
</p>


<p>
💺 <b>Seats:</b>
<%= booking.getSeats() %>
</p>


<p>
💰 <b>Total Amount:</b>
₹<%= booking.getTotalAmount() %>
</p>



</div>



<form action="CancelBookingServlet" method="post">

<input type="hidden" 
name="bookingId"
value="<%= booking.getBookingId() %>">


<input class="cancel-btn"
type="submit"
value="Cancel Booking">


</form>



</div>


<%

}

}

%>



<a class="home-btn" href="home.jsp">
⬅ Back to Home
</a>



</div>



<footer>

<p>
© 2026 BusGo | Travel Smart, Travel Safe 🚍
</p>

</footer>


</body>

</html>