import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Usuario parImpar = new Usuario();
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int valorUno = lecturaTeclado.nextInt();
        parImpar.operacionMatematica(valorUno);
        lecturaTeclado.close();

    }
}