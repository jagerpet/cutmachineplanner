package CutMachine.entity;
// Generated 31.12.2012 21:28:25 by Hibernate Tools 3.2.1.GA



/**
 * Druhpapiru generated by hbm2java
 */
public class Druhpapiru  implements java.io.Serializable {


     private int cislopap;
     private String druhpap;
     private Integer rychlost;

    public Druhpapiru() {
    }

	
    public Druhpapiru(int cislopap) {
        this.cislopap = cislopap;
    }
    public Druhpapiru(int cislopap, String druhpap, Integer rychlost) {
       this.cislopap = cislopap;
       this.druhpap = druhpap;
       this.rychlost = rychlost;
    }
   
    public int getCislopap() {
        return this.cislopap;
    }
    
    public void setCislopap(int cislopap) {
        this.cislopap = cislopap;
    }
    public String getDruhpap() {
        return this.druhpap;
    }
    
    public void setDruhpap(String druhpap) {
        this.druhpap = druhpap;
    }
    public Integer getRychlost() {
        return this.rychlost;
    }
    
    public void setRychlost(Integer rychlost) {
        this.rychlost = rychlost;
    }




}


