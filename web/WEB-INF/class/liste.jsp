<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nouvelle liste</title>
</head>
<body>
<form action="liste" method="post">
    <label for="nom">Liste</label>
    <input type="text" id="nom" name="nomListe">
<%--    <label for="article">Article</label>--%>
<%--    <input type="text" id="article" name="newArticle">--%>
    <input type="submit" value="Ajouter">
</form>
<a href="accueil"><button>Retour</button></a>
</body>
</html>
