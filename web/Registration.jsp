<%--
  Created by IntelliJ IDEA.
  User: sruthimedavaram
  Date: 8/12/18
  Time: 5:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="/Registration" method="post">
First name:<input type="text" name="First name" required> <br>
Last name:<input type="text" name="Last name" required><br>
<input type="radio" value="gender" value="Male"> Male <br>
<input type="radio" value="gender" value="Female"> Female <br>
<input type="radio" value="gender" value="Others"> others <br>
<label>Username:</label>
<input type="text" name="Username" required> <br>
<label>Password:</label>

<input type="text" name="Password" required> <br>
<input type="submit" value="submit"> <br>
</form>






</body>
</html>
