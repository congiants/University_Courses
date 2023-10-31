package askisi.erg_10_1;

public class Painting implements ProsPolisi{
    
    private String perigrafi;
    private double timi;
    private String texnotropia;

    /////CONSTRUCTORS//////
    public Painting() {
    }
    
    public Painting(String perigrafi, double timi, String texnotropia) {
        this.perigrafi = perigrafi;
        this.timi = timi;
        this.texnotropia = texnotropia;
    }

    /////SETTERS-GETTERS/////
    public String getPerigrafi() {
        return perigrafi;
    }

    public void setPerigrafi(String perigrafi) {
        this.perigrafi = perigrafi;
    }

    public double getTimi() {
        return timi;
    }

    public void setTimi(double timi) {
        this.timi = timi;
    }

    public String getTexnotropia() {
        return texnotropia;
    }

    public void setTexnotropia (String texnotropia) {
        this.texnotropia = texnotropia;
    }

    /////TO STRING/////
    @Override
    public String toString() {
        return "Paintintg{" + "perigrafi=" + perigrafi + ", timi=" + timi + ", texnotropia=" + texnotropia + '}';
    }
    
    /////METHODS FROM INTERFACE "ProsPolisi"/////
    
    @Override
    public String perigrafi(){
        return perigrafi;
    }
    
    @Override
    public double timi(){
        return timi * 100;
    }
    
    @Override
    public double minTimi(double pososto){
        return timi * pososto/ 100;
    }
}
