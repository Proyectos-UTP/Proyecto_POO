package POO_Proy_Paquete;
public abstract class CursoCaf extends Sistema_ev_Caf{
    private String nombre;
    private String seccion;
    private int creditos;

    public CursoCaf(String nombre, String seccion, int creditos, int pc1, int lab1, int exp, int pc2, int lab2, int proyf, int exf) {
        super(pc1, lab1, exp, pc2, lab2, proyf, exf);
        this.nombre = nombre;
        this.seccion = seccion;
        this.creditos = creditos;
    }
    
    public double promedio() {
        return ((getPc1() * 0.10) + (getLab1() * 0.10) + (getExp() * 0.20) +
                (getPc2() * 0.10) + (getLab2() * 0.10) + (getProyf() * 0.20) + (getExf() * 0.20));
    }
    public boolean check(){
        if (this.getPc1() < 0 || this.getPc1() > 20 || this.getLab1() < 0 || this.getLab1() > 20 || this.getExp() < 0 || this.getExp() > 20 || this.getPc2() < 0 || this.getPc2() > 20 || this.getLab2() < 0 || this.getLab2() > 20 || this.getProyf() < 0 || this.getProyf() > 20 || this.getExf() < 0 || this.getExf() > 20){
        return true;
        } else return false;
    }
    
    public abstract String reporte_curso();
    public abstract String reporte_notas();

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSeccion() {
        return seccion;
    }
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    public int getCreditos() {
        return creditos;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
