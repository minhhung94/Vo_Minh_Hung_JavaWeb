<%--
  Created by IntelliJ IDEA.
  User: Minh Hung
  Date: 04/04/2020
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Customer Management Application</title>
  </head>
  <body>
  <h1 style="text-align: center">Customer Management</h1>
  <h2 style="text-align: center">
    <a href="new">Add New Customer</a>
    <a href="list">List All Customer</a>
  </h2>
  <div align="center">
      <table border="1" cellpadding="5">
          <caption><h2>List Of Customer</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Action</th>
        </tr>
<%--          Hiển thị danh sach customer--%>
          <c:forEach var="customer" items="${listCustomer}">
              <tr>
                  <td><c:out value="${customer.getId()}"/></td>
                  <td><c:out value="${customer.getName()}"/></td>
                  <td><c:out value="${customer.getPhone()}"/></td>
                  <td><c:out value="${customer.getEmail()}"/></td>
                  <td>
                      <a href="edit?id=<c:out value='${customer.getId()}'/>">Edit</a>
                      <a href="delete?id=<c:out value='${customer.getId()}'/> ">Delete</a>
                  </td>
              </tr>
          </c:forEach>
      </table>
  </div>
  </body>
</html>
