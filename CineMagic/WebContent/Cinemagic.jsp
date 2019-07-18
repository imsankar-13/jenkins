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
<section style="float:left;">
	<c:forEach var="movie" items = "${movies}">
		<div style="float:left; margin:5px;">
		<form action="DisplayShowsForTheMovie" method="post">
		<input type="image" src="/CineMagic/Images/${movie.getImageLink()}" alt="Submit" width="220px" height="300px">
		<h3 style="text-align:center;"><c:out value="${movie.getMovieName()}"/></h3>
		<h4 style="text-align:center;"><c:out value="${movie.getLanguage()}"/></h4>
		<input name="movieId" type="hidden" value="${movie.getMovieId()}">
		</form>
		</div>
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
	Copyright 2017 © CineMagic Entertainment Pvt. Ltd. All Rights Reeed .
</footer>
</div>
</body>
</html>
