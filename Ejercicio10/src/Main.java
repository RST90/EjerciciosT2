import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Salario salarioTotal = new Salario();
        Scanner lecturaTeclado = new Scanner (System.in);
        System.out.println("Introduce horas trabajadas");
        double horasTrabajadas = lecturaTeclado.nextDouble();
        System.out.println("Introduce salario por hora trabajada");
        double salarioHoras = lecturaTeclado.nextDouble();
        System.out.println("¿Puedes realizar horas extra?");
        boolean horasExtra = lecturaTeclado.nextBoolean();
        salarioTotal.pagoTotal(salarioHoras, horasTrabajadas, horasExtra);
        lecturaTeclado.close();

    }
}