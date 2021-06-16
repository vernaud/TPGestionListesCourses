package fr.eni.bll;

import fr.eni.bo.Blocs;
import fr.eni.dal.BlocsDAO;
import fr.eni.dal.DAOFactory;

import java.util.List;

public class BlocsManager {

    BlocsDAO blkDAO;

    public BlocsManager(){
        blkDAO = DAOFactory.getBlocsDAO();
    }

    public void supprListe(int id) {
        blkDAO.supprListe(id);
    }

    public List<Blocs> touslesblocs() {
        List<Blocs> listeBlocs = blkDAO.selectAll();
        return listeBlocs;
    }

    public void addListe(String nomListe) {
        Blocs b = new Blocs(nomListe);
        blkDAO.addListe(b);

    }
}
