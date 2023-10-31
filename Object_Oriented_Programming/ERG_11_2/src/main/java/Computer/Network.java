package Computer;

public class Network {
    private String description;

    public Network() {
        this.description="Default constructor: This is a Data Network";
        System.out.println(description);
    }

    @Override
    public String toString() {
        return "toString: This network carries bits and bytes";
    }
}
