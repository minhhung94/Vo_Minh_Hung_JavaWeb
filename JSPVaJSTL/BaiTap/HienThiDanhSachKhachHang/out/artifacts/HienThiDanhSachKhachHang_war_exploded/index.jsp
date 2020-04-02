<%--
  Created by IntelliJ IDEA.
  User: Minh Hung
  Date: 02/04/2020
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
  <head>
    <title>Danh Sach Khach Hang</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  </head>
  <body>
  <div class="container">
    <table>
      <h2>Danh sách khách hàng</h2>
      <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Hình ảnh</th>
      </tr>
      <c:forEach items="${customers}" var="customer">
        <tr>
          <td>${customer.name}</td>
          <td>${customer.ngaysinh}</td>
          <td>${customer.address}</td>
          <td><img src="${customer.image}" alt=""></td>
        </tr>
      </c:forEach>
    </table>
  </div>
  </body>
</html>
