
package POO_Proy_Paquete;

public class Usuario extends Cuenta {
    private String nombre;
    private String apellido;
    private String tipo;
    
    public Usuario(String nombre, String apellido, String tipo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        
    }
    
    
    @Override
    public String reporte_cuenta(){
        char t = 'N';
        if (this.getTipo().equals("Docente")) {
        t = 'C';
        } else if (this.getTipo().equals("Estudiante")){
        t = 'E';    
        }
        
        return "Información de cuenta: " + "\n" +
               "ID de cuenta: " + t + this.getId_cuenta() + "\n" +
               "Nombre: " + this.getNombre() + "\n" +
               "Apellido: " + this.getApellido()
                
               
                ;
                
                    
                    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
