<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Minh Hung
  Date: 01/04/2020
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <h2>List Customer</h2>
    <a href="/customer?action=create" class="btn btn-"></a>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="customer" items="${requestScope['customers']}">
        <tr>
            <td><c:out value="${customer.getId()}"></c:out></td>
            <td><c:out value="${customer.getName()}"></c:out></td>
            <td><c:out value="${customer.getphone()}"></c:out></td>
            <td><c:out value="${customer.getEmail()}"></c:out></td>
            <td><c:out value="${customer.getAddress()}"></c:out></td>
            <td>
            <a href="#" class="btn btn-primary"></a>
            <a href="#" class="btn btn-dranger"></a>
            </td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
