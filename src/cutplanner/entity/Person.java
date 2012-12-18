package cutplanner.entity;
// Generated 14.12.2012 17:06:32 by Hibernate Tools 3.2.1.GA



/**
 * Person generated by hbm2java
 */
public class Person  implements java.io.Serializable {


     private int cislozam;
     private String jmeno;
     private String prijmeni;
     private String username;
     private String password;
     private Integer role;

    public Person() {
    }

	
    public Person(int cislozam) {
        this.cislozam = cislozam;
    }
    public Person(int cislozam, String jmeno, String prijmeni, String username, String password, Integer role) {
       this.cislozam = cislozam;
       this.jmeno = jmeno;
       this.prijmeni = prijmeni;
       this.username = username;
       this.password = password;
       this.role = role;
    }
   
    public int getCislozam() {
        return this.cislozam;
    }
    
    public void setCislozam(int cislozam) {
        this.cislozam = cislozam;
    }
    public String getJmeno() {
        return this.jmeno;
    }
    
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    public String getPrijmeni() {
        return this.prijmeni;
    }
    
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getRole() {
        return this.role;
    }
    
    public void setRole(Integer role) {
        this.role = role;
    }




}

