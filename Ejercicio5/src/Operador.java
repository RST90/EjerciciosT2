public class Operador{
    public void alquilerCoche(int edad, boolean carnetConducir) {
        boolean resultado =  (edad>= 21) && carnetConducir;
        System.out.println("La posibilidad de que alquiles un coche es = " +resultado);
    }
}