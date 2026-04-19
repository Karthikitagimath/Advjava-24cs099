<%@ page import="javax.servlet.http.Cookie" %>

<%
    String name = request.getParameter("name");
    String domain = request.getParameter("domain");
    int age = Integer.parseInt(request.getParameter("age"));

    // Create cookie
    Cookie c = new Cookie(name, domain);

    // Set expiry
    c.setMaxAge(age);

    // Add cookie
    response.addCookie(c);
%>

<html>
<head>
    <title>Cookie Added</title>
</head>
<body>

<h2>Cookie Added Successfully!</h2>

<p><b>Name:</b> <%= name %></p>
<p><b>Domain:</b> <%= domain %></p>
<p><b>Max Age:</b> <%= age %> seconds</p>

<br>
<a href="viewCookies.jsp">Go to Active Cookie List</a>

</body>
</html>