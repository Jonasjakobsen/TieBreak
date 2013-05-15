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
    
    private static final String ID = "id";
    private static final String SORDERID = "sOrderId";
    private static final String SORDER = "sOrder";
    private static final String PORDERID = "pOrderId";
    private static final String PORDER = "pOrder";
    private static final String DUEDATE = "dueDate";
    private static final String QUANTITY = "quantity";
    private static final String MATERIALNAME = "name";
    private static final String THICKNESS = "thickness";
    private static final String WIDTH = "width";
    private static final String STATUS = "status";
    private static final String URGENT = "urgent";

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

            ArrayList<BEProduktion> ordre = new ArrayList<>();

            while (rs.next()) 
            {
                ordre.add(getOneOrder(rs));
            }
            return ordre;

        }
    
    }
    
    public BEProduktion getOneOrder(ResultSet rs) throws SQLException
    {
        int sOrderID = rs.getInt(SORDERID);
        String pOrder = rs.getString(PORDER);
        Date dueDate = rs.getDate(DUEDATE);
        Float quantity = rs.getFloat(QUANTITY);
        String materialName = rs.getString(MATERIALNAME);
        
        return new BEProduktion(sOrderID, pOrder, dueDate, quantity, materialName);
    }
    
    public ArrayList<BEProduktion> orderByUrgent() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT * FROM ProductionOrder ORDER BY urgent DESC";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BEProduktion> ordrer = new ArrayList<>();

            while (rs.next()) {
                int sOrderId = rs.getInt(SORDERID);
                int pOrderId = rs.getInt(PORDERID);
                String pOrder = rs.getString(PORDER);
                Date dueDate = rs.getDate(DUEDATE);
                Float quantity = rs.getFloat(QUANTITY);
                Float width = rs.getFloat(WIDTH);
                Float thickness = rs.getFloat(THICKNESS);
                String status = rs.getString(STATUS);
                boolean urgent = rs.getBoolean(URGENT);
                


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
                int sOrderID = rs.getInt(SORDERID);
                String pOrder = rs.getString(PORDER);
                Date dueDate = rs.getDate(DUEDATE);
                Float quantity = rs.getFloat(QUANTITY);
                String materialName = rs.getString(MATERIALNAME);
                


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
                int sOrderId = rs.getInt(SORDERID);
                int pOrderId = rs.getInt(PORDERID);
                String pOrder = rs.getString(PORDER);
                Date dueDate = rs.getDate(DUEDATE);
                Float quantity = rs.getFloat(QUANTITY);
                Float width = rs.getFloat(WIDTH);
                Float thickness = rs.getFloat(THICKNESS);
                String status = rs.getString(STATUS);
                boolean urgent = rs.getBoolean(URGENT);
                


                BEProduktion l = new BEProduktion(sOrderId, pOrderId, pOrder, dueDate, quantity, width, thickness, status, urgent);
                ordrer.add(l);
            }
            return ordrer;

        }
    }

    public ArrayList<BEProduktion> getOrderByMaterial(BEProduktion p) throws SQLException
    {
        try (Connection con = ds.getConnection()) {
        String sql = //"SELECT ProductionOrder.sOrderId, ProductionOrder.pOrder, ProductionOrder.dueDate, ProductionOrder.quantity, Material.name "
                      "SELECT * " 
                + "FROM ProductionOrder, Material, Sleeve "
                        + "WHERE ProductionOrder.pOrderId = Sleeve.pOrderId "
                        + "AND Sleeve.materialId = Material.id "
                        + "AND Material.name = ? " ;
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setString(1, p.getMaterialName());
        
        ResultSet rs = ps.executeQuery();

        ArrayList<BEProduktion> ordrers = new ArrayList<>();

            while (rs.next()) {
                int sOrderID = rs.getInt(SORDERID);
                String pOrder = rs.getString(PORDER);
                Date dueDate = rs.getDate(DUEDATE);
                Float quantity = rs.getFloat(QUANTITY);
                String materialName = rs.getString(MATERIALNAME);
                


                BEProduktion l = new BEProduktion(sOrderID, pOrder, dueDate, quantity, materialName);
                ordrers.add(l);
        }
        return ordrers;
        

       }
            
    }
}
