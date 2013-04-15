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
 *
 * @author Stoffer
 */
public class DALEventDBManager extends DALTieBreakDBManager
{
    private ArrayList<BEEvent> events;
    
    public DALEventDBManager() throws Exception
    {
        super();
    }
    
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
}
