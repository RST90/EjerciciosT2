import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Operador operadoresLogicos = new Operador();
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("¿Qué edad tienes?" );
        int edad = lecturaTeclado.nextInt();
        System.out.println("¿Tienes carnet de conducir?" );
        boolean carnetConducir = lecturaTeclado.nextBoolean();
        operadoresLogicos.alquilerCoche(edad, carnetConducir);
    }
}