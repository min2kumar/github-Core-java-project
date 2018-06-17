<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .f1
            {
                float:left;
                border:0px;
                overflow:scroll;
                background: -webkit-linear-gradient(top, #b3dced 0%,#29b8e5 50%, #bce0ee 100%)
            }
            .f2
            {
                float:right;
                border:0px;
                background-color: darkorange;
                overflow:scroll;
            }
            .f3
            {
                float:middle;
                border:0px;
                overflow:scroll;
                background: -webkit-linear-gradient(top, #b9f2b8 0%,#29b8e5 50%, #bce0ee 100%)
            }
            .f4
            {
                float:left;
                border:0px;
                overflow:scroll;
            }
        </style>
    </head>
    <body>
        <iframe class="f3" name="top" align="top" src="HeadingFramePage.jsp" width="100%" height="130"></iframe>
        <iframe class="f1" name="left" align="left" src="LinksPage.jsp" width="20%" height="500"></iframe>
        <iframe class="f4" name="middle" align="right" src="MainPage.jsp" width="70%" height="500"></iframe>
    </body>
</html>
