package fr.eni.servlets;

import fr.eni.bll.BlocsManager;
import fr.eni.bo.Blocs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/accueil")
public class AccueilServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Affichage des listes
        List<Blocs> collectionNomDesListes = new ArrayList<>();
        BlocsManager blocmanager = new BlocsManager();
        collectionNomDesListes = blocmanager.touslesblocs();
        request.setAttribute("collectionNomDesListes", collectionNomDesListes);

        // Supprimer une liste
        String supprimerListe = request.getParameter("choix");
        System.out.println(supprimerListe);

        // Redirection vers accueil.jsp
        request.getRequestDispatcher("WEB-INF/class/index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
