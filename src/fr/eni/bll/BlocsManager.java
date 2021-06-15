package fr.eni.bll;

import fr.eni.bo.Blocs;
import fr.eni.dal.BlocsDAO;
import fr.eni.dal.DAOFactory;

import java.util.List;

public class BlocsManager {

    public List<Blocs> touslesblocs() {
        BlocsDAO blkDAO = DAOFactory.getBlocsDAO();
    }


}
