<%-- 
    Document   : index
    Created on : 18 янв. 2023 г., 01:02:11
    Author     : Богдан
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of a students </title>
    </head>
    <body>
        <form method = "post" action="StudentAdd">
            <table>
                <tbody>
                    <tr>
                        <td><label for="name">Name</td>
                        <td><input id="name" type="text" name = "name"></td>
                    </tr>
                    <tr>
                        <td><label for="surname">Surname</td>
                        <td><input id="surname" type="text" name = "surname"></td>
                    </tr>
                    <tr>
                        <td><label for="age">Age</td>
                        <td><input id="age" type="text" name = "age"></td>
                    </tr>
                    <tr>
                        <td><label for="email">Email</td>
                        <td><input id="email" type="text" name = "email"></td>
                    </tr>
                    <tr>
                        <td><label for="group">Group</td>
                        <td><input id="group" type="text" name = "group"></td>
                    </tr>
                    <tr>
                        <td><label for="faculty">Faculty</td>
                        <td><input id="faculty" type="text" name = "faculty"></td>
                    </tr>
                </tbody>
            </table>
            <input type ="submit" name= "send" value = "Відправити">
        </form>
        
    <c:if test = "${students.size() > 0}">
        <table class = "list">
            <tr>
                <th>Name</th>
                <th>Surname</th>
                <th>Age</th>
                <th>Email</th>
                <th>Group</th>
                <th>Faculty</th>
            </tr>
            <c:forEach var ="student" items ="${students}">
                <td><c:out value = "${student.getName()}"/></td>
                <td><c:out value = "${student.getSurname()}"/></td>
                <td><c:out value = "${student.getAge()}"/></td>
                <td><c:out value = "${student.getEmail()}"/></td>
                <td><c:out value = "${student.getGroup()}"/></td>
                <td><c:out value = "${student.getFaculty()}"/></td>
            </tr>
            </c:forEach>
        </table>
    </c:if>
    <c:if test = "${students.size() > 2}">
        <form action = "StatAdd">
            <input type = "submit" name = "state"  value ="test">
        </form>
    </c:if>
    </body>
</html>
