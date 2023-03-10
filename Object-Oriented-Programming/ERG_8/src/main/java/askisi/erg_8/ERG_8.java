package askisi.erg_8;
import java.io.*;
import java.lang.Math;

public class ERG_8 {
    
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
    
    public static String getString(){
      String line;
      InputStreamReader eisodosString=new InputStreamReader (System.in);
      BufferedReader br=new BufferedReader(eisodosString);
      try{
         line=br.readLine();
         return line;
      }
      catch(Exception e){
         return "Lathos";
      }
  }

    public static void main(String[] args) {
        int place;
        System.out.println("Give array length: ");
        int n = getInteger();
        Vehicle VehiclesArray[] = new Vehicle [n];
        
        /////////// 70% CARS//////////////
        for (int i =1; i <= Math.round(n * 0.7); i++){
            System.out.println("Idioktitis: ");
            String id = getString();
            System.out.println("Arithmos kykloforias: ");
            String ak = getString();
            System.out.println("Etos kataskevis: ");
            int ek = getInteger();
            System.out.println("Kyvismos: ");
            int k = getInteger();
            System.out.println("Ippodyynami: ");
            int ip = getInteger();
            System.out.println("Thires: ");
            int th = getInteger();
            
            Car c = new Car(id, ak, ek, k, ip, th);
            
            do{
                place = (int) (Math.random() * 10);
            }
            while (place >= n || VehiclesArray[place]!=null);
            VehiclesArray[place] = c;
        }
        /////////// 15% TRUCKS//////////////
        for (int i =1; i <= Math.round(n * 0.15); i++){
            System.out.println("Idioktitis: ");
            String id = getString();
            System.out.println("Arithmos kykloforias: ");
            String ak = getString();
            System.out.println("Etos kataskevis: ");
            int ek = getInteger();
            System.out.println("Kyvismos: ");
            int k = getInteger();
            System.out.println("Ippodyynami: ");
            int ip = getInteger();
            System.out.println("Axones: ");
            int ax = getInteger();
            
            Truck t = new Truck(id, ak, ek, k, ip, ax);
            
            do{
                place = (int) (Math.random() * 10);
            }
            while (place >= n || VehiclesArray[place]!=null);
            VehiclesArray[place] = t;
        }
        /////////// 15% MOTORCYCLES//////////////
        for (int i =1; i <= n - Math.round(n * 0.7)- Math.round(n * 0.15); i++){
            System.out.println("Idioktitis: ");
            String id = getString();
            System.out.println("Arithmos kykloforias: ");
            String ak = getString();
            System.out.println("Etos kataskevis: ");
            int ek = getInteger();
            System.out.println("Kyvismos: ");
            int k = getInteger();
            System.out.println("Ippodyynami: ");
            int ip = getInteger();
            System.out.println("Kalathi (0=OXI, 1=NAI): ");
            int kal = getInteger();
            
            Motorcycle m = new Motorcycle(id, ak, ek, k, ip, kal);
            
            do{
                place = (int) (Math.random() * 10);
            }
            while (place >= n || VehiclesArray[place]!=null);
            VehiclesArray[place] = m;
        }
        
        for(int i= 0; i < n; i++){
            System.out.println("Vehicle:");
            System.out.println(VehiclesArray[i]);
            System.out.println("========================");
            
        }
    }
}