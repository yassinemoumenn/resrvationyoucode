 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta http-equiv="X-UA-Compatible" content="ie=edge">
      <title>reservation</title>
      <link rel="stylesheet" href="resources/hisorique.css">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
      <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
      <link rel="icon" type="image/png" href="resources/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/css/util.css">
	<link rel="stylesheet" type="text/css" href="resources/main.css">
	
   </head>
   <body>
   <a href="logout" class="button3">logout</a>
 
    <!--  <div class="res">
     <h2>Votre Reservation</h2></div> -->
   <div class="container">
 	 
   <div class="limiter">
      <div class="container-table100">
        <div class="wrap-table100">
          <div class="table100 ver1 m-b-110">
            <div class="table100-head">
              <table>
                <thead>
                  <tr class="row100 head">
                    <th class="cell100 column1">Nom</th>
                    <th class="cell100 column2">prenom</th>
                    <th class="cell100 column3">Date</th>
                    <th class="cell100 column3">Confirmation</th>
                    
                  
                  </tr>
                </thead>
              </table>
            </div>

            <div class="table100-body js-pscroll">
              <table>
              <tbody>
              <c:forEach var="reservation" items="${listReservation}">
                <tr>
                    <td>${reservation.apprenant.nom}</td>
                    <td>${reservation.apprenant.prenom}</td>
                    <td>${reservation.dateReservation}</td>
                    <td>
                        <c:if test="${reservation.confirmation == true}">
                            <p>Confirmer</p>
                        </c:if>
                        <c:if test="${reservation.confirmation == false}">
                            <p>En attante</p>
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
            
              </table>
            </div>
          </div>
        </div>
      </div>
    </div>
</div>
    <!--===============================================================================================-->
    <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/bootstrap/js/popper.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/select2/select2.min.js"></script>
    <!--===============================================================================================-->
    <script src="vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
    <script>
      $(".js-pscroll").each(function () {
        var ps = new PerfectScrollbar(this);

        $(window).on("resize", function () {
          ps.update();
        });
      });
    </script>
    <!--===============================================================================================-->
    <script src="js/main.js"></script>
  </body>
</html>