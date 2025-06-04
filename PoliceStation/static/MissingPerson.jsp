<!DOCTYPE html>
<html>
<head>
    <title>Missing Person Report</title>
</head>
<body>
<h2>Missing Person Complaint Form</h2>
<form action="MissingPersonResult.jsp" method="post">
    Missing Person's Name: <input type="text" name="missingPersonName" required /><br/><br/>
    Complaintee Mobile: <input type="text" name="complainteeMobile" required /><br/><br/>
    Missing Person Age: <input type="number" name="missingPersonAge" required /><br/><br/>
    Address: <input type="text" name="address" required /><br/><br/>
    Location Last Seen: <input type="text" name="location" required /><br/><br/>
    Identifying Marks: <input type="text" name="marks" /><br/><br/>
    Missing Person Gender:
    <select name="gender" required>
        <option value="">--Select--</option>
        <option>Male</option>
        <option>Female</option>
        <option>Other</option>
    </select><br/><br/>
    Languages Known: <input type="text" name="languages" /><br/><br/>

    <input type="submit" value="Submit" />
</form>
</body>
</html>
