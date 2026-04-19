
<%
    String name = request.getParameter("uname");
    int time = Integer.parseInt(request.getParameter("time"));

    // Create session
    session.setAttribute("username", name);

    // Set session expiry time (convert minutes to seconds)
    session.setMaxInactiveInterval(time * 60);
%>

<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Hello <%= name %>!</h2>

    <p>
        Click below link to check session within expiry time:
    </p>

    <a href="checkSession.jsp">Check Session</a>

    <br><br>

    <p>
        Or wait for <%= time %> minute(s) to see session expiry.
    </p>
</body>
</html>

