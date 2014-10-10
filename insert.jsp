<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form name="insert" action="insert" namespace="/">
		<s:textfield name="title" label="title" />
		<s:textfield name="name" label="name" />
		<s:textfield name="price" label="price" />
		<s:textfield name="publish" label="publisher" />
		<s:textfield name="pub_date" label="pub_date" />
		<s:textfield name="ISBN" label="ISBN" />
		<hr/>
		<s:textfield name="age" label="Author_Age" />
		<s:textfield name="country" label="Author_Country" />
		<s:submit />
	</s:form>
	<s:form name="back" action="back" namespace="/">
		<s:submit value="back to home" />
	</s:form>
</body>
</html>