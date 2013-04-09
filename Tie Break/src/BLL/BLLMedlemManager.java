/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.BEMedlem;
import DAL.DALMedlemDBManager;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.lang.reflect.Member;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Stoffer
 */
public class BLLMedlemManager
{
    private static BLLMedlemManager instance = null;
    private DALMedlemDBManager db = null;
    
    public BLLMedlemManager() throws Exception
    {
        db = new DALMedlemDBManager();
    }
    
    public static BLLMedlemManager getInstance() throws Exception
    {
        if (instance == null)
        {
            instance = new BLLMedlemManager();
        }
        return instance;
    }

    public ArrayList<BEMedlem> visMedlemmer() throws SQLServerException, SQLException
    {
        return db.showAll();
    }
    public BEMedlem addMember(BEMedlem e) throws SQLException
    {
        return db.addMember(e);
    }
}
