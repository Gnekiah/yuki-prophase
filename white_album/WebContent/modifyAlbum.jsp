<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv=refresh content="3; url=/white_album/index.jsp">
<title>相册重命名</title>
</head>
<body>
<%boolean result = (boolean) request.getAttribute("modifyAlbum");
if (result) {
   	out.println("相册重命名成功！");
}
else {
    out.println("相册重命名失败！");
}
out.println("即将跳转！");
%>
</body>
</html>