
package POO_Proy_Paquete;

public class Curso extends Sistema_ev {
    //Atributos
    private String nombre;
    private String sección;
    private int créditos;
    
    
    //constructores
    
    //métodos
    public double promedio(){
    return ((this.getPc1()) + (this.getPc2()) + (this.getPc3()) + (this.getExp()) + (this.getExf()))/5;
            }
    
        public boolean check(){
        if (this.getPc1() < 0 || this.getPc1() > 20 || this.getPc2() < 0 || this.getPc2() > 20 || this.getPc3() < 0 || this.getPc3() > 20 || this.getExp() < 0 || this.getExp() > 20 || this.getExf() < 0 || this.getExf() > 20){
        return true;
        } else return false;
        
        
    }
        public String reporte_curso(){
            return "Nombre: " + this.nombre + "\n" +
                   "Sección: " + this.sección + "\n" +
                   "Creditos: " + this.créditos;
        }
        
        public String reporte_notas(){
                return "PC1: " + this.getPc1() + "\n" +
                       "PC2: " + this.getPc2() + "\n" +
                       "PC3: " + this.getPc3() + "\n" +
                       "EXP: " + this.getExp() + "\n" +
                       "EXF: " + this.getExf() + "\n" +
                       "Promedio: " + this.promedio();
        }
       
    //Métodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSección() {
        return sección;
    }

    public void setSección(String sección) {
        this.sección = sección;
    }

    public int getCréditos() {
        return créditos;
    }

    public void setCréditos(int créditos) {
        this.créditos = créditos;
    }
    
}
