package DAL;

import BE.BELager;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Lager DB Manager The data Access Layer
 */
public class DALLagerDBManager extends DALBelmanDBManager {

    private ArrayList<BELager> lager;
    
    private static final String STOCKITEMID = "id";
    private static final String COILCODE = "code";
    private static final String MATERIALID = "materialId";
    private static final String MATERIALNAME = "name";
    private static final String MATERIALDENSITY = "density";
    private static final String CHARGENO = "chargeNo";
    private static final String LENGTH = "lenght";
    private static final String WIDTH = "width";
    private static final String THICKNESS = "thickness";
    private static final String STOCKQUANTITY = "stockQuantity";

    public DALLagerDBManager() throws Exception {
        super();
    }

    /**
     * Makes an ArrayList and adds the lines read from the file into the lageret
     * arrayList
     *
     * @return lageret
     * @throws SQLServerException, SQLException
     */
    public ArrayList<BELager> visLager() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {

            String sql = "SELECT Material.name, Material.density, Stockitem.stockQuantity "                    
                    + "FROM Material, CoilType, StockItem "
                    + "WHERE Material.id = CoilType.materialId "
                    + "AND CoilType.id = StockItem.coilTypeId ";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BELager> lageret = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt(STOCKITEMID);
                String Code = rs.getString(COILCODE);
                int MaterialID = rs.getInt(MATERIALID);
                String MaterialName = rs.getString(MATERIALNAME);
                Float MaterialDensity = rs.getFloat(MATERIALDENSITY);
                String ChargeNo = rs.getString(CHARGENO);
                Float Length = rs.getFloat(LENGTH);
                Float Width = rs.getFloat(WIDTH);
                Float Thickness = rs.getFloat(THICKNESS);
                Float StockQuantity = rs.getFloat(STOCKQUANTITY);


                BELager l = new BELager(-1, MaterialName, MaterialDensity, StockQuantity);
                lageret.add(l);
            }
            return lageret;
        }
    }

    public ArrayList<BELager> orderByThickness() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT StockItem.id, CoilType.code, "
                    + "CoilType.materialID, Material.name, "
                    + "Material.density,"
                    + " StockItem.chargeNo, StockItem.[length], "
                    + "CoilType.width, CoilType.thickness, "
                    + "StockItem.stockQuantity "
                    + "FROM Material, CoilType, StockItem "
                    + "WHERE Material.id = CoilType.materialId "
                    + "AND CoilType.id = StockItem.coilTypeId "
                    + "ORDER BY CoilType.thickness";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BELager> lageret = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt(STOCKITEMID);
                String Code = rs.getString(COILCODE);
                int MaterialID = rs.getInt(MATERIALID);
                String MaterialName = rs.getString(MATERIALNAME);
                Float MaterialDensity = rs.getFloat(MATERIALDENSITY);
                String ChargeNo = rs.getString(CHARGENO);
                Float Length = rs.getFloat(LENGTH);
                Float Width = rs.getFloat(WIDTH);
                Float Thickness = rs.getFloat(THICKNESS);
                Float StockQuantity = rs.getFloat(STOCKQUANTITY);


                BELager l = new BELager(id, Code, MaterialID, MaterialName, MaterialDensity, ChargeNo, Length, Width, Thickness, StockQuantity);
                lageret.add(l);
            }
            return lageret;

        }
    }

    public ArrayList<BELager> orderByLength() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT StockItem.id, CoilType.code, "
                    + "CoilType.materialID, Material.name, "
                    + "Material.density,"
                    + " StockItem.chargeNo, StockItem.[length], "
                    + "CoilType.width, CoilType.thickness, "
                    + "StockItem.stockQuantity "
                    + "FROM Material, CoilType, StockItem "
                    + "WHERE Material.id = CoilType.materialId "
                    + "AND CoilType.id = StockItem.coilTypeId "
                    + "ORDER BY StockItem.length";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BELager> lageret = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt(STOCKITEMID);
                String Code = rs.getString(COILCODE);
                int MaterialID = rs.getInt(MATERIALID);
                String MaterialName = rs.getString(MATERIALNAME);
                Float MaterialDensity = rs.getFloat(MATERIALDENSITY);
                String ChargeNo = rs.getString(CHARGENO);
                Float Length = rs.getFloat(LENGTH);
                Float Width = rs.getFloat(WIDTH);
                Float Thickness = rs.getFloat(THICKNESS);
                Float StockQuantity = rs.getFloat(STOCKQUANTITY);


                BELager l = new BELager(id, Code, MaterialID, MaterialName, MaterialDensity, ChargeNo, Length, Width, Thickness, StockQuantity);
                lageret.add(l);
            }
            return lageret;

        }
    }

    public ArrayList<BELager> orderByWidth() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT StockItem.id, CoilType.code, "
                    + "CoilType.materialID, Material.name, "
                    + "Material.density,"
                    + " StockItem.chargeNo, StockItem.[length], "
                    + "CoilType.width, CoilType.thickness, "
                    + "StockItem.stockQuantity "
                    + "FROM Material, CoilType, StockItem "
                    + "WHERE Material.id = CoilType.materialId "
                    + "AND CoilType.id = StockItem.coilTypeId "
                    + "ORDER BY CoilType.width";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BELager> lageret = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt(STOCKITEMID);
                String Code = rs.getString(COILCODE);
                int MaterialID = rs.getInt(MATERIALID);
                String MaterialName = rs.getString(MATERIALNAME);
                Float MaterialDensity = rs.getFloat(MATERIALDENSITY);
                String ChargeNo = rs.getString(CHARGENO);
                Float Length = rs.getFloat(LENGTH);
                Float Width = rs.getFloat(WIDTH);
                Float Thickness = rs.getFloat(THICKNESS);
                Float StockQuantity = rs.getFloat(STOCKQUANTITY);


                BELager l = new BELager(id, Code, MaterialID, MaterialName, MaterialDensity, ChargeNo, Length, Width, Thickness, StockQuantity);
                lageret.add(l);
            }
            return lageret;

        }
    }

    public ArrayList<BELager> orderByMaterialID() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT StockItem.id, CoilType.code, "
                    + "CoilType.materialID, Material.name, "
                    + "Material.density,"
                    + " StockItem.chargeNo, StockItem.[length], "
                    + "CoilType.width, CoilType.thickness, "
                    + "StockItem.stockQuantity "
                    + "FROM Material, CoilType, StockItem "
                    + "WHERE Material.id = CoilType.materialId "
                    + "AND CoilType.id = StockItem.coilTypeId "
                    + "ORDER BY CoilType.materialID";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BELager> lageret = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt(STOCKITEMID);
                String Code = rs.getString(COILCODE);
                int MaterialID = rs.getInt(MATERIALID);
                String MaterialName = rs.getString(MATERIALNAME);
                Float MaterialDensity = rs.getFloat(MATERIALDENSITY);
                String ChargeNo = rs.getString(CHARGENO);
                Float Length = rs.getFloat(LENGTH);
                Float Width = rs.getFloat(WIDTH);
                Float Thickness = rs.getFloat(THICKNESS);
                Float StockQuantity = rs.getFloat(STOCKQUANTITY);


                BELager l = new BELager(id, Code, MaterialID, MaterialName, MaterialDensity, ChargeNo, Length, Width, Thickness, StockQuantity);
                lageret.add(l);
            }
            return lageret;

        }
    }

    public ArrayList<BELager> orderByDensity() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT StockItem.id, CoilType.code, "
                    + "CoilType.materialID, Material.name, "
                    + "Material.density,"
                    + " StockItem.chargeNo, StockItem.[length], "
                    + "CoilType.width, CoilType.thickness, "
                    + "StockItem.stockQuantity "
                    + "FROM Material, CoilType, StockItem "
                    + "WHERE Material.id = CoilType.materialId "
                    + "AND CoilType.id = StockItem.coilTypeId "
                    + "ORDER BY Material.Density";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BELager> lageret = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt(STOCKITEMID);
                String Code = rs.getString(COILCODE);
                int MaterialID = rs.getInt(MATERIALID);
                String MaterialName = rs.getString(MATERIALNAME);
                Float MaterialDensity = rs.getFloat(MATERIALDENSITY);
                String ChargeNo = rs.getString(CHARGENO);
                Float Length = rs.getFloat(LENGTH);
                Float Width = rs.getFloat(WIDTH);
                Float Thickness = rs.getFloat(THICKNESS);
                Float StockQuantity = rs.getFloat(STOCKQUANTITY);


                BELager l = new BELager(id, Code, MaterialID, MaterialName, MaterialDensity, ChargeNo, Length, Width, Thickness, StockQuantity);
                lageret.add(l);
            }
            return lageret;

        }
    }

    public ArrayList<BELager> orderByStockQuantity() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT StockItem.id, CoilType.code, "
                    + "CoilType.materialID, Material.name, "
                    + "Material.density,"
                    + "StockItem.chargeNo, StockItem.[length], "
                    + "CoilType.width, CoilType.thickness, "
                    + "StockItem.stockQuantity "
                    + "FROM Material, CoilType, StockItem "
                    + "WHERE Material.id = CoilType.materialId "
                    + "AND CoilType.id = StockItem.coilTypeId "
                    + "ORDER BY StockItem.stockQuantity";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BELager> lageret = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt(STOCKITEMID);
                String Code = rs.getString(COILCODE);
                int MaterialID = rs.getInt(MATERIALID);
                String MaterialName = rs.getString(MATERIALNAME);
                Float MaterialDensity = rs.getFloat(MATERIALDENSITY);
                String ChargeNo = rs.getString(CHARGENO);
                Float Length = rs.getFloat(LENGTH);
                Float Width = rs.getFloat(WIDTH);
                Float Thickness = rs.getFloat(THICKNESS);
                Float StockQuantity = rs.getFloat(STOCKQUANTITY);


                BELager l = new BELager(id, Code, MaterialID, MaterialName, MaterialDensity, ChargeNo, Length, Width, Thickness, StockQuantity);
                lageret.add(l);
            }
            return lageret;

        }


    }

    /**
     * Makes an ArrayList and adds the lines read from the file into the members
     * arrayList
     *
     * @return members
     * @throws SQLServerException, SQLException
     */
    public ArrayList<BELager> getLagerById(int Id) throws SQLException {
        Connection con = ds.getConnection();
        String sql = "SELECT StockItem.id, CoilType.code, "
                    + "CoilType.materialID, Material.name, "
                    + "Material.density, "
                    + "StockItem.chargeNo, StockItem.[length], "
                    + "CoilType.width, CoilType.thickness, "
                    + "StockItem.stockQuantity "
                    + "FROM Material, CoilType, StockItem "
                    + "WHERE (StockItem.id = ? OR Material.name = ?)"
                    + "AND Material.id = CoilType.materialId "
                    + "AND CoilType.id = StockItem.coilTypeId";               
 
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, Id);
        ps.setInt(2, Id);
        ResultSet rs = ps.executeQuery();

        ArrayList<BELager> LagerID = new ArrayList<>();
        while (rs.next()) {
                int id = rs.getInt(STOCKITEMID);
                String Code = rs.getString(COILCODE);
                int MaterialID = rs.getInt(MATERIALID);
                String MaterialName = rs.getString(MATERIALNAME);
                Float MaterialDensity = rs.getFloat(MATERIALDENSITY);
                String ChargeNo = rs.getString(CHARGENO);
                Float Length = rs.getFloat(LENGTH);
                Float Width = rs.getFloat(WIDTH);
                Float Thickness = rs.getFloat(THICKNESS);
                Float StockQuantity = rs.getFloat(STOCKQUANTITY);

            BELager l = new BELager(id, Code, MaterialID, MaterialName, MaterialDensity, ChargeNo, Length, Width, Thickness, StockQuantity);
            LagerID.add(l);
        }
        return LagerID;

    }
}
