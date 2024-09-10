
package POO_Proy_Paquete;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean confirmation = false;
        Scanner sc = new Scanner(System.in);
        String[] evs = {"PC1", "PC2", "PC3", "EXP", "EXF"};
        Usuario usr = new Usuario("Juan", "Perez", "Estudiante");
        usr.setId_cuenta("58456");
        usr.setContraseña("1234");
        Curso curs = new Curso("Calculo", "30943", 2);

        

            for (int i = 0;i<evs.length;i++){
            int j = 0;
            System.out.println("Ingrese la nota de " + evs[i]);
            switch (i){
                case 0: curs.setPc1(sc.nextInt()); break;
                case 1: curs.setPc2(sc.nextInt()); break;
                case 2: curs.setPc3(sc.nextInt()); break;
                case 3: curs.setExp(sc.nextInt()); break;
                case 4: curs.setExf(sc.nextInt()); break;
                
            }
            if (curs.check() == true){
                System.err.println("Valor invalido!");
                i = i - 1;
            switch (i){
                case 0: curs.setPc1(0); break;
                case 1: curs.setPc2(0); break;
                case 2: curs.setPc3(0); break;
                case 3: curs.setExp(0); break;
                case 4: curs.setExf(0); break;
            }

            }
            }
        
                System.out.println(usr.reporte_cuenta());
                System.out.println("Información del curso: ");
                System.out.println(curs.reporte_curso());
                System.out.println("Notas del alumno: ");
                System.out.println(curs.reporte_notas());
        
        
        
        

    }
}
   
