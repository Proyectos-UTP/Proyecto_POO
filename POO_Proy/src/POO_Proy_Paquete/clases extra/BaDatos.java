package POO_Proy_Paquete;
public class BaDatos extends CursoBaDatos {
    public BaDatos (String nombre, String seccion, int creditos, double pc1, double pc2, double pc3, double pa, double exf){
        super("Base de Datos", "23296", 3, pc1, pc2, pc3, pa, exf);
    }

    @Override
    public String reporte_curso() {
        return "Curso: " + getNombre() + "\nSeccion: " + getSeccion() + "\nCreditos: " + getCreditos();
    }
    
    @Override
    public String reporte_notas() {
        return "Notas CursoCaf:\nPractica Calificada 1 (PC1): " + getPc1() +
               "\nPractica Calificada 2 (PC2): " + getPc2() +
               "\nPractica Calificada 3 (PC3): " + getPc3() +
               "\nParticipación en clase (PA): " + getPa() +
               "\nExamen Final (EXF): " + getExf() +
               "\nPromedio: " + promedio();
    }
}
