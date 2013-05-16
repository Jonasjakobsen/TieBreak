/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.BEProduktion;
import DAL.DALSleeveDBManager;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author Christoffer
 */
public class BLLSleeveManager extends Observable {

    private static BLLSleeveManager instance = null;
    private DALSleeveDBManager db = null;

    public BLLSleeveManager() throws Exception {
        db = new DALSleeveDBManager();
    }

    public static BLLSleeveManager getInstance() throws Exception {
        if (instance == null) {
            instance = new BLLSleeveManager();
        }
        return instance;
    }

    public ArrayList<BEProduktion> visOrdrer() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}
