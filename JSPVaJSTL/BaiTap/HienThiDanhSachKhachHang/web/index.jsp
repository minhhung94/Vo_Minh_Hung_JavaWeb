<%--
  Created by IntelliJ IDEA.
  User: Minh Hung
  Date: 01/04/2020
  Time: 8:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>Customer Management Application</title>
  </head>
  <body>
  <h1 style="text-align: center">Customer Management</h1>
  <h2 style="text-align: center">
    <a href="#" >Add Customer</a>
    <a href="#" >List All Customer</a>
  </h2>
<div style="text-align: center">
  <table>
    <h2>List Of Customer</h2>
    <tr>
      <th>Id: </th>
      <th>Name: </th>
      <th>Phone: </th>
      <th>Email: </th>
      <th>Action: </th>
    </tr>
    <tr>
      <c:forEach var="customer" items="${listCustomer}">
        <tr>
            <td><c:out value="${customer.getId()}"></c:out></td>
        </tr>
      </c:forEach>
    </tr>
  </table>

</div>
  </body>
</html>
