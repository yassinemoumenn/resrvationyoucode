<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Table V04</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/list.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
	
<!-- For Demo Purpose -->
<div class="container py-5">
    <header class="text-center">
        <h1 class="display-4 font-weight-bold">Reserve votre place</h1>
   
    </header>
</div>

   <form:form action="saveReservation" method="post" modelAttribute="reservation">
<div class="container">
    <div class="row">
        <div class="col-md-6 mx-auto">
            <div class="py-4 text-center"><i class="fa fa-calendar fa-5x"></i></div>

            <!-- Date Picker Input -->
            <div class="form-group mb-4">
                <div class="datepicker date input-group p-0 shadow-sm">
                 <input placeholder="Choose a reservation date" class="form-control py-4 px-4" type="Date" name="date" path="dateReservation"> 
                   
                    <div class="input-group-append"><span class="input-group-text px-4"></span></div>
                </div>
            </div>  
            <div class="text-center">
               
                <input class="btn btn-primary btn-sm px-4 rounded-pill text-uppercase font-weight-bold shadow-sm" type="submit" value="Save" >
            </div>
        </div>
    </div>
</div>
        </form:form>



	<script src="${pageContext.request.contextPath}/resources/js/list.js"></script>


<!--===============================================================================================-->	
	<script src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/popper.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	

</body>
</html>