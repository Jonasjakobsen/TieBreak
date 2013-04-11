/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.BEMedlem;
import BLL.BLLMedlemManager;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Stoffer
 */
public class MedlemTableModel extends AbstractTableModel
{

    private BLLMedlemManager mm;
    private final String[] header =
    {
        "Id", "Name", "Efternavn", "Adresse", "PostNr", "Fødselsdag", "Mobil Nr", "Tlf nr", "Email", "Kontingent"
    };
    private final Class[] columnTypes =
    {
        int.class, String.class, String.class, String.class,  String.class, String.class, String.class, String.class, String.class, Boolean.class
    };
    private ArrayList<BEMedlem> medlemmer;

    public MedlemTableModel()
    {
        try
        {
            mm = new BLLMedlemManager();
        }
        catch (Exception ex)
        {
            System.out.println("lol");
        }
    }
    MedlemTableModel(ArrayList<BEMedlem> AllPersons)
    {
        fireTableDataChanged();
        medlemmer = AllPersons;
    }

    @Override
    public int getRowCount()
    {
        return medlemmer.size();
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
            BEMedlem m = medlemmer.get(row);
            switch (col)
            {
                case 0:
                    return m.getId();
                case 1:
                    return m.getNavn();
                case 2:
                    return m.getEfternavn();
                case 3:
                    return m.getAddresse1();
                case 4:
                    return m.getPostnr();
                case 5:
                    return m.getFodselsdag();
                case 6:
                    return m.getMobnr();
                case 7:
                    return m.getTlfnr();
                case 8:
                    return m.getEmail();
                case 9:
                    return m.harBetalt();

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
    
    public void setCollection(Collection<BEMedlem> list)
    {
        medlemmer = new ArrayList<>(list);
        fireTableDataChanged();
    }

    BEMedlem getMedlemByRow(int row)
    {
        return medlemmer.get(row);
    }
}
