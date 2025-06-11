<!DOCTYPE html>
<html>
<head>
    <title>Driving License Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-4">
<h2>Driving License Form</h2>
<form action="license" method="post">
    <div class="mb-3"><label>Name:</label><input type="text" name="name" class="form-control" required></div>
    <div class="mb-3"><label>Address:</label><input type="text" name="address" class="form-control" required></div>
    <div class="mb-3"><label>Mobile:</label><input type="text" name="mobile" class="form-control" required></div>
    <div class="mb-3"><label>Applied Date:</label><input type="date" name="appliedDate" class="form-control" required></div>
    <div class="mb-3"><label>Vehicle Type:</label><input type="text" name="vehicleType" class="form-control" required></div>
    <button type="submit" class="btn btn-success">Submit</button>
</form>
</body>
</html>
