/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.lager;

import BE.BELager;
import BLL.BLLLagerManager;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Stoffer
 */
public class LagerTableModel extends AbstractTableModel
{

    private BLLLagerManager lm;
    private final String[] header =
    {
        "ID", "Code", "MaterialID", "MaterialName", "MaterialDensity", "ChargeNo", "Length", "Width", "Thickness", "StockQuantity", "kg"
    };
    private final Class[] columnTypes =
    {
        int.class, String.class, int.class, String.class,  Float.class, String.class, Float.class, Float.class, Float.class, String.class
    };
    private ArrayList<BELager> lager;

    public LagerTableModel()
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
    LagerTableModel(ArrayList<BELager> AllLager)
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
                case 10:
                    return l.getKg();

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
