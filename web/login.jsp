<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="style/style.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;600;700&display=swap" rel="stylesheet">
    <!DOCTYPE html>
    <html>
    <head>
        <meta charset="ISO-8859-1">
        <title>LOGIN</title>
    </head>
    
<section class="jumbo" id="jumbo">
            <div class="container">
                <div class="row">
                    <div class="col-12 col-md-6">

        <h1>LOGIN</h1>
        <form action="weblogout.jsp" method="post">
            <table style="with: 100%">
                <tr>
                    <td>Username:</td>
                            <td><input type="text" placeholder="Username" name="username" required/></td>
                            </tr>
                            <tr>
                    <td>Password:</td>
                            <td><input type="password" Placeholder="Password" name="password" required/></td>
                            </tr>
                            <br>
                            <p>Don't have an account? <a href="adduserform.jsp">Register Here</a>.<p>
                        </table>
                           <button name="submit" class="btn">Login<a class="nav-item nav-link"href="/logout.jsp"></a></button>
                         </form>
                        </body>
                    </div>
                    <div class="col-6">
                        <img src="img/4401287.jpg" alt="">
                    </div>
                </div>
            </div>
        </section> 
    </html>