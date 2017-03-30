<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>
Cine Magic - Home
</title>
<link rel="stylesheet" type="text/css" href="Cinemagicstyle.css">
</head>
<body>
<%
if (session.getAttribute("username")==null) {
	response.sendRedirect("/CineMagic");
}
%>
<div id="container">
<header>
<nav>
<img id="logo" src = "Images/cinemagic.png" height="70px" width="230px">
<ul>
<li><button onclick="window.location.href='Cinemagic.jsp'">Home</button></li>
<li><button onclick="window.location.href='DisplayTickets'">Booking History</button></li>
<li><button onclick="window.location.href='About.jsp'">About</button></li>
<li><button onclick="window.location.href='Logout'">Logout</button></li>
</ul>
<p style="float:right;"><br>Welcome <%out.println(session.getAttribute("username"));%></p>
</nav>
</header>

<section>
		<form action="BookTickets" method="post">
		<div class="showlist" style="margin:0px 300px; padding:100px; background-color:#b3ccff; border-radius:5px;">
		<div>
			<h2>Show ID:<c:out value="${id}"/></h2>
			<h2>Available first class tickets:<c:out value="${afct}"/></h2>
			<h2>Available second class tickets:<c:out value="${asct}"/></h2>
			<h2>First class ticket Rate:<c:out value="${fctr}"/></h2>
			<h2>Second class ticket Rate:<c:out value="${sctr}"/></h2>
		</div>
		<input type="hidden" name="showId" value="${id}">
		<h2><input type="radio" style="width:20px; height:15px;" name="ticketClass" value=1 checked>First</h2>
		<h2><input type="radio" style="width:20px; height:15px;" name="ticketClass" value=2 >Second</h2>
  		<h2>Number of Tickets : <input type="number" value=1 name="quantity" min="1" max="10"></h2>
		<input class="showclass" style="padding:4px;" type="submit" value="Book Tickets" alt="Submit">
		</div>
		</form>
</section>
<div style="border-radius:5px; padding:3px;">
	<video style="border-radius:5px;margin-left:15px;margin-bottom:15px;" width="48%" controls>
  		<source src="/CineMagic/Images/logan.mp4" type="video/mp4">
	</video>
	<video width="48%" controls style="float:right;border-radius:5px;margin-bottom:15px;margin-right:15px;">
  		<source src="/CineMagic/Images/wonder.mp4" type="video/mp4">
	</video>
</div>
<footer>
	Copyright 2017 © CineMagic Entertainment Pvt. Ltd. All Rights Reserved.
</footer>
</div>
</body>
</html>
