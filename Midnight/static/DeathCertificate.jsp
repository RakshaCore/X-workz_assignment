<!DOCTYPE html>
<html>
<head>
    <title>Death Certificate Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-4">
<h2>Death Certificate Form</h2>
<form action="death" method="post">
    <div class="mb-3"><label>Name:</label><input type="text" name="name" class="form-control" required></div>
    <div class="mb-3"><label>Cause of Death:</label><input type="text" name="cause" class="form-control" required></div>
    <div class="mb-3"><label>Date:</label><input type="date" name="date" class="form-control" required></div>
    <div class="mb-3"><label>Time:</label><input type="time" name="time" class="form-control" required></div>
    <div class="mb-3"><label>Age at Death:</label><input type="number" name="age" class="form-control" required></div>
    <div class="mb-3"><label>Certified By:</label><input type="text" name="certifiedBy" class="form-control" required></div>
    <div class="mb-3"><label>Hospital Name:</label><input type="text" name="hospital" class="form-control" required></div>
    <div class="mb-3"><label>Manner of Death:</label><input type="text" name="manner" class="form-control" required></div>
    <div class="mb-3"><label>Gender:</label><input type="text" name="gender" class="form-control" required></div>
    <div class="mb-3"><label>Marks:</label><input type="text" name="marks" class="form-control"></div>
    <button type="submit" class="btn btn-danger">Submit</button>
</form>
</body>
</html>
