package POO_Proy_Paquete;
public class Sistema_ev_Tgs {
    private int pc1;   // Práctica Calificada 1
    private int exp;   // Examen Parcial
    private int avpf;  // Avance Proyecto Final
    private int pc2;   // Práctica Calificada 2
    private int proyf; // Proyecto Final

    public Sistema_ev_Tgs(int pc1, int exp, int avpf, int pc2, int proyf) {
        this.pc1 = pc1;
        this.exp = exp;
        this.avpf = avpf;
        this.pc2 = pc2;
        this.proyf = proyf;
    }

    public int getPc1() {
        return pc1;
    }
    public void setPc1(int pc1) {
        this.pc1 = pc1;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public int getAvpf() {
        return avpf;
    }
    public void setAvpf(int avpf) {
        this.avpf = avpf;
    }
    public int getPc2() {
        return pc2;
    }
    public void setPc2(int pc2) {
        this.pc2 = pc2;
    }
    public int getProyf() {
        return proyf;
    }
    public void setProyf(int proyf) {
        this.proyf = proyf;
    }
}
