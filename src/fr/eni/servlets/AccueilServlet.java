package fr.eni.servlets;

import fr.eni.bo.Blocs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/accueil")
public class AccueilServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer List<noms>
        // test affichage
        Blocs bloc1 = new Blocs(1,"Intermarché");
        Blocs bloc2 = new Blocs(2,"SuperU");
        Blocs bloc3 = new Blocs(3,"Bricomarché");

        List<Blocs> collectionNomDesListes = new ArrayList<>();
        collectionNomDesListes.add(bloc1);
        collectionNomDesListes.add(bloc2);
        collectionNomDesListes.add(bloc3);

        request.setAttribute("collectionNomDesListes", collectionNomDesListes);

        request.getRequestDispatcher("WEB-INF/class/index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
