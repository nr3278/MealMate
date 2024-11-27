<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f9f9f9;
    margin: 0;
    padding: 0;
    height: 100vh;
}

.login-container {
    margin: 100px auto;
    padding: 20px;
    background-color: #fff;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.login-container h1 {
    text-align: center;
    margin-bottom: 20px;
    background-color: #f1f1f1;
    padding: 10px;
    border-bottom: 1px solid #ddd;
    text-align: center;
    font-size: 25px;
}

.login-container input[type="text"],
.login-container input[type="password"] {
    display: block;
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ddd;
    box-sizing: border-box;
}

.login-container label {
    display: flex;
    align-items: center;
    margin-bottom: 10px;
}

.login-container label input {
    margin-right: 5px;
}

.login-container input[type="submit"] {
    width: 100%;
    padding: 10px;
    background-color: #007bff;
    border: none;
    color: #fff;
    cursor: pointer;
}

.login-container input[type="submit"]:hover {
    background-color: #0056b3;
}

.login-container p {
    color: red;
    text-align: center;
}
</style>
</head>
<body>
<div class="login-container">
<h1>Login</h1>
<form action="${pageContext.request.contextPath}/login" method="post">
<label for="id">E-mail</label>
<input type="text" id="id" name="id" size="20" maxlength="20" required><br><br>

        <label for="password">password</label>
<input type="password" id="password" name="password" size="20" maxlength="20" required><br><br>

<label><a href="signin.jsp">Click Here for Signin</a></label>

        <input type="submit" name="login" value="Login">
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