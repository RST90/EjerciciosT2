import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Comparacion comparacionesAritmeticas = new Comparacion();
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Indique primer número");
        int valorUno = lecturaTeclado.nextInt();
        System.out.println("Indique segundo número");
        int valorDos = lecturaTeclado.nextInt();
        comparacionesAritmeticas.comparacionesMatematicas(valorUno, valorDos);
        lecturaTeclado.close();


    }
}