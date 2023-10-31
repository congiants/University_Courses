package erg_7_2;
import java.io.*;

public class ERG_7_2 {
    
    static int getInteger(){
      String line;
      InputStreamReader eisodosString = new InputStreamReader (System.in);
      BufferedReader br = new BufferedReader (eisodosString);
      try{
         line = br.readLine();
         int i = Integer.parseInt (line);
         return i;
      }
      catch (Exception e){
         return -1;
     }
  }

    public static void main(String[] args) {
        int n =3;
        Vehicle[] V= new Vehicle[n];
        SystimaDieythynsis s = new SystimaDieythynsis();
        
        Mihani e = new Mihani(1400, 100);
        V[0] = new Vehicle(2006, s, e);
        V[0].setIdioktisia("Idioktitis1");
        V[0].setArithmoKykl("NAB 28721");
        
        e = new Mihani(1600, 200);
        V[1] = new Vehicle(2008, s, e);
        V[1].setIdioktisia("Idioktitis2");
        V[1].setArithmoKykl("KAL 38625");
        
        e = new Mihani(1800, 250);
        V[2] = new Vehicle(2010, s, e);
        V[2].setIdioktisia("Idioktitis3");
        V[2].setArithmoKykl("LAV 89671");
        
        int i;
        do{
            System.out.println("\nGive 0-2 to choose a vehicle from the array to find the KYVISMOS and -1 to exit:");
            i = getInteger();
            
            if (i <= 2 && i >=0){
                System.out.println(V[i].getMihani().getKyvismos());
            }   
        }
        while(i != -1);
        
        do{
            System.out.println("\nGive 0-2 to choose a vehicle from the array to find the IPPODYNAMI and -1 to exit:");
            i = getInteger();
            
            if (i <= 2 && i >=0){
                System.out.println(V[i].getMihani().getIppodynami());
            }   
        }
        while(i != -1);
        
        do{
            System.out.println("\nGive 0-2 to choose a vehicle from the array to find the OWNER and -1 to exit:");
            i = getInteger();
            
            if (i <= 2 && i >=0){
                System.out.println(V[i].getIdioktisia());
                System.out.println(V[i].getArithmoKykl());
            }   
        }
        while(i != -1);
        
        
        V[0].getSystimaDieythynsis().vazeiEmpros();
        V[0].getSystimaDieythynsis().striveiAristera();
        V[0].getSystimaDieythynsis().striveiDexia();
        V[0].getSystimaDieythynsis().svynei();
}
}
