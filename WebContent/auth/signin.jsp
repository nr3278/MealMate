<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>サインイン</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f9f9f9;
    margin: 0;
    padding: 0;
    height: 100vh;
}

.signin-container {
    margin: 100px auto;
    padding: 20px;
    background-color: #fff;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.signin-container h1 {
    text-align: center;
    margin-bottom: 20px;
    background-color: #f1f1f1;
    padding: 10px;
    border-bottom: 1px solid #ddd;
    font-size: 25px;
}

.signin-container input[type="text"],
.signin-container input[type="password"],
.signin-container select {
    display: block;
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ddd;
    box-sizing: border-box;
}

.signin-container input[type="submit"] {
    width: 100%;
    padding: 10px;
    background-color: #007bff;
    border: none;
    color: #fff;
    cursor: pointer;
}

.signin-container input[type="submit"]:hover {
    background-color: #0056b3;
}

.signin-container p {
    color: red;
    text-align: center;
}
</style>
</head>
<body>
<div class="signin-container">
<h1>Signin</h1>
<form action="${pageContext.request.contextPath}/login" method="post">

<label><a href="login.jsp">Click Here for Login</a></label><br><br>

<label for="name">Name</label><br>
<input type="text" id="name" name="name" size="20" maxlength="20" required><br><br>

<label for="lan">Language</label><br>
 <select id="lan" name="lan" required>
        <option value="en">English</option>
        <option value="ja">Japanese</option>
    </select><br><br>

<label for="mail">E-mail</label><br>
<input type="text" id="mail" name="mail" size="20" maxlength="20" required><br><br>

<label for="password">Password</label><br>
<input type="password" id="password" name="password" size="20" maxlength="20" required><br><br>

<label for="confirmpassword">Confirm password</label><br>
<input type="password" id="confirmpassword" name="confirmpassword" size="20" maxlength="20" required><br><br>



        <input type="submit" name="Signin" value="Signin">
</form>

    <ul id="errorMessages">
<%
        String errorMessage = (String) request.getAttribute("errorMessage");
        if (errorMessage != null) {
        %>
<li style="color:red;"><%= errorMessage %></li>
<%
        }
        %>
</ul>
</div>

<script>
    function togglePasswordVisibility() {
        var passwordField = document.getElementById("password");
        if (passwordField.type === "password") {
            passwordField.type = "text";
        } else {
            passwordField.type = "password";
        }
    }
</script>
</body>
</html>