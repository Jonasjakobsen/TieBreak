/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.BEMedlem;
import com.microsoft.sqlserver.jdbc.SQLServerException;
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
                String postnr = rs.getString("PostNr");
                String fodselsdag = rs.getString("Fodselsdag");
                String mobnr = rs.getString("Mobnr");
                String tlfnr = rs.getString("Tlfnr");
                String email = rs.getString("Email");
                Boolean kontingent = rs.getBoolean("Kontingent");

                BEMedlem m = new BEMedlem(id, navn, efternavn, addresse1, postnr, fodselsdag, mobnr, tlfnr, email, kontingent);
                members.add(m);
            }
            return members;

        }
        
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
    
    public BEMedlem updateMember(BEMedlem m) throws SQLException
    {
        Connection con = ds.getConnection();
        String sql = "UPDATE Medlem SET Fornavn = ?, Efternavn = ?, Kontingent = ? WHERE MedlemsNr = ?";


        PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setString(1, m.getNavn());
        ps.setString(2, m.getEfternavn());
        ps.setBoolean(3, m.harBetalt());
        ps.setInt(4, m.getId());
        

        int affectedRows = ps.executeUpdate();
        if (affectedRows == 0)
        {
            throw new SQLException("Unable to update Member");
        }

        ResultSet keys = ps.getGeneratedKeys();
        keys.next();
        int id = keys.getInt(1);

        return new BEMedlem(id, m);
    }
    
    public void deleteMember(int id) throws SQLException
    {
        Connection con = ds.getConnection();
        String sql = "DELETE Medlem WHERE MedlemsNr = ?";
                
        PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setInt(1, id);
        
        int affectedRows = ps.executeUpdate();
        if (affectedRows == 0)
        {
            throw new SQLException("Unable to delete Member");
        }
        
    }
    
}



