<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE HTML>
<html>
	<head>
		<title>用户注册</title>
	</head>

	<body style="text-align: center;">
		<form:form action="${pageContext.request.contextPath}/sysout" method="post">
			<table width="60%" border="1">
				<tr>
					<td>用户名</td>
					<td>
						<%--使用EL表达式${}提取存储在request对象中的formbean对象中封装的表单数据(formbean.userName)以及错误提示消息(formbean.errors.userName)--%>
						<input type="text" name="nickName" value="${formbean.nickName}">${formbean.errors.nickName}
					</td>
				</tr>
				<tr>
					<td>密码</td>
					<td>
						<input type="password" name="password" value="${formbean.password}">${formbean.errors.password}
					</td>
				</tr>
				<tr>
					<td>确认密码</td>
					<td>
						<input type="password" name="confirmPwd" value="${formbean.confirmPwd}">${formbean.errors.confirmPwd}
					</td>
				</tr>
				<tr>
					<td>
						<input type="reset" value="清空">
					</td>
					<td>
						<input type="submit" value="注册">
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>
