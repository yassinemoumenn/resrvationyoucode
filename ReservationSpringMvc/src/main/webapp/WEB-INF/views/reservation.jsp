<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Table V04</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
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
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100 ver1 m-b-110">
					<div class="table100-head">
						<table>
							<thead>
								<tr class="row100 head">
									<th class="cell100 column1">Etudient</th>
 									<th class="cell100 column3">Date</th>
									<th class="cell100 column4">Confirmation</th>
									<th scope="cell100 column5">Select</th>
									
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
                    <td>${reservation.dateReservation}</td>
                    <%-- <td>${reservation.confirmation}</td>
 --%>					<td>
                        <c:if test="${reservation.confirmation == true}">
                            Valide
                        </c:if>
                        <c:if test="${reservation.confirmation == false}">
                            Invalide
                        </c:if>
                    </td>
                    <td class="d-flex flex-row">
                        <form action="deleteReservation"  method="post">
                            <input type="hidden" value="${reservation.idReservation}"  name="id" class="form-control"/>
                            <input type="submit" value="Supprimer" class="btn btn-danger btn-sm">
                        </form>
                        <c:if test="${reservation.confirmation == false}">
                            <form action="AccpterReservation"  method="post">
                                <input type="hidden" value="${reservation.idReservation}"  name="id" class="form-control"/>
                                <input type="submit" value="Accepter" class="btn btn-primary btn-sm">
                            </form>
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
 
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>


<!--===============================================================================================-->	
	<script src="resources/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/bootstrap/js/popper.js"></script>
	<script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
	<script>
		$('.js-pscroll').each(function(){
			var ps = new PerfectScrollbar(this);

			$(window).on('resize', function(){
				ps.update();
			})
		});
			
		
	</script>
<!--===============================================================================================-->
	<script src="resources/js/main.js"></script>

</body>
</html>