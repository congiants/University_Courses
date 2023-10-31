package erg_3_4;
import java.io.*;

public class ERG_3_4 {
    
    static int rev(int n, int temp){
        
        if (n ==0)
            return temp;
        
        temp = (temp*10) + (n % 10);
        
        return rev(n/10, temp);
    }
    

    public static void main(String[] args) {
        
        int number;
        
        do{
            System.out.println ("Give positive integer, no longer than 5 digits: ");
            number = UserInput.getInteger();
        }while(number < 0 || number > 999999);
        
        int temp = rev(number, 0);
        
        if (temp == number)
            System.out.println ("Palindromikos");
        else
            System.out.println ("Mi palindromikos");
    }
}
