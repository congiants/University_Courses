package askisi.erg_9;
import java.lang.Math;


public class Stathero extends Tilefono{
    ///////////CONSTRUCTORS//////////////
    Stathero(){
        //////RANDOMM PHONE NUMBER STARTING WITH 2 AND 10 DIGITS LONG/////////
        String s = "2";
        for(int i =1; i<=9; i++){
            s += (int)(Math.random()*10);
        }
        setNumber(s);
    }
    
    Stathero(String num){
        super(num);
    }
    
    Stathero (int sec2Stath, int sec2Kin){
        super(sec2Stath, sec2Kin);
    }
    
    Stathero (String num, int sec2Stath, int sec2Kin){
        super(num, sec2Stath, sec2Kin);
    }
    
    @Override
    public void dial (String til){
        String msg = null;
        /////////FIRST CHAR IN A STRING == 2/////////
        if (til.charAt(0) == '2'){
           msg = "stathero";
           setSec2Stath(getSec2Stath() + (int)(Math.random() * 595)+5);
        }
        /////////FIRST CHAR IN A STRING == 6/////////
        else if (til.charAt(0) == '6'){
            msg = "kinito";
            setSec2Kin(getSec2Kin() + (int)(Math.random() *595)+5);
        }
        else{
            System.out.println("Wrong number");
        }
        System.out.println("Klisi apo to stathero tilefono "+ getNumber() + " sto " +msg+ " thlefono " +til);
    }
    
    @Override
    public double cost(){
        double cost = (getSec2Stath() * 0.02) + (getSec2Kin() * 0.05);
        return cost;
    }
}