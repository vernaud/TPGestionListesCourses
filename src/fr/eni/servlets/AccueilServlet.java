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

    private List<Blocs> collectionNomDesListes;
    BlocsManager blocManager;

    @Override
    public void init() throws ServletException {
        collectionNomDesListes = new ArrayList<>();
        blocManager = new BlocsManager();
        collectionNomDesListes = blocManager.touslesblocs();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Affichage des listes
        init();
        request.setAttribute("collectionNomDesListes", collectionNomDesListes);

        // Supprimer une liste
        if (request.getParameter("choix") != null){
            int supprimerListe = Integer.parseInt(request.getParameter("choix"));
            System.out.println("Supprimer id : " + supprimerListe);
            blocManager.supprListe(supprimerListe);
            init();
            request.setAttribute("collectionNomDesListes", collectionNomDesListes);
        }

        // Redirection vers accueil.jsp
        request.getRequestDispatcher("WEB-INF/class/index.jsp").forward(request,response);
    }

}
