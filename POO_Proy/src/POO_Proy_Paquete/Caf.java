package POO_Proy_Paquete;
public class Caf extends CursoCaf{
    public Caf(String nombre, String seccion, int creditos, int pc1, int lab1, int exp, int pc2, int lab2, int proyf, int exf) {
        super("Calculo Aplicado a la Fisica", "29765", 5, pc1, lab1, exp, pc2, lab2, proyf, exf);
    }

    @Override
    public String reporte_curso() {
        return "Curso: " + getNombre() + "\nSeccion: " + getSeccion() + "\nCreditos: " + getCreditos();
    }
    @Override
    public String reporte_notas() {
        return "Notas CursoCaf:\nPractica Calificada 1 (PC1): " + getPc1() +
               "\nLaboratorio 1 (LAB1): " + getLab1() +
               "\nExamen Parcial (EXP): " + getExp() +
               "\nPractica Calificada 2 (PC2): " + getPc2() +
               "\nLaboratorio 2 (LAB2): " + getLab2() +
               "\nProyecto Final (PROYF): " + getProyf() +
               "\nExamen Final (EXF): " + getExf() +
               "\nPromedio: " + promedio();
    }
}
