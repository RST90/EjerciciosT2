public class Calificacion {
    public void calificacionesExamenes(float notaUno, float notaDos, float notaTres){
        float notaMedia = (notaUno + notaDos+ notaTres)/3f;
        System.out.printf("El resultado de la nota media es = %.2f\n ", notaMedia);
        String resultadoFinal;
        if (notaMedia >= 9.0){
            resultadoFinal = "Sobresaliente";
        }
        else if (notaMedia >=7.0){
            resultadoFinal = "Notable";
        }
        else if (notaMedia >=5.0){
            resultadoFinal = "Aprobado";
        }
        else{
            resultadoFinal = "Suspenso";
        }
        System.out.println("El resultado final es = " +resultadoFinal);

    }
}