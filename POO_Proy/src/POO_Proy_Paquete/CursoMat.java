package POO_Proy_Paquete;

public abstract class CursoMat extends Sistema_ev_Mate2 {
    //Atributos
    private String nombre;
    private String seccion;
    private int creditos;
    //constructor
    public CursoMat(String nombre, String seccion, int creditos, int pc1, int pc2, int pc3, int exp, int exf){    
        super(pc1, pc2, pc3, exp, exf);
        this.nombre = nombre;
        this.seccion = seccion;
        this.creditos = creditos;
    }
    //métodos
    public double promedio() {
        return ((this.getPc1()) + (this.getPc2()) + (this.getPc3()) + (this.getExp()) + (this.getExf()))/5;
    }
    public boolean check(){
        if (this.getPc1() < 0 || this.getPc1() > 20 || this.getPc2() < 0 || this.getPc2() > 20 || this.getPc3() < 0 || this.getPc3() > 20 || this.getExp() < 0 || this.getExp() > 20 || this.getExf() < 0 || this.getExf() > 20){
        return true;
        } else return false;
    }
    public abstract String reporte_curso();
    public abstract String reporte_notas();
    //Métodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSeccion() {
        return seccion;
    }
    public void setSección(String seccion) {
        this.seccion = seccion;
    }
    public int getCreditos() {
        return creditos;
    }
    public void setCréditos(int creditos) {
        this.creditos = creditos;
    }
}
