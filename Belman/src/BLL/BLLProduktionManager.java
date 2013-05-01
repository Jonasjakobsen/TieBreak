package BLL;

import BE.BEProduktion;
import DAL.DALProduktionDBManager;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * LagerManager
 * The Business logic layer
 */
public class BLLProduktionManager
{
    private static BLLProduktionManager instance = null;
    private DALProduktionDBManager db = null;
    
    /**
     * Constructor for the BLLLagerManager
     * @throws Exception
     */   
    
    public BLLProduktionManager() throws Exception
    {
        db = new DALProduktionDBManager();
    }
    
    public static BLLProduktionManager getInstance() throws Exception
    {
        if (instance == null)
        {
            instance = new BLLProduktionManager();
        }
        return instance;
    }
    
        public ArrayList<BEProduktion> visOrdrer() throws SQLServerException, SQLException
    {
        return db.visOrdrer();
    }
    
}