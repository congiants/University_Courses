package erg_7_3;

public class Ypallilos {
    private String onoma;
    private int am;
    private String eidikotita;
    private String odos;
    ////////CONSTRUCTORS//////////////
    public Ypallilos () {}
    
    public Ypallilos (String onoma, int am, String eidikotita, String odos){
        this.am = am;
        this.onoma = onoma;
        this.eidikotita = eidikotita;
        this.odos = odos;
    }
    ///////////SETTERS-GETTERS////////////
    public void setONOMA (String onoma){
        this.onoma = onoma;
    }
    public String getONOMA (){
    return onoma;
    }
    /////////
    public void setAM (int am){
        this.am = am;
    }
    public int getAM (){
        return am;
    }
    ////////
    public void setEIDIKOTITA (String eidikotita){
        this.eidikotita = eidikotita;
    }
    public String getEIDIKOTITA (){
    return eidikotita;
    }
    ////////
    public void setODOS (String eidikotita){
        this.odos = eidikotita;
    }
    public String getODOS (){
    return odos;
    }
    ////////TO-STRING//////////
    public String toString(){
        return("\nOnoma:"+onoma
                +"\nArithmos Mitroou: "+am
                +"\nEidikotita: "+eidikotita
                +"\nOdos: "+odos);
    } 
}
