package fr.eni.dal;

import fr.eni.bo.Blocs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BlocsDAOJbdcImpl implements BlocsDAO{

    @Override
    public List<Blocs> selectAll() {
        List<Blocs> listeBlocs = new ArrayList<>();

        String SELECT_ALL = "SELECT l.id, l.nom FROM LISTES l";

        try (Connection connection = ConnectionProvider.getConnection();
        PreparedStatement psmt = connection.prepareStatement(SELECT_ALL)) {
            ResultSet rs = psmt.executeQuery();
            Blocs blocEnCours = new Blocs();
            while (rs.next()){
                if (rs.getInt(1) != blocEnCours.getId()){
                    blocEnCours = new Blocs();
                    blocEnCours.setId(rs.getInt(1));
                    blocEnCours.setNom(rs.getString(2));
                    listeBlocs.add(blocEnCours);
                }
            }
           rs.close();
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
        System.out.println(listeBlocs);

        return listeBlocs;
    }
}
