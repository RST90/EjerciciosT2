import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Oferta precioDescuento = new Oferta();
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce el precio del producto deseado");
        double precioOriginal = lecturaTeclado.nextDouble();
        System.out.println("Introduce el porcentaje de descuento del producto deseado");
        double porcentajeDescuento = lecturaTeclado.nextDouble();
        double tasaDescuento = porcentajeDescuento / 100.0;
        precioDescuento.ofertaMercado(precioOriginal,tasaDescuento);
        lecturaTeclado.close();

    }
}