package askisi.erg_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ERG_4 {
    
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
        Foititis FS [] = new Foititis [4];
        FS[0] = new Foititis("onoma1", "eponimo1", (short)1234, (short)2019);
        FS[1] = new Foititis("onoma2", "eponimo2", (short)2345, (short)2020);
        FS[2] = new Foititis("onoma3", "eponimo3", (short)3456, (short)2021);
        FS[3] = new Foititis("onoma4", "eponimo4", (short)4567, (short)2022);
        
        int a = MyUtils.anazitisiMeEpwnymo(FS, "eponimo2");
        System.out.println(FS[a].getEPONIMO());
        
        a = MyUtils.anazitisiMeArMitrwou (FS, (short)3456);
        System.out.println(FS[a].getAM());
        
        a = MyUtils.anadromiAnazMeArithMitrwou(FS, (short)4567, 3, 0);
        System.out.println(FS[a].getAM());
    }
}
