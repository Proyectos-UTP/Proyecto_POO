package POO_Proy_Paquete;
public class Sistema_ev_Ciudadania {
    // Atributos del sistema de evaluación
    private int pc;   // Práctica Calificada
    private int exp;  // Examen Parcial
    private int ta;   // Tarea Académica
    private int exf;  // Examen Final

    public Sistema_ev_Ciudadania(int pc, int exp, int ta, int exf) {
        this.pc = pc;
        this.exp = exp;
        this.ta = ta;
        this.exf = exf;
    }

    public int getPc() {
        return pc;
    }
    public void setPc(int pc) {
        this.pc = pc;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public int getTa() {
        return ta;
    }
    public void setTa(int ta) {
        this.ta = ta;
    }
    public int getExf() {
        return exf;
    }
    public void setExf(int exf) {
        this.exf = exf;
    }
}
