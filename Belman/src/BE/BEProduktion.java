/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

import java.util.Date;

/**
 *
 * @author Christoffer
 */
public class BEProduktion {
    
    private final int SOrderID;
    private String SOrder;
    private int POrderID;
    private String POrder;
    private boolean Urgent;
    private Date DueDate;
    private float Quantity;
    private float MaterialID;
    private float Thickness;
    private float Width;
    private float Circumference;
    private String status;
    
    
    public BEProduktion (int SOrderID, String SOrder, int POrderID, 
                        String POrder, boolean Urgent, Date DueDate, Float Quantity,
                        Float MaterialID, Float Thickness, Float Width,
                        Float Circumference)
    {
        this.SOrderID = SOrderID;
        this.SOrder = SOrder;
        this.POrderID = POrderID;
        this.POrder = POrder;
        this.Urgent = Urgent;
        this.DueDate = DueDate;
        this.Quantity = Quantity;
        this.MaterialID = MaterialID;
        this.Thickness = Thickness;
        this.Width = Width;
        this.Circumference = Circumference;
    }

    public BEProduktion(int sOrderId, int pOrderId, String pOrder, Date dueDate, Float quantity, Float width, Float thickness, String status, boolean urgent) {
        this.SOrderID = sOrderId;       
        this.POrderID = pOrderId;
        this.POrder = pOrder;
        this.DueDate = dueDate;
        this.Quantity = quantity;
        this.Width = width;
        this.Thickness = thickness;
        this.status = status;
        this.Urgent = urgent;

    }

    /**
     * @return the SOrderID
     */
    public int getSOrderID() {
        return SOrderID;
    }

    /**
     * @return the SOrder
     */
    public String getSOrder() {
        return SOrder;
    }

    /**
     * @return the POrderID
     */
    public int getPOrderID() {
        return POrderID;
    }

    /**
     * @return the POrder
     */
    public String getPOrder() {
        return POrder;
    }

    /**
     * @return the DueDate
     */
    public Date getDueDate() {
        return DueDate;
    }

    /**
     * @return the Quantity
     */
    public float getQuantity() {
        return Quantity;
    }

    /**
     * @return the Thickness
     */
    public float getThickness() {
        return Thickness;
    }

    /**
     * @return the Width
     */
    public float getWidth() {
        return Width;
    }

    /**
     * @return the Circumference
     */
    public float getCircumference() {
        return Circumference;
    }

    /**
     * @return the Urgent
     */
    public boolean isUrgent() {
        return Urgent;
    }

    /**
     * @return the MaterialID
     */
    public float getMaterialID() {
        return MaterialID;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
