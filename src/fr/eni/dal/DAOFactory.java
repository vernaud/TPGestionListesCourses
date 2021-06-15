package fr.eni.dal;

public class DAOFactory {
    public static BlocsDAO getBlocsDAO() {
        return new BlocsDAOJbdcImpl();
    }
}
