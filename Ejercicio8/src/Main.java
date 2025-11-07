import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Operaciones operacionCombinada = new Operaciones();
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Dime el primer número");
        double numeroUno = lecturaTeclado.nextDouble();
        System.out.println("Dime el segundo número");
        double numeroDos = lecturaTeclado.nextDouble();
        System.out.println("Dime el tercer número");
        double numeroTres = lecturaTeclado.nextDouble();
        operacionCombinada.operacionesCombinadas(numeroUno, numeroDos, numeroTres);


    }
}