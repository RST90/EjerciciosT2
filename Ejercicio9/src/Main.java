import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calificacion notasExamenes = new Calificacion();
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen");
        float notaUno = lecturaTeclado.nextFloat();
        System.out.println("Introduce la nota del segundo examen");
        float notaDos = lecturaTeclado.nextFloat();
        System.out.println("Introduce la nota del tercer examen");
        float notaTres = lecturaTeclado.nextFloat();
        notasExamenes.calificacionesExamenes(notaUno, notaDos, notaTres);
        lecturaTeclado.close();

    }
}