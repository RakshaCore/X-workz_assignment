<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Child Adoption Form</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5 mb-5">
    <h2 class="text-center mb-4">Adoption Form</h2>

    <form action="submitAdoption" method="post">

        <h5 class="mt-4">Child Details</h5>
        <div class="mb-3">
            <label for="childName" class="form-label">Child Name</label>
            <input type="text" class="form-control" name="childName" id="childName" required>
        </div>

        <div class="mb-3">
            <label for="childAge" class="form-label">Child Age</label>
            <input type="number" class="form-control" name="childAge" id="childAge" required>
        </div>

        <div class="mb-3">
            <label for="childGender" class="form-label">Gender</label>
            <select class="form-select" name="childGender" id="childGender" required>
                <option value="" disabled selected>Select Gender</option>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Other">Other</option>
            </select>
        </div>

        <h5 class="mt-4">Adopter Details</h5>

        <div class="mb-3">
            <label for="adopterName" class="form-label">Adopter Name</label>
            <input type="text" class="form-control" name="adopterName" id="adopterName" required>
        </div>

        <div class="mb-3">
            <label for="adopterAge" class="form-label">Adopter Age</label>
            <input type="number" class="form-control" name="adopterAge" id="adopterAge" required>
        </div>

        <div class="mb-3">
            <label for="occupation" class="form-label">Occupation</label>
            <input type="text" class="form-control" name="occupation" id="occupation" required>
        </div>

        <div class="mb-3">
            <label class="form-label">Marital Status</label><br>
            <div class="form-check form-check-inline">
                <input type="radio" name="married" value="true" id="marriedYes" class="form-check-input">
                <label for="marriedYes" class="form-check-label">Married</label>
            </div>
            <div class="form-check form-check-inline">
                <input type="radio" name="married" value="false" id="marriedNo" class="form-check-input">
                <label for="marriedNo" class="form-check-label">Single</label>
            </div>
        </div>

        <div class="mb-3">
            <label for="email" class="form-label">Email ID</label>
            <input type="email" class="form-control" name="email" id="email" required>
        </div>

        <div class="mb-3">
            <label for="phone" class="form-label">Phone Number</label>
            <input type="text" class="form-control" name="phone" id="phone" required>
        </div>

        <div class="mb-3">
            <label for="address" class="form-label">Address</label>
            <input type="text" class="form-control" name="address" id="address" required>
        </div>

        <div class="mb-3">
            <label for="reason" class="form-label">Reason for Adoption</label>
            <textarea name="reason" id="reason" class="form-control" rows="3" required></textarea>
        </div>

        <div class="d-grid">
            <button type="submit" class="btn btn-success">Submit Application</button>
        </div>

        <%
        String error = (String) request.getAttribute("error");
        if (error != null) {
        %>
        <div class="alert alert-danger mt-3">
            <%= error %>
        </div>
        <%
        }
        %>
    </form>
</div>
</body>
</html>
