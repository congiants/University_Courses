package erg_7_2;

public class Vehicle {
    private String idioktitis;
    private String arKykloforias;
    private int etosKat;
    private SystimaDieythynsis sysdief; 
    private Mihani eng;
    
    ////////////CONSTRUCTORS///////////////
    public Vehicle (){    
    }
    
    public Vehicle (int ek, SystimaDieythynsis sd, Mihani e){
        etosKat = ek;
        sysdief = sd;
        eng = e;
    }
    
    public Vehicle (String id, String ak, int ek, SystimaDieythynsis sd, Mihani e){
        idioktitis = id;
        arKykloforias = ak;
        etosKat = ek;
        sysdief = sd;
        eng = e;
    }
    /////////////SETTERS-GETTERS/////////////
    public void setIdioktisia (String id){
        idioktitis = id;
    }
    public String getIdioktisia(){
        return(idioktitis);
    }
    ///////
    public void setArithmoKykl (String ak){
        arKykloforias = ak;
    }
    public String getArithmoKykl(){
        return(arKykloforias);
    }
    //////
    public void setEtosKat (int ek){
        etosKat = ek;
    }
    public int getEtosKat(){
        return(etosKat);
    }
    /////
    public void setSystimaDieythynsis (SystimaDieythynsis sd){
        sysdief = sd;
    }
    public SystimaDieythynsis getSystimaDieythynsis(){
        return sysdief;
    }
    //////
    public void setMihani (Mihani e){
        eng = e;
    }
    public Mihani getMihani(){
        return(eng);
    }
    ///////////TO STRING////////////
    public String toString(){
        return("\nIdioktits:"+idioktitis
                +"\nArithmos Kykloforias: "+arKykloforias
                +"\nEtos Kataskevis: "+etosKat
                +"\nKyvismos: "+eng.getKyvismos()
                +"\nIppodynami: "+eng.getIppodynami());
    }    
}
