package askisi.erg_8;

public class Car extends Vehicle{
    //////////METAVLITES/////////////
    private int thires;
    //////////CONSTRUTCTORS/////////
    Car (){}
    
    Car (String idioktitis, String arKykloforias, int etosKat, int k, int ip, int thires){
        super(idioktitis, arKykloforias, etosKat, k, ip);
        this.thires = thires;
    }
    /////////SETTERS-GETTERS/////////
    public void setTHIRES (int thires){
        this.thires = thires;
    }
    public int getTHIRES (){
        return thires;
    }
    /////////TO-STRING////////
    @Override
    public String toString(){
        return super.toString() + "\n Thires: " + thires;  
    } 
    ////////METHODS////////////
    @Override
    public void Drive(){
        System.out.println("You need a car driving license dear " +getIdioktisia());
    }
    
}

