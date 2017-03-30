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
			
<section >
<h2 style=" text-align:center;">Your ticket has been successfully booked</h2>
<div style=" text-align:center;margin:25px 300px; padding:15px; background-color:#b3ccff; border-radius:5px;">
	<c:forEach var="ticket" items = "${tickets}">
	<h3>Ticket ID    :<c:out value="${ticket.getTicketId()}"/></h3>
	<h3>User name    :<c:out value="${ticket.getUsername()}"/></h3>
	<h3>Movie Name   :<c:out value="${ticket.getMovieName()}"/></h3>
	<h3>Show date    :<c:out value="${ticket.getShowDate()}"/></h3>
	<h3>Show time    :<c:out value="${ticket.getShowTime()}"/></h3>	
	<h3>Ticket Class :<c:out value="${ticket.getTicketClass()}"/></h3>
	<h3>No of Tickets:<c:out value="${ticket.getNoOfTickets()}"/></h3>
	<h3>Ticket amount:<c:out value="${ticket.getTicketAmount()}"/></h3>
	<br>
	</c:forEach>
</div>
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

