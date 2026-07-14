<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<title>Search Bus - BusGo</title>

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



/* Main section */

.container {

    display:flex;
    justify-content:center;
    align-items:center;
    height:80vh;

}


.search-box {

    background:white;
    width:450px;
    padding:35px;
    border-radius:20px;
    box-shadow:0px 8px 20px rgba(0,0,0,0.15);

}


.search-box h1 {

    text-align:center;
    color:#333;

}


label {

    font-weight:bold;
    color:#555;

}


input {

    width:100%;
    padding:14px;
    margin:10px 0 20px;
    border:1px solid #ccc;
    border-radius:10px;
    font-size:16px;

}


button {

    width:100%;
    padding:15px;
    background:#667eea;
    color:white;
    border:none;
    border-radius:30px;
    font-size:18px;
    cursor:pointer;

}


button:hover {

    background:#5563d6;

}


.footer {

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


<div class="search-box">


<h1>🔍 Search Your Bus</h1>


<form action="SearchBusServlet" method="post">


<label>From</label>

<input type="text" 
name="source"
placeholder="Enter starting place">


<label>To</label>

<input type="text"
name="destination"
placeholder="Enter destination">


<label>Journey Date</label>

<input type="date"
name="date">



<button type="submit">
Search Bus
</button>


</form>


</div>


</div>



<div class="footer">

<p>© 2026 BusGo | Travel Smart, Travel Safe 🚍</p>

</div>


</body>

</html>