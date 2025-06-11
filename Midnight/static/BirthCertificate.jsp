<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Birth Certificate</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Birth Certificate Form</h2>
    <form action="birthCertificate" method="post">
        <div class="form-row">
            <div class="form-group col-md-6">
                <label>Birth ID</label>
                <input type="text" class="form-control" name="BirthId" placeholder="Enter Birth ID">
            </div>
            <div class="form-group col-md-6">
                <label>Hospital Name</label>
                <select class="form-control" name="hospitalName">
                    <option selected disabled>Select Hospital</option>
                    <option>Apollo</option>
                    <option>Bpollo</option>
                    <option>Cpollo</option>
                    <option>Dpollo</option>
                </select>
            </div>
        </div>

        <div class="form-row">
            <div class="form-group col-md-6">
                <label>Father Name</label>
                <input type="text" class="form-control" name="fatherName" placeholder="Enter Father Name">
            </div>
            <div class="form-group col-md-6">
                <label>Mother Name</label>
                <input type="text" class="form-control" name="motherName" placeholder="Enter Mother Name">
            </div>
        </div>

        <div class="form-group">
            <label>Date and Time of Birth</label>
            <input type="text" class="form-control" name="birthDateTime">
        </div>

        <div class="form-row">
            <div class="form-group col-md-6">
                <label>Doctor Name</label>
                <input type="text" class="form-control" name="doctorName" placeholder="Enter Doctor's Name">
            </div>
            <div class="form-group col-md-6">
                <label>Nurse Name</label>
                <input type="text" class="form-control" name="nurseName" placeholder="Enter Nurse's Name">
            </div>
        </div>

        <div class="form-group">
            <label>Hospital Type</label>
            <select class="form-control" name="hospitalType">
                <option selected disabled>Select Hospital Type</option>
                <option>Government</option>
                <option>Private</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

<!-- Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
