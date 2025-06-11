<%@ page import="com.xworkz.dto.DeathCertificateDTO" %>
<%
DeathCertificateDTO dto = (DeathCertificateDTO) request.getAttribute("deathCertificateDTO");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Death Certificate Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4">
<h2>Death Certificate Details</h2>
<ul class="list-group">
    <li class="list-group-item">Name: <strong><%= dto.getName() %></strong></li>
    <li class="list-group-item">Cause of Death: <strong><%= dto.getCause() %></strong></li>
    <li class="list-group-item">Date: <strong><%= dto.getDate() %></strong></li>
    <li class="list-group-item">Time: <strong><%= dto.getTime() %></strong></li>
    <li class="list-group-item">Age At Death: <strong><%= dto.getAgeAtDeath() %></strong></li>
    <li class="list-group-item">Certified By: <strong><%= dto.getCertifiedBy() %></strong></li>
    <li class="list-group-item">Hospital Name: <strong><%= dto.getHospitalName() %></strong></li>
    <li class="list-group-item">Manner Of Death: <strong><%= dto.getMannerOfDeath() %></strong></li>
    <li class="list-group-item">Gender: <strong><%= dto.getGender() %></strong></li>
    <li class="list-group-item">Marks: <strong><%= dto.getMarks() %></strong></li>
</ul>
</body>
</html>
