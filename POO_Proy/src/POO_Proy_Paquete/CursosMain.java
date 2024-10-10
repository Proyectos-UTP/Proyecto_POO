package POO_Proy_Paquete;

import java.util.Scanner;

public class CursosMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ingreso de notas del curso Ciudadania
        System.out.println("Ingrese las notas del curso de Matematicas 2:");
        Mate2 cursoMate2 = new Mate2("Matematicas 2", "24786", 4,
                pedirNota(scanner, "Practica Calificada 1"),
                pedirNota(scanner, "Practica Calificada 2"),
                pedirNota(scanner, "Practica Calificada 3"),
                pedirNota(scanner, "Examen Parcial"),
                pedirNota(scanner, "Examen Final"));
        // Mostrar reporte del curso Ciudadania
        System.out.println("\n-------------------------------");
        System.out.println("Reporte del curso Matematicas 2");
        System.out.println("-------------------------------");
        System.out.println(cursoMate2.reporte_curso());
        System.out.println(cursoMate2.reporte_notas());
        
        // Ingreso de notas del curso Ciudadania
        System.out.println("Ingrese las notas del curso de Ciudadania:");
        Ciudadania cursoCiudadania = new Ciudadania("Ciudadania", "25948", 3,
                pedirNota(scanner, "Practica Calificada"),
                pedirNota(scanner, "Examen Parcial"),
                pedirNota(scanner, "Tarea Academica"),
                pedirNota(scanner, "Examen Final"));
        // Mostrar reporte del curso Ciudadania
        System.out.println("\n-------------------------------");
        System.out.println("Reporte del curso Ciudadania y Etica");
        System.out.println("-------------------------------");
        System.out.println(cursoCiudadania.reporte_curso());
        System.out.println(cursoCiudadania.reporte_notas());

        // Ingreso de notas del curso Caf
        System.out.println("\nIngrese las notas del curso de CAF:");
        Caf cursoCaf = new Caf("Calculo Aplicado a la Fisica", "29765", 5,
                pedirNota(scanner, "Practica Calificada 1"),
                pedirNota(scanner, "Laboratorio 1"),
                pedirNota(scanner, "Examen Parcial"),
                pedirNota(scanner, "Practica Calificada 2"),
                pedirNota(scanner, "Laboratorio 2"),
                pedirNota(scanner, "Proyecto Final"),
                pedirNota(scanner, "Examen Final"));
        // Mostrar reporte del curso Caf
        System.out.println("\n-------------------------------");
        System.out.println("Reporte del curso Calculo Aplicado a la Fisica");
        System.out.println("-------------------------------");
        System.out.println(cursoCaf.reporte_curso());
        System.out.println(cursoCaf.reporte_notas());

        // Ingreso de notas del curso Tgs
        System.out.println("\nIngrese las notas del curso de TGS:");
        TGS cursoTgs = new TGS("Teoria General de Sistemas", "23894", 4,
                pedirNota(scanner, "Practica Calificada 1"),
                pedirNota(scanner, "Examen Parcial"),
                pedirNota(scanner, "Avance Proyecto Final"),
                pedirNota(scanner, "Practica Calificada 2"),
                pedirNota(scanner, "Proyecto Final"));
        // Mostrar reporte del curso Tgs
        System.out.println("\n-------------------------------");
        System.out.println("Reporte del curso Teoria General de Sistemas");
        System.out.println("-------------------------------");
        System.out.println(cursoTgs.reporte_curso());
        System.out.println(cursoTgs.reporte_notas());
    }
    // Método auxiliar para pedir notas
    public static int pedirNota(Scanner scanner, String tipoNota) {
        System.out.print("Ingrese la nota para " + tipoNota + ": ");
        return scanner.nextInt();
    }
}
