<html>
<body>
	<h2>ERROR PAGE!</h2>
	<p>
		Exception -
		<%=request.getAttribute("error")%></p>
	<ul>
		<li><a href="<%=request.getContextPath()%>/jsp/HomePage.jsp">Go Home</a></li>
	</ul>
</body>
</html>
