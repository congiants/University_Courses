package erg_7_3;
public class Oromisthios extends Ypallilos{
    ////////////METAVLITES/////////////
    private int ores;
    ////////////CONSTRUCTORS/////////////
    public Oromisthios() {}
    
    public Oromisthios(String ono, int a, String eid, String od, int or){
        super (ono, a, eid, od);
        ores = or;
    }
    ///////////SETTERS-GETTERS///////////
    public int getORES(){
        return ores;
    }
    public void setORES(int o){
        ores = o;
    }
    ///////////TO-STRING/////////////////
    public String toString(){
        return (super.toString()
                +"\nOres: "+ores
                +"\nSalary: "+salary());}
    ////////////SALARY METHOD///////////
    public double salary(){
        double s;
        s = 7*ores;
        s = s + 0.06 * s;
        return s;
    }
}
