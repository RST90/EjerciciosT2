import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Operador operadoresMatematicos = new Operador();
        Scanner resultadosMatematicos = new Scanner(System.in);
        System.out.println("¿Cuál es tu primer valor?");
        double op1 = resultadosMatematicos.nextDouble();
        System.out.println("¿Cuál es tu segundo valor?");
        double op2 = resultadosMatematicos.nextDouble();
        operadoresMatematicos.operacionesMatematicas(op1, op2);

    }
}