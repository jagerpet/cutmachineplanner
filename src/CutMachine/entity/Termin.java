package CutMachine.entity;
// Generated 18.12.2012 13:29:40 by Hibernate Tools 3.2.1.GA



/**
 * Termin generated by hbm2java
 */
public class Termin  implements java.io.Serializable {


     private int cislozak;
     private Integer startday;
     private Integer startmounth;
     private Integer startyear;
     private Integer starthour;
     private Integer startminute;
     private Integer endday;
     private Integer endmounth;
     private Integer endyear;
     private Integer endhour;
     private Integer endminute;
     private Integer vyrdoba;
     private Integer state;

    public Termin() {
    }

	
    public Termin(int cislozak) {
        this.cislozak = cislozak;
    }
    public Termin(int cislozak, Integer startday, Integer startmounth, Integer startyear, Integer starthour, Integer startminute, Integer endday, Integer endmounth, Integer endyear, Integer endhour, Integer endminute, Integer vyrdoba, Integer state) {
       this.cislozak = cislozak;
       this.startday = startday;
       this.startmounth = startmounth;
       this.startyear = startyear;
       this.starthour = starthour;
       this.startminute = startminute;
       this.endday = endday;
       this.endmounth = endmounth;
       this.endyear = endyear;
       this.endhour = endhour;
       this.endminute = endminute;
       this.vyrdoba = vyrdoba;
       this.state = state;
    }
   
    public int getCislozak() {
        return this.cislozak;
    }
    
    public void setCislozak(int cislozak) {
        this.cislozak = cislozak;
    }
    public Integer getStartday() {
        return this.startday;
    }
    
    public void setStartday(Integer startday) {
        this.startday = startday;
    }
    public Integer getStartmounth() {
        return this.startmounth;
    }
    
    public void setStartmounth(Integer startmounth) {
        this.startmounth = startmounth;
    }
    public Integer getStartyear() {
        return this.startyear;
    }
    
    public void setStartyear(Integer startyear) {
        this.startyear = startyear;
    }
    public Integer getStarthour() {
        return this.starthour;
    }
    
    public void setStarthour(Integer starthour) {
        this.starthour = starthour;
    }
    public Integer getStartminute() {
        return this.startminute;
    }
    
    public void setStartminute(Integer startminute) {
        this.startminute = startminute;
    }
    public Integer getEndday() {
        return this.endday;
    }
    
    public void setEndday(Integer endday) {
        this.endday = endday;
    }
    public Integer getEndmounth() {
        return this.endmounth;
    }
    
    public void setEndmounth(Integer endmounth) {
        this.endmounth = endmounth;
    }
    public Integer getEndyear() {
        return this.endyear;
    }
    
    public void setEndyear(Integer endyear) {
        this.endyear = endyear;
    }
    public Integer getEndhour() {
        return this.endhour;
    }
    
    public void setEndhour(Integer endhour) {
        this.endhour = endhour;
    }
    public Integer getEndminute() {
        return this.endminute;
    }
    
    public void setEndminute(Integer endminute) {
        this.endminute = endminute;
    }
    public Integer getVyrdoba() {
        return this.vyrdoba;
    }
    
    public void setVyrdoba(Integer vyrdoba) {
        this.vyrdoba = vyrdoba;
    }
    public Integer getState() {
        return this.state;
    }
    
    public void setState(Integer state) {
        this.state = state;
    }




}

