<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/add" method="post">
  name:<input type="text" name="name"><br>
  sex:<input type="text" name="sex"><br>
  age:<input type="text" name="age"><br>
  phone:<input type="text" name="phone"><br>
  <input type="submit" value="保存">
</form>
</body>
</html>