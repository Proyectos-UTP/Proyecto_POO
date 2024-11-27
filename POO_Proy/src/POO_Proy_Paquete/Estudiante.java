
package POO_Proy_Paquete;

public class Estudiante extends Usuario {
    private String codigo;

    public Estudiante(String id, String pass, String n, String ap, String c) {
        super(id, pass, n, ap);
        this.codigo = c;
    }
    
    
    public String darcodigo(){
        codigo = "E" + super.id_cuenta;
    return codigo;
    }
    
    
}
