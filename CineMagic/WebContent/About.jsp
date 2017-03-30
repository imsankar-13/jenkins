<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<div style="rgb(140, 140, 140)">
<h2><strong>How it all started?</strong></h2>
<h3>
CineMagic is a movie theatre company founded in the year 2017 by the burning Phoenix. 
It all started when the founder went on a trip to the Himalayas. 
</h3>
<h2><strong>Where we are?</strong></h2>
<h3>
This web-site helps you to book the movie-shows in the CineMagic theatres. You can also view
the ticket booking history.
We are not stopping. We will provide you with the canceling of tickets with respect to terms and 
conditions sooner.
</h3>
<h2><strong>Change of pace</strong></h2>
<h3> 
We had also started to evolve to a whole new level by planning to upgrade our site for multiple 
theatres and book shows for concerts, games, events and many more. Stay excited.
</h3>
</div>
<h1>ABOUT OUR SERVICE</h1>
<h2><strong>LEADERSHIP TEAM</strong></h2>
<h3> 
Get to know Cinemagic’s leadership team.
</h3>

<h2><strong>CAREER OPPORTUNITIES</strong></h2>
<h3> 
Interested in joining the Cinemagic's family? Learn about an exciting career with us.
</h3>

<h2><strong>ADVERTISING</strong></h2>
<h3> 
Want to advertise with us? Fill out our online 
proposal form and a Cinemagic's sales person will contact you.
</h3>

<h2><strong>AFFILIATE PROGRAM</strong></h2>
<h3> 
Become a Cinemagic's Affiliate and make money from every movie ticket or 
Cinemagic's gift card sale referred from your site or app.
</h3>
<h2><strong>BUSINESS DEVELOPMENT</strong></h2>
<h3> 
If your company is interested in partnering with Cinemagic's, 
fill out our online proposal form.
</h3>
<h2><strong>TERMS AND POLICIES</strong></h2>
<h3> 
Read about Cinemagic's Terms and Policies, Privacy Policy, and Terms of Use.
</h3>
<h2><strong>HELP</strong></h2>
<h3> 
Need help with your account or a Cinemagic's purchase? Reach out to our Customer Support.
</h3>
</section>
<footer class="about">
	Copyright 2017 © CineMagic Entertainment Pvt. Ltd. All Rights Reserved.
</footer>
</div>
</body>
</html>