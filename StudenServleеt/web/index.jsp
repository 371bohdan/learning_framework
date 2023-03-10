<%-- 
    Document   : index.jsp
    Created on : 23 дек. 2022 г., 14:39:59
    Author     : Богдан
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Students</title>
        <style>
            h1{
                text-align: center;
            }
            #page{
                width:800px;
                margin:auto;
            }
            form{
                width:400px;
                margin:20px auto;
            }
            input[type=submit]{
                margin:auto;
            }
            .list, .list td, .list th{
                margin: auto;
                border: 1px solid black;
                border-collapse: collapse;
            }
            .list td, .list th{
                padding: 10px;
            }
        </style>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method = "post" action="StudenAdd">
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
        
    <c:if test = "${studens.size() > 0}">
        <table class = "list">
            <tr>
                <th>Name</th>
                <th>Surname</th>
                <th>Age</th>
                <th>Email</th>
                <th>Group</th>
                <th>Faculty</th>
            </tr>
            <c:forEach var ="studen" items ="${studens}">
                <td><c:out value = "${studen.getName()}"/></td>
                <td><c:out value = "${studen.getSurname()}"/></td>
                <td><c:out value = "${studen.getAge()}"/></td>
                <td><c:out value = "${studen.getEmail()}"/></td>
                <td><c:out value = "${studen.getGroup()}"/></td>
                <td><c:out value = "${studen.getFaculty()}"/></td>
            </tr>
            </c:forEach>
        </table>
    </c:if>
    </body>
</html>
