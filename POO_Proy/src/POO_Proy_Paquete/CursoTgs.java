package POO_Proy_Paquete;
public abstract class CursoTgs extends Sistema_ev_Tgs{
    private String nombre;
    private String seccion;
    private int creditos;

    public CursoTgs(String nombre, String seccion, int creditos, int pc1, int exp, int avpf, int pc2, int proyf) {
        super(pc1, exp, avpf, pc2, proyf);
        this.nombre = nombre;
        this.seccion = seccion;
        this.creditos = creditos;
    }
    
    public double promedio() {
        return ((getPc1() * 0.15) + (getExp() * 0.25) + (getAvpf() * 0.15) +
                (getPc2() * 0.15) + (getProyf() * 0.30));
    }
    public boolean check(){
        if (this.getPc1() < 0 || this.getPc1() > 20 || this.getExp() < 0 || this.getExp() > 20 || this.getPc2() < 0 || this.getPc2() > 20 || this.getAvpf() < 0 || this.getAvpf() > 20 || this.getProyf() < 0 || this.getProyf() > 20){
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
