<%--
  Created by IntelliJ IDEA.
  User: 86191
  Date: 2024/3/18
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
New User Registration
    <form  action="register" method="post" >
       username :<input type="text" name="username"><br>

       password: <input type="password" name="password"><br>
       email :<input type="text" name="email"><br>

        Gender: <input type="radio" name="gender" value="male"> Male <input type="radio" name="gender" value="female">Female<br>
        Date of Birth: <input type="text name=" name="birthdate"><br>
        <input type="submit" value="Register">
    </form>
</center>
</body>
</html>
