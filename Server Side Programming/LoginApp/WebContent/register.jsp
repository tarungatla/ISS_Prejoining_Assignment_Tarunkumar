<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register Page</title>
    <script src="validate.js"></script>
    <style>
        body { font-family: Arial; display: flex; justify-content: center; margin-top: 100px; }
        .box { border: 1px solid #ccc; padding: 30px; border-radius: 8px; width: 300px; }
        input { width: 100%; padding: 8px; margin: 8px 0; box-sizing: border-box; }
        button { width: 100%; padding: 10px; background: #2196F3; color: white; border: none; border-radius: 4px; cursor: pointer; }
        a { display: block; margin-top: 10px; text-align: center; }
    </style>
</head>
<body>
<div class="box">
    <h2>Register</h2>

    <% String msg = (String) request.getAttribute("msg");
       if (msg != null) { %>
        <p style="color:green"><%= msg %></p>
    <% } %>

    <form action="RegisterServlet" method="post" onsubmit="return validateRegister()">
        <label>Username:</label>
        <input type="text" name="username" id="reg_username" placeholder="Choose username"/>

        <label>Password:</label>
        <input type="password" name="password" id="reg_password" placeholder="Min 6 characters"/>

        <label>Confirm Password:</label>
        <input type="password" name="confirm" id="reg_confirm" placeholder="Repeat password"/>

        <button type="submit">Register</button>
    </form>
    <a href="login.jsp">Already have an account? Login</a>
</div>
</body>
</html>