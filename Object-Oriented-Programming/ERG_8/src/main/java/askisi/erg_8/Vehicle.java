package askisi.erg_8;

abstract class Vehicle {
    private String idioktitis;
    private String arKykloforias;
    private int etosKat;
    private SystimaDieythynsis sysdief; 
    private Mihani eng;
    
    ////////////CONSTRUCTORS///////////////
    public Vehicle (){    
    }
    
    public Vehicle (int ek, int k, int ip){
        etosKat = ek;
        sysdief = new SystimaDieythynsis();
        eng = new Mihani(k, ip);;
    }
    
    public Vehicle (String id, String ak, int ek, int k, int ip){
        idioktitis = id;
        arKykloforias = ak;
        etosKat = ek;
        sysdief = new SystimaDieythynsis();
        eng = new Mihani(k, ip);
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
    ///////////METHODS/////////////
    public abstract void Drive();
    
    public void transferOwnership(String newOwner){
        System.out.println("Ownership is transferred from" +getIdioktisia()+ "to" + newOwner);
        idioktitis = newOwner;
    }
    
}
