public class Operador{
    public void posibleDescuento(int edad, boolean estudiante){
        boolean resultado = (edad <= 26) && estudiante;
        System.out.println("La opcion de que tengas descuento es = " +resultado);

    }
}