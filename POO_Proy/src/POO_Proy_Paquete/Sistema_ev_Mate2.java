package POO_Proy_Paquete;
public abstract class Sistema_ev_Mate2 {
    //atributos
    private int pc1;
    private int pc2;
    private int pc3;
    private int exp;
    private int exf;
    //constructor
    public Sistema_ev_Mate2(){}
    
    public Sistema_ev_Mate2(int pc1, int pc2, int pc3, int exp, int exf) {
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.exp = exp;
        this.exf = exf;
    }
    //Métodos get y set
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
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public int getExf() {
        return exf;
    }
    public void setExf(int exf) {
        this.exf = exf;
    }
}
