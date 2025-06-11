<%@ page import="com.xworkz.dto.JobApplicationDTO" %>
<%
JobApplicationDTO dto = (JobApplicationDTO) request.getAttribute("jobApplicationDTO");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Job Application Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4">
<h2>Job Application Details</h2>
<ul class="list-group">
    <li class="list-group-item">Name: <strong><%= dto.getName() %></strong></li>
    <li class="list-group-item">Email: <strong><%= dto.getEmail() %></strong></li>
    <li class="list-group-item">Education: <strong><%= dto.getEducation() %></strong></li>
    <li class="list-group-item">Skills: <strong><%= dto.getSkills() %></strong></li>
    <li class="list-group-item">Expected Salary: <strong><%= dto.getExpectedSalary() %></strong></li>
    <li class="list-group-item">Experience: <strong><%= dto.getExperience() %></strong></li>
</ul>
</body>
</html>
