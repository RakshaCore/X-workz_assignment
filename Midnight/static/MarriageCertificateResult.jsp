<%@ page import="com.xworkz.dto.MarriageCertificateDTO" %>
<%
MarriageCertificateDTO dto = (MarriageCertificateDTO) request.getAttribute("marriageCertificateDTO");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Marriage Certificate Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4">
<h2>Marriage Certificate Details</h2>
<ul class="list-group">
    <li class="list-group-item">Groom Name: <strong><%= dto.getGroomName() %></strong></li>
    <li class="list-group-item">Bride Name: <strong><%= dto.getBrideName() %></strong></li>
    <li class="list-group-item">Location: <strong><%= dto.getLocation() %></strong></li>
    <li class="list-group-item">Address: <strong><%= dto.getAddress() %></strong></li>
    <li class="list-group-item">Religion: <strong><%= dto.getReligion() %></strong></li>
<!--    <li class="list-group-item">Date: <strong><%= dto.getDate() %></strong></li>-->
    <li class="list-group-item">Witness 1: <strong><%= dto.getWitness1() %></strong></li>
    <li class="list-group-item">Witness 2: <strong><%= dto.getWitness2() %></strong></li>
    <li class="list-group-item">Officer Present: <strong><%= dto.getOfficerPresent() %></strong></li>
</ul>
</body>
</html>
