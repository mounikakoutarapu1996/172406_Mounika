<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<body>

<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>
</head>
 <body></body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
     
    </div>
   
    
  </div>
  
  <nav class="navbar navbar-expand-sm navbar-dark">
     
      <a class="navbar-brand" href="#">PET CARE</a>
    
      
      <ul class="navbar-nav" >
       
        <li class="nav-item">
            <a routerLink="customer" class="nav-link" role="button" routerLinkActive="active">Puppies</a>
        </li>
      
        <li class="nav-item">
            <a routerLink="add" class="nav-link" role="button" routerLinkActive="active">Add Puppy</a>
        </li>
        <li class="nav-item">
            <a routerLink="findbyage" class="nav-link" role="button" routerLinkActive="active">Search</a>
        </li>
        <li class="nav-item">
            <a routerLink="register" class="nav-link" role="button" routerLinkActive="active">Register</a> 
        </li>
    
        
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
           Login
          </a>
          <div class="dropdown-menu">
              <ul class="nav navbar-nav navbar-right">
                  <a href="#" class="dropdown-item" routerLink="login" role="button" routerLinkActive="active"><span class="glyphicon glyphicon"></span>Login As Admin</a> 
          
                  <a href="#" class="dropdown-item" routerLink="login" role="button" routerLinkActive="active"><span class="glyphicon glyphicon"></span>Login As Owner</a> 
              
                  <a href="#" class="dropdown-item" routerLink="login" role="button" routerLinkActive="active"><span class="glyphicon glyphicon"></span>Login As Borrower</a> 
              </ul> 
          </div>
        
        
        </li>
     
      </ul>
    
    </nav>
    <br>
  
</nav> 

</body>
</html>
