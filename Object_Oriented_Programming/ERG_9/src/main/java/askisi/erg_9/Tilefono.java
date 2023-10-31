package askisi.erg_9;

abstract class Tilefono {
    ///////METAVLITES/////////
    private String number;
    private int sec2Stath;
    private int sec2Kin;
    ////////CONSTRUCTORS///////
    Tilefono(){}
    
    Tilefono(String number){
        this.number = number;
    }
    
    Tilefono(int sec2Stath, int sec2Kin){
        this.sec2Stath = sec2Stath;
        this.sec2Kin = sec2Kin;
    }
    
    Tilefono(String number,  int sec2Stath, int sec2Kin){
        this.number = number;
        this.sec2Stath = sec2Stath;
        this.sec2Kin =  sec2Kin;
    }
    /////////////SETTERS-GETTERS/////////////
    public void setNumber (String num){
        number = num;
    }
    public String getNumber(){
        return(number);
    }
    ///////
    public void setSec2Stath (int sec){
        sec2Stath = sec;
    }
    public int getSec2Stath(){
        return(sec2Stath);
    }
    //////
     public void setSec2Kin (int sec){
        sec2Kin = sec;
    }
    public int getSec2Kin(){
        return(sec2Kin);
    }
    /////////////TO-STRING////////////
    public String toString(){
        return("\nNumber:"+number
                +"\nSeconds to stathero: "+sec2Stath
                +"\nSeconds to kinito: "+sec2Kin);
    }
    ///////////METHODS/////////////
    abstract public void dial(String til);
    
    abstract public double cost();
}
