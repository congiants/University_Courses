package askisi.erg_4;

public class Foititis {
    private String onoma;
    private String eponimo;
    private short am;
    private short etos;
    /////////////CONSTRUCTORS///////////////
    public Foititis () {}
    
    public Foititis (String onoma, String eponimo, short am, short etos){
        this.onoma = onoma;
        this.eponimo = eponimo;
        this.am = am;
        this.etos = etos;
    }
    //////////////SETTERS-GETTERS/////////// 
    public void setONOMA (String onoma){
        this.onoma = onoma;
    }
    public String getONOMA (){
    return onoma;
    }
    ////////
    public void setEPONIMO (String eponimo){
        this.eponimo = eponimo;
    }
    public String getEPONIMO (){
        return eponimo;
    }
    //////////
    public void setAM (short am){
        this.am = am;
    }
    public short getAM (){
        return am;
    }
    ///////
    public void setETOS (short etos){
        this.etos = etos;
    }
    public short getETOS (){
        return etos;
    }
    ///////////TO-STRING/////////////
    public String toString(){
        return("\nOnoma:"+onoma
                +"\nEponimo: "+eponimo
                +"\nArithmos Mitroou: "+am
                +"\nEtos: "+etos);
    }
}
