
package POO_Proy_Paquete;

public class Estudiante extends Usuario {
    private String codigo;
    
    
    public String darcodigo(){
        codigo = "E" + super.id_cuenta;
    return codigo;
    }
    
    
}
