<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Adoption</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
<h1>Adoption Form</h1>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
<div class="container mt-5">
    <h2 class="mb-4">All Adoption Applications</h2>
    <table class="table table-bordered table-hover">
        <thead class="table-dark">
        <tr>
            <th>#</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
            <th>City</th>
            <th>State</th>
            <th>Zip</th>
            <th>Marital Status</th>
            <th>Adoption Type</th>
        </tr>
        </thead>
        <tbody>
        <%
        List<AdoptionDTO> list = (List<AdoptionDTO>) request.getAttribute("adoptions");
            if (list != null && !list.isEmpty()) {
            int i = 1;
            for (AdoptionDTO dto : list) {
            %>
            <tr>
                <td><%= i++ %></td>
                <td><%= dto.getFirstName() %></td>
                <td><%= dto.getLastName() %></td>
                <td><%= dto.getAge() %></td>
                <td><%= dto.getCity() %></td>
                <td><%= dto.getState() %></td>
                <td><%= dto.getZip() %></td>
                <td><%= dto.getMaritalStatus() %></td>
                <td><%= dto.getAdoptionType() %></td>
            </tr>
            <%
            }
            } else {
            %>
            <tr>
                <td colspan="9" class="text-center text-danger">No records found.</td>
            </tr>
            <% } %>
        </tbody>
    </table>
</div>
</body>
</html>