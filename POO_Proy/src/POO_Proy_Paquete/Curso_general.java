
package POO_Proy_Paquete;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Curso_general extends Sistema_ev_general {
    private String nombre;
    private String idseccion;

    //private Image imagen;
    public Curso_general(int e1, int e2, int e3, int efin, String n, String s)
    {
    super(e1,e2,e3,efin);
    this.nombre = n;
    this.idseccion = s;
    

    //this.imagen = ImageIO.read(new File(n + ".png"));
    }

    @Override
    public double promedio() {
       double prom = (super.getPc1() + super.getPc2() + super.getPc3() + super.getExfin())/4;
        return prom;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdseccion() {
        return idseccion;
    }

    public void setIdseccion(String idseccion) {
        this.idseccion = idseccion;
    }


    
}
