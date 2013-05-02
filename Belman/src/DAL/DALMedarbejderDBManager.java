package DAL;

import BE.BELager;
import java.util.ArrayList;

/**
 * Lager DB Manager The data Access Layer
 */
public class DALMedarbejderDBManager extends DALBelmanDBManager {

    private ArrayList<BELager> lager;

    public DALMedarbejderDBManager() throws Exception {
        super();
    }

}
