package CutMachine.entity;
// Generated 18.12.2012 13:29:40 by Hibernate Tools 3.2.1.GA



/**
 * Deadline generated by hbm2java
 */
public class Deadline  implements java.io.Serializable {


     private int cislozak;
     private Integer deadday;
     private Integer deadmounth;
     private Integer deadyear;
     private Integer deadhour;
     private Integer deadminute;

    public Deadline() {
    }

	
    public Deadline(int cislozak) {
        this.cislozak = cislozak;
    }
    public Deadline(int cislozak, Integer deadday, Integer deadmounth, Integer deadyear, Integer deadhour, Integer deadminute) {
       this.cislozak = cislozak;
       this.deadday = deadday;
       this.deadmounth = deadmounth;
       this.deadyear = deadyear;
       this.deadhour = deadhour;
       this.deadminute = deadminute;
    }
   
    public int getCislozak() {
        return this.cislozak;
    }
    
    public void setCislozak(int cislozak) {
        this.cislozak = cislozak;
    }
    public Integer getDeadday() {
        return this.deadday;
    }
    
    public void setDeadday(Integer deadday) {
        this.deadday = deadday;
    }
    public Integer getDeadmounth() {
        return this.deadmounth;
    }
    
    public void setDeadmounth(Integer deadmounth) {
        this.deadmounth = deadmounth;
    }
    public Integer getDeadyear() {
        return this.deadyear;
    }
    
    public void setDeadyear(Integer deadyear) {
        this.deadyear = deadyear;
    }
    public Integer getDeadhour() {
        return this.deadhour;
    }
    
    public void setDeadhour(Integer deadhour) {
        this.deadhour = deadhour;
    }
    public Integer getDeadminute() {
        return this.deadminute;
    }
    
    public void setDeadminute(Integer deadminute) {
        this.deadminute = deadminute;
    }




}


