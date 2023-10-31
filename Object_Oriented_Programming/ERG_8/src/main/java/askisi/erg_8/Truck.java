package askisi.erg_8;

public class Truck extends Vehicle{
    //////////METAVLITES/////////////
    private int ax;
    //////////CONSTRUTCTORS/////////
    Truck (){}
    
    Truck (String idioktitis, String arKykloforias, int etosKat, int k, int ip, int ax){
        super(idioktitis, arKykloforias, etosKat, k, ip);
        this.ax = ax;
    }
    /////////SETTERS-GETTERS/////////
    public void setAX (int ax){
        this.ax = ax;
    }
    public int getAX (){
        return ax;
    }
    /////////TO-STRING////////
    @Override
    public String toString(){
        return super.toString() + "\n Axones: " + ax;  
    } 
    ////////METHODS////////////
    @Override
    public void Drive(){
        System.out.println("You must be a professional driver. This is a" + ax+ "axels truck Mr./Mrs. " +getIdioktisia());
    }
}
