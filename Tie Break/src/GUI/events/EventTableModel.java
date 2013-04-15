/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.events;

import BE.BEEvent;
import BE.BEMedlem;
import BLL.BLLEventManager;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Stoffer
 */
public class EventTableModel extends AbstractTableModel
{
    private BLLEventManager em;
    private final String[] header =
    {
        "ArrangementID", "Arrangementdag", "Arrangement beskrivelse"
    };
    private final Class[] columnTypes =
    {
        int.class, String.class, String.class
    };
    
    private ArrayList<BEEvent> events;
    
    public EventTableModel()
    {
        try
        {
            em = BLLEventManager();
        }
        catch (Exception ex)
        {
            System.out.println("ERROR - " + ex.getMessage());
        }
    }
    
    MedlemTableModel(ArrayList<BEEvent> AllEvents)
    {
        fireTableDataChanged();
        events = AllEvents;
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

