package askisi.erg_10_2;
import java.util.*;

public class ERG_10_2 {

    public static void main(String[] args) {
        Horse Ranch[] = new Horse[4];
        iBird Aviary[] = new iBird[4];
        Random generator = new Random();
        int x;
        
        //////////////RANCH//////////////
        System.out.println("\n=====================");
        System.out.println("\nRanch:");
        for (int i =0; i < Ranch.length; i++){
            
            x = generator.nextInt(2) + 1;
            
            if(x==1){
                Ranch[i] = new Horse(5,500);
                System.out.println("\nHorse");
                System.out.println("Ilikia: "+ Ranch[i].getAge()+ "Varos: "+Ranch[i].getWeight());
                Ranch[i].whinny();
                Ranch[i].gallop();
            }
            else{
                Ranch[i]=new Pegasus(4, 600);
                System.out.println("\nPegasus");
                System.out.println("Ilikia: "+ Ranch[i].getAge()+ "Varos: "+Ranch[i].getWeight());
                Ranch[i].whinny();
                Ranch[i].gallop();
                ((Pegasus)Ranch[i]).fly();
            } 
        }
        
        //////////////AVIARY//////////////
        System.out.println("\n=====================");
        System.out.println("\nAviary:");
        for (int i =0; i < Aviary.length; i++){
            
            x = generator.nextInt(2) + 1;
            
            if(x==1){
                Aviary[i] = new Bird(1,2);
                System.out.println("\nBird");
                System.out.println("Ilikia: "+ Ranch[i].getAge()+ "Varos: "+Ranch[i].getWeight());
                Aviary[i].chirp();
                Aviary[i].fly();
            }
            else{
                Aviary[i]=new Pegasus(4, 600);
                System.out.println("\nPegasus");
                System.out.println("Ilikia: "+ ((Pegasus)Aviary[i]).getAge()+ "Varos: "+((Pegasus)Aviary[i]).getWeight());
                ((Pegasus)Aviary[i]).whinny();
                ((Pegasus)Aviary[i]).gallop();
                Aviary[i].fly();
            } 
        }
    }
}
