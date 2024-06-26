<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
</head>
<body>
<h1>Add Product</h1>
<form method="post" action="add-product">
<table>
<tr>
     <td><label>Product Id</label></td>
     <td><input type="text" name="productId"/></td>
</tr>
<tr>
     <td><label>Product Price</label></td>
     <td><input type="text" name="productPrice"/></td>
</tr>
<tr>
     <td><label>Product Name</label></td>
     <td><input type="text" name="productName"/></td>
</tr>
</table>
<button>Save Product</button>
</form>
</body>
</html>