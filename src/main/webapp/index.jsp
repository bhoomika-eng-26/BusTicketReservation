<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>BusGo - Online Bus Ticket Booking</title>

<style>
body {
    margin: 0;
    font-family: Arial, sans-serif;
    background: linear-gradient(to right, #667eea, #764ba2);
    color: white;
}

.navbar {
    display: flex;
    justify-content: space-between;
    padding: 20px 50px;
    background: rgba(0,0,0,0.2);
}

.logo {
    font-size: 28px;
    font-weight: bold;
}

.navbar a {
    color: white;
    text-decoration: none;
    margin-left: 25px;
}

.hero {
    text-align: center;
    padding: 80px 20px;
}

.hero h1 {
    font-size: 45px;
}

.hero p {
    font-size: 20px;
}

.btn {
    display: inline-block;
    margin-top: 30px;
    padding: 15px 35px;
    background: white;
    color: #667eea;
    border-radius: 30px;
    text-decoration: none;
    font-weight: bold;
}

.features {
    display: flex;
    justify-content: center;
    gap: 30px;
    margin-top: 40px;
}

.card {
    background: white;
    color: black;
    width: 220px;
    padding: 25px;
    border-radius: 15px;
    text-align: center;
}

footer {
    text-align: center;
    margin-top: 60px;
}
</style>

</head>

<body>

<div class="navbar">

<div class="logo">
🚌 BusGo
</div>

<div>
<a href="login.jsp">Login</a>
<a href="register.jsp">Register</a>
</div>

</div>


<div class="hero">

<h1>Book Your Journey Easily 🚍</h1>

<p>
Travel anywhere with comfort, safety and convenience.
</p>

<a class="btn" href="login.jsp">
Start Booking
</a>


<div class="features">

<div class="card">
<h2>🔍</h2>
<h3>Search Bus</h3>
<p>Find available buses quickly.</p>
</div>


<div class="card">
<h2>🎫</h2>
<h3>Easy Booking</h3>
<p>Book your tickets online.</p>
</div>


<div class="card">
<h2>📱</h2>
<h3>Manage Trips</h3>
<p>View and cancel bookings.</p>
</div>

</div>

</div>


<footer>
<p>© 2026 BusGo | Online Bus Ticket Reservation System</p>
</footer>


</body>
</html>