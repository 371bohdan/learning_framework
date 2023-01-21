<%-- 
    Document   : resultStudents
    Created on : 18 янв. 2023 г., 01:42:59
    Author     : Богдан
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Результати обрахунків по студентам</title>
    </head>
    <body>
      <h1>Statistics</h1>
      <h2> Average age: ${stat.getAverageAge()} </h2>
      <h2> Min age: ${stat.getMinAge()} </h2>
      <h2> Max age: ${stat.getMaxAge()} </h2>
      <h2> Popular email: ${stat.getPopularEmail()} </h2>
      <h2> Count Sumdu domen: ${stat.getCountEmailSumdu()} </h2>
      <h2> Count group: ${stat.getCountGroup()} </h2>
    </body>
</html>