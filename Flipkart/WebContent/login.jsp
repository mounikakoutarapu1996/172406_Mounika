<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body style="background-color:powderblue;">
<center> 
<h2>login page</h2>
<form action="LoginServlet" method="post"> 
<br/>Username:<input type="text" name="username"> 
<br>
<br/>Password:<input type="password" name="password"> 
<br>
<br/><input type="submit" value="Submit"> 
 <div class="container login">
 <td colspan="2">Yet Not Registered!! <a href="register.jsp">Register Here</a></td>
  </div>
</form> 
</center> 
</body> 
</html>

