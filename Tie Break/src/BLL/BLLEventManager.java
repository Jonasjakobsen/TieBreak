/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.BEEvent;
import DAL.DALEventDBManager;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Stoffer
 */
public class BLLEventManager extends BLLTieBreakManager
{
    private static BLLEventManager instance = null;
    private DALEventDBManager db = null;
    
    public BLLEventManager() throws Exception
    {
        db = new DALEventDBManager();
    }
    
    private static BLLEventManager getInstance() throws Exception
    {
        if (instance == null)
        {
            instance = new BLLEventManager();
        }
        return instance;
    }
    
    public ArrayList<BEEvent> visEvents() throws SQLServerException, SQLException
    {
       return db.showAll(); 
    }
}
