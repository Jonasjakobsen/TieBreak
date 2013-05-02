/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author Groggy
 */
public class BEMedarbejder {

   private final int id;
   private String firstname;
   private String lastname;
   private String password;

   public BEMedarbejder (int id, String firstname, String lastname,
                         String password)
   {
       this.id = id;
       this.firstname = firstname;
       this.lastname = lastname;
       this.password = password;
   }
   
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
   
}
