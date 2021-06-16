package fr.eni.dal;

import fr.eni.bo.Blocs;

import java.util.List;

public interface BlocsDAO {

    List<Blocs> selectAll();
    void supprListe(int supprimerListe);


    void addListe(Blocs nomListe);
}
