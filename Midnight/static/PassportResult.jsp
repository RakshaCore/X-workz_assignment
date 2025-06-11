<%@ page import="com.xworkz.dto.PassportDTO" %>
<%
PassportDTO dto = (PassportDTO) request.getAttribute("passportDTO");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Passport Application Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4">
<h2>Passport Details</h2>
<ul class="list-group">
    <li class="list-group-item">Applicant Name: <strong><%= dto.getApplicantName() %></strong></li>
    <li class="list-group-item">Aadhar No: <strong><%= dto.getAadharNo() %></strong></li>
    <li class="list-group-item">Address: <strong><%= dto.getAddress() %></strong></li>
    <li class="list-group-item">PAN No: <strong><%= dto.getPanNo() %></strong></li>
    <li class="list-group-item">Country: <strong><%= dto.getCountry() %></strong></li>
    <li class="list-group-item">State: <strong><%= dto.getState() %></strong></li>
    <li class="list-group-item">City: <strong><%= dto.getCity() %></strong></li>
    <li class="list-group-item">Pin Code: <strong><%= dto.getPinCode() %></strong></li>
    <li class="list-group-item">Passport Type: <strong><%= dto.getPassportType() %></strong></li>
    <li class="list-group-item">Payment Ref No: <strong><%= dto.getPaymentRefNo() %></strong></li>
</ul>
</body>
</html>
