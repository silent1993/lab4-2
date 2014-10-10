<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library System</title>

</head>
<body>
	<s:form name="list" action="list" namespace="/">
		<s:textfield name="name" label="name" />
		<s:submit value="search"/>
	</s:form>
	<s:if test="listb.size()>0">
		<table cellspacing="0">
			<thead>
				<tr>
					<th>Title</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="listb">
					<tr>
						<td><a
							href='<s:url action="search"><s:param name="ISBN" value="ISBN" /></s:url>'>
								<s:property value="title" />
						</a></td>
						<td><a
							href='<s:url action="delete"><s:param name="ISBN" value="ISBN" /></s:url>'>
								Delete</a></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</s:if>
	<s:else>

	</s:else>
	<s:form name="insert" action="insert" namespace="/">
	<s:submit value="insert"/>
	</s:form>
</body>
</html>