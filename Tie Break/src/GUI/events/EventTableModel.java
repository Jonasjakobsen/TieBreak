/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.events;

import BE.BEEvent;
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
        "ArrangementID", "Arrangementdag"
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
            em = new BLLEventManager();
        }
        catch (Exception ex)
        {
            System.out.println("ERROR - " + ex.getMessage());
        }
    }
    
    EventTableModel(ArrayList<BEEvent> AllEvents)
    {
        fireTableDataChanged();
        events = AllEvents;
    }
@Override
    public int getRowCount()
    {
        return events.size();
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
            BEEvent e = events.get(row);
            switch (col)
            {
                case 0:
                    return e.getId();
                case 1:
                    return e.getArrangementdag();

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
    
    public void setCollection(Collection<BEEvent> list)
    {
        events = new ArrayList<>(list);
        fireTableDataChanged();
    }

    BEEvent getEventByRow(int row)
    {
        return events.get(row);
    }
}

