<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LAB2</title>


</head>
<body bgcolor="red">
	<table border="1">
		<thead>
			<tr>

				<th>Title</th>
				<th>Price</th>
				<th>Publisher</th>
				<th>PublishDate</th>
				<th>ISBN</th>

			</tr>
		</thead>
		<tbody>
			<tr>

				<td align="center"><s:property value="lib.title" /></td>
				<td align="center"><s:property value="lib.price" /></td>
				<td align="center"><s:property value="lib.publish" /></td>
				<td align="center"><s:property value="lib.pub_date" /></td>
				<td align="center"><s:property value="lib.ISBN" /></td>
			</tr>
		</tbody>
	</table>
	<hr/>
	<table border="1">
		<thead>
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Country</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td align="center"><s:property value="author.name" /></td>
				<td align="center"><s:property value="author.age" /></td>
				<td align="center"><s:property value="author.country" /></td>
			</tr>
		</tbody>
	</table>

</body>
</html>