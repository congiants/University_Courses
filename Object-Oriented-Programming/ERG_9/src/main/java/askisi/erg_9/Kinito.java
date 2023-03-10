package askisi.erg_9;

public class Kinito extends Tilefono{
    ///////////CONSTRUCTORS//////////////
    Kinito(){
        //////RANDOMM PHONE NUMBER STARTING WITH 6 AND 10 DIGITS LONG/////////
        String s = "6";
        for(int i =1; i<=9; i++){
            s += (int)(Math.random()*10);
        }
        setNumber(s);
    }
    
    Kinito(String num){
        super(num);
    }
    
    Kinito (int sec2Stath, int sec2Kin){
        super(sec2Stath, sec2Kin);
    }
    
    Kinito (String num, int sec2Stath, int sec2Kin){
        super(num, sec2Stath, sec2Kin);
    }
    
    @Override
    public void dial (String til){
        String msg = null;
        /////////FIRST CHAR IN A STRING == 2/////////
        if (til.charAt(0) == '2'){
           msg = "stathero";
           setSec2Stath(getSec2Stath() + (int)(Math.random() * 995)+5);
        }
        /////////FIRST CHAR IN A STRING == 6/////////
        else if (til.charAt(0) == '6'){
            msg = "kinito";
            /////////////ADDS TO Sec2Kin RANDOM NUMBER (0-1000)//////////
            setSec2Kin(getSec2Kin() + (int)(Math.random() *995)+5);
        }
        else{
            System.out.println("Wrong number");
        }
        System.out.println("Klisi apo to kinito tilefono "+ getNumber() + " sto " +msg+ " thlefono " +til);
    }
    
    @Override
    public double cost(){
        double cost = (getSec2Stath() * 0.06) + (getSec2Kin() * 0.07);
        return cost;
    }
}
