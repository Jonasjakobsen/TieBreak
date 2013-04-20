/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.BEEvent;
import BE.BEMedlem;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Event DB Manager
 * The Data Access Layer
 */
public class DALEventDBManager extends DALTieBreakDBManager
{
    private ArrayList<BEEvent> events;
    
    public DALEventDBManager() throws Exception
    {
        super();
    }
    
    /**
     * Makes an ArrayList and adds the lines read from the file into the 
     * events arrayList
     * @return events
     * @throws SQLServerException, SQLException
     */
    
    public ArrayList<BEEvent> showAll() throws SQLServerException, SQLException
    {
        try (Connection con = ds.getConnection())
        {
            String sql = "SELECT * FROM Arrangement";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BEEvent> events = new ArrayList<>();

            while (rs.next())
            {
                int id = rs.getInt("ArrID");
                String arrangementbeskrivelse = rs.getString("ArrBeskrivelse");
                String arrangementdag = rs.getString("ArrDag");

                BEEvent e = new BEEvent(id, arrangementbeskrivelse, arrangementdag);
                events.add(e);
            }
            return events;
        }        
    }
    /**
     * Add event
     * @return BEEvent
     * @throws SQLServerException, SQLException
     */

    public BEEvent addEvent(BEEvent m) throws SQLServerException, SQLException 
    {
        Connection con = ds.getConnection();

        String sql = "INSERT INTO Arrangement(ArrBeskrivelse, ArrID)"
                + "VALUES(?,?)";

        PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setString(1, m.getArrangementbeskrivelse());
        ps.setInt(2, m.getId());
        

        int affectedRows = ps.executeUpdate();
        if (affectedRows == 0)
        {
            throw new SQLException("Unable to add Event");
        }

        ResultSet keys = ps.getGeneratedKeys();
        keys.next();
        int id = keys.getInt(1);

        return new BEEvent(id, m);
    }
    /**
     * Updates the event
     * @return BEEvent
     * @throws SQLServerException, SQLException
     */

    public BEEvent updateEvent(BEEvent m) throws SQLServerException, SQLException
    {
        Connection con = ds.getConnection();
        String sql = "UPDATE Arrangement SET ArrBeskrivelse = ? WHERE ArrID = ?";


        PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setString(1, m.getArrangementbeskrivelse());
        ps.setInt(2, m.getId());
        
        int affectedRows = ps.executeUpdate();
        if (affectedRows == 0)
        {
            throw new SQLException("Unable to update Arrangement");
        }

        ResultSet keys = ps.getGeneratedKeys();
        keys.next();
        int id = keys.getInt(1);

        return new BEEvent(id, m);
    }
     /**
     * Deletes the event
     * @throws SQLException
     */
    public void deleteEvent(int id) throws SQLException
    {
        Connection con = ds.getConnection();
        String sql = "DELETE Arrangement WHERE ArrID = ?";
                
        PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setInt(1, id);
        
        int affectedRows = ps.executeUpdate();
        if (affectedRows == 0)
        {
            throw new SQLException("Unable to delete Event");
        }
        
    }
}
