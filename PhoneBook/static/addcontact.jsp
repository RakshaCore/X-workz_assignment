<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Add Contact</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
<h1>Add Contact</h1>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
<form method="post" action="addContact">
    <div class="form-row">
        <div class="col-md-4 mb-3">
            <label for="fullName">Full Name</label>
            <input type="text" class="form-control" id="fullName" name="fullName" required>
        </div>
        <div class="col-md-4 mb-3">
            <label for="phoneNumber">Phone Number</label>
            <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" required>
        </div>
        <div class="col-md-4 mb-3">
            <label for="email">Email</label>
            <input type="email" class="form-control" id="email" name="email" required>
    </div>
    <button class="btn btn-primary" type="submit">Add Contact</button>
    </div>
</form>
</body>
</html>