import java.sql.SQLOutput;

public class Operador {

    public void operacionesMatematicas(double op1, double op2) {
        double resultadoSuma = op1 + op2;
        System.out.println("El resultado de la suma es = " +resultadoSuma);
        double resultadoResta = op1-op2;
        System.out.println("El resultado de la resta es = " +resultadoResta);
        double resultadoMulti = op1*op2;
        System.out.println("El resultado de la multiplicacion es = " +resultadoMulti);
        double resultadoDiv = op1/op2;
        System.out.println("El resultado de la division es = " +resultadoDiv);
        double resultadoMod = op1%op2;
        System.out.println("El resultado del modulo es = " +resultadoMod);
    }
}