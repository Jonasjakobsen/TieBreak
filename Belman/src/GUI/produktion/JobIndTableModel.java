/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.produktion;

import BE.BELager;
import BLL.BLLLagerManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Stoffer
 */
public class JobIndTableModel extends AbstractTableModel
{

    private BLLLagerManager lm;
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
    private ArrayList<BELager> lager;

    public JobIndTableModel()
    {
        try
        {
            lm = new BLLLagerManager();
        }
        catch (Exception ex)
        {
            System.out.println("lol");
        }
    }
    JobIndTableModel(ArrayList<BELager> AllLager)
    {
        fireTableDataChanged();
        lager = AllLager;
    }

    @Override
    public int getRowCount()
    {
        return lager.size();
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
            BELager l = lager.get(row);
            switch (col)
            {
                case 0:
                    return l.getId();
                case 1:
                    return l.getCode();
                case 2:
                    return l.getMaterialID();
                case 3:
                    return l.getMaterialName();
                case 4:
                    return l.getMaterialDensity();
                case 5:
                    return l.getChargeNo();
                case 6:
                    return l.getLength();
                case 7:
                    return l.getWidth();
                case 8:
                    return l.getThickness();
                case 9:
                    return l.getStockQuantity();   

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
    
    public void setCollection(Collection<BELager> list)
    {
        lager = new ArrayList<>(list);
        fireTableDataChanged();
    }

    BELager getMedlemByRow(int row)
    {
        return lager.get(row);
    }
}
