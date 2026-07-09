<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bus Ticket Reservation - Register</title>

<style>
body{
    font-family: Arial, sans-serif;
    background:#f2f2f2;
}

.container{
    width:400px;
    margin:60px auto;
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0 0 10px gray;
}

h2{
    text-align:center;
    color:#1565c0;
}

input{
    width:100%;
    padding:10px;
    margin:10px 0;
}

button{
    width:100%;
    padding:10px;
    background:#1565c0;
    color:white;
    border:none;
    cursor:pointer;
}

a{
    text-decoration:none;
}
</style>

</head>

<body>

<div class="container">

<h2>User Registration</h2>

<form action="register" method="post">

<input type="text" name="fullName" placeholder="Full Name" required>

<input type="email" name="email" placeholder="Email" required>

<input type="password" name="password" placeholder="Password" required>

<input type="text" name="phone" placeholder="Phone Number" required>

<button type="submit">Register</button>

</form>

<br>

<a href="login.jsp">Already have an account? Login</a>

</div>

</body>
</html>