/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.produktion;

import BE.BEProduktion;
import BLL.BLLProduktionManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Stoffer
 */
public class ProduktionFormTableModel extends AbstractTableModel {

    private BLLProduktionManager pm;
    private final String[] header = {
        "pOrder", "Due Date", "Quantity", "MaterialName"
    };
    private final Class[] columnTypes = {
        String.class, Date.class, Float.class, String.class
    };
    private ArrayList<BEProduktion> produktion;

    public ProduktionFormTableModel() {
        try {
            pm = new BLLProduktionManager();
        } catch (Exception ex) {
            System.out.println("lol");
        }
    }

    ProduktionFormTableModel(ArrayList<BEProduktion> AllProduktion) {
        fireTableDataChanged();
        produktion = AllProduktion;
    }

    @Override
    public int getRowCount() {
        return produktion.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        {
            BEProduktion p = produktion.get(row);
            switch (col) {


                case 0:
                    return p.getPOrder(); 
                case 1:
                    return p.getDueDate();
                case 2:
                    return p.getQuantity();
                case 3:
                    return p.getMaterialName();
            }
            return null;
        }
    }

    @Override
    public String getColumnName(int col) {
        return header[col];
    }

    @Override
    public Class<?> getColumnClass(int col) {
        return columnTypes[col];
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return (false);
    }

    public void setCollection(Collection<BEProduktion> list) {
        produktion = new ArrayList<>(list);
        fireTableDataChanged();
    }

    BEProduktion getOrderByRow(int row) {
        return produktion.get(row);
    }

    void clear() {
        produktion.clear();
    }
}
