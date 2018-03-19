<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="${pageContext.request.contextPath }/result" method="post">
       按姓名查询：<input type="text" name="selectbyname" id="selectbyname"><input type="submit" value="查询">
</form>
</div><br><br>
<table align="center" border="1">
        <tr>
            <td>id</td>
            <td>name</td>
            <td>sex</td>
            <td>age</td>
            <td>phone</td>
        </tr>
        <c:forEach items="${list}" var="c" varStatus="st">
            <tr>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td>${c.sex}</td>
                <td>${c.age}</td>
                <td>${c.phone}</td>
                <td>
                    <a href="${pageContext.request.contextPath }/edit?id=${c.id}">edit</a>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath }/delete?id=${c.id}">delete</a>
                </td>
            </tr>
        </c:forEach>
        </table>
       <br><br>
       <div align="center">
       <form action="${pageContext.request.contextPath }/addpage" method="get">
             <input type="submit" value="新增">
       </form></div>
</body>
</html>