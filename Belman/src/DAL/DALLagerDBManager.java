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

    public DALLagerDBManager() throws Exception {
        super();
    }

    /**
     * Makes an ArrayList and adds the lines read from the file into the members
     * arrayList
     *
     * @return members
     * @throws SQLServerException, SQLException
     */
    public ArrayList<BELager> visLager() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT * FROM StockItem";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BELager> lageret = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("ID");
                String Code = rs.getString("Code");
                int MaterialID = rs.getInt("MaterialID");
                String MaterialName = rs.getString("MaterialName");
                Float MaterialDensity = rs.getFloat("MaterialDensity");
                String ChargeNo = rs.getString("ChargeNo");
                Float Length = rs.getFloat("Length");
                Float Width = rs.getFloat("Width");
                Float Thickness = rs.getFloat("Thickness");
                Float StockQuantity = rs.getFloat("StockQuantity");


                BELager l = new BELager(id, Code, MaterialID, MaterialName, MaterialDensity, ChargeNo, Length, Width, Thickness, StockQuantity);
                lageret.add(l);
            }
            return lageret;

        }
    }
    public ArrayList<BELager> orderByThickness() throws SQLServerException, SQLException {
        try (Connection con = ds.getConnection()) {
            String sql = "SELECT * FROM StockItem ORDER BY Thickness";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<BELager> lageret = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("ID");
                String Code = rs.getString("Code");
                int MaterialID = rs.getInt("MaterialID");
                String MaterialName = rs.getString("MaterialName");
                Float MaterialDensity = rs.getFloat("MaterialDensity");
                String ChargeNo = rs.getString("ChargeNo");
                Float Length = rs.getFloat("Length");
                Float Width = rs.getFloat("Width");
                Float Thickness = rs.getFloat("Thickness");
                Float StockQuantity = rs.getFloat("StockQuantity");


                BELager l = new BELager(id, Code, MaterialID, MaterialName, MaterialDensity, ChargeNo, Length, Width, Thickness, StockQuantity);
                lageret.add(l);
            }
            return lageret;

        }
    }
}
