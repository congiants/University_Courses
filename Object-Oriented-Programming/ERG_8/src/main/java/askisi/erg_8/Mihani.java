package askisi.erg_8;

public class Mihani {
    private int kyvismos;
    private int ippodynami;
    //////////CONSTRUCTOR///////////
    Mihani (int kyvismos, int ippodynami){
        this.kyvismos = kyvismos;
        this.ippodynami = ippodynami;
    }
    //////////SETTERS-GETTERS/////////
    public void setKyvismos (int ky){
        kyvismos = ky;
    }
    public int getKyvismos(){
        return kyvismos;
    }
    //////
    public void setIppodynami (int ipp){
        ippodynami = ipp;
    }
    public int getIppodynami(){
        return ippodynami;
    }
    ///////////METHODS////////////
    public static void leitourgia(){
        System.out.println("Leitourgia.");
    }
    
    public static void kinisi(){
        System.out.println("Kinisi.");
    }
    
    public static void svysimo(){
        System.out.println("Svysimo.");
    }
}
