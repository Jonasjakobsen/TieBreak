/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.produktion;

import BE.BELager;
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
public class ProduktionFormTableModel extends AbstractTableModel
{

    private BLLProduktionManager pm;
    private final String[] header =
    {
        "SOrderID", "SOrder", "POrderID", "POrder", "Urgent", "DueDate", 
        "Quantity", "MaterialID", "Thickness", "Width", "Circumference"
    };
    private final Class[] columnTypes =
    {
        int.class, String.class, int.class, String.class,  Boolean.class, 
        Date.class, Float.class, Float.class, Float.class, Float.class,
        Float.class
    };
    private ArrayList<BEProduktion> produktion;

    public ProduktionFormTableModel()
    {
        try
        {
            pm = new BLLProduktionManager();
        }
        catch (Exception ex)
        {
            System.out.println("lol");
        }
    }
    ProduktionFormTableModel(ArrayList<BEProduktion> AllProduktion)
    {
        fireTableDataChanged();
        produktion = AllProduktion;
    }

    @Override
    public int getRowCount()
    {
        return produktion.size();
    }

    @Override
    public int getColumnCount()
    {
        return header.length;
    }

    @Override
    public Object getValueAt(int row, int col)
    {
        {
            BEProduktion p = produktion.get(row);
            switch (col)
            {
                case 0:
                    return p.getSOrderID();
                case 1:
                    return p.getSOrder();
                case 2:
                    return p.getPOrderID();
                case 3:
                    return p.getPOrder();
                case 4:
                    return p.isUrgent();
                case 5:
                    return p.getDueDate();
                case 6:
                    return p.getQuantity();
                case 7:
                    return p.getMaterialID();
                case 8:
                    return p.getThickness();
                case 9:
                    return p.getWidth();
                case 10:
                    return p.getCircumference();   

            }
            return null;
        }
    }

    @Override
    public String getColumnName(int col)
    {
        return header[col];
    }

    @Override
    public Class<?> getColumnClass(int col)
    {
        return columnTypes[col];
    }

    @Override
    public boolean isCellEditable(int row, int col)
    {
        return (false);
    }
    
    public void setCollection(Collection<BEProduktion> list)
    {
        produktion = new ArrayList<>(list);
        fireTableDataChanged();
    }

    BEProduktion getMedlemByRow(int row)
    {
        return produktion.get(row);
    }

    void clear() {
        produktion.clear();
    }
}
