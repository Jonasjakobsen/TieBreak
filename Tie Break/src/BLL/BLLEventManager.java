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
 * Event Manager
 * The business logic layer
 */
public class BLLEventManager
{
    private static BLLEventManager instance = null;
    private DALEventDBManager db = null;
    
    /**
     * Constructor for the BLLEventManager
     * @throws Exception
     */
    
    public BLLEventManager() throws Exception
    {
        db = new DALEventDBManager();
    }
    
    public static BLLEventManager getInstance() throws Exception
    {
        if (instance == null)
        {
            instance = new BLLEventManager();
        }
        return instance;
    }
    
    /**
     * Retrieves the visEvents method from the Data access layer
     * @return showAll
     * @throws SQLException, SQLServerException
     */
    
    public ArrayList<BEEvent> visEvents() throws SQLServerException, SQLException
    {
       return db.showAll(); 
    }
    
     /**
     * Retrieves the updateEvent method from the Data access layer
     * @return updateEvents
     * @throws SQLException
     */
    
    public BEEvent updateEvent(BEEvent m) throws SQLException
    {
        return db.updateEvent(m);
    }
    
     /**
     * Retrieves the deleteEvent method from the Data access layer
     * @return deleteEvent
     * @throws SQLException
     */
    
    public void deleteEvent(int id) throws SQLException
    {
        db.deleteEvent(id);
    }
}
