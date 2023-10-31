package askisi.erg_2_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ERG_2_1 {
    
    public static int getInteger(){
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
    
    public static int findΜax(int m[]){
        int max = m[0];
        int pos = 0;
        for (int i = 0; i < m.length; i++){
            if (max < m[i]){
                max = m[i];
                pos = i;
            }
        }
        return pos;
    }
    
    public static double findΑvg(int m[]){
        double sum = 0;
        for (int i = 0; i < m.length; i++){
            sum += m[i];
        }
        double average;
        average = sum / (double)m.length;
        return average;
    }
    
    public static void display(int m[]){
        for(int i = 0; i < m.length; i++){
            System.out.println(m[i]);
        }
    }
    
    public static void swap(int m[], int i, int j){
        int temp = m[i];
        m[i] = m[j];
        m[j] = temp;
    }

    public static void main(String[] args) {
        
        System.out.println("Give array size:");
        int N;
        N = getInteger();
        int []array = new int[N];
        
        for (int i =0; i < array.length; i++){
            System.out.println("Give integer for the array:");
            array[i] = getInteger();
        }
        
        System.out.println("Maximum integer of the array is: "+array[findΜax(array)]);
        System.out.println("Average of the array is: "+findΑvg(array));
        System.out.println("Array is: ");
        display(array);
    }
}
