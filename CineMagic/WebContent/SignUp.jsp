<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="loginpagestyle.css">
<title>SignUp for Cine Magic</title>
</head>
<body>
<h1>Sign Up for Cine Magic</h1>
<div id="container">
<div id="login">
      <form name='form-login' action="/CineMagic/SignUp" method="post">
        <span class="fontawesome-user"></span>
          <input type="text" id="user" name="username" placeholder="Enter Username" required>
       
        <span class="fontawesome-lock"></span>
          <input type="password" id="pass" name="password" placeholder="Enter Password" required>
        
        <span class="fontawesome-user"></span>
          <select name="question" required>
          		<option selected disabled value="">Select Security Question</option>
  				<option value="Your favourite superhero?">Your favorite super-hero?</option>
  				<option value="Your childhood friend?">Your childhood friend?</option>
  				<option value="Your nickname?">Your nickname?</option>
  				<option value="You are afraid of?">You are afraid of?</option>
		  </select> 
          
        <span class="fontawesome-user"></span>  
          <input type="password" placeholder="Enter security answer" name="answer" required>
        
        <input type="submit" value="Sign Up">
	  </form>
</div>
</div>
</body>
</html>