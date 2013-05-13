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
           String sql = "SELECT ProductionOrder.sOrderId, ProductionOrder.pOrder, ProductionOrder.dueDate, ProductionOrder.quantity, Material.name "
                        + "FROM ProductionOrder, Material, Sleeve "
                        + "WHERE ProductionOrder.pOrderId = Sleeve.pOrderId "
                        + "AND Sleeve.materialId = Material.id ";
             

            
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BEProduktion> ordrer = new ArrayList<>();

            while (rs.next()) {
                int sOrderID = rs.getInt("sOrderId");
                String pOrder = rs.getString("pOrder");
                Date dueDate = rs.getDate("dueDate");
                Float quantity = rs.getFloat("quantity");
                String materialName = rs.getString("name");
                


                BEProduktion l = new BEProduktion(sOrderID, pOrder, dueDate, quantity, materialName);
                ordrer.add(l);
            }
            return ordrer;

        }
    
    }
    
    public ArrayList<BEProduktion> orderByUrgent() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT * FROM ProductionOrder ORDER BY urgent DESC";
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
            String sql = "SELECT ProductionOrder.sOrderId, ProductionOrder.pOrder, ProductionOrder.dueDate, ProductionOrder.quantity, Material.name "
                        + "FROM ProductionOrder, Material, Sleeve "
                        + "WHERE ProductionOrder.pOrderId = Sleeve.pOrderId "
                        + "AND Sleeve.materialId = Material.id ";
//                        + "AND Material.name = ? " ;
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BEProduktion> ordrer = new ArrayList<>();

            while (rs.next()) {
                int sOrderID = rs.getInt("sOrderId");
                String pOrder = rs.getString("pOrder");
                Date dueDate = rs.getDate("dueDate");
                Float quantity = rs.getFloat("quantity");
                String materialName = rs.getString("name");
                


                BEProduktion l = new BEProduktion(sOrderID, pOrder, dueDate, quantity, materialName);
                ordrer.add(l);
            }
            return ordrer;

        }
    }

    public ArrayList<BEProduktion> orderByDueDate() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT * FROM ProductionOrder ORDER BY dueDate";
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
