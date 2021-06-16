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

        List<Blocs> collectionNomDesListes = new ArrayList<>();
        // Récupérer les noms des listes
        BlocsManager blocmanager = new BlocsManager();
        collectionNomDesListes = blocmanager.touslesblocs();
        request.setAttribute("collectionNomDesListes", collectionNomDesListes);

        // Redirection vers accueil.jsp
        request.getRequestDispatcher("WEB-INF/class/index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer le 'name' du boutton

        // appel du deleteListe

        // Redirection vers accueil.jsp
        doGet(request,response);
    }
}
