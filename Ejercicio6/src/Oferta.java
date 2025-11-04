public class Oferta{
    public void ofertaMercado( double precioOriginal, double porcentajeDescuento){
        double factorPago = 1.0 - porcentajeDescuento;
        double resultado = precioOriginal * factorPago;
        System.out.println("Precio original: " +precioOriginal + " euros");
        System.out.println("Tasa de Descuento: " + (porcentajeDescuento * 100) + " %");
        System.out.println("Precio final con descuento " +resultado + " euros");
    }
}