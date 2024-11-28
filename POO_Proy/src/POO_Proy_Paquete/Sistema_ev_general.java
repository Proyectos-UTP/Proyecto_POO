
package POO_Proy_Paquete;

public abstract class Sistema_ev_general {
    protected int pc1;
    protected int pc2;
    protected int pc3;
    protected int exfin;
    
    public Sistema_ev_general(int e1, int e2, int e3, int efin)
    {
    this.pc1 = e1;
    this.pc2 = e2;
    this.pc3 = e3;
    this.exfin = efin;
    }
    
    public abstract float promedio();
}