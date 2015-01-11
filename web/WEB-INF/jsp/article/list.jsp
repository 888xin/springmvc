<%--
  Created by IntelliJ IDEA.
  User: xin
  Date: 15-1-11
  Time: 下午6:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<table>
    <tr>
        <th colspan="2">
            <img src="${pageContext.request.contextPath}/resources/less.png" alt="文章列表">
        </th>
    </tr>
    <tr>
        <td>1</td>
        <td>
            <a href="${pageContext.request.contextPath}/article/details/1" target="_blank">文章一</a>
        </td>
    </tr>
    <tr>
        <td>2</td>
        <td>
            <a href="${pageContext.request.contextPath}/article/details/2" target="_blank">文章二</a>
        </td>
    </tr>
</table>

</body>
</html>
