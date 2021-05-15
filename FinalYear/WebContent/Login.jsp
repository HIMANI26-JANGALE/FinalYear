<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/bootstrap-responsive.css">
    <title>Login Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="login.css">
<title>Insert title here</title>
</head>
<body>
<form action="LoginRegister" method="post" >

          <h3 style="color:yellow;">${message}</h1>
          <h3 style="color:green;">${successmessage}</h1>
          
           <div class="login-box">
            <img src="https://i.pinimg.com/474x/7d/63/eb/7d63eb5683da074e056d682c3e3b9bd0.jpg" class="user">
            <h2>Log In Here</h2>
            <p><span class="glyphicon glyphicon-user" style="color:salmon">&nbsp;</span>&nbsp;</span>Username<span class="req">*</span></p>
            <input type="text" name="username" placeholder="Enter your Username" >
            <p><span class="glyphicon glyphicon-lock" style="color:salmon">&nbsp;</span>&nbsp;</span>Password<span class="req">*</span></p>
            <input type="password" name="password" placeholder="Enter your password">
            <input type="submit" name="submit" value="Login">
           
            <div class="form-footer">
                <div>
                    <span>Don't have an account?<a href="register.jsp">Sign Up</a></span> 
                </div>
            </div>
</form>
</body>
</html>