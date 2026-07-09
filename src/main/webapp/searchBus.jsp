<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Bus</title>

<link rel="stylesheet" href="css/search.css">

</head>
<body>

<div class="container">

    <h2>🚌 Search Bus</h2>

    <form action="SearchBusServlet" method="get">

        <div class="input-group">
            <label>Source</label>
            <input type="text" name="source" placeholder="Enter Source" required>
        </div>

        <div class="input-group">
            <label>Destination</label>
            <input type="text" name="destination" placeholder="Enter Destination" required>
        </div>

        <button type="submit" class="btn">Search Bus</button>

    </form>

</div>

</body>
</html>