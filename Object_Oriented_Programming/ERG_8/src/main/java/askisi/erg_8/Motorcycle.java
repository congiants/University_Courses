package askisi.erg_8;

public class Motorcycle extends Vehicle{
     //////////METAVLITES/////////////
    private int kalathi;
    //////////CONSTRUTCTORS/////////
    Motorcycle (){}
    
    Motorcycle (String idioktitis, String arKykloforias, int etosKat, int k, int ip, int kalathi){
        super(idioktitis, arKykloforias, etosKat, k, ip);
        this.kalathi = kalathi;
    }
    /////////SETTERS-GETTERS/////////
    public void setKALATHI (int kalathi){
        this.kalathi = kalathi;
    }
    public int getKALATHI (){
        return kalathi;
    }
    /////////TO-STRING////////
    @Override
    public String toString(){
        return super.toString() + "\n Kalathi: " + kalathi;  
    } 
    ////////METHODS////////////
    @Override
    public void Drive(){
        System.out.println("Your car driving license is not enough. You need a special license dear " +getIdioktisia());
    }
}
