package POO_Proy_Paquete;
public abstract class Cuenta extends Usuario{
    //Atributos
    protected String id_cuenta;
    protected String contraseña;
    protected char tipo_cuenta;
    
    
    //Métodos get y set
    public String getId_cuenta() {
        return id_cuenta;
    }
    public void setId_cuenta(String id_cuenta) {
        this.id_cuenta = id_cuenta;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
