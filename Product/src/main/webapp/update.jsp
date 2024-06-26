<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>
</head>
<body>
<h1>Update Product</h1>
<form method="post" action="update-product">
<table>
<tr>
    <td><label>Product Id</label></td>
    <td><input type="text" name="productId" value="${product.productId}" readonly /></td>
</tr>
<tr>
    <td><label>Product Price</label></td>
    <td><input type="text" name="productPrice" value="${product.productPrice}" /></td>
</tr>
<tr>
    <td><label>Product Name</label></td>
    <td><input type="text" name="productName" value="${product.productName}" /></td>
</tr>
</table>
<button type="submit">Update Product</button>
</form>
</body>
</html>
