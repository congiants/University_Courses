package askisi.erg_10_1;

public class Photograph implements ProsPolisi{
    
    private String perigrafi;
    private double timi;
    private int xroma;

    /////CONSTRUCTORS//////
    public Photograph() {
    }
    
    public Photograph(String perigrafi, double timi, int xroma) {
        this.perigrafi = perigrafi;
        this.timi = timi;
        this.xroma = xroma;
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

    public int getXroma() {
        return xroma;
    }

    public void setXroma(int xroma) {
        this.xroma = xroma;
    }

    /////TO STRING/////
    @Override
    public String toString() {
        return "Photograph{" + "perigrafi=" + perigrafi + ", timi=" + timi + ", xroma=" + xroma + '}';
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
