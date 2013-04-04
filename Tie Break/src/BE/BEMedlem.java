/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author Stoffer
 */
public class BEMedlem
{
    private final int id;
    private String navn;
    private String efternavn;
    private String addresse1;
    private String addresse2;
    private String postnr;
    private String tlfnr;
    private String mobnr;
    private String email;
    private String fodselsdag;
    
    /**
     *
     * @param id
     * @param navn
     * @param efternavn
     * @param addresse1
     * @param addresse2
     * @param postnr
     * @param tlfnr
     * @param mobnr
     * @param email
     * @param fodselsdag
     */
    public BEMedlem(int id, String navn, String efternavn, String addresse1,
                    String addresse2, String postnr, String tlfnr, String mobnr,
                    String email, String fodselsdag)
    {
        this.id = id;
        this.navn = navn;
        this.efternavn = efternavn;
        this.addresse1 = addresse1;
        this.addresse2 = addresse2;
        this.postnr = postnr;
        this.tlfnr = tlfnr;
        this.mobnr = mobnr;
        this.email = email;
        this.fodselsdag = fodselsdag;
        
    }
}
