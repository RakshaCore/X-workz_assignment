<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Theft Report Result</title>
</head>
<body>
<h2>Theft Report Details</h2>
<ul>
    <li>Name: <%= request.getParameter("name") %></li>
    <li>Mobile: <%= request.getParameter("mobile") %></li>
    <li>Age: <%= request.getParameter("age") %></li>
    <li>Address: <%= request.getParameter("address") %></li>
    <li>Location: <%= request.getParameter("location") %></li>
    <li>Item Lost: <%= request.getParameter("item") %></li>
    <li>Date of Loss: <%= request.getParameter("lostOn") %></li>
</ul>
</body>
</html>
