package erg_3_4_4;


public class ERG_3_4_4 {
    
    static int protos (int num){
        int counter = 0;
        if (num > 0){
        if (num % (num -1) == 0)
            counter++;
        }
        else
            return 0;
    }

    
    public static void main(String[] args) {
        int temp;
        temp = protos(4);
        System.out.println(temp);
    }
}
