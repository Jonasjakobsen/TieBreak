/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.BEMedlem;
import DAL.DALMedlemDBManager;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * MedlemManager
 * The Business logic layer
 */
public class BLLMedlemManager
{
    private static BLLMedlemManager instance = null;
    private DALMedlemDBManager db = null;
    
    /**
     * Constructor for the BLLMedlemManager
     * @throws Exception
     */   
    
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
    /**
     * Retrieves the visMedlemmer method from the Data access layer
     * @returns showAll
     * @throws SQLException, SQLServerException
     */
    public ArrayList<BEMedlem> visMedlemmer() throws SQLServerException, SQLException
    {
        return db.showAll();
    }
    /**
     * Retrieves the addMedember method from the Data access layer
     * @returns addMember
     * @throws SQLException
     */
    public BEMedlem addMember(BEMedlem m) throws SQLException
    {
        return db.addMember(m);
    }
    /**
     * Retrieves the updateMedember method from the Data access layer
     * @returns updateMember
     * @throws SQLException
     */
    public BEMedlem updateMember(BEMedlem m) throws SQLException
    {
        return db.updateMember(m);
    }
    /**
     * Retrieves the deleteMedember method from the Data access layer
     * @returns deleteMember
     * @throws SQLException
     */
    public void deleteMember(int id) throws SQLException
    {
        db.deleteMember(id);
    }
    
}
