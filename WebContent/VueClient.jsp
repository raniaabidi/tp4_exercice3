<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Client créé avec succés </h2>
<h3>Nom : <%= session.getAttribute("texte1") %></h3>
<h3>Prenom : <%= session.getAttribute("texte2") %></h3>
<h3>Adresse : <%= session.getAttribute("texte3")  %></h3>
<h3>Téléphone : <%= session.getAttribute("texte4")  %></h3>
<h3>Email : <%= session.getAttribute("texte5") %></h3>
</body>
</html>