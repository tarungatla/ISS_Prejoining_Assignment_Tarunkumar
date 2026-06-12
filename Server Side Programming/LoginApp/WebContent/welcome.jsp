<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    // Redirect to login if not logged in
    String user = (String) session.getAttribute("username");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<html>
<head>
    <title>Welcome</title>
    <style>
        body { font-family: Arial; display: flex; justify-content: center; margin-top: 100px; }
        .box { border: 1px solid #ccc; padding: 30px; border-radius: 8px; width: 300px; text-align: center; }
        button { padding: 10px 20px; background: #f44336; color: white; border: none; border-radius: 4px; cursor: pointer; margin-top: 20px; }
    </style>
</head>
<body>
<div class="box">
    <h2>Welcome, <%= user %>! 👋</h2>
    <p>You have successfully logged in.</p>

    <form action="LogoutServlet" method="post">
        <button type="submit">Logout</button>
    </form>
</div>
</body>
</html>