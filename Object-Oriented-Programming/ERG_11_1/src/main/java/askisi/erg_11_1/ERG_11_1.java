package askisi.erg_11_1;

public class ERG_11_1 {

    public static void main(String[] args) throws InvalidBirthDateException, InvalidOvertimeException{
        double workingHours [] = {160, 150, 125, 140, 145, 146, 157, 148, 139, 150, 141, 152};
        double overTime [] = {22, 12, 24, 0, 4, 3, 15, 7, 1, 2, 0, 11};
        
        Employee emp1 = new Employee("employee1", "41/02/2021", workingHours, overTime, 10, -2);
        System.out.println(emp1.getName()+": Apodoxes Ianouariou: " +emp1.computeMonthlyIncome(0));
        System.out.println(emp1);
        System.out.println("==================");
        
        Employee emp2 = new Employee("employee2", "11/11/1976", workingHours, overTime, 10, 2);
        System.out.println(emp2.getName()+": Apodoxes Ianouariou: " +emp2.computeMonthlyIncome(0));
        System.out.println(emp2);
    }
}
