package POO_Proy_Paquete;
public class Sistema_ev_BaDatos {
    private double pc1;
    private double pc2;
    private double pc3;
    private double pa;
    private double exf;
    
    public Sistema_ev_BaDatos (double pc1, double pc2, double pc3, double pa, double exf){
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.pa = pa;
        this.exf = exf;
    }

    public double getPc1() { return pc1; }
    public void setPc1(double pc1) { this.pc1 = pc1; }

    public double getPc2() { return pc2; }
    public void setPc2(double pc2) { this.pc2 = pc2; }

    public double getPc3() { return pc3; }
    public void setPc3(double pc3) { this.pc3 = pc3; }

    public double getPa() { return pa; }
    public void setPa(double pa) { this.pa = pa; }

    public double getExf() { return exf; }
    public void setExf(double exf) { this.exf = exf; }
}
