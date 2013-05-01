package DAL;

import BE.BEProduktion;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Lager DB Manager The data Access Layer
 */
public class DALProduktionDBManager extends DALBelmanDBManager {

    private ArrayList<BEProduktion> ordrer;

    public DALProduktionDBManager() throws Exception {
        super();
    }

    public ArrayList<BEProduktion> visOrdrer() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT * FROM ProductionOrder";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BEProduktion> ordrer = new ArrayList<>();

            while (rs.next()) {
                int SOrderID = rs.getInt("SOrderID");
                String SOrder = rs.getString("SOrder");
                int POrderID = rs.getInt("POrderID");
                String POrder = rs.getString("POrder");
                boolean Urgent = rs.getBoolean("Urgent");
                Date DueDate = rs.getDate("DueDate");
                Float Quantity = rs.getFloat("Quantity");
                Float Thickness = rs.getFloat("Thickness");
                Float Width = rs.getFloat("Width");
                Float Circumference = rs.getFloat("Circumference");
                


                BEProduktion l = new BEProduktion(SOrderID, SOrder, POrderID, POrder, Urgent, DueDate, Quantity, Thickness, Width, Circumference);
                ordrer.add(l);
            }
            return ordrer;

        }
    
    }
}