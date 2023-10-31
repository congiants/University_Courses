package erg_7_3;

public class Proistamenos extends Misthotos{
    
    //////////////CONSTRUCTORS///////////////
    public Proistamenos(){}
    
    public Proistamenos (String ono, int a, String eid, String od, int tek, int ye){
        super (ono, a, eid, od, tek, ye);
    }
    /////////////SALARY METHOD//////////////
    public double salary(){
        double s;
        s = super.salary()  + 0.1 * super.salary();
        return s;
    }
}
