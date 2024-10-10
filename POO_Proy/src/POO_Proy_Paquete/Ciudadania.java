package POO_Proy_Paquete;
public class Ciudadania extends CursoCiu{
    public Ciudadania(String nombre, String seccion, int creditos, int pc, int exp, int ta, int exf) {
        super("Ciudadania", "25948", 3, pc, exp, ta, exf);
    }
    
    @Override
    public String reporte_curso() {
        return "Curso: " + getNombre() + "\nSeccion: " + getSeccion() + "\nCreditos: " + getCreditos();
    }
    @Override
    public String reporte_notas() {
        return "Notas Ciudadanía:\nPractica Calificada (PC): " + getPc() + 
               "\nExamen Parcial (EXP): " + getExp() + 
               "\nTarea Academica (TA): " + getTa() + 
               "\nExamen Final (EXF): " + getExf() + 
               "\nPromedio: " + promedio();
    }
}
