
<%
    String name = (String) session.getAttribute("username");
%>

<html>
<head>
    <title>Session Check</title>
</head>
<body>

<%
    if (name != null) {
%>
        <h2>Session Active!</h2>
        <p>Hello <%= name %>, your session is still alive.</p>
<%
    } else {
%>
        <h2>Session Expired!</h2>
        <p>Your session has expired. Please login again.</p>
        <a href="index.jsp">Go Back</a>
<%
    }
%>

</body>
</html>

