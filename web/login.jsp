<%--
  Created by IntelliJ IDEA.
  User: xin
  Date: 15-1-11
  Time: 下午5:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<a href="user/ajax.do">测试json</a>
<form action="user/login.do" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="userName"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="登陆">
            </td>
        </tr>
    </table>
</form>


</body>
</html>
