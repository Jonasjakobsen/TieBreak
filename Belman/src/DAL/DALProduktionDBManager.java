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
                int sOrderId = rs.getInt("sOrderId");
                int pOrderId = rs.getInt("pOrderId");
                String pOrder = rs.getString("pOrder");
                Date dueDate = rs.getDate("dueDate");
                Float quantity = rs.getFloat("quantity");
                Float width = rs.getFloat("width");
                Float thickness = rs.getFloat("thickness");
                String status = rs.getString("status");
                boolean urgent = rs.getBoolean("urgent");
                


                BEProduktion l = new BEProduktion(sOrderId, pOrderId, pOrder, dueDate, quantity, width, thickness, status, urgent);
                ordrer.add(l);
            }
            return ordrer;

        }
    
    }
    
    public ArrayList<BEProduktion> orderByUrgent() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT * FROM ProductionOrder ORDER BY Urgent DESC";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BEProduktion> ordrer = new ArrayList<>();

            while (rs.next()) {
                int sOrderId = rs.getInt("sOrderId");
                int pOrderId = rs.getInt("pOrderId");
                String pOrder = rs.getString("pOrder");
                Date dueDate = rs.getDate("dueDate");
                Float quantity = rs.getFloat("quantity");
                Float width = rs.getFloat("width");
                Float thickness = rs.getFloat("thickness");
                String status = rs.getString("status");
                boolean urgent = rs.getBoolean("urgent");
                


                BEProduktion l = new BEProduktion(sOrderId, pOrderId, pOrder, dueDate, quantity, width, thickness, status, urgent);
                ordrer.add(l);
            }
            return ordrer;

        }
    
    }

    public ArrayList<BEProduktion> orderByMaterial() throws SQLServerException, SQLException  {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT * FROM ProductionOrder ORDER BY MaterialID";
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
                Float MaterialID = rs.getFloat("MaterialID");
                Float Thickness = rs.getFloat("Thickness");
                Float Width = rs.getFloat("Width");
                Float Circumference = rs.getFloat("Circumference");
                


                BEProduktion l = new BEProduktion(SOrderID, SOrder, POrderID, POrder, Urgent, DueDate, Quantity, MaterialID, Thickness, Width, Circumference);
                ordrer.add(l);
            }
            return ordrer;

        }
    }

    public ArrayList<BEProduktion> orderByDueDate() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT * FROM ProductionOrder ORDER BY DueDate";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BEProduktion> ordrer = new ArrayList<>();

            while (rs.next()) {
                int sOrderId = rs.getInt("sOrderId");
                int pOrderId = rs.getInt("pOrderId");
                String pOrder = rs.getString("pOrder");
                Date dueDate = rs.getDate("dueDate");
                Float quantity = rs.getFloat("quantity");
                Float width = rs.getFloat("width");
                Float thickness = rs.getFloat("thickness");
                String status = rs.getString("status");
                boolean urgent = rs.getBoolean("urgent");
                


                BEProduktion l = new BEProduktion(sOrderId, pOrderId, pOrder, dueDate, quantity, width, thickness, status, urgent);
                ordrer.add(l);
            }
            return ordrer;

        }
    }
}
