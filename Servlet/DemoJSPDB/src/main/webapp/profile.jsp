<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import='java.sql.*' %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	232
	ashutosh
	99
	
	<%
		String url = "jdbc:mysql://host1:33060/ashu";
		String username = "root";
		String password = "mysql";
		String sqlQuery = " ";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sqlQuery);
		rs.next();
	%>
	
		Name : <%= rs.getString(1) %>
	
</body>
</html>