package askisi.erg_10_2;

public class Bird implements iBird{
    
    ///////METAVLITES//////////
    private int age;
    private double weight;
    private int a =2;
    
    /////////CONSTRUCTORS///////
    public Bird(){}
    
    public Bird(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }
    
    ///////SETTERS-GETTERS////////
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    ///////////
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    ////////TO-STRING//////////
    @Override
    public String toString() {
        return "Bird{" + "age=" + age + ", weight=" + weight + '}';
    }
    
    /////////METHODS//////////
    @Override
    public void chirp(){
        System.out.println("chirp...");
    }
    
    @Override
    public void fly(){
        System.out.println("fly high");
    }
}
