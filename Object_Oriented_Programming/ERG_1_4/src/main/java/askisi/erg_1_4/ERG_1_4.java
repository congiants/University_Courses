//////////////PERIEXEI ASKISIS ERGASTIRIOY 1.3 KAI 1.4 KAI 2.2//////////////////////

package askisi.erg_1_4;
//////////////MAIN//////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ERG_1_4 {
    
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
      
    public static void FindLowSalary(Employee e1, Employee e2){
        double telikos_misth = e1.salary();
        int years = e1.getYEARS();
        if (telikos_misth <  1200.0 && years >= 5){
            System.out.println("Xamilomisthos");
            double vasikos_misth = e1.getVASIKOS_MISTHOS();
            e1.setVASIKOS_MISTHOS(vasikos_misth + 100);
            telikos_misth = e1.salary();
            System.out.println (e1);
            System.out.println(telikos_misth);
        }
        
        telikos_misth = e2.salary();
        years = e2.getYEARS();
        
        if (telikos_misth <  1200.0 && years >= 5){
            System.out.println("Xamilomisthos");
            double vasikos_misth = e2.getVASIKOS_MISTHOS();
            e2.setVASIKOS_MISTHOS(vasikos_misth + 100);
            telikos_misth = e2.salary();
            System.out.println (e2);
            System.out.println(telikos_misth);
        }
}
    
    public static void displayStaff(Employee[] st){
        System.out.println("Employee info: ");
        for (int i =0; i < st.length; i++){
            System.out.println(st[i]);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(12345, "onoma1", "eponimo1", 2, 500.0, 50.0);
        Employee e2 = new Employee(54321, "onoma2", "eponimo2", 5, 800.0, 100.0);
        System.out.println (e1);
        System.out.println (e2);
        
        double telikos_misth = e1.salary();
        System.out.println(telikos_misth);
        telikos_misth = e2.salary();
        System.out.println(telikos_misth);
        
        FindLowSalary(e1, e2);
        
        Employee []staff = new Employee [5];
        
        staff[0] = e1;
        staff[1] = e2;
        staff[2] = new Employee(5123, "onoma3", "eponimo3", 6, 750.0, 150.0);
        staff[3] = new Employee(4123, "onoma4", "eponimo4", 12, 1750.0, 350.0);
        staff[4] = new Employee(3123, "onoma5", "eponimo5", 2, 4000.0, 2000.0);
        
        displayStaff(staff);
    }
}