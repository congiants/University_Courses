package askisi.erg_10_1;

public class AgoraParadosi implements Asfalismeno{
    
    private ProsPolisi ergo;
    private double timi;
    private double varos;
    private int euthrafsto;
    private double posoAsfalisis;
    private double ogos;

    ////CONSTRUCTORS
    public AgoraParadosi() {
    }

    public AgoraParadosi(ProsPolisi ergo, double timi) {
        this.ergo = ergo;
        this.timi = timi;
    }
    
    public AgoraParadosi(ProsPolisi ergo, double timi, double varos, int euthrafsto, double posoAsfalisis, double ogos) {
        this.ergo = ergo;
        this.timi = timi;
        this.varos = varos;
        this.euthrafsto = euthrafsto;
        this.posoAsfalisis = posoAsfalisis;
        this.ogos = ogos;
    }

    ////SETTERS-GETTERS
    public ProsPolisi getErgo() {
        return ergo;
    }

    public void setErgo(ProsPolisi ergo) {
        this.ergo = ergo;
    }

    public double getTimi() {
        return timi;
    }

    public void setTimi(double timi) {
        this.timi = timi;
    }

    public double getVaros() {
        return varos;
    }

    public void setVaros(double varos) {
        this.varos = varos;
    }

    public int getEuthrafsto() {
        return euthrafsto;
    }

    public void setEuthrafsto(int euthrafsto) {
        this.euthrafsto = euthrafsto;
    }

    public double getPosoAsfalisis() {
        return posoAsfalisis;
    }

    public void setPosoAsfalisis(double posoAsfalisis) {
        this.posoAsfalisis = posoAsfalisis;
    }

    public double getOgos() {
        return ogos;
    }

    public void setOgos(double ogos) {
        this.ogos = ogos;
    }

    /////TO-STRING
    @Override
    public String toString() {
        return "AgoraParadosi{" + "ergo=" + ergo + ", timi=" + timi + ", varos=" + varos + ", euthrafsto=" + euthrafsto + ", posoAsfalisis=" + posoAsfalisis + ", ogos=" + ogos + '}';
    }
    
    ////METHODS FROM INTERFACE "ProsPolisi"///
    
    @Override
    public String perigrafi(){
        return ergo.perigrafi(); ////////////////LIGO PERIERGO////////////
    }
    
    @Override
    public double timi(){
        return timi * 100;
    }
    
    @Override
    public double minTimi (double pososto){
        return timi * pososto/100;
    }
    
    ///METHODS FROM INTERFACE "ProsMetafora"///
    
    @Override
    public int varos(){
        return (int) varos * 1000;
    }
    
    @Override
    public int euthrausto(){
        return euthrafsto;
    }
    
    @Override
    public double posoAsfalisis(){
        return posoAsfalisis;
    }
}