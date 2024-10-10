
package POO_Proy_Paquete;

public class main {

    public static void main(String[] args) {
        // Esta clase es para comprobar que las clases y sus relaciones entre ellas funcionan
        
        // Inicio de la prueba 1, crear un objecto de la calse docente el cual esté asociado a un curso
        
        Docente d1 = new Docente();
        Curso curs1 = new Curso();
        
        curs1.setNombre("Cálculo");
        d1.setNombre("Juan");
        d1.setApellido("Perez");
        d1.setId_cuenta("2500");
        d1.setContraseña("123");
        d1.setEns_curso(curs1);
        
        d1.mostrar();
        
        // Fin de la prueba 1
    }
    
}
