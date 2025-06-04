<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Missing Person Report Details</title>
</head>
<body>
<h2>Missing Person Report Submitted</h2>
<ul>
    <li><strong>Missing Person's Name:</strong> <%= request.getParameter("missingPersonName") %></li>
    <li><strong>Complaintee Mobile:</strong> <%= request.getParameter("complainteeMobile") %></li>
    <li><strong>Missing Person Age:</strong> <%= request.getParameter("missingPersonAge") %></li>
    <li><strong>Address:</strong> <%= request.getParameter("address") %></li>
    <li><strong>Last Seen Location:</strong> <%= request.getParameter("location") %></li>
    <li><strong>Identifying Marks:</strong> <%= request.getParameter("marks") %></li>
    <li><strong>Gender:</strong> <%= request.getParameter("gender") %></li>
    <li><strong>Languages Known:</strong> <%= request.getParameter("languages") %></li>
</ul>
</body>
</html>
