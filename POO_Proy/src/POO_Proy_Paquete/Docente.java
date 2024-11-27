
package POO_Proy_Paquete;

public class Docente extends Usuario implements login_attempts{
   // private CursoCaf ens_curso;
    private String codigo;
    
    /* Esta clase fue creada para asociar un docente con un curso, pero debido a como las clases de los cursos estan hechas, esto ya no es posible, por lo menos no de la
    manera en la que se hacía antes
    */
    
    public Docente(){
        
    }
/*
    public CursoCaf getEns_curso() {
        return ens_curso;
    }

    public void setEns_curso(CursoCaf ens_curso) {
        this.ens_curso = ens_curso;
    }
    
        public void mostrar(){
        System.out.println("El docente de nombre: "+ nombre +", enseña el curso: " +
                ens_curso.getNombre());
    }*/
    
        public String darcodigo(){
        codigo = "D" + super.id_cuenta;
    return codigo;
    }

        
        
    }
       
