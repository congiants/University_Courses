package erg_7_3;

public class ERG_7_3 {
    
    public static void main(String[] args) {
        Oromisthios yp1 = new Oromisthios("yp1", 121311, "eidikotita1", "odos1", 80);
        Oromisthios yp2 = new Oromisthios("yp2", 115530, "eidikotita2", "odos2", 40);
        Misthotos yp3 = new Misthotos("yp1", 111213, "eidikotita3", "odos3", 3, 5);
        Misthotos yp4 = new Misthotos("yp2", 143510, "eidikotita4", "odos4", 1, 2);
        Proistamenos yp5 = new Proistamenos("yp1", 1111532, "eidikotita5", "odos5", 5, 1);
        Proistamenos yp6 = new Proistamenos("yp2", 1105243, "eidikotita6", "odos6", 2, 2);
        
        System.out.println("Yp1: "+yp1);
        System.out.println("\nYp2: "+yp2);
        System.out.println("\nYp3: "+yp3);
        System.out.println("\nYp4: "+yp4);
        System.out.println("\nYp5: "+yp5);
        System.out.println("\nYp6: "+yp6);
    }
}
