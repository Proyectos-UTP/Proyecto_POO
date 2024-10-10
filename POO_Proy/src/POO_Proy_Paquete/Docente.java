
package POO_Proy_Paquete;

public class Docente extends Cuenta {
    private Curso ens_curso;
    
    public Docente(){
        
    }

    public Curso getEns_curso() {
        return ens_curso;
    }

    public void setEns_curso(Curso ens_curso) {
        this.ens_curso = ens_curso;
    }
    
        public void mostrar(){
        System.out.println("El docente de nombre: "+ nombre +", enseña el curso: " +
                ens_curso.getNombre());
    }
    
    
}
