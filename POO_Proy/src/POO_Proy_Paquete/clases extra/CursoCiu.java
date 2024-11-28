package POO_Proy_Paquete;
public abstract class CursoCiu extends Sistema_ev_Ciudadania{
    private String nombre;
    private String seccion;
    private int creditos;

    public CursoCiu(String nombre, String seccion, int creditos, int pc, int exp, int ta, int exf) {
        super(pc, exp, ta, exf);
        this.nombre = nombre;
        this.seccion = seccion;
        this.creditos = creditos;
    }
    
    public double promedio() {
        return ((this.getPc()) + (this.getExp()) + (this.getTa()) + (this.getExf()))/4;
    }
    public boolean check(){
        if (this.getPc() < 0 || this.getPc() > 20 || this.getTa() < 0 || this.getTa() > 20 || this.getExp() < 0 || this.getExp() > 20 || this.getExf() < 0 || this.getExf() > 20){
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
