/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

import java.util.GregorianCalendar;

/**
 *
 * @author Christoffer
 */
public class BESleeve {
    private final int id;
//    private GregorianCalendar startTime;
//    private GregorianCalendar endTime;
    private Float thickness;
    private Float circumference;
    private int materialId;
    private int pOrderId;
    private BEMateriale material;    
    

    public BESleeve(int id,  Float thickness, Float circumference, int materialId, int pOrderId, BEMateriale material)
    {
        this.id = id;
        this.thickness = thickness;
        this.circumference = circumference;
        this.materialId = materialId;
        this.pOrderId = pOrderId; 
        this.material = material;
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

//    /**
//     * @return the startTime
//     */
//    public GregorianCalendar getStartTime()
//    {
//        return startTime;
//    }
//
//    /**
//     * @param startTime the startTime to set
//     */
//    public void setStartTime(GregorianCalendar startTime)
//    {
//        this.startTime = startTime;
//    }
//
//    /**
//     * @return the endTime
//     */
//    public GregorianCalendar getEndTime()
//    {
//        return endTime;
//    }
//
//    /**
//     * @param endTime the endTime to set
//     */
//    public void setEndTime(GregorianCalendar endTime)
//    {
//        this.endTime = endTime;
//    }

    /**
     * @return the thickness
     */
    public double getThickness()
    {
        return thickness;
    }

    /**
     * @param thickness the thickness to set
     */
    public void setThickness(Float thickness)
    {
        this.thickness = thickness;
    }

    /**
     * @return the circumference
     */
    public double getCircumference()
    {
        return circumference;
    }

    /**
     * @param circumference the circumference to set
     */
    public void setCircumference(Float circumference)
    {
        this.circumference = circumference;
    }

    /**
     * @return the materialId
     */
    public int getMaterialId()
    {
        return materialId;
    }

    /**
     * @param materialId the materialId to set
     */
    public void setMaterialId(int materialId)
    {
        this.materialId = materialId;
    }

    /**
     * @return the pOrderId
     */
    public int getpOrderId()
    {
        return pOrderId;
    }

    /**
     * @param pOrderId the pOrderId to set
     */
    public void setpOrderId(int pOrderId)
    {
        this.pOrderId = pOrderId;
    }
    
    public BEMateriale getMaterialName()
    {
        return material;
    }   
}