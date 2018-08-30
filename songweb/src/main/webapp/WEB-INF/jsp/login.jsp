<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>LOGIN</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="icon" href="../image/picture.ico" type="image/x-icon"/>

<!-- <link rel="stylesheet" type="text/css" href="../css/login.css"> -->
<script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="../js/verifyCode.js"></script>

</head>
<body>
<input type="hidden" id="path" value="<%=path %>"/>
<input type="hidden" id="basePath" value="<%=basePath %>"/>
	<div id="login-form">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td width="100"> </td>
			<td width="100">验证码：</td>
			<td width="150">
				<input id="veryCode" name="veryCode" type="text" class="yzm" value="" onblur="isRightCode()" /></td>
			<td width="135"><img id="imgObj" alt="" src="<%=basePath%>login/img"
				onclick="changeImg()" /></td>
			<td><a href="#" onclick="changeImg()">换一张</a></td>
			<td></td>
		</tr>
		<tr>
			<td style="line-height: 38px; color: #FF0000; text-align: center;" colspan="4" id="info"> </td>
			<td></td>
		</tr>
	</table>
	</div>
</body>
</html>
