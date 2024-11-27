package POO_Proy_Paquete;
public class Sistema_ev_Caf {
    private int pc1;   // Práctica Calificada 1
    private int lab1;  // Laboratorio Calificado 1
    private int exp;   // Examen Parcial
    private int pc2;   // Práctica Calificada 2
    private int lab2;  // Laboratorio Calificado 2
    private int proyf; // Proyecto Final
    private int exf;   // Examen Final

    public Sistema_ev_Caf(int pc1, int lab1, int exp, int pc2, int lab2, int proyf, int exf) {
        this.pc1 = pc1;
        this.lab1 = lab1;
        this.exp = exp;
        this.pc2 = pc2;
        this.lab2 = lab2;
        this.proyf = proyf;
        this.exf = exf;
    }

    public int getPc1() { return pc1; }
    public void setPc1(int pc1) { this.pc1 = pc1; }

    public int getLab1() { return lab1; }
    public void setLab1(int lab1) { this.lab1 = lab1; }

    public int getExp() { return exp; }
    public void setExp(int exp) { this.exp = exp; }

    public int getPc2() { return pc2; }
    public void setPc2(int pc2) { this.pc2 = pc2; }

    public int getLab2() { return lab2; }
    public void setLab2(int lab2) { this.lab2 = lab2; }

    public int getProyf() { return proyf; }
    public void setProyf(int proyf) { this.proyf = proyf; }

    public int getExf() { return exf; }
    public void setExf(int exf) { this.exf = exf; }
}
