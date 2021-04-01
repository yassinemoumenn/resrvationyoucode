<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reservation</title>
</head>
<body>
    <div align="center">
         <h1>Welcome <%= request.getSession().getAttribute("prenom") %></h1>
 
        <h1>Reseravtion</h1>


        <form:form action="saveReservation" method="post"
            modelAttribute="reservation">


            <td>Date:</td>
            <form:input type="date" id="date" name="trip-start"
                value="2021-07-22" min="2021-01-01" max="2022-12-31"
                path="dateReservation" />
                  <div class="form-group col-md-4">
      <label for="inputState">Type</label>
      <form:select id="inputState" class="form-control" path="typeReservation">
        <form:option value ="weekend">weekend</form:option>
        <form:option value ="matin">morning</form:option>
        <form:option value ="soir">evening</form:option>
      </form:select>
    </div>

            <input type="submit" value="Save">

        </form:form>




    </div>
<script>



    function SetMinDate() {
        var now = new Date();

        var day = ("0" + now.getDate()).slice(-2);
        var month = ("0" + (now.getMonth() + 1)).slice(-2);

        var today = now.getFullYear() + "-" + (month) + "-" + (day);


        document.getElementById("date").min = today;

    }
    SetMinDate();
</script>
</body>
</html>