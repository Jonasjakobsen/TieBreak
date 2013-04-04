/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author Stoffer
 */
public class BEArrangement {

    private final int id;
    private String arrangementbeskrivelse;
    private String arrangementdag;
    private int medlemsnr;

    /**
     *
     * @param id
     * @param arrangementbeskrivelse
     * @param arrangementdag
     * @param medlemsnr
     */
    public BEArrangement(int id, String arrangementbeskrivelse,
            String arrangementdag, int medlemsnr)
{
    this.id = id;
    this.arrangementbeskrivelse = arrangementbeskrivelse;
    this.arrangementdag = arrangementdag;
    this.medlemsnr = medlemsnr;
}

    /**
     * @return the arrangementbeskrivelse
     */
    public String getArrangementbeskrivelse() {
        return arrangementbeskrivelse;
    }

    /**
     * @return the arrangementdag
     */
    public String getArrangementdag() {
        return arrangementdag;
    }

    /**
     * @return the medlemsnr
     */
    public int getMedlemsnr() {
        return medlemsnr;
    }

    /**
     * @param medlemsnr the medlemsnr to set
     */
    public void setMedlemsnr(int medlemsnr) {
        this.medlemsnr = medlemsnr;
    }

}