<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

  <style>
    
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
    
     .jumbotron {
      margin-bottom: 0;
    }
   
    
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>
    
</head>
<body bgcolor="blue">
<div class="jumbotron">
  <div class="container text-left">
    <h1>Flipkart</h1>     
    <p>Explore Plus</p>
     <input type="text" placeholder="Search..">
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
     
    </div>
      
      <ul class="nav navbar-nav navbar-left">
        <li class="active"><a href=index.html>Home</a></li>
        <li><a href="#">Products</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="login.jsp"><span class="glyphicon glyphicon-user"></span>Login </a></li>
        <li><a href="cart.html"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>

</nav>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
      <div class="panel-heading">REDMI 4A</div>
     <div class="panel-body"><img src="C:\Users\mokoutar\Desktop\New folder\Redmi 4 pro.jfif" class="img-responsive" style="width:100%" alt="Image"></div>
       <div class="panel-footer">redmi 4 pro</div>
       <div><a href="redmi.html"><button type="submit">ADD TO CART</button></div>
      <div><a href="login.jsp"><button type="submit">BUY NOW</button></a></div>
        
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">REDMI 5A</div>
        <div class="panel-body"><img src="C:\Users\mokoutar\Desktop\New folder\Redmi 5A.jfif" class="img-responsive" style="width:100%" alt="Image"></div>
         <div class="panel-footer">redmi 5A</div>
         <div> <a href="redmi 5A.html"><button type="submit">ADD TO CART</button></div>
         <div><a href="login.jsp"><button type="submit">BUY NOW</button></a></div>
      
      
      
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">OKWU</div>
        <div class="panel-body"><img src="C:\Users\mokoutar\Desktop\New folder\OKWU.jfif" class="img-responsive" style="width:100%" alt="Image"></div>
         <div class="panel-footer">OKWU</div>
          <div><a href="okwu.html"><button type="submit">ADD TO CART</button></div>
          <div><a href="login.jsp"><button type="submit">BUY NOW</button></a></div>
      </div>
    </div>
  </div>
</div><br>

<div class="container">    
  <div class="required">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">LENOVO</div>
        <div class="panel-body"><img src="C:\Users\mokoutar\Desktop\New folder\lenovo.jfif" class="img-responsive" style="width:100%" alt="Image"></div>
         <div class="panel-footer">lenovo</div>
         <div> <a href="lenovo.html"><button type="submit">ADD TO CART</button></div>
         <div><a href="login.jsp"><button type="submit">BUY NOW</button></a></div>
      
      
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">REDMI Y1</div>
        <div class="panel-body"><img src="C:\Users\mokoutar\Desktop\New folder\REDMI Y1.jfif" class="img-responsive" style="width:100%" alt="Image"></div>
         <div class="panel-footer">Redmi Y1</div>
         <div> <a href="redmi y1.html"></a><button type="submit">ADD TO CART</button></div>
         <div><a href="login.jsp"><button type="submit">BUY NOW</button></a></div>
      
      
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">REDMI Y2</div>
        <div class="panel-body"><img src="C:\Users\mokoutar\Desktop\New folder\Redmi y2.jfif" class="img-responsive" style="width:100%" alt="Image"></div>
         <div class="panel-footer">Redmi y2</div>
         <div> <a href="Redmi y2.html"><button type="submit">ADD TO CART</button></div>
         <div><a href="login.jsp"><button type="submit">BUY NOW</button></a></div>
   
      </div>
    </div>
  </div>
</div><br><br>

<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>  
  <form class="form-inline">Get deals:
    <input type="email" class="form-control" size="50" placeholder="Email Address">
    <button type="button" class="btn btn-danger">Sign Up</button>
  </form>
</footer>

</body>
</html>

</body>
</html>