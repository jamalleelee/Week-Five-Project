<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.viddygames.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>View The Collection</title>

<link href="css/bootstrap.min.css" rel="stylesheet">

<link href="css/full-width-pics.css" rel="stylesheet">

</head>
<body>
	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.html">Viddy Game Collection</a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="/weekfiveproject/JSPView.jsp">View The
						Collection</a></li>
				<li><a href="add.html">Add To The Collection</a></li>
				<li><a href="update.html">Update A Game In The Collection</a></li>
				<li><a href="delete.html">Delete A Game From The Collection</a>
				</li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container --> </nav>

	<!-- Full Width Image Header with Logo -->
	<!-- Image backgrounds are set within the full-width-pics.css file. -->
	<header class="image-bg-fluid-height"> <img
		class="img-responsive img-center" src="http://i.imgur.com/sgC4EvN.jpg"
		alt="PS4 Games"> </header>

	<!-- Content Section -->
	<section>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="section-heading">View The Collection</h1>

				<table class="table table-striped table-bordered">

					<tr class="success">
						<th>Game Title</th>
						<th>Game Genre</th>
						<th>Game Console</th>
						<th>Game Developer</th>
						<th>Game Publisher</th>
						<th>Game Release Date</th>
					</tr>
					<%
						DAO.readFromDB();
					%>
					<%
						VideoGame displayOnWebPage = new VideoGame();
						for (int i = 0; i < DAO.videoGamesInMyList.size(); i++) {
							displayOnWebPage = DAO.videoGamesInMyList.get(i);
					%>
					<tr>
						<td><%=displayOnWebPage.getGameTitle()%></td>
						<td><%=displayOnWebPage.getGameGenre()%></td>
						<td><%=displayOnWebPage.getGameConsole()%></td>
						<td><%=displayOnWebPage.getGameDeveloper()%></td>
						<td><%=displayOnWebPage.getGamePublisher()%></td>
						<td><%=displayOnWebPage.getGameReleaseDate()%></td>
					</tr>
					<%
						}
						DAO.videoGamesInMyList.clear();
					%>

				</table>

				<!-- Footer -->
				<footer>
				<div class="container">
					<div class="row">
						<div class="col-lg-12">
							<p>Copyright &copy; Jamal M</p>
						</div>
					</div>
					<!-- /.row -->
				</div>
				<!-- /.container --> </footer>

				<!-- jQuery -->
				<script src="js/jquery.js"></script>

				<!-- Bootstrap Core JavaScript -->
				<script src="js/bootstrap.min.js"></script>
			</div>
		</div>
	</div>
	</section>

</body>
</html>
