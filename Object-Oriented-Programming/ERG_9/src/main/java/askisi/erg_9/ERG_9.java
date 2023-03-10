package askisi.erg_9;
import java.io.*;
import java.lang.Math;

public class ERG_9 {
    
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
        System.out.println("Number of phones: ");
        int n = getInteger();
        Tilefono til[] = new Tilefono[n];
        
        ///////////////60% Chance of a stathero til///////////
        for (int i =1; i <= Math.round(n * 0.6); i++){
            Stathero s = new Stathero();
            
            do{
                place = (int) (Math.random() * 10);
            }
            while (place >= n || til[place]!=null);
            System.out.println("Stathero");
            til[place] = s;
        }
        
        ///////////////40% Chance of a kinito til///////////
        for (int i =1; i <= Math.round(n * 0.4); i++){
            Kinito k = new Kinito();
            
            do{
                place = (int) (Math.random() * 10);
            }
            while (place >= n || til[place]!=null);
            System.out.println("Kinito");
            til[place] = k;    
        }
        
        ////////////Emfanizei tin lista apo ta antikeimena///////////
        for (int i =0; i < n; i++){
            System.out.println(til[i]);
        }
        
        ///////////Kano apo 100 mexri 2000 kliseis/////////////
        int max = 2000;
        int min = 100;
        int x = (int) Math.floor(Math.random()*(max-min+1)+min);/////Here 100-2000/////
        for(int i = 0; i < x; i++){
            String s = null;
            int rnd = (int) (Math.random() * n);
            
            /////////////60% na parei se stathero/////////
            if ((int)(Math.random()*10) <= 6){
                s = "2";
            }
            
            /////////////40% na parei se kinito/////////
            else{
                s = "6";
            }
            
            /////////Creathing the rest of the phone number///////
            for(int z =1; z<=9; z++){
                s += (int)(Math.random()*10);
            }
            
            ///////Making the call////////
            til[rnd].dial(s);
        }
        
        /////////KATALOGOS ME  THLEFONA KAI KOSTOS///////////
        System.out.println("========== \nKatalogos me tilefona:");
        for (int i =0; i < n; i++){
            System.out.println("Tilefono: "+ til[i].getNumber()+ " Kostos: "+ til[i].cost());
        }
        
        //////////OLIKOS XRONOS KLISIS APO TIL KAI KOSTOS//////
        int stath2StathSecs =0;
        int stath2KinSecs =0;
        int kin2StathSecs =0;
        int kin2KinSecs = 0;
        int secsStath = 0;
        int secsKin = 0;
        double costStath = 0.0;
        double costKin = 0.0;
        double costProsStath = 0.0;
        double costProsKin = 0.0;
        double fullCost = 0.0;
        
        
        //////Oles metavlites ektos apo costPros...////////////
        for (int i =0; i<n; i++){
            if(til[i].getNumber().charAt(0) == '2'){
                secsStath += til[i].getSec2Kin() +til[i].getSec2Stath();
                stath2StathSecs += til[i].getSec2Stath();
                stath2KinSecs += til[i].getSec2Kin();
                costStath += til[i].cost();
            }
            else{
                secsKin += til[i].getSec2Stath() + til[i].getSec2Kin();
                kin2StathSecs += til[i].getSec2Stath();
                kin2KinSecs += til[i].getSec2Kin();
                costKin += til[i].cost();
            }
            fullCost += til[i].cost();
        }
        
        //////////costPros...///////
        costProsStath = stath2StathSecs * 0.02 + kin2StathSecs * 0.06;
        costProsKin = stath2KinSecs * 0.05 + kin2KinSecs * 0.07;
        
        System.out.println("================\nOlikoi xronoi kai oliko kostos:");
        System.out.println("Olikos xronos stathero se stathero: "+stath2StathSecs);
        System.out.println("Olikos xronos stathero se kinito: "+stath2KinSecs);
        System.out.println("Olikos xronos kinito se stathero: "+kin2StathSecs);
        System.out.println("Olikos xronos kinito se kinito: "+kin2KinSecs);
        System.out.println("Olikos xronos statheron: "+secsStath);
        System.out.println("Olikos xronos kiniton: "+secsKin);
        System.out.println("Olikos kostos statheron: "+costStath);
        System.out.println("Olikos kostos kiniton: "+costKin);
        System.out.println("Olikos kostos pros stathera: "+costProsStath);
        System.out.println("Olikos kostos pros kinita: "+costProsKin);
        System.out.println("Olikos kostos: "+fullCost);
    }
}    
