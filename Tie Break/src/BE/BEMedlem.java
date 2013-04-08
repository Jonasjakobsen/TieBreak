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
    private boolean kontingent;
    
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
                    String email, String fodselsdag, Boolean kontingent)
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
        this.kontingent = kontingent;
    }
    
    public BEMedlem(int id, String navn, String efternavn, String addresse1,
                    String fodselsdag, String mobnr, String tlfnr, String email,
                    Boolean kontingent)
    {
        this.id = id;
        this.navn = navn;
        this.efternavn = efternavn;
        this.addresse1 = addresse1;
        this.fodselsdag = fodselsdag;
        this.mobnr = mobnr;
        this.tlfnr = tlfnr;
        this.email = email;
        this.kontingent = kontingent;
    }
    
    public BEMedlem(int id, String navn, String efternavn, Boolean kontingent)
    {
        this.id = id;
        this.navn = navn;
        this.efternavn = efternavn;
        this.kontingent = kontingent;
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @return the navn
     */
    public String getNavn()
    {
        return navn;
    }

    /**
     * @param navn the navn to set
     */
    public void setNavn(String navn)
    {
        this.navn = navn;
    }

    /**
     * @return the efternavn
     */
    public String getEfternavn()
    {
        return efternavn;
    }

    /**
     * @param efternavn the efternavn to set
     */
    public void setEfternavn(String efternavn)
    {
        this.efternavn = efternavn;
    }

    /**
     * @return the addresse1
     */
    public String getAddresse1()
    {
        return addresse1;
    }

    /**
     * @param addresse1 the addresse1 to set
     */
    public void setAddresse1(String addresse1)
    {
        this.addresse1 = addresse1;
    }

    /**
     * @return the addresse2
     */
    public String getAddresse2()
    {
        return addresse2;
    }

    /**
     * @param addresse2 the addresse2 to set
     */
    public void setAddresse2(String addresse2)
    {
        this.addresse2 = addresse2;
    }

    /**
     * @return the postnr
     */
    public String getPostnr()
    {
        return postnr;
    }

    /**
     * @param postnr the postnr to set
     */
    public void setPostnr(String postnr)
    {
        this.postnr = postnr;
    }

    /**
     * @return the tlfnr
     */
    public String getTlfnr()
    {
        return tlfnr;
    }

    /**
     * @param tlfnr the tlfnr to set
     */
    public void setTlfnr(String tlfnr)
    {
        this.tlfnr = tlfnr;
    }

    /**
     * @return the mobnr
     */
    public String getMobnr()
    {
        return mobnr;
    }

    /**
     * @param mobnr the mobnr to set
     */
    public void setMobnr(String mobnr)
    {
        this.mobnr = mobnr;
    }

    /**
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * @return the fodselsdag
     */
    public String getFodselsdag()
    {
        return fodselsdag;
    }

    /**
     * @param fodselsdag the fodselsdag to set
     */
    public void setFodselsdag(String fodselsdag)
    {
        this.fodselsdag = fodselsdag;
    }

    /**
     * @return the isQualified
     */
    public boolean harBetalt()
    {
        return kontingent;
    }

    /**
     * @param isQualified the isQualified to set
     */
    public void setHarBetalt(boolean kontingent)
    {
        this.kontingent = kontingent;
    }
}
