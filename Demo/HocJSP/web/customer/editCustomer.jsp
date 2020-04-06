<%--
  Created by IntelliJ IDEA.
  User: Minh Hung
  Date: 05/04/2020
  Time: 9:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Customer</title>
</head>
<body>
<h1 style="text-align: center "><a href="list">List All Customer</a></h1>
<div align="center">
    <form action="update" method="post">
        <table border="1" cellpadding="5">
            <caption>Add New Customer</caption>
            <tr>
                <td>
                    <input type="hidden" name="id" size="45" value="${customerList.getId()}" />
                </td>
            </tr>
            <tr>
                <th>Customer Name: </th>
                <td>
                    <input type="text" name="name" size="45" value="${customerList.getName()}"/>
                </td>
            </tr>
            <tr>
                <th>Customer Phone: </th>
                <td>
                    <input type="text" name="phone" size="45" value="${customerList.getPhone()}"/>
                </td>
            </tr>
            <tr>
                <th>Customer Email: </th>
                <td>
                    <input type="text" name="email" size="45" value="${customerList.getEmail()}" />
                </td>
            </tr>
            <tr>
                <th>Customer Address: </th>
                <td>
                    <input type="text" name="address" size="45" value="${customerList.getAddress()}" />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save" />
                </td>
            </tr>
        </table>

    </form>
</div>
</body>
</html>
