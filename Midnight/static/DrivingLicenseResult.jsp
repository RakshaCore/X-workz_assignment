<%@ page import="com.xworkz.dto.DrivingLicenseDTO" %>
<%
DrivingLicenseDTO dto = (DrivingLicenseDTO) request.getAttribute("drivingLicenseDTO");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Driving License Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4">
<h2>Driving License Details</h2>
<ul class="list-group">
    <li class="list-group-item">Name: <strong><%= dto.getName() %></strong></li>
    <li class="list-group-item">Address: <strong><%= dto.getAddress() %></strong></li>
    <li class="list-group-item">Mobile: <strong><%= dto.getMobile() %></strong></li>
    <li class="list-group-item">Applied Date: <strong><%= dto.getAppliedDate() %></strong></li>
    <li class="list-group-item">Vehicle Type: <strong><%= dto.getVehicleType() %></strong></li>
</ul>
</body>
</html>
