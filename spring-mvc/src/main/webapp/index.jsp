<%@ page contentType="text/html; charset=gb2312"%>
<html>
<head>
    <meta>
</head>
<body>
<h2>Hello World!</h2>
<p>
    <a href="/hello">hello</a>
    <a href="/customServlet">customServlet</a>
    <a href="/annotation">annotation</a>
</p>

<form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file">
    <input type="submit" name="upload">
</form>

<a href="/download/1">home1.jpg</a>
<a href="/download/2">home2.jpg</a>

</body>
</html>
