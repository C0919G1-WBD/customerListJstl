<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/12/2019
  Time: 8:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>Customer List</title>
    <style>
      div {
        width: 100%;
        text-align: center;
      }
      table {
        width: 60%;
        margin: auto;
        text-align: center;
      }
      td, th {
        padding: 10px;
        border-bottom: 1px solid #c3c3c3;
      }
    </style>
  </head>
  <body>
  <div>
    <h1>Danh sách khách hàng</h1>
    <table>
      <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
      </tr>
      <c:forEach items="${customer}" var="cus">
        <tr>
          <td>${cus.getName()}</td>
          <td>${cus.getDob()}</td>
          <td>${cus.getAddress()}</td>
          <td><img src="${cus.getImage()}" alt="image" width="100px" height="100px"></td>
        </tr>
      </c:forEach>
    </table>
  </div>
  </body>
</html>
