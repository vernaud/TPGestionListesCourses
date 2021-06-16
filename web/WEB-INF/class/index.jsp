<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--JSTL pour if foreach--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Listes prédéfinies</title>
  </head>
  <body>
  <ul>
    <c:forEach items="${collectionNomDesListes}" var="liste">
        <li>
          <span>${liste.nom}</span>
          <button>Commencer les courses</button>
          <a href="accueil?choix=${liste.id}" name="supprimer"><button>Supprimer la liste</button></a>
        </li>
    </c:forEach>
  </ul>
  <a href="liste"><button>Ajouter une liste</button></a>
  </body>
</html>
