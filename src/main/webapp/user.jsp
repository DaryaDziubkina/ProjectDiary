<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <style>
        <%@include file='style.css' %>
    </style>
    <title> this page created by Dashka</title>
    <meta http-equiv="author" content="Darya"/>
    <meta http-equiv="expires" content="Fri, 1 Apr 2015 23:59:59 GMT"/>
</head>
<body>
<div class="main_block">
    <div class="header">
        <h1>
            <center> Hello ${name1}</center>
        </h1>
    </div>

    <form action="" method="post">
        <div class="content">
            <fieldset>
                <legend>Регистрация</legend>
                <%--<label>UID:<br/>--%>
                <%--<input type="text" name="id" value="${id_user}"/></label><br/>--%>
                <label>Name:<br/>
                    <input type="text" name="name" value="${name}" placeholder="Darya"/></label><br/>
                <label>Email:<br/>
                    <input type="email" name="email" value="${email}" placeholder="dasha.dub@gmail.com"/></label><br/>
                <label>Password:<br/>
                    <input type="password" placeholder="********" name="password" size="8" maxlength="30"
                           required="required" value="${password}"/></label><br/>
                <br/>
            </fieldset>
            <button style="width:100px; height:50px" name="action" value="getUID">Войти</button>
        </div>
    </form>
</div>
</body>
</html>
