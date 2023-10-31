package erg_1_2;

public class Student {
    private int am;
    private String onoma;
    private int apousies;
    private double vathmos_erg;
    private double vathmos_th;
    
    public Student () {}
    
    public Student (int am, String onoma, int apousies, double vathmos_erg, double vathmos_th){
        this.am = am;
        this.onoma = onoma;
        this.apousies = apousies;
        this.vathmos_erg = vathmos_erg;
        this.vathmos_th = vathmos_th;
    }
    
    public Student (int am, String onoma){
        this(am, onoma, 0, 0.0, 0.0);
    }
    
    public void setAM (int am){
        this.am = am;
    }
    
    public void setONOMA (String onoma){
        this.onoma = onoma;
    }
    
    public void setAPOUSIES (int apousies){
        this.apousies = apousies;
    }
    
    public void setVATHMOS_ERG (double vathmos_erg){
        this.vathmos_erg = vathmos_erg;
    }
    
    public void setVATHMOS_TH (double vathmos_th){
        this.vathmos_th = vathmos_th;
    }
    
    public int getAM (){
        return am;
    }
    
    public String getONOMA (){
    return onoma;
    }
    
    public int getAPOUSIES(){
        return apousies;
    }
    
    public double getVATHMOS_ERG(){
        return vathmos_erg;
    }
    
    public double getVATHMOS_TH(){
        return vathmos_th;
    }
    
    public String toString(){
        return ("Onoma: "+onoma+" (AM:"+am+") \nVathmos: "+computeFinal()+" (Th: "+vathmos_th+" Erg:"+vathmos_erg+") \nApousies: "+apousies+"");
    }
    
    public double computeFinal(){
        return 0.7 * this.vathmos_th + 0.3 * this.vathmos_erg;
    }
}
