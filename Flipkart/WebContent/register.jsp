<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body style="background-color:powderblue;">>
<form action="RegisterServlet" method="post">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
            
                        <br/>name:<input type="text" name="name">
                        <br>
                        <br/>email:<input type="text" name="email">
                        <br>
                        <br/>password:<input type="password" name="password">
                         <br>
                        <br/>Phone:<input type="password" name="phone">
                        <br>
                        <br>
                        <input type="submit" value="Login">
                        
                        <input type="reset" value="Reset">
                         <br>
                         <p>Already have an account? <a href=login.jsp>Sign in</a>.</p>
                       
                   
                
           
        </form>
   
</body>
</html>