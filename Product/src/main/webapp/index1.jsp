<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Details</title>
</head>
<body>
<h1>Product Details</h1>
<form method="get" action="add">
    <button>Add New Product</button>
</form>
<br/>
<table border="1" style="border:5px solid black; width:50%;text-align:center">
  <tr styele="background-color:lightblue">
  <th>Product Id</th>
  <th>Product Price</th>
  <th>Product Name</th>
  <th>Action1</th>
  <th>Action2</th>
  </tr>
  <c:forEach var="product" items="${products}">
    <tr>
  <td>${product.productId}</td>
  <td>${product.productPrice}</td>
  <td>${product.productName}</td>
  <td>
  <a href="delete?productId=${product.productId }" onclick="return confirm('Do you wish to delete ${product.productName}?')">Delete</a>
  </td>

   <td>
     <a href="edit?productId=${product.productId }">Update</a>
      
      </td>
  </tr> 
  </c:forEach>


</table>
</body>
</html>