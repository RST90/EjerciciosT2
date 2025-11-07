public class Operaciones {
    public void operacionesCombinadas( double numeroUno, double numeroDos, double numeroTres){
        double suma = numeroUno + numeroDos + numeroTres;
        System.out.println("El resultado de la suma es = " +suma);
        double promedio = (suma)/ 3;
        System.out.println("El resultado del promedio es = " +promedio);
        double calculo = (numeroUno * numeroDos)/numeroTres;
        System.out.println("El resultado de (numeroUno * numeroDos)/numeroTres es = " +calculo);
    }
}