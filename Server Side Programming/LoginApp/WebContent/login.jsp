<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <script src="validate.js"></script>
    <style>
        body { font-family: Arial; display: flex; justify-content: center; margin-top: 100px; }
        .box { border: 1px solid #ccc; padding: 30px; border-radius: 8px; width: 300px; }
        input { width: 100%; padding: 8px; margin: 8px 0; box-sizing: border-box; }
        button { width: 100%; padding: 10px; background: #4CAF50; color: white; border: none; border-radius: 4px; cursor: pointer; }
        .error { color: red; font-size: 14px; }
        a { display: block; margin-top: 10px; text-align: center; }
    </style>
</head>
<body>
<div class="box">
    <h2>Login</h2>

    <%-- Show error message if login fails --%>
    <% String msg = (String) request.getAttribute("msg");
       if (msg != null) { %>
        <p class="error"><%= msg %></p>
    <% } %>

    <form action="LoginServlet" method="post" onsubmit="return validateLogin()">
        <label>Username:</label>
        <input type="text" name="username" id="username" placeholder="Enter username"/>

        <label>Password:</label>
        <input type="password" name="password" id="password" placeholder="Enter password"/>

        <button type="submit">Login</button>
    </form>
    <a href="register.jsp">New user? Register here</a>
</div>
</body>
</html>