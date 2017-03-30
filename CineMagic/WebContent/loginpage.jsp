<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="loginpagestyle.css">
<title>Cine Magic</title>
</head>
<body>
<%
if (session.getAttribute("username")!=null) {
	 response.sendRedirect("/CineMagic/Cinemagic.jsp");
}
%>
<h1>Welcome to Cine Magic</h1>
<div id="container">
<p style="text-align:center;"><%
if (request.getAttribute("error")!=null) {
String error = (String) request.getAttribute("error");
out.print("<font style='color:red'>" + error + "</font>"); 
}
if (request.getAttribute("logout")!=null) {
String error = (String) request.getAttribute("logout");
out.print("<font style='color:red'>" + error + "</font>"); 
}
%></p>
<div id="login">
      <form name='form-login' action="/CineMagic/LoginToCineMagic" method="post">
     	
        <span class="fontawesome-user"></span>
          <input type="text" id="user" name="username" placeholder="Username" required>    
        <span class="fontawesome-lock"></span>
          <input type="password" id="pass" name="password" placeholder="Password" required>
          <input type="hidden" name="action" value="login">
        <input type="submit" value="Login">
	  </form>
</div>
<div id="signup">
	  <form action="SignUp.jsp">
	  	<input type="submit" value="Sign Up as a New User?">
	  </form>
</div>
</div>
</body>
<%
if (request.getAttribute("message")!=null) {
String message = (String) request.getAttribute("message");
out.print("<script type=\"text/javascript\">" + "alert('" + message + "');"+"</script>");
}
%>
</html>