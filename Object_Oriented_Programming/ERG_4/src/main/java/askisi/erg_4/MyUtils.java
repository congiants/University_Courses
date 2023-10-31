package askisi.erg_4;

import java.util.Arrays;

public class MyUtils {
    public static int anazitisiMeEpwnymo (Foititis F[], String S){
        for  (int i = 0; i < F.length; i++){
            if ((F[i].getEPONIMO()).equals(S))return i;
        }
        return -1;
    }
    
    public static int anazitisiMeArMitrwou(Foititis F[], short am){
        short FAM [] = new short [F.length];
        for (int i = 0; i < F.length; i ++){
            FAM[i] = F[i].getAM();
        }
        return Arrays.binarySearch(FAM, am);
    }
    
    public static int anadromiAnazMeArithMitrwou(Foititis F[], short am, int high, int low){
        int mid = (high +low) / 2;
        
        if (high < low) return -1;
        
        if (am == F[mid].getAM()) return mid;
        
        else if (am > F[mid].getAM()){
            return anadromiAnazMeArithMitrwou(F, am, high, mid + 1);
        }
        
        else{
            return anadromiAnazMeArithMitrwou(F, am, mid-1, low);
        }
    }
}
