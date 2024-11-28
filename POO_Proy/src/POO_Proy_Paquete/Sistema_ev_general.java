
package POO_Proy_Paquete;

public abstract class Sistema_ev_general {
    private int pc1;
    private int pc2;
    private int pc3;
    private int exfin;
    
    public Sistema_ev_general(int e1, int e2, int e3, int efin)
    {
    this.pc1 = e1;
    this.pc2 = e2;
    this.pc3 = e3;
    this.exfin = efin;
    }
    
    public abstract double promedio();

    public int getPc1() {
        return pc1;
    }

    public void setPc1(int pc1) {
        this.pc1 = pc1;
    }

    public int getPc2() {
        return pc2;
    }

    public void setPc2(int pc2) {
        this.pc2 = pc2;
    }

    public int getPc3() {
        return pc3;
    }

    public void setPc3(int pc3) {
        this.pc3 = pc3;
    }

    public int getExfin() {
        return exfin;
    }

    public void setExfin(int exfin) {
        this.exfin = exfin;
    }
    
    
    
    
}
