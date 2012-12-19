package CutMachine.entity;
// Generated 18.12.2012 13:29:40 by Hibernate Tools 3.2.1.GA



/**
 * CapacityId generated by hbm2java
 */
public class CapacityId  implements java.io.Serializable {


     private int day;
     private int mounth;
     private int year;

    public CapacityId() {
    }

    public CapacityId(int day, int mounth, int year) {
       this.day = day;
       this.mounth = mounth;
       this.year = year;
    }
   
    public int getDay() {
        return this.day;
    }
    
    public void setDay(int day) {
        this.day = day;
    }
    public int getMounth() {
        return this.mounth;
    }
    
    public void setMounth(int mounth) {
        this.mounth = mounth;
    }
    public int getYear() {
        return this.year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CapacityId) ) return false;
		 CapacityId castOther = ( CapacityId ) other; 
         
		 return (this.getDay()==castOther.getDay())
 && (this.getMounth()==castOther.getMounth())
 && (this.getYear()==castOther.getYear());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getDay();
         result = 37 * result + this.getMounth();
         result = 37 * result + this.getYear();
         return result;
   }   


}

