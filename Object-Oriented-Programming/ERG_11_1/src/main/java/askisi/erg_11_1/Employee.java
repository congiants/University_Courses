package askisi.erg_11_1;

import java.util.Arrays;
import java.util.Objects;


public class Employee {
    /////METAVLITES//////
    private String name;
    private String birthDate;
    private double workingHours[];
    private double overtime[];
    private double hourlyWage;
    private int childNo;

    /////CONSTRUCTORS///////
    public Employee() {
    }
    
    public Employee(String name, String birthDate, double[] workingHours, double[] overtime, double hourlyWage, int childNo) throws InvalidBirthDateException, IllegalArgumentException{
        this.name = name;
        
        /////Ean day < 1 || day > 31 petaei exception pou eftiaksa ego
        try{
            int day = Integer.parseInt(birthDate.substring(0, 1)); //Elegxei theseis 0 eos kai 1
            if (day<1 || day>31) throw new InvalidBirthDateException();
            
            int month = Integer.parseInt(birthDate.substring(3, 4)); //Elegxei theseis 3 eos kai 4
            if (month < 1 || month >12) throw new InvalidBirthDateException();
            this.birthDate = birthDate;
        } catch(InvalidBirthDateException e){
            System.out.println(name+" birth date is wrong ("+birthDate+")");
            System.out.println("You have to set this birthdate later");
        }
        
        this.workingHours = workingHours;
        this.overtime = overtime;
        this.hourlyWage = hourlyWage;
        
        ////Ean childNo < 0 petaei exception
        try{
            if (childNo < 0) throw new IllegalArgumentException();
            this.childNo = childNo;
        }
        catch (IllegalArgumentException e){
            System.out.println("Child number cannot be negative ("+childNo+ ") Child number will be set to 0");
        }
    }
    
    public Employee(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Employee(String name, double[] workingHours, double[] overtime) {
        this.name = name;
        this.workingHours = workingHours;
        this.overtime = overtime;
    }

    /////SETTERS-GETTERS//////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) throws InvalidBirthDateException{
        
        /////Ean day < 1 || day > 31 petaei exception pou eftiaksa ego
        try{
            int day = Integer.parseInt(birthDate.substring(0, 1)); //Elegxei theseis 0 eos kai 1
            if (day<1 || day>31) throw new InvalidBirthDateException();
            
            int month = Integer.parseInt(birthDate.substring(3, 4)); //Elegxei theseis 3 eos kai 4
            if (month < 1 || month >12) throw new InvalidBirthDateException();
            this.birthDate = birthDate;
        } catch(InvalidBirthDateException e){
            System.out.println(name+" birth date is wrong ("+birthDate+")");
            System.out.println("You have to set this birthdate later");
        }
    }

    public double getWorkingHours(int pos) {
        return workingHours[pos];
    }

    public void setWorkingHours(double[] workingHours) {
        this.workingHours = workingHours;
    }

    public double getOvertime(int pos) {
        return overtime[pos];
    }

    ////////AN overtime> 80 h overtime < 0 petaei InvalidOvertimeException pou eftiaksa ego/////////
    public void setOvertime(double overtime, int pos) throws InvalidOvertimeException{
        try{
            if (overtime > 80 || overtime < 0) throw new InvalidOvertimeException();
            this.overtime[pos] = overtime;
        } catch (InvalidOvertimeException e){
            System.out.println("Overtime cannot be negative or exceed 80 hours. Overtime will be set to 0");
            this.overtime[pos] = 0;
        }
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getChildNo() {
        return childNo;
    }

    ////////AN childNo < 0 petaei IllegalArgumentException/////////
    public void setChildNo(int childNo) throws IllegalArgumentException{
        try{
            if (childNo < 0) throw new IllegalArgumentException();
            this.childNo = childNo;
        }
        catch (IllegalArgumentException e){
            System.out.println("Child number cannot be negative ("+childNo+ ") Child number will be set to 0");
        }
    }

    /////TO STRING////
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", birthDate=" + birthDate + ", workingHours=" + Arrays.toString(workingHours) + ", overtime=" + Arrays.toString(overtime) + ", hourlyWage=" + hourlyWage + ", childNo=" + childNo + '}';
    }

    /////EQUALS/////
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (Double.doubleToLongBits(this.hourlyWage) != Double.doubleToLongBits(other.hourlyWage)) {
            return false;
        }
        if (this.childNo != other.childNo) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.birthDate, other.birthDate)) {
            return false;
        }
        if (!Arrays.equals(this.workingHours, other.workingHours)) {
            return false;
        }
        return Arrays.equals(this.overtime, other.overtime);
    }
    
    ///////METHODS//////
    public double computeMonthlyIncome(int month) throws InvalidOvertimeException{
        return (workingHours[month] + (overtime[month] * hourlyWage *(1+childBenefitFactor())));
    }
    
    public double childBenefitFactor () throws ArithmeticException{
        double factor;
        try{
            factor = (100-(50/childNo))/200d;
        }catch (Exception e){
            factor = 0;
        }
        return factor;
    }
}