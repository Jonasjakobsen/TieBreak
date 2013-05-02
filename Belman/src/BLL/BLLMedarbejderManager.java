package BLL;

import DAL.DALMedarbejderDBManager;

/**
 * LagerManager
 * The Business logic layer
 */
public class BLLMedarbejderManager 
{
    private static BLLMedarbejderManager instance = null;
    private DALMedarbejderDBManager db = null;
    public boolean isLoggedIn;
    
    /**
     * Constructor for the BLLLagerManager
     * @throws Exception
     */   
    
    public BLLMedarbejderManager() throws Exception
    {
        db = new DALMedarbejderDBManager();
    }
    
    public static BLLMedarbejderManager getInstance() throws Exception
    {
        if (instance == null)
        {
            instance = new BLLMedarbejderManager();
        }
        return instance;
    }
    

    public boolean logIn(int Id, String Password) {
        return db.isLoggedIn;
    }
    
}