package askisi.erg_1_4;

public class Employee {
    private int am;
    private String onoma;
    private String eponimo;
    private int years;
    private double vasikos_misthos;
    private double bonus;
    
    public Employee () {}
    
    public Employee (int am, String onoma, String eponimo, int years, double vasikos_misthos, double bonus){
        this.am = am;
        this.onoma = onoma;
        this.eponimo = eponimo;
        this.years = years;
        this.vasikos_misthos = vasikos_misthos;
        this.bonus = bonus;
    }
    /////////////////SETTERS////////////////////////
    public void setAM (int am){
        this.am = am;
    }
    
    public void setONOMA (String onoma){
        this.onoma = onoma;
    }
    
    public void setEPONIMO (String eponimo){
        this.eponimo = eponimo;
    }
    
    public void setYEARS (int years){
        this.years = years;
    }
    
    public void setVASIKOS_MISTHOS (double vasikos_misthos){
        this.vasikos_misthos = vasikos_misthos;
    }
    
    public void setBONUS (double bonus){
        this.bonus = bonus;
    }
    /////////////////GETTERS////////////////////////
    public int getAM (){
        return am;
    }
    
    public String getONOMA (){
        return onoma;
    }
    
    public String getEPONIMO(){
        return eponimo;
    }
    
    public double getVASIKOS_MISTHOS (){
        return vasikos_misthos;
    }
    
    public double getBONUS (){
        return bonus;
    }
    
    public int getYEARS(){
        return years;
    }
    ///////////////TO STRING///////////////////////
    public String toString(){
        return ("Onoma: "+onoma+" \nEponimo:"+eponimo+" \nVsikos Misthos: "+vasikos_misthos+" \nBonus: "+bonus+" \nYears:"+years+"");
    }
    ///////////////SALARY//////////////////////////
    public double salary(){
        double telikos_misthos = vasikos_misthos + (years * 10) + bonus;
        return telikos_misthos;
    }
}