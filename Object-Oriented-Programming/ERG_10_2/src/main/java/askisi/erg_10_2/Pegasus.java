package askisi.erg_10_2;

public class Pegasus extends Horse implements iBird{

    ////////CONSTRUCTORS////////
    public Pegasus() {
    }

    public Pegasus(int age, double weight) {
        super(age, weight);
    }
    
    ////////METHODS///////
    @Override
    public void  whinny(){
        System.out.println("whinnyy");
    }
    
    @Override
    public void  chirp(){
        System.out.println("whinnyy");
    }
    
    @Override
    public void  gallop(){
        System.out.println("travel fast");
    }
    
    @Override
    public void fly(){
        System.out.println("fly high");
    } 
}
