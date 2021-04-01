 <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta http-equiv="X-UA-Compatible" content="ie=edge">
      <title>Responsive Sticky Navbar</title>
      <link rel="stylesheet" href="resources/accuill.css">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
      <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
   </head>
   <body>
   <div class="container">
 <h1>
    <a href="#menu">Welcome</a>
 </h1>
    
<div class="popover" id="menu">
 <div class = 'content'>
  <a href="#" class="close"></a>
   <div class = 'nav'>
    <ul class = 'nav_list'>
      
      <div class ='nav_list_item'>
	  <li><a href="#">Home</a></li>
      </div>
     <div class = 'nav_list_item'>
		<li><a href="#">About</a></li>
      </div>
    <div class = 'nav_list_item'>
	  <li><a href="login">Login</a> </li>
      </div>
    <div class = 'nav_list_item'>
	  <li><a href="#">Services</a></li>
      </div>
     <div class = 'nav_list_item'>
		<li><a href="#">Contact</a></li>
      </div>
      
	</ul>
  </div>
 </div>
 </div>
 </div>
   </body>
</html>
