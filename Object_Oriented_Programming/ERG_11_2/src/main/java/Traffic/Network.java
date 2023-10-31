package Traffic;

public class Network {
    private String description;

    public Network() {
        this.description="Default constructor: This is a Traffic Network";
        System.out.println(description);
    }

    @Override
    public String toString() {
        return "toString: Τhis network is used by vehicles";
    }
}