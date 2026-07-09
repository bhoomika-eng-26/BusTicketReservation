<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<link rel="stylesheet" href="css/auth.css">

</head>
<body>

<div class="container">

    <h2>User Login</h2>

    <form action="login" method="post">

        <div class="input-group">
            <label>Email</label>
            <input type="email" name="email" required>
        </div>

        <div class="input-group">
            <label>Password</label>
            <input type="password" name="password" required>
        </div>

        <button type="submit" class="btn">Login</button>

    </form>

    <p>
        Don't have an account?
        <a href="register.jsp">Register Here</a>
    </p>

</div>

</body>
</html>