/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.BEMedlem;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Stoffer
 */
public class DALMedlemDBManager extends DALTieBreakDBManager
{
    private ArrayList<BEMedlem> medlemmer;
    
    public DALMedlemDBManager() throws Exception
    {
        super();
    }
    

     public ArrayList<BEMedlem> showAll() throws SQLServerException, SQLException
    {
        try (Connection con = ds.getConnection())
        {
            String sql = "SELECT * FROM Medlem";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BEMedlem> members = new ArrayList<>();

            while (rs.next())
            {
                int id = rs.getInt("MedlemsNr");
                String navn = rs.getString("Fornavn");
                String efternavn = rs.getString("Efternavn");
                String addresse1 = rs.getString("Addresse1");
                String fodselsdag = rs.getString("Fodselsdag");
                String mobnr = rs.getString("Mobnr");
                String tlfnr = rs.getString("Tlfnr");
                String email = rs.getString("Email");
                Boolean kontingent = rs.getBoolean("Kontingent");

                BEMedlem m = new BEMedlem(id, navn, efternavn, addresse1, fodselsdag, mobnr, tlfnr, email, kontingent);
                members.add(m);
            }
            return members;

        }
        
    }
     
    public BEMedlem getById(int id)
    {
        for (BEMedlem e : medlemmer)
        {
            if (e.getId() == id)
            {
                return e;
            }
        }
        return null;
    }

    public BEMedlem addMember(BEMedlem m) throws SQLServerException, SQLException 
    {
        Connection con = ds.getConnection();

        String sql = "INSERT INTO Medlem(Fornavn, Efternavn, Addresse1, PostNr, TlfNr, Mobnr, Email, Fodselsdag, Kontingent)"
                + "VALUES(?,?,?,?,?,?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setString(1, m.getNavn());
        ps.setString(2, m.getEfternavn());
        ps.setString(3, m.getAddresse1());
        ps.setString(4, m.getPostnr());
        ps.setString(5, m.getTlfnr());
        ps.setString(6, m.getMobnr());
        ps.setString(7, m.getEmail());
        ps.setString(8, m.getFodselsdag());
        ps.setBoolean(9, m.harBetalt());
        

        int affectedRows = ps.executeUpdate();
        if (affectedRows == 0)
        {
            throw new SQLException("Unable to add Member");
        }

        ResultSet keys = ps.getGeneratedKeys();
        keys.next();
        int id = keys.getInt(1);

        return new BEMedlem(id, m);

    }
}



