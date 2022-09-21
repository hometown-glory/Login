<%--
  Created by IntelliJ IDEA.
  User: 17837
  Date: 2022/9/20
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>用户登录</title>
    <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
</head>
<body>
<div style="text-align:center">
    <form action="login" id="loginFrom" method="post">
        姓名<input type="text" name="uname" id="uname" value="${MessageModel.object.username}"><br>
        密码<input type="password" name="upwd" id="upwd" value="${MessageModel.object.userPwd}"><br>
        <span id="msg" style="font-size: 12px;color: red">${MessageModel.msg}</span><br>
        <button type="button" id="loginBtn">登录</button>
        <button type="button">注册</button>
    </form>
</div>
</body>

<script type="text/javascript">
    $("#loginBtn").click(function () {
        var uname = $("#uname").val();
        var upwd = $("#upwd").val();

        if (isEmpty(uname)) {
            $("#msg").html("姓名不能为空");
            return;
        }

        if (isEmpty(upwd)) {
            $("#msg").html("密码不能为空");
            return;
        }

        $(" #loginFrom ").submit();
    });

    function isEmpty(str) {
        if (str == null || str.trim() == "") {
            return true;
        }
        return false;
    }
</script>
</html>
