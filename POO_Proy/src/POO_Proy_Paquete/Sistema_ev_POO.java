package POO_Proy_Paquete;
public class Sistema_ev_POO {
    private double pc1;
    private double pc2;
    private double pc3;
    private double proy;
    
    public Sistema_ev_POO (double pc1, double pc2, double pc3, double proy){
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.proy = proy;
    }

    public double getPc1() { return pc1; }
    public void setPc1(double pc1) { this.pc1 = pc1; }

    public double getPc2() { return pc2; }
    public void setPc2(double pc2) { this.pc2 = pc2; }

    public double getPc3() { return pc3; }
    public void setPc3(double pc3) { this.pc3 = pc3; }

    public double getProy() { return proy; }
    public void setExf(double proy) { this.proy = proy; }
}
