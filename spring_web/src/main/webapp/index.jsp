<%--
  Created by IntelliJ IDEA.
  User: 19165
  Date: 2020/10/14
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生注册</title>
</head>
<body>
    <form action="reg" method="post">
        <table border="2px" align="center">
            <caption style="color: crimson; font-size: 20px">
                <strong>
                    学生注册
                </strong>
            </caption>
            <tr>
                <td>id</td>
                <td><input type="text" naem="id"></td>
            </tr>
            <tr>
                <td>name</td>
                <td><input type="text" naem="name"></td>
            </tr>
            <tr>
                <td>email</td>
                <td><input type="text" naem="email"></td>
            </tr>
            <tr>
                <td>age</td>
                <td><input type="text" naem="age"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="注册">
                    <input type="reset">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
