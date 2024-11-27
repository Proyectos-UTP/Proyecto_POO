package POO_Proy_Paquete;
public abstract class CursoEsInf extends Sistema_ev_EsInf {
    private String nombre;
    private String seccion;
    private int creditos;

    public CursoEsInf(String nombre, String seccion, int creditos, double pc1, double aif1, double pc2, double pc3, double pa, double pc4, double iF) {
        super(pc1, aif1, pc2, pc3, pa, pc4, iF);
        this.nombre = nombre;
        this.seccion = seccion;
        this.creditos = creditos;
    }
    
    public double promedio() {
        return (0.2 * getAif1()) + (0.3 * getIF()) + (0.1 * getPa()) + (0.1 * getPc1()) + (0.1 * getPc2()) + (0.1 * getPc3()) + (0.1 * getPc4());
    }
    
    public boolean check(){
        if (getPc1()<0 || getPc1()>20 || getAif1()<0 || getAif1()>20 || getPc2()<0 || getPc2()>20 || getPc3()<0 || getPc3()>20 || getPa()<0 || getPa()>20 || getPc4()<0 || getPc4()>20 || getIF()<0 || getIF()>20) {
            return true;
        } else {
            return false;
        }
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
