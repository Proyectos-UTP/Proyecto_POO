
package POO_Proy_Paquete;

public abstract class Clase_general {
    private String nombre;
    private int pc1;
    private int pc2;
    private int pc3;
    private int exfin;
    private int idseccion;

    public float promedio(){
    return (pc1+pc2+pc3+exfin)/4;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPc1() {
        return pc1;
    }

    public void setPc1(int pc1) {
        this.pc1 = pc1;
    }

    public int getPc2() {
        return pc2;
    }

    public void setPc2(int pc2) {
        this.pc2 = pc2;
    }

    public int getPc3() {
        return pc3;
    }

    public void setPc3(int pc3) {
        this.pc3 = pc3;
    }

    public int getExfin() {
        return exfin;
    }

    public void setExfin(int exfin) {
        this.exfin = exfin;
    }

    public int getIdseccion() {
        return idseccion;
    }

    public void setIdseccion(int idseccion) {
        this.idseccion = idseccion;
    }
    
}
