package POO_Proy_Paquete;
public abstract class Usuario extends Cuenta {
    protected String nombre;
    protected String apellido;
    
    public Usuario(String id, String pass, String n, String ap)
    {
    super (id, pass);
    this.nombre = n;
    this.apellido = ap;
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
    
}
