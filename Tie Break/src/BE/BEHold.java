/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author 
 */
public class BEHold
{
    private final int id;
    private int medlemsnr;
  
    
    /**
     *  The constructor for the Hold class.
     * @param id - The unique id of the Team.
     */
    
    public BEHold(int id, int medlemsnr)
    {
        this.id = id;
        this.medlemsnr = medlemsnr;
    }
    
      
//    /**
//     *
//     * @return overrides the default text format and prints out properly.
//     */
//    @Override
//    public String toString()
//    {
//        return String.format("%-6s %-30s ", getId());
    }



