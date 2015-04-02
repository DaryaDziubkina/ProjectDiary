<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Bookmark</title>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
    <link rel="stylesheet" href="style.css">

    <script>
        $(function () {
            $("#datepicker").datepicker();
        });
    </script>
<body>
<div class="main_block">
    <div class="header">
        <h1>
            <center> Hello my friend</center>
        </h1>
    </div>
    <form action="" method="post">
        <div class="content">
            <%--@declare id="depart"--%>
            <p class="right">
                <label for="depart"> Date: </label>
                <input type="text" id="datepicker" name="end_data" value="${date}" placeholder="choice"/><br/>
                <label for="depart"> Time: </label>
                <input type="datetime" id="datetime" name="dateTime" value="${time}" placeholder="12:00:00"/><br/>
            </p>

            <label> Theme: </label><br/>
            <input type="text" name="theme" value="${theme}"/><br/>
            <label>Contents:</label><br/>
            <textarea type="text" name="text" value="${text}" rows="15" cols="91" placeholder="text"></textarea>

            <p>
            <fieldset>
                <legend> Select the level of importance:</legend>
                <input type="radio" name="genre" value="${low}"/> low
                <input type="radio" name="genre" value="${normal}" checked="checked"/> normal
                <input type="radio" name="genre" value="${high}"/> high
            </fieldset>
            <p class="right">
                <button style="width:150px; height:35px" class="action bluebtn">Save</button>
            </p>
        </div>
    </form>
</div>
</body>
</html>
