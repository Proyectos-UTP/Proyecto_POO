package POO_Proy_Paquete;
public class EsInf extends CursoEsInf {
    public EsInf(String nombre, String seccion, int creditos, double pc1, double aif1, double pc2, double pc3, double pa, double pc4, double iF) {
        super("Estadistica Inferencial", "23167", 4, pc1, aif1, pc2, pc3, pa, pc4, iF);
    }

    @Override
    public String reporte_curso() {
        return "Curso: " + getNombre() + "\nSeccion: " + getSeccion() + "\nCreditos: " + getCreditos();
    }
    @Override
    public String reporte_notas() {
        return "Notas CursoCaf:\nPractica Calificada 1 (PC1): " + getPc1() +
               "\nInforme de Avance Final 1 (AIF1): " + getAif1()+
               "\nPractica Calificada 2 (PC2): " + getPc2() +
               "\nPractica Calificada 3 (PC3): " + getPc3() +
               "\nParticipacion en Clase (PA): " + getPa() +
               "\nPractica Calificada 4 (PC4): " + getPc4() +
               "\nInforme Final (IF): " + getIF()+
               "\nPromedio: " + promedio();
    }
}
