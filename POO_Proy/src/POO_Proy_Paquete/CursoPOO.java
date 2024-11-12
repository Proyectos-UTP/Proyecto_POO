package POO_Proy_Paquete;
public abstract class CursoPOO extends Sistema_ev_POO{
    private String nombre;
    private String seccion;
    private int creditos;
    
    public CursoPOO (String nombre, String seccion, int creditos, double pc1, double pc2, double pc3, double proy){
        super(pc1, pc2, pc3, proy);
        this.nombre = nombre;
        this.seccion = seccion;
        this.creditos = creditos;
    }
    
    public double promedio (){
        return (getPc1() + getPc2() + getPc3() + getProy()) / 4;
    }
    public boolean check (){
        if (getPc1()>20 || getPc1()<0 || getPc2()<0 || getPc2()>20 || getPc3()<0 || getPc3()>20 || getProy()<0 || getProy()>20) {
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
