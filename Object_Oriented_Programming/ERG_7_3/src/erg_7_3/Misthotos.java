package erg_7_3;

public class Misthotos extends Ypallilos{
    private int tekna;
    private int years;
    ///////////CONSTRUCTORS//////////
    public Misthotos(){}
    
    public Misthotos(String ono, int a, String eid, String od, int tek, int ye){
        super (ono, a, eid, od);
        tekna = tek;
        years = ye;
    }
    ////////////SETTERS-GETTERS//////////
    public void setTEKNA (int tek){
        tekna = tek;
    }
    public int getTEKNA (){
        return tekna;
    }
    //////
    public void setYEARS (int ye){
        years = ye;
    }
    public int getYEARS (){
        return years;
    }
    ///////////TO-STRING/////////////////
    public String toString(){
        return (super.toString()
                +"\nTekna: "+tekna
                +"\nYears: "+years
                +"\nSalary: "+salary());}
    ////////////SALARY METHOD///////////
    public double salary(){
        double s = 0.0;
        s = 700.0 + 35 * tekna + 70 * (years/3);
        return s;
    }
}
