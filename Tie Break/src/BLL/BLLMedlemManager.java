/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DALMedlemDBManager;

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
}
