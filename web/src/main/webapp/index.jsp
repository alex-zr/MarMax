<html>
    <head>
        <title>Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <form action="/registration">
            <fieldset>
                <%
                    String error = (String) request.getAttribute("error");
                    if (error != null){
                        out.println(error);
                        out.println("</br>");
                    }
                %>
                login: <input name="login" type="text" size="20"></br>
                password: <input name="password" type="password" size="20"></br>
                <input type="submit" value="register">
            </fieldset>
        </form>
    </body>
</html>
