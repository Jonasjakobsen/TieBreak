package DAL;

import BE.BELager;
import BE.BEMedarbejder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Lager DB Manager The data Access Layer
 */
public class DALMedarbejderDBManager extends DALBelmanDBManager {

    private ArrayList<BELager> lager;
    public boolean isLoggedIn;

    public DALMedarbejderDBManager() throws Exception {
        super();
    }
    
    public boolean isLoggedIn(int Id, String Password) throws Exception
    {
         try (Connection con = ds.getConnection()) {
            String sql = "SELECT isLoggedIn FROM Employee WHERE ID = ?, Password = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Id);
            ps.setString(2, Password);
            ResultSet rs = ps.executeQuery();

            ArrayList<BELager> loggedin = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("ID");
                String firstname = rs.getString("FirstName");
                String lastname = rs.getString("LastName");
                String password = rs.getString("Password");
                boolean isLoggedIn = rs.getBoolean("isLoggedIn");


                BEMedarbejder l = new BEMedarbejder(id, firstname, lastname, password, isLoggedIn);

            }
            return isLoggedIn;

        }
    }

}
