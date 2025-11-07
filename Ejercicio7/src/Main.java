import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Operador posibleEstudiante = new Operador();
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("¿Qué edad tienes?");
        int edad = lecturaTeclado.nextInt();
        System.out.println("¿Eres estudiante?");
        boolean estudiante = lecturaTeclado.nextBoolean();
        posibleEstudiante.posibleDescuento(edad, estudiante);
        lecturaTeclado.close();


    }
}