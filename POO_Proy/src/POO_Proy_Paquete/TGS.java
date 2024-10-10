package POO_Proy_Paquete;
public class TGS extends CursoTgs{
    public TGS(String nombre, String seccion, int creditos, int pc1, int exp, int avpf, int pc2, int proyf) {
        super("Teoria General de Sistemas", "23894", 4, pc1, exp, avpf, pc2, proyf);
    }
    
    @Override
    public String reporte_curso() {
        return "Curso: " + getNombre() + "\nSección: " + getSeccion() + "\nCréditos: " + getCreditos();
    }
    @Override
    public String reporte_notas() {
        return "Notas CursoTgs:\nPráctica Calificada 1 (PC1): " + getPc1() +
               "\nExamen Parcial (EXP): " + getExp() +
               "\nAvance Proyecto Final (AVPF): " + getAvpf() +
               "\nPráctica Calificada 2 (PC2): " + getPc2() +
               "\nProyecto Final (PROYF): " + getProyf() +
               "\nPromedio: " + promedio();
    }
}
