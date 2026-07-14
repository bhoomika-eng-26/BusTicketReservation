<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<title>Booking Successful - BusGo</title>

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
    color:white;
    display:flex;
    justify-content:space-between;
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


/* Ticket */

.container {

    display:flex;
    justify-content:center;
    align-items:center;
    height:75vh;

}


.ticket {

    width:450px;
    background:white;
    padding:35px;
    border-radius:20px;
    box-shadow:0px 8px 20px rgba(0,0,0,0.15);
    text-align:center;

}


.success {

    font-size:60px;

}


h1 {

    color:#28a745;

}


.ticket-info {

    margin-top:25px;
    text-align:left;
    background:#f8f9fa;
    padding:20px;
    border-radius:15px;

}


.ticket-info p {

    font-size:17px;
    margin:12px;

}


.btn {

    display:inline-block;
    margin-top:25px;
    padding:14px 35px;
    background:#667eea;
    color:white;
    text-decoration:none;
    border-radius:30px;

}


.btn:hover {

    background:#5563d6;

}


footer {

    text-align:center;
    color:#777;

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
<a href="bookingHistory">My Bookings</a>
<a href="logout">Logout</a>

</div>

</div>



<div class="container">


<div class="ticket">


<div class="success">
✅
</div>


<h1>Booking Confirmed!</h1>


<p>
Your bus ticket has been booked successfully.
</p>


<div class="ticket-info">

<p>
🎫 Booking Status:
<b>Confirmed</b>
</p>


<p>
🚍 Thank you for choosing BusGo
</p>


<p>
Have a safe journey! ❤️
</p>


</div>



<a href="BookingHistoryServlet" class="btn">
View My Bookings
</a>


</div>


</div>



<footer>

<p>
© 2026 BusGo | Travel Smart, Travel Safe 🚍
</p>

</footer>


</body>

</html>