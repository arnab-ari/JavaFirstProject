<html>
<head>
<title>Hello World JSP</title>

</head>

<body>
<%

	out.println("<h2>Hello World From JSP!</h2>");

%>

This page was last accessed on : <%= new java.util.Date() %>


</body>

</html>