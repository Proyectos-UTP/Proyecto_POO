package POO_Proy_Paquete;
public abstract class CursoBaDatos extends Sistema_ev_BaDatos {
    private String nombre;
    private String seccion;
    private int creditos;
    
    public CursoBaDatos (String nombre, String seccion, int creditos, double pc1, double pc2, double pc3, double pa, double exf){
        super(pc1, pc2, pc3, pa, exf);
        this.nombre = nombre;
        this.seccion = seccion;
        this.creditos = creditos;
    }
    
    public double promedio (){
        return (getPc1() + getPc2() + getPc3() + getPa() + getExf()) / 5;
    }
    public boolean check (){
        if (getPc1()>20 || getPc1()<0 || getPc2()<0 || getPc2()>20 || getPc3()<0 || getPc3()>20 || getPa()<0 || getPa()>20 || getExf()<0 || getExf()>20) {
            return true;
        } else {
            return false;
        }
    }
    
    public abstract String reporte_curso();
    public abstract String reporte_notas();

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getSeccion() { return seccion; }
    public void setSeccion(String seccion) { this.seccion = seccion; }

    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }
    
}
