<%--
  Created by IntelliJ IDEA.
  User: xin
  Date: 15-1-10
  Time: 下午9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form action="student/save.do" method="post">
    <table>
        <tr>
            <th colspan="2">学生修改</th>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" value="${student.name}"></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age" value="${student.age}"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="hidden" name="id" value="${student.id}">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
