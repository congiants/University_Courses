package askisi.erg_10_1;
import java.io.*;

public class ERG_10_1 {
    
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
    
    static double getDouble(){
      String line;
      InputStreamReader eisodosString = new InputStreamReader (System.in);
      BufferedReader br = new BufferedReader (eisodosString);
      try{
         line = br.readLine();
         double i = Double.parseDouble (line);
         return i;
      }
      catch (Exception e){
         return -1;
     }
    }
    
    static byte getByte(){
      String line;
      InputStreamReader eisodosString = new InputStreamReader (System.in);
      BufferedReader br = new BufferedReader (eisodosString);
      try{
         line = br.readLine();
         byte i = Byte.parseByte(line);
         return i;
      }
      catch (Exception e){
         return -1;
      }
  }
    
    
    ////////////////////////////////////////////
    /////////////PROGRAM STARTS HERE///////////
    
    
    public static int ergoNo=1; /////Plithos ergon pou exoun kataxorithei ston pinaka ErgaProsPolisi

    public static void displayMenu(){
        System.out.println("===== MENU =====");
            System.out.println("1. Enter a work of art");
            System.out.println("2. Prepare work of art for delivery");
            System.out.println("3. Deliver work of art");
            System.out.println("4. Display all availabe photographs");
            System.out.println("5. Display all availabe paintings");
            System.out.println("6. Display all availabe work of arts");
            System.out.println("7. Display all work of arts to be delivered");
            System.out.println("8. End program");
            System.out.println("Enter selection (1-8) :");
    }
    
    public static void InsertEgro(ProsPolisi[] b){
        int epil;
        
        /////Find empty position in the array
        for (int i =0; i < b.length; i++){
            if (b[i] == null){
            System.out.println("Choose a type");
            System.out.println("1. Photograph");
            System.out.println("2. Painting");
            System.out.println("Enter your choice: ");
            epil = getInteger();
            
                ///Gemizei mia thesi tou pinaka me antikeimeno tupou Photograpgh me xrisi DOWNCASTING///
                if (epil == 1){
                    b[ergoNo-1] = new Photograph();
                    System.out.println("Eisagogi stoixeion "+ergoNo+"ou ergou texnis (Typou fotografias)");
                    System.out.println("Titlos egou:");
                    ((Photograph)b[ergoNo-1]).setPerigrafi(getString());
                    System.out.println("Timi:");
                    ((Photograph)b[ergoNo-1]).setTimi(getDouble());
                    System.out.println("An einai exromi dose 1 allios 0:");
                    ((Photograph)b[ergoNo-1]).setXroma(getInteger()); 
                }
                ///Gemizei mia thesi tou pinaka me antikeimeno tupou Painting me xrisi DOWNCASTING///
                else if(epil == 2){
                    b[ergoNo-1] = new Painting();
                    System.out.println("Eisagogi stoixeion "+ergoNo+"ou ergou texnis (Typou painting)");
                    System.out.println("Titlos egou:");
                    ((Painting)b[ergoNo-1]).setPerigrafi(getString());
                    System.out.println("Timi:");
                    ((Painting)b[ergoNo-1]).setTimi(getDouble());
                    System.out.println("Texnotropia:");
                    ((Painting)b[ergoNo-1]).setTexnotropia(getString()); 
                }
                ergoNo++;
                break;
            }
        }
    }
    
    ///////////FOR LOOP WITH A WEIRDER WAY////////
    public static void displayErgaProsPolisi (ProsPolisi b[]){
        System.out.println("\nSTOIXEIA ERGON PROS POLISI:");
        for(ProsPolisi b1 : b){
            if(b1!=null){
                System.out.println(b1);
            }
        }
    }
    
    public static void displayErgaProsMetafora (ProsMetafora b[]){
        System.out.println("\nSTOIXEIA ERGON PROS METAFORA:");
        for(ProsMetafora b1 : b){
            if(b1!=null){
                System.out.println(b1);
            }
        }
    }
    
    ///////////INSTANCEOF USE HERE/////////////
    public static void displayPhotographs (ProsPolisi b[]){
        System.out.println("\nSTOIXEIA ERGON TYPOU FOTOGRAFIAS:");
        for(ProsPolisi b1 : b){
            if(b1!=null){
                if(b1 instanceof Photograph)
                System.out.println(b1);
            }
        }
    }
    
    public static void displayPaintings (ProsPolisi b[]){
        System.out.println("\nSTOIXEIA ERGON TYPOU PAINTING:");
        for(ProsPolisi b1 : b){
            if(b1!=null){
                if(b1 instanceof Painting)
                System.out.println(b1);
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        
        //////CREATE 2 ARRAYS OF INTERFACES//////
        int size = 10;
        ProsPolisi ErgaProsPolisi[] = new ProsPolisi[size];
        ProsMetafora ErgaProsMetafora[] = new ProsMetafora[size];
        int epil_1;
        
        
        do{
            //////SHOW MENU//////
            displayMenu();
            epil_1 = getInteger();
            
            switch (epil_1){
                
                //////1. Enter a work of art//////
                case 1:
                    InsertEgro(ErgaProsPolisi);
                    break;
                
                //////2. Prepare work of art for delivery//////
                case 2:
                    if(ergoNo != 1){
                        System.out.println("Plithos ergon texnis: "+(ergoNo-1));
                        displayErgaProsPolisi(ErgaProsPolisi);
                        System.out.println("Doste thesi ergou pou tha metaferthei: ");
                        int pos = getInteger();
                        for(int i = 0; i < ErgaProsMetafora.length; i++){
                            if(ErgaProsMetafora[i] == null){
                                ErgaProsMetafora[i] = new AgoraParadosi();
                                ((AgoraParadosi)ErgaProsMetafora[i]).setErgo(ErgaProsPolisi[pos]);
                                ErgaProsPolisi[pos] = null;
                                --ergoNo;
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("Den yparxoun katoxoiromena stoixeia ergon");
                        break;
                    }
                    break;
                
               //////3. Deliver work of art//////
                case 3:
                    if (ErgaProsMetafora.length != 0){
                        displayErgaProsMetafora(ErgaProsMetafora);
                        System.out.println("Dose thesi ergou pou paradothike:");
                        int pos = getInteger();
                        ErgaProsMetafora[pos] = null;
                        break;
                    }
                    else{
                        System.out.println("Den yparxoun katoxoiromena stoixeia gia metafora");
                        break;
                    }
            
                //////4. Display all availabe photographs//////        
                case 4:
                    if (ergoNo != 1){
                        displayPhotographs(ErgaProsPolisi);
                    }
                    else{
                        System.out.println("Den yparxoun katoxeiromena ega typou forografias");
                    }
                    break;
            
                 //////5. Display all availabe paintings//////
                case 5:
                    if (ergoNo != 1){
                        displayPaintings(ErgaProsPolisi);
                    }
                    else{
                        System.out.println("Den yparxoun katoxeiromena ega typou painting");
                    }
                    break;
                
                //////6. Display all availabe work of arts//////
                case 6:
                    if(ergoNo !=1){
                        System.out.println("STOIXEIA ERGON");
                        for(ProsPolisi b1 : ErgaProsPolisi){
                            if(b1!=null){
                                System.out.println(b1);
                            }
                        }   
                    }
                    else{
                        System.out.println("Den yparxoun katoxeiromena erga pros polisi");
                    }
                    break;
               
                //////7. Display all work of arts to be delivered//////
                case 7:
                    int flag = 0;
                    for (int i =0; i < ErgaProsMetafora.length; i++){
                        if(ErgaProsMetafora[i] != null){
                            flag = 1;
                        }
                    }
                    if(flag ==1){
                        displayErgaProsMetafora(ErgaProsMetafora);
                    }
                    else{
                        System.out.println("Den yparxoun katoxeiromena erga pros metafora");
                    }
                    flag = 0;
                    break;
                
                //////8. End program//////
                case 8:
                    System.out.println("... TELOS PROGRAMMATOS ...");
                    break;
                
                //////IN CASE THE USER DOESN'T GIVE NUMBER 1-8//////
                default:
                    System.out.println("Lathos Epilogi ...Eisagete arithmo 1-8\n");
            }
        }while(epil_1 != 8);
    }
}