package askisi.erg_10_2;

public class Horse {
    
    //////METAVLITES//////
    private int age;
    private double weight;

    ///////CONSTRUCTORS///////
    public Horse() {
    }

    public Horse(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    ////////SETTERS-GETTERS///////
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    ////////
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    /////////TO-STRING//////
    @Override
    public String toString() {
        return "Horse{" + "age=" + age + ", weight=" + weight + '}';
    }
    
    /////////METHODS///////
    public void whinny(){
        System.out.println("whinny");
    }
    
    public void gallop(){
        System.out.println("travel fast");
    }
}
