package fr.eni.servlets;

import fr.eni.bll.BlocsManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/liste")
public class ListeServlet extends HttpServlet {

    private BlocsManager blocManager;

    @Override
    public void init() throws ServletException {
        blocManager = new BlocsManager();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/class/liste.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer les paramètres du formulaire
        if ("nomListe" != null){
//            request.getParameter("nomListe");
//            System.out.print(request.getParameter("nomListe"));
            blocManager.addListe(request.getParameter("nomListe"));
            request.setAttribute("ajout", "Nouvelle liste ajoutée");

        }

        // retour à la saisie d'un article
        doGet(request,response);
    }
}
