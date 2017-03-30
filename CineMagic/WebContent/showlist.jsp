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
<p style="float:right;"><br>Welcome <%out.println(session.getAttribute("username")+"  ");%></p>
</nav>
</header>
			
<section>
	<c:forEach var="show" items = "${shows}">
		<form action="BookForTheShow" method="post">
		<div style="padding: 50px 300px; background-color:#b3ccff; border-radius:5px;">
		<h2>Show Date : <c:out value="${show.getShowDate()}"/></h2>
		<h2>Show Time : <c:out value="${show.getShowTime()}"/></h2>
		<input name="showId" type="hidden" value="${show.getShowID()}">
		<input class="showclass" type="submit" value="Select this show" alt="Submit">
		</div>
		</form>
	</c:forEach>
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